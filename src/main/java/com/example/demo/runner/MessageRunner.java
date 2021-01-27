package com.example.demo.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageRunner implements CommandLineRunner {

	
	private static Logger log = LoggerFactory.getLogger(MessageRunner.class);
	
	@Override
	public void run(String... args) throws Exception {
		int a =10;
		System.out.println("Modified Code"+a);
	} 

}
