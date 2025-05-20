package com.oraclejava.spring.sample1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Lists;
import com.oraclejava.spring.sample1.entity.Destination;
import com.oraclejava.spring.sample1.repo.DestinationRepository;

@Transactional
@Service("destinationService")
public class DestinationServiceImpl implements DestinationService {

	private DestinationRepository destinationRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Destination> findAll() {
		// TODO Auto-generated method stub
		return Lists.newArrayList(destinationRepository.findAll());
	}

	@Autowired
	// 테스트 등 윧통성을 위해 셋터 주입을 사용한다.
	public void setDestinationRepository(DestinationRepository destinationRepository) {
		this.destinationRepository = destinationRepository;
	}

	
}
