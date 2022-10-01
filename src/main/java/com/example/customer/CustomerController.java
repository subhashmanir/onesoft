package com.example.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CustomerController {
	@Autowired
	RestTemplate restTemplate;
	@Autowired
	CustomerSevice cs;

	@PostMapping(value = "/update")
	public String updateAll(@RequestBody List<Customer> b) {
		return cs.updateAll(b);
	}

	@GetMapping(value = "/get")
	public List<Customer> getAll() {
		return cs.getAll();
	}

	@PostMapping(value = "/post")
	public String postIfsc(@RequestBody List<Customer> c) {
		String url = "http://localhost:8080/getifsc/";
		c.forEach(x -> {
			String branch = x.getBranch();
			ResponseEntity<String> response=restTemplate.exchange(url+branch, HttpMethod.GET, null, String.class);
			String ifsc=response.getBody();
			x.setIfsc(ifsc);
		});
		return cs.postIfsc(c);
	}

}
