package br.com.profNelio.aula213.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import br.com.profNelio.aula213.entities.Course;
import br.com.profNelio.aula213.entities.Student;
import br.com.profNelio.aula213.entities.Teacher;

public class ProgramUniversity {

	public static void main(String[] args) {

		Set<Course> courses = new HashSet<Course>();
		Set<Teacher> teacherNames = new HashSet<>();
		Set<Student> studentNames = new HashSet<>();

		Scanner sc = new Scanner(System.in);

		System.out.print("How many Courses do you want to register? ");
		int totalCourses = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <= totalCourses; i++) {
			System.out.println();
			System.out.print("What is the name of the " + i + "ª course? ");
			String courseName = sc.nextLine();
			System.out.print("Please, entry Teacher name: ");
			String teacherName = sc.nextLine();
			
			Teacher newTeacher = new Teacher(teacherName);
			teacherNames.add(newTeacher);

			courses.add(new Course(courseName, newTeacher));

			System.out.print("How many Students do you want to register in this Course? ");
			int totalStudents = Integer.parseInt(sc.nextLine());
			for (int y = 1; y <= totalStudents; y++) {
				System.out.print(" Student name: ");
				String studentName = sc.nextLine();

				for (Course course : courses) {
					if (course.getNameCourse().equals(courseName)) {
						course.addStudent(new Student(studentName));
					}
				}
			}
		}

		System.out.println();
		for (Course course : courses) {
			System.out.println(course);
			System.out.print("Students of the course:");
			for (Student students : course.getStudent()) {
				System.out.print("\n " + students.getName());
			}
			System.out.println();
		}
		
		//Show total of students
		for (Course x : courses) {
			for (Student y : x.getStudent()) {
				studentNames.add(y);
			}
			for (Teacher z : teacherNames) {
				teacherNames.add(z);
			}
		}
		
		System.out.println();
		System.out.println("-------------------------------");
		System.out.println();
		System.out.println("Total of Teachers: " + teacherNames.size());
		System.out.println();
		
		System.out.println("Total of students: " + studentNames.size());
		System.out.println();
		
		for (Course x : courses) {
			//Show total of students per Course
			System.out.println(x.getNameCourse() + " course has " + x.getStudent().size() + " students");
			System.out.println();
			//List students per Teacher
			System.out.print("Students of the teacher " + x.getTeacher().getName() + ":");
			for (Student y : x.getStudent()) {
				System.out.print("\n" + y.getName());
			}
			System.out.println();
		}
		

		sc.close();
	}

}
