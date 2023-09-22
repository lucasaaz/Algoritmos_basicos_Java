package Vetores;
import java.util.Scanner;
public class colocarOrdem {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Ordem
		System.out.println("\n---- Colocar em Ordem ----\n");
		
		//Quantidades de numeros
		System.out.printf("Quantidade de numeros: ");
		int totNum = teclado.nextInt();
		
		//Escolher numeros
		int numeros[] = new int[totNum];
		int i, cont;
		for(i=0; i<totNum; i++) {
			cont = i+1;
			System.out.printf("Numero " + cont + "°: ");
			numeros[i] = teclado.nextInt();
		}
			
		//Ordem (antes)
		System.out.printf("\nAntes:\n");
		for(i=0; i<totNum; i++) {
			System.out.printf("[" + numeros[i] + "] ");
		}
		
		//Colocar em ordem
		int j;
		int aux;
		for(i=0; i<totNum; i++) {
			for(j=i+1; j<totNum; j++) {
				if(numeros[i] > numeros[j]) {
					aux = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = aux;
				}
			}
		}
		
		//Ordem (depois)
		System.out.printf("\nDepois:\n");
		for(i=0; i<totNum; i++) {
			System.out.printf("[" + numeros[i] + "] ");
		}
		
	}

}
