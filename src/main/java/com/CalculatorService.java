package com;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorService {
	int result;
	
	@GetMapping("/ADD")
	public int Add(@RequestParam(defaultValue="1") int A,@RequestParam(defaultValue="1") int B) 
	
	{
		result=A+B;
		return (result);
	}

	@GetMapping("/SUB")
	public int Sub(@RequestParam(defaultValue="4") int A,@RequestParam(defaultValue="2") int B) 
	
	{
		result=A-B;
		return (result);
	}
	
	
	
	
}