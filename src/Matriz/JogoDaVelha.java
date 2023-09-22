package Matriz;

import java.util.Scanner;

public class JogoDaVelha {

	public static void main(String[] args) {
		
		
		//Variaveis gerais
		String matrizVelha[][] = new String[3][3];
		int i,j, cont = 1;
		
		//Montar cenário
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				matrizVelha[i][j] = "| " + cont + " ";
				System.out.printf(matrizVelha[i][j]);
				cont++;
			}
			System.out.println("|\n----+---+---+");
		}
		
		try (//Marcar O ou X
		Scanner teclado = new Scanner(System.in)) {
			boolean finish = false;
			
			while(finish != true) {
				
							
				//Vez do jogador1 jogar
				System.out.printf("Vai jogar [O] em qual posição? ");
				int jogador1 = teclado.nextInt();
				cont = 1;
				
				for(i=0; i<3; i++) {
					for(j=0; j<3; j++) {
						if(jogador1 == cont && matrizVelha[i][j] != "| X ") {
							matrizVelha[i][j] = "| O ";
							System.out.printf(matrizVelha[i][j]);
							cont++;
						}else {
							System.out.printf(matrizVelha[i][j]);
							cont++;
						}
					}
					System.out.println("|\n----+---+---+");
				}
				
				
				//Ver se jagador1[O] GANHOU nas linhas
				int resultadoO = 0;
				for(i=0; i<3; i++) {
					for(j=0; j<3; j++) {
						if(matrizVelha[i][j] == "| O ") {
							resultadoO++;
						}
						if(resultadoO == 3) {
							finish = true;
							System.out.printf("\n Parabens, seu pinto cresceu 1 cm, agr vc tem 2 cm!");
							return;
						}
					}
					resultadoO = 0;
				}
				//Ver se jagador1[O] GANHOU nas colunas
				for(j=0; j<3; j++) {
					for(i=0; i<3; i++) {
						if(matrizVelha[i][j] == "| O ") {
							resultadoO++;
						}
						if(resultadoO == 3) {
							finish = true;
							System.out.printf("\n Parabens, seu pinto cresceu 1 cm, agr vc tem 2 cm!!");
							return;
						}
					}
					resultadoO = 0;
				}
				//Ver se jagador1[O] GANHOU na diagonal principal
				for(j=0; j<3; j++) {
					for(i=0; i<3; i++) {
						if(i==j) {
							if(matrizVelha[i][j] == "| O ") {
								resultadoO++;
							}
							if(resultadoO == 3) {
								finish = true;
								System.out.printf("\n Parabens, seu pinto cresceu 1 cm, agr vc tem 2 cm!");
								return;
							}
						}
					}
				}
				//Ver se jagador1[O] GANHOU na diagonal secundaria
				resultadoO = 0;
				for(i=0; i<3; i++) {
					for(j=0; j<3; j++) {
						if((i==0 && j==2) || (i==1 && j==1) || (i==2 && j==0)) {
							if(matrizVelha[i][j] == "| O ") {
								resultadoO++;
							}
							if(resultadoO == 3) {
								finish = true;
								System.out.printf("\n Parabens, seu pinto cresceu 1 cm, agr vc tem 2 cm!");
								return;
							}
						}
					}
				}
				
				
				
				//____________________________________________________________//
				
				
				
				//Vez do jogador2 jogar
				System.out.printf("Vai jogar [X] em qual posição? ");
				int jogador2 = teclado.nextInt();
				cont = 1;
				
				for(i=0; i<3; i++) {
					for(j=0; j<3; j++) {
						if(jogador2 == cont && matrizVelha[i][j] != "| O ") {
							matrizVelha[i][j] = "| X ";
							System.out.printf(matrizVelha[i][j]);
							cont++;
						}else {
							System.out.printf(matrizVelha[i][j]);
							cont++;
						}
					}
					System.out.println("|\n----+---+---+");
				}
						
				
				//Ver se jagador2[X] GANHOU nas linhas
				int resultadoX = 0;
				for(i=0; i<3; i++) {
					for(j=0; j<3; j++) {
						if(matrizVelha[i][j] == "| X ") {
							resultadoX++;
						}
						if(resultadoX == 3) {
							System.out.printf("\n Jogador2 GANHOUU!");
							finish = true;
							return;
						}
					}
					resultadoX = 0;
				}
				//Ver se jagador2[X] GANHOU nas colunas
				for(j=0; j<3; j++) {
					for(i=0; i<3; i++) {
						if(matrizVelha[i][j] == "| X ") {
							resultadoX++;
						}
						if(resultadoX == 3) {
							finish = true;
							System.out.printf("\n Jogador2 GANHOUU!");
							return;
						}
					}
					resultadoX = 0;
				}
				//Ver se jagador2[X] GANHOU nas diagonais
				for(j=0; j<3; j++) {
					for(i=0; i<3; i++) {
						if(i==j) {
							if(matrizVelha[i][j] == "| X ") {
								resultadoX++;
							}
							if(resultadoX == 3) {
								finish = true;
								System.out.printf("\n Jogador2 GANHOUU!");
								return;
							}
						}
					}
				}
				//Ver se jagador2[X] GANHOU na diagonal secundaria
				resultadoX = 0;
				for(i=0; i<3; i++) {
					for(j=0; j<3; j++) {
						if((i==0 && j==2) || (i==1 && j==1) || (i==2 && j==0)) {
							if(matrizVelha[i][j] == "| X ") {
								resultadoX++;
							}
							if(resultadoX == 3) {
								finish = true;
								System.out.printf("\n Jogador2 GANHOUU!");
								return;
							}
						}
					}
				}
				
				
				
				//Deu VELHA
				int velha = 0;
				for(i=0; i<3; i++) {
					for(j=0; j<3; j++) {
						if(matrizVelha[i][j] == "| X " || matrizVelha[i][j] == "| O "  ) {
							velha++;
						}else {
							
						}
					}
				}
				if( velha == 9) {
					System.out.println("\n Deu VELHA!!");
					return;
				}
			
				
				
				
			}//endWhile
		}

	}//endMain

}//end Class
