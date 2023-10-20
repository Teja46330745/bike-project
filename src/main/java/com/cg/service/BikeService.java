package com.cg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.Bike;
import com.cg.repository.BikeRepository;

@Service
public class BikeService {
	

	
		@Autowired
		BikeRepository bikeRepository;
		public void saveOrUpdate(Bike bike) {
			bikeRepository.save(bike);
		}


		public Bike getbikeById(int id) {
			return bikeRepository.findById(id).get();
		} 
		public List<Bike> getAllBike()   
		{  
		List<Bike> bike = new ArrayList<Bike>();  
		bikeRepository.findAll().forEach(bike1 -> bike.add(bike1));  
		return bike;  
		}  
	}


