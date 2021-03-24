package br.com.profNelio.aula225.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		Stream<Integer> st1 = list.stream();
		System.out.println(Arrays.toString(st1.toArray()));
		
		//Apply function each to element of stream
		Stream<Integer> st2 = list.stream().map(x -> x * 10); //'(x -> x * 10)' Read each element and multiply it by ten.
		System.out.println(Arrays.toString(st2.toArray()));
		
		Stream<String> st3 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st3.toArray()));
		Stream<String> st4 = Stream.of("Maria", "Alex", "Bob").map(x -> x.toUpperCase());
		System.out.println( Arrays.toString(st4.toArray()) );
		Stream<String> st5 = Stream.of("jonas", "henrique", "nascimento").map(
					x -> x.substring(0, 1).toString().toUpperCase()+x.substring(1));
		System.out.println(Arrays.toString(st5.toArray()));
		
		Stream<Integer> st6 = Stream.iterate(0,  x -> x + 2);
		System.out.println(Arrays.deepToString(st6.limit(5).toArray()));
		
		Stream<Long> st7 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0]+p[1] }).map(p -> p[0]);
		System.out.println(Arrays.toString(st7.limit(10).toArray()));
		
		
		System.out.println();
		System.out.println("The end");
	}

}
