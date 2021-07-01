/**
 * 
 */
package com.study.pattern.singleton;

/**
 * @author rajan
 * 
 * to save time that lose in sleep method. double check is best
 *
 */
public class DoubleCheckedSingleton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t1= new Thread(new Runnable() {
			
			@Override
			public void run() {
				A a1= A.getA();
				
			}
		});
		
		Thread t2= new Thread(new Runnable() {
			
			@Override
			public void run() {
				A a2= A.getA();
				
			}
		});
		
		t1.start();
		t2.start();

	}

}

/**
 * @author rajan
 *
 */
class A {
	public static A a;

	private A() {
		System.out.println("A created");
	}

	public static A getA() {
		if (a == null) {
			synchronized (A.class) {
				if (a == null)
					a = new A();
			}

		}
		return a;
	}
}
