import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String alunos[] = new String [3];
		int notas[]= new int [3];
		int soma = 0, media = 0;
		
		for(int i=0;i<alunos.length;i++) {
			System.out.println("Digite o Nome do Aluno " + (i+1));
			alunos[i] = leitor.next();
			System.out.println("Digite a Nota do Aluno " + (i+1));
			notas[i] = leitor.nextInt();
			soma = soma + notas[i];
			
		}
		
		media = soma / notas.length;
		System.out.println("A média da sala é:  " + media);
		
		for(int i=0;i<alunos.length;i++) {
			if(notas[i]<=5) {
				System.out.println("Chamar o Aluno(a) " + alunos[i] + " para conversar");
			}
		}
		
		leitor.close();
	}

}
