import java.util.Random;

public class Exer03 {

	public static void main(String[] args) {
		Random gerar = new Random();
		int vetor[] = new int [3];
		int qtd01 = 0, qtdPares = 0, qtd03 = 0, qtdImpares = 0;
		
		for(int i=0;i<vetor.length; i++) {
			vetor[i] = gerar.nextInt(9);
		}
		
		for(int i=0;i<vetor.length; i++) {
			
			if(vetor[i]>=3 && vetor[i]<=7) {
				qtd01 = qtd01 + 1;
				
			}if(vetor[i]<3) {
				qtd03 = qtd03 + 1;
				
			}if (vetor[i] % 2 == 0) {
				qtdPares = qtdPares + 1;
			}else {
				qtdImpares =  qtdImpares + 1;
				}
		}
		
		for(int i=0;i<vetor.length; i++) {
			System.out.println("Valor na posição " + i + " é igual a " + vetor[i]);
		}
		System.out.println("A quantidade de números entre 3 e 7 é igual a: " + qtd01);
		System.out.println("Quantidade de números pares é igual a: " + qtdPares);
		System.out.println("A quantidade de números menores que 3 igual a: " + qtd03);
		System.out.println("Quantidade de números impares é igual a: " + qtdImpares);
	}

}
