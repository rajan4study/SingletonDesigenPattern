/**
 * 
 */
package com.study.pattern.singleton;

/**
 * @author rajan
 * Best of singleton pattern. 
 * can used during deserialization
 * available for >java 1.5
 *
 */
public class SingletonWithEnum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		E e1=E.Rajan;
		e1.i=2;
		E e2=E.Rajan;
		e2.i=3;
		e1.display();
		e2.display();

	}

}

/**
 * @author rajan
 *
 */
enum E{
	Rajan;
	int i;
	public void display() {
		System.out.println(i);
	}
}
