package com.corejava.trywithresources;

/*Finally block is used with try catch also only with try to execute the statements
whether try or catch is executed. generally we use finally block to close the resources
see in TryWithResources.java file 
*/
public class TryCatchFinal {
	public static void main(String[] args) {
		int i = 9;
		int j = 0;
		try {
			j = 18/i;
			System.out.println(j);
			
		} 
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Something went wrong.." + e);
		}
		finally {
			System.out.println("Job Done");
		}
	}

}
