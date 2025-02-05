package com.sprk.utility;

import java.util.ArrayList;
import java.util.List;

import com.sprk.entity.Student;

public class Util {
	public List<Student> getStudents(){
		List<Student> students= new ArrayList<>();
		
		students.add(new Student("Rohan","Gupta"));
		students.add(new Student("Suyash","Sharma"));
		students.add(new Student("Rahul","Yadav"));
		students.add(new Student("Abdul Gani","Memon"));
		
		return students;
		
	}
}
