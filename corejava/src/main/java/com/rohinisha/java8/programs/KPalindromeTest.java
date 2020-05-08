/**
 * 
 */
package com.rohinisha.java8.programs;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class KPalindromeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 String str = "abcbaabc";
	        int k = 2;
	        
	        int length = str.length();
	        
	      /*  String reverseString = new StringBuilder(str).reverse().toString();
	        
	        int result = isKPalindrome(str, length, reverseString, length);
	        
	        System.out.println("result "+result);
	        		
	        		if(result <=2*k) {
	        			System.out.println("Palindrome");
	        		} else {
	        			System.out.println("Not");
	        		}*/

	        String revereString = new StringBuilder(str).reverse().toString();
	        int result = isKPalindrome(str, length, revereString, length);
	        
	        if(result <=2*k) {
	        	System.out.println("Palindrome");
	        } else {
	        	System.out.println("Not");
	        }

	}

	private static int isKPalindrome(String str, int m, String revereString, int n) {
		
		if(n == 0 || m == 0) {
			return n + m;
		}
		
		if(str.charAt(m-1) == revereString.charAt(n-1)) {
			return isKPalindrome(str, m-1, revereString, n-1);
		}
		
		int x = isKPalindrome(str, m-1, revereString, n);
		
		int y = isKPalindrome(str, m, revereString, n-1);
		
		return 1 + Integer.min(x, y);
	}

	/*
	private static int isKPalindrome(String actual, int m, String reverseString, int n) {
		
		
		  // if either string is empty, remove all characters from other string
        if (m == 0 || n == 0) {
            return n + m;
        }
        
        if(actual.charAt(m-1) == reverseString.charAt(n-1)) {
        	return isKPalindrome(actual, m-1, reverseString, n-1);
        }
        
        
        int x = isKPalindrome(actual, m-1, reverseString, n);
        
        int y= isKPalindrome(actual, m, reverseString, n-1);
		
		return 1 + Integer.min(x, y);
	}*/

}
