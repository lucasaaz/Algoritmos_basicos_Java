package Vetores;
import java.util.Scanner;
public class reservaCinema {
	public static void main(String[] args) {
	try (Scanner teclado = new Scanner(System.in)) {
		//CadeIras do cinema
		String cadeiras[] = {"b1", "b2", "b3", "b4", "b5", "b6"};	
		int i;
		
		//Escolhendo cadeira do cinema
		char saida;
		do {

			System.out.println("\n------- Cadeiras -------");
			for(i=0; i<6; i++) {
				System.out.printf("[" + cadeiras[i] + "]");
			}
			
			System.out.printf("\nEscolha uma cadeira: ");
			String numCadeira = teclado.next();
			
			for(i=0; i<6; i++) {
				if(numCadeira.equals(cadeiras[i])) {
					cadeiras[i] = "--";
				}
			}
			
			System.out.printf("Continuar reservando? [s/n]");
			saida = teclado.next().charAt(0);
			
		}while( saida != 'n');
	}
		
		System.out.println("\nCadeiras reservadas com sucesso!!");
	}

}
