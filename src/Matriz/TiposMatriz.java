package Matriz;
import java.util.Scanner;
public class TiposMatriz {

	public static void main(String[] args) {
		
		//Variaveis
		int matriz[][] = new int[4][4];
		int i,j;
		
		//Entrada Matriz
		Scanner teclado = new Scanner(System.in);
		for(i=0; i<4; i++) {
			for(j=0; j<4; j++) {
				System.out.printf("Posição [" + i + "][" + j + "]: ");
				int x = teclado.nextInt();
				matriz[i][j] = x;
			}
		}
	
		
		//Escolher Opção
		boolean finish = false;
		do {
		System.out.println("\n MENU DE OPÇÕES");
		System.out.println("---------------");
		System.out.println("[1] Mostrar a Matriz");
		System.out.println("[2] Diagonal Principal");
		System.out.println("[3] Triângulo Superior");
		System.out.println("[4] Triângulo Inferior");
		System.out.println("[5] Sair");
		System.out.printf("--- Escolha uma Opção: ");
		int opcao = teclado.nextInt();
		
		
		//Selecionando opção escolhida
		if(opcao == 1) {		
			//Mostrar a Matriz
			System.out.printf("\n");
			for(i=0; i<4; i++) {
				for(j=0; j<4; j++) {
					System.out.print(" " + matriz[i][j]);
				}
				System.out.printf("\n");
			}
		}else if(opcao == 2) {		
				//Diagonal Principal
				System.out.printf("\n");
				for(i=0; i<4; i++) {
					for(j=0; j<4; j++) {
						if(i == j) {
							System.out.printf(" " + matriz[i][j]);
						}
						System.out.printf("  ");
					}
					System.out.printf("\n");
				}
			}else if(opcao == 3) {
					//Triangulo Superior
				    System.out.printf("\n");
					for(i=0; i<4; i++) {
						for(j=0; j<4; j++) {
							if(i < j) {
								System.out.printf(" " + matriz[i][j]);
							}else {
							System.out.printf("  ");
							}
						}
						System.out.printf("\n");
					}
				}else if(opcao == 4) {
						//Triangulo Inferior
						for(i=0; i<4; i++) {
							for(j=0; j<4; j++) {
								if(i > j) {
									System.out.printf(" " + matriz[i][j]);
								}
							}
							System.out.printf("\n");
						}
				}else if(opcao == 5) {
					finish = true;
					System.out.println("\n FINALIZADO!!");
				}
		}while( finish == false);
	}

}
