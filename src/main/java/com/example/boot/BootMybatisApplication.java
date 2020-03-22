package com.example.boot;

import com.example.boot.mapper.db1.CityDB1Mapper;
import com.example.boot.mapper.db2.CityDB2Mapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootMybatisApplication implements CommandLineRunner {

	public BootMybatisApplication(CityDB1Mapper cityMapper, CityDB2Mapper cityDB2Mapper) {
		this.cityDB1Mapper = cityMapper;
		this.cityDB2Mapper = cityDB2Mapper;
	}

	public static void main(String[] args) {
		SpringApplication.run(BootMybatisApplication.class, args);
	}

	private final CityDB1Mapper cityDB1Mapper;

	private final CityDB2Mapper cityDB2Mapper;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this.cityDB1Mapper.findByState("CA"));
		System.out.println(this.cityDB2Mapper.findByState("CA2"));

	}
}
