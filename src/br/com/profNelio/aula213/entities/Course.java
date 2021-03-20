package br.com.profNelio.aula213.entities;

import java.util.ArrayList;
import java.util.List;

public class Course {

	private String nameCourse;
	private Teacher teacher;
	
	List<Student> students = new ArrayList<Student>();

	public Course(String nameCourse, Teacher teacher) {
		this.nameCourse = nameCourse;
		this.teacher = teacher;
	}

	public String getNameCourse() {
		return nameCourse;
	}

	public void setNameCourse(String nameCourse) {
		this.nameCourse = nameCourse;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public Teacher getTeacher() {
		return teacher;
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public void removeStudent(Student student) {
		students.remove(student);
	}
	
	public List<Student> getStudent(){
		return students;
	}
		
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Course: ");
		sb.append(nameCourse);
		sb.append(" Teacher: ");
		sb.append(teacher.getName());
		return sb.toString();
	}
}
