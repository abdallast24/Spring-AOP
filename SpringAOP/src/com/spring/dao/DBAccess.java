package com.spring.dao;

import org.springframework.stereotype.Component;

@Component("access")
public class DBAccess {
	public String getStudent() {
		// throw new Exception("error 404");
		return "Name of student is abdalla";
	}
	
	public String returnDBDate() throws Exception {
		//throw new Exception();
		return "DB DATA ........";
	}
}
