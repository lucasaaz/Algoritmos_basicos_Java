package Funcao;
import java.util.Scanner;
public class funcao {

	//SOMAR DOIS NUMEROS
	public static int soma(int a , int b){
		a++;
		b++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
		
		return a;
	}
	
	//PAR OU IMPAR
	public static void parOuImpar(int a) {
		if(a % 2 == 0) {
			System.out.println("O numero " + a + " é Par");
		}else {
			System.out.println("O numero " + a + " é Impar");
		}
	}
	
	//METODO PRINCIPAL
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner (System.in)) {
			//SOMAR DOIS NUMEROS
			int res;
			
			System.out.printf("Digite um valor: ");
			int Num01 = teclado.nextInt(); 
			
			System.out.printf("Digite outro valor: ");
			int Num02 = teclado.nextInt(); 		
			
			res = soma(Num01, Num02);
			
			System.out.println(Num01);
			System.out.println(Num02);
			System.out.println(res);
	
			//PAR OU IMPAR
			System.out.printf("Digite um numero: ");
			int Num03 = teclado.nextInt();
			parOuImpar(Num03);
		
		}
		
	}

}
