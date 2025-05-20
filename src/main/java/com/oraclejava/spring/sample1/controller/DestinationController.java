package com.oraclejava.spring.sample1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oraclejava.spring.sample1.entity.Destination;
import com.oraclejava.spring.sample1.service.DestinationService;

@RequestMapping("/destinations")
@Controller
public class DestinationController {

	private DestinationService destinationService;
	
	@GetMapping
	public String list(Model model) {
		List<Destination> destinations = destinationService.findAll();
		model.addAttribute("destinations", destinations);
		return "destinations/list";
	}

	@Autowired
	public void setDestinationService(DestinationService destinationService) {
		this.destinationService = destinationService;
	}
	
	
}
