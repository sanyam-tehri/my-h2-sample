package com.h2.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h2.sample.entity.UserDetails;
import com.h2.sample.repo.H2Repository;

@Service
public class InsertDataServiceImpl implements InsertDataService {

	@Autowired
	H2Repository repo;

	@Override
	public String insertData(String name) {
		UserDetails user = new UserDetails();
		user.setName(name);
		UserDetails out = repo.save(user);
		return "User added successfully with id " + out.getId();
	}

}
