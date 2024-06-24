package com.corejava.enhancedforloop;

import com.corejava.arrayofobjects.Student;

public class EnhancedForLoop {
	public static void main(String[] args) {
		
		// Creating 3 student objects by importing from arrayofobjects.Students package and assigning the values for each object
		Student S1 = new Student();
		S1.Rollno = 1;
		S1.Name = "Swetha";
		S1.Marks = 97;

		Student S2 = new Student();
		S2.Rollno = 2;
		S2.Name = "Venkat";
		S2.Marks = 93;

		Student S3 = new Student();
		S3.Rollno = 3;
		S3.Name = "Rithwik";
		S3.Marks = 99;

		// Creating a student array
		Student students[] = new Student[3];

		// assigning each student object to array
		students[0] = S1;
		students[1] = S2;
		students[2] = S3;

		// printing each student name and marks using enhanced for loop
		//iterates and assigns one value of students array to Student type of variable stud every time until it ends 
		for (Student stud : students) {
			System.out.println(stud.Name + ":" + stud.Marks);
		}
			
			

	}

}
