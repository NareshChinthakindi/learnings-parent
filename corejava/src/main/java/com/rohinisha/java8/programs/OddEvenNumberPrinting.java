/**
 * 
 */
package com.rohinisha.java8.programs;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class OddEvenNumberPrinting implements Runnable{
	
	private static int counter = 1;
	
	private static final int MAX_VAL=10;
	
	private static final Object lock = new Object();

	private int reminder;
	
	public OddEvenNumberPrinting(int reminder) {
		this.reminder = reminder;
	}

	@Override
	public void run() {
		
		while (counter <MAX_VAL) {
			
			synchronized (lock) {
				
				if (counter%2 != reminder) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + counter);
				 counter++;
				 lock.notifyAll();
			}
		}
		
	}

	/*
	 * private static int counter = 1; private static int MAX_VAL = 10;
	 * 
	 * static Object lock = new Object(); private int reminder;
	 * 
	 * public OddEvenNumberPrinting(int reminder) { this.reminder = reminder; }
	 * 
	 * 
	 * @Override public void run() {
	 * 
	 * while(counter < MAX_VAL) {
	 * 
	 * synchronized (lock) { if( counter %2 != this.reminder) {
	 * 
	 * try { lock.wait(); } catch (InterruptedException e) { // TODO Auto-generated
	 * catch block e.printStackTrace(); } }
	 * 
	 * System.out.println(Thread.currentThread().getName() + " " + counter);
	 * counter++; lock.notifyAll();
	 * 
	 * } } }
	 */

}
