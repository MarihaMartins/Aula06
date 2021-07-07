import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		double alunos[] = new double[10];
		double total = 0;
		Scanner leitor = new Scanner(System.in);
		
		//Alterar para que o for leia o tamanho vetor alunos.length
		for (int i=0;i<alunos.length;i++) {
			System.out.println("Por favor, digite o consumo do 1º aluno");
			alunos[i] = leitor.nextDouble();
			total = total + alunos[i];
		}
		
		for(int i=0;i<alunos.length;i++) {
			System.out.println("O aluno 1 consumiu R$" + alunos[1]);
		}
		
		System.out.println("O total de consumo foi de R$" + total);
		
		leitor.close();
		
	}

}
