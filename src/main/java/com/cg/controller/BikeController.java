package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Bike;
import com.cg.service.BikeService;

@RestController
@RequestMapping("/bike")
public class BikeController {

	@Autowired
	BikeService service;

	@GetMapping("/bike/{id}")             
		private Bike getbikeById(@PathVariable("id") int id) {

			return service.getbikeById(id);
		}

	@PostMapping("/add")
	private int save(@RequestBody Bike bike) {

		service.saveOrUpdate(bike);
		return bike.getId();

	}

	@GetMapping("/")
	private List<Bike> getAllBooks(){

		return service.getAllBike();

	}

}
