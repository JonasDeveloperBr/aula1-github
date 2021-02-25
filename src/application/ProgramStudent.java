package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ProgramStudent {

	public static void main(String[] args) {
		
		//Preparation
		boolean isPass;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student newStudent = new Student();
		
		//Input
		newStudent.setNameStudent(sc.nextLine());
		newStudent.setNota1(sc.nextDouble());
		newStudent.setNota2(sc.nextDouble());
		newStudent.setNota3(sc.nextDouble());
		
		//Output
		System.out.printf("FINAL GRADE = %.2f%n", newStudent.showFinalScore());
		isPass = newStudent.statusOfStudent();
		System.out.println(isPass ? "PASS" : "FAILED");
		
		if (!isPass)
			System.out.printf("MISSING %.2f" + " POINTS", newStudent.calcRemainingPoints());

		sc.close();
	}

}
