package Vetores;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class correcaoProva {

	public static void main(String[] args) throws IOException {
		Scanner teclado = new Scanner(System.in);
		
		//saida (Inicio)
		System.out.println(" \nCORREÇÃO DA PROVA ");
		System.out.println("---------------------");
		
		//Nome da Prova
		System.out.print("Por favor, de um nome a Prova: ");
		String nomeProva = teclado.nextLine();
	
		//Quantidade de questoes na prova
		System.out.printf("Numero de questões na prova: ");
		int totQuestoes = teclado.nextInt();
		
		
		//Gabarito das questoes
		System.out.println("\n--- Gabarito ---");
		
		String questao[] = new String[totQuestoes];
		int i, cont;
		
		for(i=0; i<totQuestoes; i++) {
			cont = i+1;
			System.out.printf("Questão" + cont + ": ");
			questao[i] = teclado.next();
		}
		System.out.println("----------------\n");
		
		
		//Escrever na file o Gabarito
		String caminho = "C:\\Users\\Riva Investimentos\\Documents\\Gabarito_"+nomeProva+".txt";
		
		try (FileWriter escritor = new FileWriter(caminho, true)) {
			escritor.write("\nGabarito:\n");
			for(i=0; i<totQuestoes; i++) {
				escritor.write(questao[i] + "\n");
			}
			escritor.close();
		}
	
		//Quantidade de alunos
		System.out.printf("Numero de alunos participantes: ");
		
		int totAlunos = teclado.nextInt();
		
		
		//Respostas dos alunos e soma da nota e armazenado na file Resposta
		String resposta[] = new String[totQuestoes];
		String    aluno[] = new String[totAlunos];
		int   alunoNota[] = new int[totAlunos];
		int       totNota = 0;
		int             y;
		
		for(y=0; y<totAlunos; y++) {
			System.out.printf("\nNome do Aluno: ");
			aluno[y] = teclado.next();
			
			for(i=0; i<totQuestoes; i++) {
				cont = i+1;
				System.out.printf("Resposta da questão" + cont + ": ");
				resposta[i] = teclado.next();
				
				if(questao[i].equals(resposta[i])) {
					alunoNota[y] = alunoNota[y] + 2;
				}
			}
			totNota = totNota + alunoNota[y];
			
		}
		
		
		//Resultado dos alunos
		String caminho2 = "C:\\Users\\Riva Investimentos\\Documents\\Respostas_"+nomeProva+".txt";
		String alunoEstrela = null;
		float    mediaTurma = 0;
		int        contador = 0;
		int           maior = 0;
		int           menor = 0;
		
		System.out.println("\n------------------------");
		System.out.println(" RESULTADO DA PROVA ");
		
		for(i=0; i<totAlunos; i++) {
			System.out.println("Aluno " + aluno[i] + " tirou " + alunoNota[i]);
		
			if(alunoNota[i] > maior) {
				maior = alunoNota[i];
				alunoEstrela = aluno[i];
			}
			
			if(alunoNota[i] < maior) {
				menor = alunoNota[i];
			}
			mediaTurma = (float) totNota/totAlunos;
		}
		System.out.println("\n INFO GERAL ");
		System.out.println("Media geral dos alunos: " + mediaTurma);
		System.out.println("Maior nota é " + maior + " do aluno " + alunoEstrela);
		
		
		//Armazenar dados da Prova na fila
		try (FileWriter escritor2 = new FileWriter(caminho2, true)) {
			
			escritor2.write("\nResultado da Prova:\n");
			
			for(i=0; i<totAlunos; i++) {
				escritor2.write("Aluno " + aluno[i] + " tirou: " + alunoNota[i] + ".\n");
			}
			
			escritor2.write("\nINFO Geral:\n");
			escritor2.write("Média Geral dos Alunos: " + mediaTurma + ".\n");
			escritor2.write("Maior nota é " + maior + " do aluno " + alunoEstrela + ".\n");
			
			escritor2.close();
		}
		
	}

}
