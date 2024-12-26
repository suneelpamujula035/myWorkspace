package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Assignment2Application{

	public static void main(String[] args) {
		SpringApplication.run(Assignment2Application.class, args);
	}

//	@Autowired 
//	private ImageService imageService;
//	@Override
//	public void run(String... args) throws Exception {
//		
//		List<Image> imgs = new ArrayList<>();
//		File f = new File("D:\\Data");
//		String[] list = f.list();
//		for (String s : list)
//		{
//			File f1 = new File(f, s);
//			BasicFileAttributes attr = Files.readAttributes(f1.toPath(), BasicFileAttributes.class);
//			System.out.println("creationTime: " + attr.creationTime());
//			System.out.println("lastAccessTime: " + attr.lastAccessTime());
//			System.out.println("lastModifiedTime: " + attr.lastModifiedTime());
//			System.out.println("********************************************************");
//			String name = f1.getName();
//			int dot = name.lastIndexOf('.');
//			String base = (dot == -1) ? name : name.substring(0, dot);
//			String extension = (dot == -1) ? "" : name.substring(dot + 1);
//			if (extension.equals("png") || extension.equals("jpg")) 
//			{
//				Image i = new Image();
//				i.setName(base);
//				i.setExtension(extension);
//				i.setDate(new Date());
//				imgs.add(i);
//			}
//		}
//		imageService.saveImages(imgs);
//		
//	}
}
