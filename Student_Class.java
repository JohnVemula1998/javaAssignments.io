package com.geekster;

public class Student_Class {
	private int StudentId;
	private String StudentName;
	private int StudentAge;
	private String StudentBranch;
	private String StudentYear;
	private String StudentCollege;
	
	
	public void SetStudentId(int StudentId) {
		this.StudentId = StudentId;
	}
	public void SetStudentName(String StudentName) {
		this.StudentName = StudentName;
	}
	
	public void SetStudentAge(int StudentAge) {
		this.StudentAge = StudentAge;
	}
	
	public void SetStudentBranch(String StudentBranch) {
		this.StudentBranch = StudentBranch;
	}
	public void SetStudentYear(String StudentYear) {
		this.StudentYear = StudentYear;
	}
	
	public void SetStudentCollege(String StudentCollege) {
		this.StudentCollege = StudentCollege;
	}
	
	public int GetStudentId() {
		return StudentId;
	}
	
	public int GetStudentAge() {
		return StudentAge;
	}
	public String GetStudentName() {
		return StudentName;
	}
	
	public String GetStudentBranch() {
		return StudentBranch;
	}
	
	public String GetStudentYear() {
		return StudentYear;
	}
	
	public String GetStudenCollege() {
		return StudentCollege;
	}

}
