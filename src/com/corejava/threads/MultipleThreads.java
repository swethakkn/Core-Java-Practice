package com.corejava.threads;

/* to make class as a thread use extends thread.
Thread class must have run method which is called when we start a thread*/
class A extends Thread{
	public void run(){
		for(int i=0;i<=10;i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
class B extends Thread{
	public void run(){
		for(int i=0;i<=10;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class MultipleThreads {
	public static void main(String[] args) {
		A obj1 = new A();
		B obj2 = new B();
		// to execute threads
		obj1.start();
		obj2.start();
		
	}

}
