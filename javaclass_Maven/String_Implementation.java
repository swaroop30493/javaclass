package com.javaclass_Maven;

public class String_Implementation extends Runnable1 {

	public static void main( String args[]) {
		Thread thread1 = new Thread(new Runnable1());
		thread1.start();
		Thread thread2 = new Thread(new Runnable2()); 
		thread2.start(); 
		Thread thread3 = new Thread(new Runnable3()); 
		thread3.start();
		Thread thread4 = new Thread(new Runnable4()); 
		thread4.start(); 
		Thread thread5 = new Thread(new Runnable5()); 
		thread5.start();
	}
	
}
