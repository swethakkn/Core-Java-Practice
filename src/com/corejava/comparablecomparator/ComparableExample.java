package com.corejava.comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<>();
		students.add(new Student(2, "Swetha", 90));
		students.add(new Student(1, "Venkat", 92));
		students.add(new Student(4, "Vihaan", 98));
		students.add(new Student(3, "Rithwik", 95));
		System.out.println("Students before sorting : "+ students);
		Collections.sort(students);
		System.out.println("Students after sorting : "+ students);
		StudentNameSort studentNameSort = new StudentNameSort();
		Collections.sort(students, studentNameSort);
		System.out.println("Students after sorting by name : "+ students);
		StudentMarksSort studentMarksSort = new StudentMarksSort();
		Collections.sort(students, studentMarksSort);
		System.out.println("Students after sorting by marks : "+ students);
		

	}

}
