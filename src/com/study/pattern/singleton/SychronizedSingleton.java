/**
 * 
 */
package com.study.pattern.singleton;

/**
 * @author rajan
 *
 */
public class SychronizedSingleton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Thread t1= new Thread(new Runnable() {
			
			@Override
			public void run() {
				//lazy loading is not working in multi thread
				//SingletonLazy singletonLazy1=SingletonLazy.getSingletonLazy();
				
				
				// synchronized lazy loading
				SingletonLazySync singletonLazySync1=SingletonLazySync.getSingletonLazySync();
				
			}
		});
		
		Thread t2= new Thread(new Runnable() {
			
			@Override
			public void run() {
				//SingletonLazy singletonLazy2=SingletonLazy.getSingletonLazy();
				SingletonLazySync singletonLazySync2=SingletonLazySync.getSingletonLazySync();
				
			}
		});
		
		t1.start();
		t2.start();
		
//		
//		

	}

}




/**
 * @author rajan
 * 
 * singleton with lazy loading with synchronized key word
 * use of synchronized key word in get instance method affect performance. x*100 more than normal execution time x millisecond
 *
 */
class SingletonLazySync {
	public static SingletonLazySync singletonLazySync;

	private SingletonLazySync() {
		System.out.println("SingletonLazy created");
	}

	public static synchronized SingletonLazySync getSingletonLazySync() {
		if (singletonLazySync == null) {
			singletonLazySync = new SingletonLazySync();
		}
		return singletonLazySync;
	}
}