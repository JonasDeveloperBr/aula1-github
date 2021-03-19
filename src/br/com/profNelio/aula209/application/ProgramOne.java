package br.com.profNelio.aula209.application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProgramOne {

	public static void main(String[] args) {

		//HashSet does not guarantee the order of entry
		Set<String> set = new HashSet<>();
		
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		
		System.out.println(set.contains("Notebook"));
		
		for (String p : set ) {
			System.out.println(p);
		}
		
		System.out.println();
		System.out.println("Remove: Tablet");
//		set.remove("Tablet");
		//A forma de ler o caso abaixo é:
		//remova da lista o elemento x
		//se o mesmo for de tamanho >= 3
//		set.removeIf(x -> x.length() >= 3);
		set.removeIf(x -> x.charAt(0) == 'T');
		
		for (String p : set) {
			System.out.println(p);
		}
		
		System.out.println();
		System.out.println("----------------------------");
		System.out.println();
		
		//The TreeSet sorts the data 
		Set<String> setTreeSet = new TreeSet<>();
		
		setTreeSet.add("TV");
		setTreeSet.add("Tablet");
		setTreeSet.add("Notebook");
		
		System.out.println(setTreeSet.contains("Notebook"));
		
		for (String p : setTreeSet) {
			System.out.println(p);
		}
		
		System.out.println();
		System.out.println("Remove: Tablet");
		setTreeSet.remove("Tablet");
		for (String p : setTreeSet) {
			System.out.println(p);
		}

		System.out.println();
		System.out.println("----------------------------");
		System.out.println();
		
		//
		Set<String> setLinkedHashSet = new LinkedHashSet<>();
	
		setLinkedHashSet.add("TV");
		setLinkedHashSet.add("Tablet");
		setLinkedHashSet.add("Notebook");
		
		System.out.println(setLinkedHashSet.contains("Notebook"));
		
		for (String p : setLinkedHashSet) {
			System.out.println(p);
		}
		
		System.out.println();
		System.out.println("Remove: Tablet");
		setLinkedHashSet.remove("Tablet");
		for (String p : setLinkedHashSet) {
			System.out.println(p);
		}
	}
}
