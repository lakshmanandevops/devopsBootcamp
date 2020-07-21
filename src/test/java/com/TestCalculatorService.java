package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestCalculatorService {
	
	CalculatorService calc = new CalculatorService();
	int a;
	
	@Test
	public void testAddFunc1() {
		
		a=calc.Add(15, 20);
		Assertions.assertEquals(a, 35);
	}
	
	@Test
	public void testAddFunc2() {
		int a=calc.Add(-15, 20);
		Assertions.assertEquals(a, 5);
	}
		
	@Test
	public void testAddFunc3() {
		int a=calc.Add(0, -1);
		Assertions.assertEquals(a,-1);
	}
	
	@Test
	public void testSubFunc1() {
		
		 a=calc.Sub(36, 26);
		Assertions.assertEquals(a, 10);
	}
	
	@Test
	public void testSubFunc2() {
		
		a=calc.Sub(26, 37);
		Assertions.assertEquals(a, -11);
	}
		
	@Test
	public void testSubFunc3() {
		
		a=calc.Sub(26, 26);
		Assertions.assertEquals(a, 0);
	}

}
