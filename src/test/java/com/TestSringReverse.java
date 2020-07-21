package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestSringReverse {

	StringReverseService StrRev = new StringReverseService();
	String Result;
	
	@Test
	public void testStrFunc1() {
		
		Result=StrRev.Reverse("RAMAR1");
		Assertions.assertEquals(Result, "1RAMAR");
	}
	
	@Test
	public void testStrFunc2() {
		
		Result=StrRev.Reverse("was it a car or a cat i saw");
		Assertions.assertEquals(Result, "was i tac a ro rac a ti saw");
	}
		
	@Test
	public void testStrFunc3() {
		
		Result=StrRev.Reverse("Madam");
		Assertions.assertEquals(Result, "madaM");
	}
	
	@Test
	public void testStrFunc4() {
		
		Result=StrRev.Reverse("1234321");
		Assertions.assertEquals(Result, "1234321");
	}
	
}
