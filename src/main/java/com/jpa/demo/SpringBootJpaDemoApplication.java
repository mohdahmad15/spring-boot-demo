package com.jpa.demo;

import com.jpa.demo.dao.UserRepository;
import com.jpa.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootJpaDemoApplication {



	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(SpringBootJpaDemoApplication.class, args);

		UserRepository userRepository=context.getBean(UserRepository.class);

		User user=new User();
		user.setName("Aamir");
		user.setCity("Basti");
		user.setStatus("JAVA Developer");

		User user1=userRepository.save(user);
		System.out.println(user1);

	}
}
