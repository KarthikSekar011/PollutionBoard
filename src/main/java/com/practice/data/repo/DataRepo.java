package com.practice.data.repo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.practice.demo.data.Data;

@Repository
public interface DataRepo extends JpaRepository<Data, Integer> {

	List<Data> findById(int id);
	
    @Query(value="select * from data where city_name=:name", nativeQuery=true) 
    List<Data> findCity(@Param("name") String name);
	
	
    @Query(value="select * from data where state_name=:name", nativeQuery=true) 
    List<Data> findState(@Param("name") String name);
	
}
