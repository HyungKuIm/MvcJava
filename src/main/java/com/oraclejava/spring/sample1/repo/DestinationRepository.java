package com.oraclejava.spring.sample1.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.oraclejava.spring.sample1.entity.Destination;

public interface DestinationRepository extends PagingAndSortingRepository<Destination, Integer>{

}
