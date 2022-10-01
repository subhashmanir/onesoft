
package com.example.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class CustomerDao {
@Autowired
CustomerRepository cr;
	public String updateAll(List<Customer> b) {
		// TODO Auto-generated method stub
		cr.saveAll(b);
		return "Updated Successfully";
	}
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}
	public String postIfsc(List<Customer> c) {
		// TODO Auto-generated method stub
		cr.saveAll(c);
		return "Updated Successfully";
	}

}
