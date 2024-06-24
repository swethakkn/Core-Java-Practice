package com.corejava.threadsracecondition;

class Counter{
	int count;
	// synchronized keyword is used to avoid thread race condition that this method is only used by one thread at once
	
	public synchronized void increment() {
		count++;
	}
}

public class RaceCondition {
	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		Runnable obj1 = ()-> {
			for(int i=0;i<1000;i++) {
				/*
				 * System.out.println("Hi"); try { Thread.sleep(10); } catch
				 * (InterruptedException e) { // TODO Auto-generated catch block
				 * e.printStackTrace(); }
				 */
				c.increment();
			}
		};
		Runnable obj2 = () -> {
			for(int i=0;i<1000;i++) {
				/*
				 * System.out.println("Hello"); try { Thread.sleep(10); } catch
				 * (InterruptedException e) { // TODO Auto-generated catch block
				 * e.printStackTrace(); }
				 */
				c.increment();
			}
		};
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
		//Thread.join is used to execute the next statement only after completing the thread
		//means it wails till the thread joins the main method after finishing the job
		t1.join();
		t2.join();
		
		System.out.println(c.count);
		
		
		
	}

}
