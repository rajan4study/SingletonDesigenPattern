/**
 * 
 */
package com.study.pattern.singleton;

/**
 * @author rajan
 * 
 * singleton design pattern
 *
 */
public class SingletonDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SingletonBasic basic1=SingletonBasic.getSingletonBasic();
		SingletonBasic basic2=SingletonBasic.getSingletonBasic();
		
		SingletonLazy lazy1=SingletonLazy.getSingletonLazy();
		SingletonLazy lazy2=SingletonLazy.getSingletonLazy();


	}

}

/**
 * @author rajan
 * Singleton design pattern with eager loading means singletonbasic will stored in memory even if it is not required
 * memory waste
 */
class SingletonBasic{
	
	public static SingletonBasic basic=new SingletonBasic();
	
	private SingletonBasic() {
		System.out.println("SingletonBasic created");
	}
	
	public static SingletonBasic getSingletonBasic() {
		return basic;
	}
	
}

/**
 * @author rajan
 * 
 * singleton with Lazyloading
 * it wont work for multi thread program
 *
 */
class SingletonLazy {
	public static SingletonLazy singletonLazy;

	private SingletonLazy() {
		System.out.println("SingletonLazy created");
	}

	public static SingletonLazy getSingletonLazy() {
		if (singletonLazy == null) {
			singletonLazy = new SingletonLazy();
		}
		return singletonLazy;
	}
}
