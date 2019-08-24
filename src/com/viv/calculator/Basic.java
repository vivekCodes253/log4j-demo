package com.viv.calculator;

import com.viv.Main;

public class Basic {

	public int add(int a, int b) {
		Main.logger.warn("Adding "+a+" and "+b);
		return a+b;
	}
}
