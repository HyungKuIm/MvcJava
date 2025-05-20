package com.oraclejava.spring.sample1.service;

import java.util.List;

import com.oraclejava.spring.sample1.entity.Destination;

public interface DestinationService {
	List<Destination> findAll();
}
