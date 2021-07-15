package com.hibernate.mateinfo.SpringAOPProgramming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringAopProgrammingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAopProgrammingApplication.class, args);
	}

}
