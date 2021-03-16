package br.com.profNelio.aula200.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @param args
 * 
 * This class implement list of the String with txt file,
 * the file contents have no separator, that is, each 
 * line is a value.
 *
 */
public class ProgramWithInterfaceComparable {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		String path = "C:\\temp\\in2.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String name = br.readLine();
			while (name != null) {
				list.add(name);
				name = br.readLine();
			}
			Collections.sort(list);
			for (String string : list) {
				System.out.println(string);
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
}
