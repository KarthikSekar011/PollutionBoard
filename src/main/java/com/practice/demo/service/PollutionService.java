package com.practice.demo.service;

import java.io.FileReader;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.practice.data.repo.DataRepo;
import com.practice.demo.data.Data;


@Service
public class PollutionService {
	
	@Autowired
	private DataRepo repo;
	
	public void readData(String readCSV) throws IOException
	{
		
		
		FileReader fileReader= new FileReader(readCSV);
		CSVReader reader = new CSVReaderBuilder(fileReader).withSkipLines(1).build();
		
		String[] newRecord;
		
		Data data;
		
		while((newRecord = reader.readNext())!=null) {
			
			int countryID = Integer.parseInt(newRecord[0]);
			String CountryName = newRecord[1];
			int stateID = Integer.parseInt(newRecord[2]);
			String stateName = newRecord[3];
			int cityID = Integer.parseInt(newRecord[4]);
			String cityName = newRecord[5];
			int PollutionPPM = Integer.parseInt(newRecord[6]);
			
			data = new Data(countryID,CountryName,stateID,stateName,cityID,cityName,PollutionPPM);
				
			repo.save(data);					
		}
	}
	
}
