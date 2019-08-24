package com.viv.calculator;

import org.springframework.stereotype.Component;

import com.viv.log.LoggerMain;

@Component
public class Basic {

	public int add(int a, int b) {
		LoggerMain.logger.warn("Adding "+a+" and "+b);
		return a+b;
	}
	
	public int subtract(int a, int b) {
		LoggerMain.logger.warn("Subtracting "+a+" and "+b);
		return a-b;
	}
}
