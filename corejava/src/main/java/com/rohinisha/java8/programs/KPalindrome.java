/**
 * 
 */
package com.rohinisha.java8.programs;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class KPalindrome {
	
	
	 // Function to check if the given string is K-Palindrome or not
    public static int isKPalindrome(String actual, int m, String reverse, int n)
    {
        // if either string is empty, remove all characters from other string
        if (m == 0 || n == 0) {
            return n + m;
        }

        // ignore last characters of both strings if they are same
        // and recurse for remaining characters
        if (actual.charAt(m - 1) == reverse.charAt(n - 1)) {
            return isKPalindrome(actual, m - 1, reverse, n - 1);
        }

        // if last character of both strings is different

        // remove last character from the first string and recurse
        int x = isKPalindrome(actual, m - 1, reverse, n);

        // remove last character from the second string and recurse
        int y = isKPalindrome(actual, m, reverse, n - 1);

        // consider minimum of above two operations plus one
        System.out.println("X "+x+" Y "+y);
        return 1 + Integer.min(x, y);
    }


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 String str = "d1abcdba1e3";
	        int K = 2;

	        // get reverse of str
	        String rev = new StringBuilder(str).reverse().toString();

	        int result = isKPalindrome(str, str.length(), rev, str.length());
	        
	        System.out.println("result "+result);
	        if ( result <= 2 * K) {
	            System.out.print("String is K-Palindrome");
	        } else {
	            System.out.print("String is not a K-Palindrome");
	        }

	}

}
