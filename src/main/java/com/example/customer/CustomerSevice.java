package com.example.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service

public class CustomerSevice {
@Autowired
CustomerDao cd;
	public String updateAll(List<Customer> b) {
		// TODO Auto-generated method stub
		return cd.updateAll(b);
	}
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return cd.getAll();
	}
	public String postIfsc(List<Customer> c) {
		// TODO Auto-generated method stub
		return cd.postIfsc(c);
	}
	

}
