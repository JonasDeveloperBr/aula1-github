package br.com.profNelio.aula204.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

	List<T> list = new ArrayList<>();
	
	public void addValue(T value) {
		list.add(value);
	}
	
	public T first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return list.get(0);
	}
	
	public void print() {
		System.out.print("[");
		if (!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for (int i=1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
		
		
//		String valReturn = "[";
//		if (!list.isEmpty()) {
//			for (int i=0; i<list.size(); i++) {
//				valReturn += (i>0 ? ", " : "") + list.get(i);
//			}
//		}
//		System.out.println(valReturn + "]");
	}
}
