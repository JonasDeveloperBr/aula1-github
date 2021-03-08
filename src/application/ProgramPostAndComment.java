package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import entities.Comment;
import entities.CommentProfessor;
import entities.Post;
import entities.PostProfessor;


public class ProgramPostAndComment {

	public static void main(String[] args) throws ParseException {
		
		boolean lifeApplication = true;
		
		//Splash abertura do programa
		splash();
		
		while (lifeApplication) {
			lifeApplication = controlNavigator();
		}
		
	}
	
	private static void splash() {
		Calendar newCalendar = Calendar.getInstance();
		SimpleDateFormat simpDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date dateToday = newCalendar.getTime();

		System.out.println("|================================================|");
		System.out.println("|          Olá, bem vindo ao InstaCode           |");
		System.out.println("|------------------------------------------------|");
		System.out.println("|Hoje: " + simpDateFormat.format(dateToday) + addSpace(23) + "|");
		System.out.println("|" + addSpace(48) + "|");
		System.out.println("|================================================|");
		System.out.println();
		System.out.println();		
	}
	
	private static String addSpace(int numberOfSpace) {
		String returnString = "";
		
		for(int i=1; i<=numberOfSpace; i++) {
			returnString += " ";
		}
		
		return returnString;
	}
	
	private static boolean controlNavigator() throws ParseException {
		boolean returnBoolean = true;
		int nOption;
		Scanner scannerNavigator = new Scanner(System.in);
		
		System.out.println("Qual versão do sistema deseja usar:"
				+ "\n 1 - 1º versão (construida sem consultar o exemplo do professor)"
				+ "\n 2 - 2º versão (cópia do exemplo do professor)"
				+ "\n 3 - 3º versão (evolução das duas versões, visando mais dinamismo e usabilidade"
				+ "\n"
				+ "\n 0 - Encerrar o programa");
		
		if (scannerNavigator.hasNextInt()) {
			System.out.println("TEM");
		} else {
			System.out.println("NÃOOOOOOOOOOOOOOOO");
			//Não encontrei uma solução para resolver o problema "java.util.NoSuchElementException" quando este método é chamado pela segunda vez.
		}
		nOption = Integer.parseInt(scannerNavigator.nextLine());
		
		switch (nOption) {
			case 1 :
				solucaoDoAluno();
				break;
			case 2 :
				solucaoDoProfessor();
				break;
			case 3 :
				evolucaoDaSolucao();
				break;
			case 0 :
				System.out.println("Bye. See you soon...");
				returnBoolean = false;
				break;
			default:
				System.out.println("Opção inválida!");
				break;
		}
		
		scannerNavigator.close();
		return returnBoolean;
	}
	
	private static void solucaoDoAluno() {

		//Abertura do método
		System.out.println("|================================================|");
		System.out.println("|      Você está usando a PRIMEIRA versão       =|");
		System.out.println("|================================================|");
		System.out.println();
		System.out.println();
		
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		//Input Data
		System.out.print("Informe o título do Post: ");
		String title = sc.nextLine();

		Calendar cal = Calendar.getInstance();
		Date datePost = cal.getTime();
		System.out.print("Informe o conteúdo do post: ");
		String content = sc.nextLine();
		
		//Create a new Post
		Post post = new Post(datePost, title, content);
		
		//Input Comments and Likes
		System.out.print("Informe a quantidade de comentários: ");
		int countComment = Integer.parseInt(sc.nextLine());//sc.nextInt();
		//sc.nextLine();
		for (int i = 0; i < countComment; i++) {
			System.out.print("Informe o " + (i+1) + "º comentário: ");
			String newComment = sc.nextLine();
			Comment comment = new Comment(newComment);
			post.addComment(comment);
			System.out.print("Like: ");
			Integer likes = Integer.parseInt(sc.nextLine());//sc.nextInt();
			//sc.nextLine();
			post.setLikes(likes);
			System.out.println();
		}
		
		//Output
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println(post.getTitle());												//Traveling to New Zealand
		System.out.println(post.getLikes() + " Likes - " + sdf.format(post.getMoment()));	//12 Likes - 21/06/2018 13:05:44
		System.out.println(post.getContent());												//I'm going to visit this wonderful country!
		System.out.println("Comments:");
		for(Comment listComments : post.getComment()) {
			System.out.println(listComments.getText());
		}
		
		//Fechamento do método
		System.out.println();
		System.out.println();
		System.out.println("|================================================|");
		System.out.println("|                      Fim                       |");
		System.out.println("|================================================|");
		System.out.println();
		System.out.println();

		
		
//		System.out.print("Informe o conteúdo do post:");
//		String content = sc.nextLine();
//		System.out.println();
		
//		while(true) {
//			System.out.println("O que deseja fazer?"
//					+ "\n 1-Incluir novo Post"
//					+ "\n 2-Incluir comentário"
//					+ "\n 3-Like"
//					+ "\n"
//					+ "\n 0-Sair");
//			
//			String option = sc.nextLine();
//			
//			if (option.equals("1")) {
//				System.out.println("1-Incluir");
//			} else if(option.equals("2")) {
//				System.out.println("2-Incluir comentário");
//			} else if(option.equals("3")) {
//				System.out.println("Like");
//			} else if(option.equals("0")) {
//				System.out.println("Você escolheu sair do programa!\n Até breve...");
//				break;
//			}
//			
//			System.out.println();
//				
//		}
		
		sc.close();
	}

	private static void solucaoDoProfessor() throws ParseException {
		System.out.println("Entrou na solução do professor - Essa é uma cópia da solução apresentada pelo professor no curso");
		System.out.println();
		
		//Aqui inicio o Código do Professor (cópia fidedigna)
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		CommentProfessor c1 = new CommentProfessor("Have a nice trip!");
		CommentProfessor c2 = new CommentProfessor("Wow that's awesome!");
		PostProfessor p1 = new PostProfessor(
				sdf.parse("21/06/2018 13:05:04"),
				"Traveling to New Zealand",
				"I'm going to visit this wonderful contry!",
				12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1.toString());
	}
	
	private static void evolucaoDaSolucao() {
		System.out.println("Esse é um mix das duas primeiras soluções porem com uma proposta mais dinâmica e com mais usabilidade");
	}
}
