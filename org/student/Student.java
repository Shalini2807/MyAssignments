package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("Shalini");
	}
	public void studentDept() {
		System.out.println("ComputerTechnology");
	}
	public void studentId() {
		System.out.println("15UCT140");
	}
	public static void main(String[] args) {
			Student student=new Student();
			student.collegeCode();
			student.collegeName();
			student.collegeRank();
			student.deptName();
			student.studentName();
			student.studentDept();
	}
}
