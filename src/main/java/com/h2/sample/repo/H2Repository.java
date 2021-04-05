package com.h2.sample.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.h2.sample.entity.UserDetails;

@Repository
public interface H2Repository extends JpaRepository<UserDetails, Integer> {

}
