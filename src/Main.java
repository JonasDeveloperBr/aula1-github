import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
//		double x = 10.35784;
//		
//		System.out.println(x);//Imprime o valor da variável
//		System.out.printf("%.2f%n", x);//Imprime o valor da variável formatado com DUAS casas decimais
//		System.out.printf("%.4f%n", x);//Imprime o valor da variável formatado com QUATRO casas decimais
		
		//Exercício de fixação
//		String product1 = "Computer";
//		String product2 = "Office desk";
//		
//		int age = 30;
//		int code = 5290;
//		char gender = 'F';
//		
//		double price1 = 2100.0;
//		double price2 = 650.50;
//		double measure = 53.234567;
//		
//		System.out.println("Products:");
//		System.out.printf("Computer, wich price is $ %.2f%n", price1);
//		System.out.printf("Office desk, which price is $ %.2f%n", price2);
//		
//		System.out.println();
//		System.out.println("Record: " + age + " years old, code " + code + " and gender: " + gender);
//		System.out.println();
//		
//		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
//		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
//		Locale.setDefault(Locale.US);
//		System.out.printf("US decimal point: %.3f%n", measure);
		
		Set<String> set = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qtd: ");
		int n = Integer.parseInt(sc.nextLine());

		for (int i=1; i<=n; i++) {
			String name = sc.nextLine();
			set.add(name);
		}
		
		System.out.println();
		System.out.println(set.size());
		System.out.println();
		
		for (String list : set) {
			System.out.println(list.toString());
		}
		
//		for (int i=0; i<=set.size(); i++) {
//			System.out.println();
//		}

	}

}
