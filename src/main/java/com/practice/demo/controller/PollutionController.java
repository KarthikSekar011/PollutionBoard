package com.practice.demo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.data.repo.DataRepo;
import com.practice.demo.data.Data;
import com.practice.demo.service.PollutionService;


@RestController
public class PollutionController {
	
	@Autowired
	private PollutionService service;
	
	@Autowired
	DataRepo repo;
	
	
	@RequestMapping("insert")
	public void insertData() throws IOException {
		
		String readCSV = "D:\\New folder\\PollutionData.CSV";
		
		service.readData(readCSV);
		
	}
	
	@RequestMapping("/findAll")
	public @ResponseBody List<Data> getAll() {

		return repo.findAll();
	}
	
	@RequestMapping("/getCity/{name}")
	public List<Data> getCity(@PathVariable(value="name") String name) {
		return repo.findCity(name);
	}
	
	@RequestMapping("/getState/{name}")
	public List<Data> getState(@PathVariable(value="name") String name) {
		return repo.findState(name);
	}
	
	@RequestMapping("/getCityById/{id}")
	public List<Data> getCityById(@PathVariable(value="id") int id) {
		return repo.findById(id);
	}

}
