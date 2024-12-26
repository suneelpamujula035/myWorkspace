package com.avi.springmvcminiproject.dao;

import com.avi.springmvcminiproject.entity.Marks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarksRepository extends JpaRepository<Marks,Integer> {
}
