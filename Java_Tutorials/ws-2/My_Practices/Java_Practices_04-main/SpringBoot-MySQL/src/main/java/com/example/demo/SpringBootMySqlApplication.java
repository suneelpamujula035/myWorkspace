package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMySqlApplication {//implements CommandLineRunner

//	@Autowired
//	private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMySqlApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		String sql = "INSERT INTO BOOKSHOPUSERS(fullname,email,password) values(?,?,?)";
//		int result = jdbcTemplate.update(sql, "Kalyan", "kalyan@gmail.com", "8990@0678");
//		if(result >0)
//		{
//			System.out.println("A new row has been inserted");
//		}
	

}
