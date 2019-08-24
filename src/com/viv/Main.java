package com.viv;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.viv.calculator.Basic;
import com.viv.log.LoggerMain;

public class Main {
	
	public static void main(String[] args) {
		LoggerMain myLogger = new LoggerMain();
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(MyConfig.class);
	
		
		//get bean from container
		Basic basicCalculator = context.getBean("basic",Basic.class);

        System.out.println(basicCalculator.add(2, 3));
	}

	
	public void demomain() {
		System.out.println("Hello");
	}
	
	public static void setName() {
		System.out.println("ok");
	}

}
