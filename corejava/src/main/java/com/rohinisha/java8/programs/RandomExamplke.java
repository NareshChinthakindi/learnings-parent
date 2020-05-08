/**
 * 
 */
package com.rohinisha.java8.programs;

import java.text.DecimalFormat;
import java.util.Random;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class RandomExamplke {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Random rd = new Random();
		 * 
		 * int max = 9; int min = 0; StringBuilder sb = new StringBuilder();
		 * 
		 * for(int i =0; i<6;i++) {
		 * 
		 * int randInt = rd.nextInt((max-min)+1)+min; //System.out.println(randInt);
		 * 
		 * sb.append(randInt); }
		 */
		
//		System.out.println(sb);
		for(int index=0; index<10; index++) {
			String otp = new DecimalFormat("000000").format(new Random().nextInt(999999));
			System.out.println(otp);
		}
		
	}

}
