package com.demo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) throws IOException {

		//create file
//		File f = new File("./src/main/directory","bablu.txt");
//		System.out.println(f.exists());
//		f.createNewFile();
//		System.out.println(f.exists());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file name : ");
		String fileName = sc.nextLine();
		File f = new File("./src/main/directory", fileName);
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		
		//list of files
//		File f = new File("./src/main/directory");
//		String[] listOfFiles = f.list();
//		int count = 0;
//		for(String s : listOfFiles)
//		{
//			count++;
//			System.out.println(s);
//		}
//		System.out.println("Number of files : "+count);
		
		//delete file
//		File f = new File("./src/main/directory/hi.txt");
//		boolean status = f.delete();
//		System.out.println("is delete file : "+status);

	}

}
