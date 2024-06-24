package com.corejava.threads;

public class ThreadPriorityAndSleep {
	public static void main(String[] args) {
		A obj1 = new A();
		B obj2 = new B();
		
		// gives the default priority of the thread assigned by the scheduler
		// default is 5, min is 1;max is 10
		System.out.println(obj1.getPriority());
		
		// we can set a priority, but this is just a suggestion to scheduler. 
		//obj2.setPriority(9);
		//obj2.setPriority(Thread.MAX_PRIORITY);
		obj1.start();
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj2.start();
		

	}

}
