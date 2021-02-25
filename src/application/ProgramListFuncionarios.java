package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.FuncionarioList;

public class ProgramListFuncionarios {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employee will be registered? ");
		int quantidadeDeFuncionariosParaRegistrar = sc.nextInt();
//		sc.nextLine();
		
		List<FuncionarioList> listFuncionario = new ArrayList<>();
		int idFuncionario;
		
		//Part 1 - Reading and Input data
		for (int i = 0; i < quantidadeDeFuncionariosParaRegistrar; i++) {
			System.out.println();
			System.out.println("Employee #"+ (i+1) +":");
			
			System.out.print("Id: ");
			idFuncionario = sc.nextInt();
			
			//Verificar se id já exist
			while (hasId(listFuncionario, idFuncionario)) {
				System.out.println("Id already taken. Try again: ");
				idFuncionario = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();			
			String nomeFuncionario = sc.nextLine();
			System.out.print("Salary: ");
			double salarioFuncionario = sc.nextDouble();

			listFuncionario.add(new FuncionarioList(idFuncionario, nomeFuncionario, salarioFuncionario));
		}
		
		//Part TWO - Increase of salary
		System.out.print("Enter the employee id that will have salary increase: ");
		idFuncionario = sc.nextInt();
		boolean existEmployee = false;
		for (FuncionarioList funcionarioList : listFuncionario) {
			if (funcionarioList.getIdFuncionario() == idFuncionario) {
				System.out.print("Enter the percentage: ");
				funcionarioList.increaseSalary(sc.nextDouble());
				existEmployee = true;
			}
		}
		if (!existEmployee) {
			System.out.println("This id does not exist!");
		}
		
		//Part three - Listing employees
		System.out.println();
		System.out.println("List of employees: ");
		for (FuncionarioList funcionarioList : listFuncionario) {
			System.out.println(funcionarioList);
		}
		

		sc.close();
	}
	
	public static boolean hasId(List<FuncionarioList> list, int id) {
		FuncionarioList emp = list.parallelStream().filter(x -> x.getIdFuncionario() == id).findFirst().orElse(null);
		return emp != null;
	}

}
