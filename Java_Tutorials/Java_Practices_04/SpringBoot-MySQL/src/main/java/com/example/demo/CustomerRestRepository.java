package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRestRepository extends JpaRepository<Customer, Long> {

}
