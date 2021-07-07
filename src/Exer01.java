import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String atividades[] = new String [3];
		int opcao=0;
		
		for(int i=0;i<atividades.length;i++) {
			System.out.println("Informe atividade " + (i+1) + "!");
			atividades[i] = leitor.nextLine();
		}
		
		System.out.println("Escolha a forma como os valores devem ser apresentados:");
		System.out.println("Digite 01 - Atividade Crescente. ");
		System.out.println("Digite 02 - Atividade Crescente. ");
		System.out.println("Digite 03 - Para não apresentar. Encerrar o programa ");
		opcao = leitor.nextInt();
		
		switch (opcao){
		case 1:
			for(int i=0;i<atividades.length;i++) {
				System.out.println("Atividade " + (i-1) + "!" + atividades[i]);
			}
			break;
		case 2:
			for(int i=atividades.length-1;i>=0;i--) {
				System.out.println("Atividade " + i + "!" + atividades[i]);
			}
			break;
		case 3:
			System.out.println("O Program foi encerrado!");
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
		leitor.close();
	}

}
