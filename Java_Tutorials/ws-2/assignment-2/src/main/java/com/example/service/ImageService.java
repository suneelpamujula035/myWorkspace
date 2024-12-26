package com.example.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.entity.Image;
import com.example.exception.ImageNotFoundException;
import com.example.repository.ImageRepository;

@Service
public class ImageService {

	@Autowired
	private ImageRepository imageRepository;
	
	public List<String> scanFiles()
	{
		List<String> listOfFiles = new ArrayList<>();
		File f = new File("D:\\Data");
		String[] list = f.list();
		for (String s : list) 
		{
			listOfFiles.add(s);
		}
		return listOfFiles;
	}
	
	public List<Image> gettingAllFiles(String field)
	{
		List<Image> images = imageRepository.findAll(Sort.by(Direction.ASC, field));
		if(images.size()!=0)
		{
			return images;
		}
		else
		{
			throw new ImageNotFoundException("Images not found");
		}
	}
	
	public List<Image> saveFileDetails(List<Image> images) throws IOException, ParseException
	{
		List<Image> imgs = new ArrayList<>();
		File f = new File("D:\\Data");
		String[] list = f.list();
		for (String s : list)//Getting files one by one
		{
			SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");//yyyy-MM-dd'T'HH:mm:ss
			File f1 = new File(f, s);
			BasicFileAttributes attributes = Files.readAttributes(f1.toPath(), BasicFileAttributes.class);
            FileTime creationDate = attributes.creationTime();
            String formattedDate = df.format(creationDate.toMillis());
            
			String fileName = f1.getName();
			int dot = fileName.lastIndexOf('.');
			String baseName = (dot == -1) ? fileName : fileName.substring(0, dot);
			String extension = (dot == -1) ? "" : fileName.substring(dot + 1);
			if (extension.equals("png") || extension.equals("jpg") ||extension.equals("gif")) 
			{
				Image i = new Image();
				i.setName(baseName);
				i.setExtension(extension);
				i.setDate(formattedDate);
				imgs.add(i);
			}
		}
		return imageRepository.saveAll(imgs);
	}
	
	public List<Image> searchByName(String name)
	{
		List<Image> searchByName = imageRepository.findByName(name);
		if(searchByName!=null && name!="" || name!=null)
		{
			return searchByName;
		}
		else
		{
			throw new ImageNotFoundException("Image not found with the name : "+name);
		}
	}
	
	public List<Image> searchByExtension(String extension)
	{
		List<Image> searchByExtension = imageRepository.findByExtension(extension);
		if(searchByExtension.size()!=0 && extension!="" || extension!=null)
		{
			return searchByExtension;
		}
		else
		{
			throw new ImageNotFoundException("Images not found with the extension : "+extension);
		}
	}
	
	public List<Image> searchByDate(String date)
	{
		List<Image> searchByDate = imageRepository.findByDate(date);
		if(searchByDate.size()!=0 && date!="" || date!=null)
		{
			return searchByDate;
		}
		else
		{
			throw new ImageNotFoundException("Images not found with the date : "+date);
		}
	}
}
