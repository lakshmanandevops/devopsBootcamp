package com;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringReverseService {

	@GetMapping("/STRING")
	public String Reverse(@RequestParam(defaultValue="CAT TOD") String Str) 
		{
		String Reversed = new StringBuffer(Str).reverse().toString();
		return Reversed;
		}
			  
	
	  public static String reverse(String s)
	  
	  {
	        if(s == null || s.isEmpty()){
	            return s;
	        }      
	        String r = "";
	        for(int i = s.length() -1; i>=0; i--){
	            r = r + s.charAt(i);
	        }
	     
	        return r;
	    }
}
