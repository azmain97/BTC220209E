package com.bit.test;

import java.util.HashMap;

import org.junit.Test;

import utility.Helper;

public class SmokeTest {

	/*
	 * @Test public void test1() { Helper h = new Helper(); h.click(); }
	 * 
	 * 
	 * 
	 */

	@Test
	public void runStringTestReverse() {
		String a = "how are you";

		String a1 = "you are how";

		StringBuffer reverseString = new StringBuffer();
		String words[] = a.split(" ");

		for (int i = words.length - 1; i > 0; i--) {
			/*
			 * System.out.print(words[i]); System.out.println("Original String -> " + a);
			 * System.out.println("Reverse String -> " + a1);
			 * System.out.println("word Reverse -> " + words[i]);
			 */
		}
		for (String word : words) {
			for (int i = word.length() - 1; i >= 0; i--) {

				reverseString.append(word.charAt(i));

			}
			reverseString.append(" ");

		}
		System.out.println(" Print The LOOP "   + reverseString.toString().trim());
		// System.out.print(words[i]);
		System.out.println(" Original String -> "  + a);
		System.out.println(" Reverse String -> "  + a1);
		// System.out.println("word Reverse -> " + words[i]);

		String str = "United State Of America";

		 int count = 0;    
         
	        //Counts each character except space    
	        for(int i = 0; i < str.length(); i++) {    
	            if(str.charAt(i) != ' ')    
	                count++;    
	        }    
	            
	        //Displays the total number of characters present in the given string    
	        System.out.println(" Total number of characters in a string: "   + count);    
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////     
	        int[] num = new int[str.length()];  
	        char minChar = str.charAt(0),
	        	 maxChar = str.charAt(0);  
	        int i, j, min, max;
	        char string[] = str.toCharArray();  
	          
	        //Count each word in given string and store in array freq  
	        for(i = 0; i < string.length; i++) {  
	            num[i] = 1;  
	            for(j = i+1; j < string.length; j++) {  
	                if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {  
	                    num[i]++;  
	                      
	                    //Set string[j] to 0 to avoid printing visited character  
	                    string[j] = '0';  
	                }  
	            }  
	        }  
	          
	        //Determine minimum and maximum occurring characters  
	        min = max = num[0];  
	        for(i = 0; i <num.length; i++) {  
	              
	            //If min is greater than frequency of a character   
	            //then, store frequency in min and corresponding character in minChar  
	            if(min >=num[i] && num[i] != '0') {  
	                min = num[i];  
	                minChar = string[i];  
	            }  
	            //If max is less than frequency of a character   
	            //then, store frequency in max and corresponding character in maxChar  
	            if(max < num[i]) {  
	                max = num[i];  
	                maxChar = string[i];  
	            }  
	        }  
	          
	        System.out.println(" Minimum occurring character: "  + minChar);  
	        System.out.println(" Maximum occurring character: "  + maxChar);  
	    }
//polirdrom - string reverse turn same words MOM>DAD>POOP>NOON>
	
	
	

}


