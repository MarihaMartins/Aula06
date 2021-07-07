import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int matriz[][] = new int [5][2];
		
		//Atribuir manualmente
		//matriz[0][1] = 99;
		//Leitor de Dados
		for(int linha=0;linha<5;linha++) {
			for(int coluna=0;coluna<2;coluna++) {
				System.out.println("Insira o valor para linha " + linha + " e coluna " + coluna);
				matriz[linha][coluna] = leitor.nextInt();			
				
			}
		}
		//Apresentando Dados
		for(int linha=0;linha<5;linha++) {
			for(int coluna=0;coluna<2;coluna++) {
				System.out.println("Valor para linha " + linha + " e coluna " + coluna);
				System.out.println("Segue Valor Inserido: " + matriz[linha][coluna]);
			}
		}
		
		
		leitor.close();
	}

}
