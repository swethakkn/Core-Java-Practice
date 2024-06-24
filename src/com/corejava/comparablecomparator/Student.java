package com.corejava.comparablecomparator;

public class Student implements Comparable<Student>{
	private int stuId;
	private String stuName;
	private int stuMarks;
	public Student(int stuId, String stuName, int stuMarks) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuMarks = stuMarks;
	}
	public int getStuId() {
		return stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public int getStuMarks() {
		return stuMarks;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuMarks=" + stuMarks + "]";
	}
	@Override
	public int compareTo(Student student) {
		// TODO Auto-generated method stub
		return this.stuId - student.getStuId();
	}
	
	

}
