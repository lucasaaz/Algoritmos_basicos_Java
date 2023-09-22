package Vetores;
import java.util.Scanner;
public class TabelaDeJogos {

	public static void main(String[] args) {
		
		String time[];
		int i = 0;
		int y = 0;
		Scanner teclado = new Scanner(System.in);

		//saida - (Inicio)
		System.out.println("\n CAMPEONATO DE FUTEBOL ");
		System.out.println("------------------------------\n");
		
		//Quantidade de times
		System.out.printf("Quantos times irão participar: ");
		int totTimes = teclado.nextInt();	
		
		//Nomes dos Times
		time = new String[totTimes];
		for(i=0; i<totTimes; i++) {
			int cont = i+1;
			System.out.printf("Nome do " + cont + "° time: ");
			time[i] = teclado.next();
		}
		
		//saida - (Final)
		System.out.println("\n TABELA DE JOGOS ENTRE OS TIMES");
		System.out.println("------------------------------");
		//Confronto entre os times
		for(i=0; i<3; i++) {
			for(y=0; y<3; y++) {
				if(time[i] != time[y]) {
					System.out.println( time[i] + " [ ] X [ ] " +  time[y]);
				}
			}
		}
		System.out.println("------------------------------");
	}

}
