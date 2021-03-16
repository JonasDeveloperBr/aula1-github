package br.com.profNelio.aula199.application;

import br.com.profNelio.aula199.devices.Printer;
import br.com.profNelio.aula199.devices.Scanner;

public class Program {

	public static void main(String[] args) {
		Printer p = new Printer("1080");
		p.processDoc("My letter");
		p.print("My letter");
		
		Scanner s = new Scanner("2003");
		s.processDoc("My email");
		System.out.println("Scan result: " + s.scan());
	}
}
