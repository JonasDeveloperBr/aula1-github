package br.com.profNelio.aula196.aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import br.com.profNelio.aula196.entities.Contrato;
import br.com.profNelio.aula196.entities.Parcelas;
import br.com.profNelio.aula196.services.ContractService;
import br.com.profNelio.aula196.services.PaypalService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.println("Enter contract data");
			System.out.print("Number: ");
			int numberContract = sc.nextInt();
			System.out.print("Date (DD/MM/YYYY): ");
			Date dateContract = sdf.parse(sc.next());
			System.out.print("Contract value: ");
			double valueContract = sc.nextDouble();
			
			Contrato contrato = new Contrato(numberContract, dateContract, valueContract);
			
			System.out.print("Enter number of installments: ");
			int numberInstallment = sc.nextInt();
			
			ContractService contractService = new ContractService(new PaypalService());
			
			contractService.processContract(contrato, numberInstallment);
			
			System.out.println("Installments:");
			for (Parcelas parcelas : contrato.getParcelas()) {
				System.out.println(parcelas);
			}
			
		} catch (ParseException e){
			System.out.println("A data deve ser informada no formato (DD/MM/YYYY)!");
		}
		
		
		
		sc.close();
	}
}
