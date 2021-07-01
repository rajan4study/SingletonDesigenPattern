/**
 * 
 */
package com.study.pattern.singleton;

/**
 * @author rajan
 * 
 * Singleton  for multi thread environemt. with sleep method
 *
 */
public class SingletonWithSleep {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t1= new Thread(new Runnable() {
			
			@Override
			public void run() {
				SingletonLazyWithSleep s1= SingletonLazyWithSleep.getSingletonLazyWithSleep();
				
			}
		});
		
		Thread t2= new Thread(new Runnable() {
			
			@Override
			public void run() {
				SingletonLazyWithSleep s2= SingletonLazyWithSleep.getSingletonLazyWithSleep();
				
			}
		});
		
		t1.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();

	}

}

/**
 * @author rajan
 *
 */
class SingletonLazyWithSleep {
	public static SingletonLazyWithSleep singletonLazyWithSleep;

	private SingletonLazyWithSleep() {
		System.out.println("SingletonLazyWithSleep created");
	}

	public static SingletonLazyWithSleep getSingletonLazyWithSleep() {
		if (singletonLazyWithSleep == null) {
			singletonLazyWithSleep = new SingletonLazyWithSleep();
		}
		return singletonLazyWithSleep;
	}
}
