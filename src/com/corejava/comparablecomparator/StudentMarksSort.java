package com.corejava.comparablecomparator;

import java.util.Comparator;

public class StudentMarksSort implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.getStuMarks()< o2.getStuMarks())
			return -1;
		else if(o1.getStuMarks()> o2.getStuMarks())
			return 1;
		else 
			return 0;
	}
	

}
