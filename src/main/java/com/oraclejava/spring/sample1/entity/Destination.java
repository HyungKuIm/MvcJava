package com.oraclejava.spring.sample1.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "destinations")
public class Destination implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,
			generator = "seq_destinations_gen")
	@SequenceGenerator(
			name= "seq_destinations_gen",
			sequenceName = "SEQ_DESTINATIONS",
			allocationSize = 1)
	private Integer id;
	private String city;
	private String description;
	private String country;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
