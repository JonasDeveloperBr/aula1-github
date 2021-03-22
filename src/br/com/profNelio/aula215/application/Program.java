package br.com.profNelio.aula215.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Program {

	public static void main(String[] args) {

		System.out.println("Start");

		try (BufferedReader br = new BufferedReader(new FileReader("c:\\temp\\totalDeVotosPorUrna.txt"))) {

			Map<String, Integer> votes = new HashMap<>();

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				Integer vote = Integer.parseInt(fields[1]);

				if (votes.containsKey(name)) {
					vote += votes.get(name);
					votes.put(name, vote);
				} else {
					votes.put(name, vote); //put in Map
				}

				line = br.readLine();	//next line
			}
			
			for (String key : votes.keySet()) {
				System.out.println(key +": "+ votes.get(key));
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
