package com.example.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Image;
import com.example.service.ImageService;

@RestController
@RequestMapping("/file")
public class ImageController {

	@Autowired
	private ImageService imageService;

	//Getting from Local system
	@GetMapping("/searchAllFiles")
	public ResponseEntity<List<String>> scanFiles()
	{
		return new ResponseEntity<List<String>>(imageService.scanFiles(), HttpStatus.OK);
	}
	
	//Getting from DB
	@GetMapping("/getAllFiles")
	public ResponseEntity<List<Image>> getAllFiles(@RequestParam String field)
	{
		return new ResponseEntity<List<Image>>(imageService.gettingAllFiles(field), HttpStatus.OK);
	}

	@PostMapping("/saveFiles")
	public ResponseEntity<List<Image>> saveFileDetails(@RequestBody(required = false) List<Image> images) throws IOException, ParseException 
	{
		return new ResponseEntity<List<Image>>(imageService.saveFileDetails(images), HttpStatus.CREATED);
	}
	
	@GetMapping("/searchByName/{name}")
	public ResponseEntity<List<Image>> searchByName(@PathVariable String name)
	{
		return new ResponseEntity<List<Image>>(imageService.searchByName(name), HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/searchByType/{extension}")
	public ResponseEntity<List<Image>> searchByExtension(@PathVariable String extension)
	{
		return new ResponseEntity<List<Image>>(imageService.searchByExtension(extension), HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/searchByDate/{date}")
	public ResponseEntity<List<Image>> searchByDate(@PathVariable String date)
	{
		return new ResponseEntity<List<Image>>(imageService.searchByDate(date), HttpStatus.ACCEPTED);
	}
}
