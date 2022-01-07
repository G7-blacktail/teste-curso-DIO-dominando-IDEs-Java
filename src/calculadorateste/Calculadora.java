package calculadorateste;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
	
		float a, b;
		
		System.out.println("Digite um valor: ");
		a = scan.nextInt();
		System.out.println("Digite outro valor: ");
		b = scan.nextInt();
		
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int multiplicacao = multiplicacao(a,b);
		float divisao = divisao(a,b);
		
		System.out.println("soma " + soma);
		System.out.println("subtracao " + subtracao);
		System.out.println("multiplicacao " + multiplicacao);
		System.out.println("divisao " + divisao);

		scan.close();
		
	}

	public static int soma(float a, float b) {
		return (int) (a + b);
	}
	
	public static int subtracao(float a, float b) {
		return (int) (a - b);
	}
	
	public static int multiplicacao(float a, float b) {
		return (int) (a * b);
	}
	
	public static float divisao(float a, float b) {
		return a / b;
	}
	
	
	
	
	
	
	
	
	
	
	

}