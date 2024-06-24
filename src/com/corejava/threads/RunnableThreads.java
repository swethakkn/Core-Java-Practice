package com.corejava.threads;
// Thread class actually implements Runnable so we use implements instaed of extends
class C implements Runnable{
	public void run(){
		for(int i=0;i<=100;i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
class D implements Runnable{
	public void run(){
		for(int i=0;i<=100;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class RunnableThreads {
	public static void main(String[] args) {
		Runnable obj1 = new C ();
		// Instead of writing C class try to do with lambda expression as below
		/*
		 * Runnable obj1 = ()-> { for (int i=0;i<=10;i++) { System.out.println("Hi"); try
		 * { Thread.sleep(5); } catch (InterruptedException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); } }
		 * 
		 * };
		 * Thread t1 = new Thread(obj1);
		 * t1.start
		 */
		// same use Lambda expression with obj2 object instead of writing D class
		Runnable obj2 = new D();
		obj1.run();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj2.run();
		
		
	}

}
