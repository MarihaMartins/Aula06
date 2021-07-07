import java.util.Scanner;

public class EntendendoVetores {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);		
		int vetor [] = new int [5];
		
		/*Vetor
		 * vetor [0] = 50;
		 */
		
		for(int i=0;i<5;i++) {
			System.out.println("Insira o valor; ");
			vetor[i] = leitor.nextInt();
		}
	
		for(int i=0;i<5;i++) {
			System.out.println("Valor digitado " + vetor[i]);
		}

	}

}
