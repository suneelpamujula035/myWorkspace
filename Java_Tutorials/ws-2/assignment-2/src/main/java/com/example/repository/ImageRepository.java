package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long>{

	List<Image> findByName(String name);
	List<Image> findByExtension(String extension);
	List<Image> findByDate(String date);

}
