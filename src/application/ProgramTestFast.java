package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ProgramTestFast {

	public static void main(String[] args) throws ParseException {
		
//		SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		Calendar cal = Calendar.getInstance();
//		Date data = new Date();
//		System.out.println(cal.getTime());//This way print value "Wed Mar 03 05:47:18 AMT 2021"
//		data = cal.getTime();
//		System.out.println(data.toString());
//		System.out.println(formatDate.parse(data.toString()));
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String strDate = sdf.format(cal.getTime());//converte data e hora em string, formata e atribui na variável string criada
		System.out.println("Current date in string format: " + strDate);// 03/03/2021 08:38:07
		
		//Verificando o tipo de dado da variável
		System.out.println(strDate.getClass().getSimpleName());
		System.out.println(cal.getTime().getClass().getSimpleName());
		boolean valueBoolean = true;


		//Não mexer - Funcionou corretamente
		/*
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		System.out.print("Informe a Data (dd/mm/yyyy): ");
		Date dataInformada = formato.parse(sc.next());
		System.out.println(dataInformada.getClass().getSimpleName());
		System.out.println(dataInformada);
		System.out.println(formato.format(dataInformada).getClass().getName());
		System.out.println(formato.format(dataInformada));
		sc.close();
		*/
	}

}
