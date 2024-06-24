package com.corejava.switchstatement;

public class Switchcase {
	public static void main(String[] args) {
		int num =3;
		/*
		if(num  ==1)
			System.out.println("Monday");
		else if(num==2)
			System.out.println("Tuesday");
		else if(num==3)
			System.out.println("Wednesday");
		else if(num==4)
			System.out.println("Thursday");
		else if(num==5)
			System.out.println("Friday");
		else if(num==6)
			System.out.println("Saturday");
		else if(num==7)
			System.out.println("Sunday");
		else
			System.out.println("Please enter a valid number!");
			*/
		//Instead of these many elseif use switch case as below
		switch (num) {
		case 1:
			System.out.println("Monday");
			break; // if one case is true then it executes all cases after that
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Please enter a valid number!");
			//no need of break here bcoz no cases are here after default to execute
		}
			
		
	}

}
