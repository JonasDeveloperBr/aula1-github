package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramFirstList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco"); //adiciono este elemento na posição 2
		
		System.out.println(list.size());
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------------");
		list.removeIf(x -> x.charAt(0) == 'M');//remove todos os elementos da lista se o valor da primeira posição do elemento for igual a 'M'
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("------------------------------");
		//Cria uma lista de nome result, recebenco uma lista filtrada contendo apenas os elementos que inicia com 'A'. Obs.: "collect(Collectors.toList())" este comando converte o stream em lista
		//Filter contem uma expressão lambda (assunto que será abordado no futuro)
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String string : result) {
			System.out.println(string);
		}

	}

}
