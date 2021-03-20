package br.com.profNelio.aula215.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import br.com.profNelio.aula214.entites.Political;

public class Program {

	public static void main(String[] args) {

		System.out.println("Start");
		
		try (BufferedReader br = new BufferedReader(new FileReader("c:\\temp\\totalDeVotosPorUrna.txt"))){
			
			Map<Political, Integer> votes = new HashMap<>();
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				Integer vote = Integer.parseInt(fields[1]);
				
				Political p = new Political(name, vote);
				if (votes.containsKey(p)) {
					for (Political polList : votes.keySet()) {
						if (polList.getName().equals(p)) {
							polList.setVote(polList.getVote() + vote);
						}
					}
				} else {
					votes.put(p, vote);
				}
				
				line = br.readLine();
			}
			
			for (Political polListEnd : votes.keySet()) {
				System.out.println(polListEnd.getName() + " - " + polListEnd.getVote());
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
