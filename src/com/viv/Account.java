package com.viv;

import org.springframework.stereotype.Component;

@Component
public class Account {
	
	public String id;
	public int amount;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	

}
