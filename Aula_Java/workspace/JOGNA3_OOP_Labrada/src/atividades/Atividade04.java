package atividades;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		getTenNumbers();
		getNumbers();
	}
	
	// Solicitar N n�mero
	public static void getNumbers() {
		System.out.println("Come�ando");
		int number = -1;
		int soma = 0;
		int pos = 0, neg = 0;
		Scanner scanner = new Scanner(System.in);
		while(number != 0) {
			number = scanner.nextInt();
			soma += number;
			if(number > 0) pos += 1;
			if(number < 0) neg += 1;			
		}
		scanner.close();
		int qtde = pos + neg;
		double media = soma / qtde;
		System.out.println("Soma: " 
							+ soma 
							+ " Positivos: " 
							+ pos 
							+ " Negativos: " 
							+ neg 
							+ " M�dia: " 
							+ media 
							+ "");
		
	}
	
	// Solicitar 10 n�mero
	public static void getTenNumbers() {

		System.out.println("Come�ando");
		int count = 1, soma = 0; 
		int maior = 0, menor = 0;
		int number;
		Scanner scanner = new Scanner(System.in);
		
		// Primeira Verifica��o (para definir o maior e menor)
		number = scanner.nextInt();
		maior = number;
		menor = number;
		soma += number;
		
		// Come�a o loop
		while(count < 10) {
			number = scanner.nextInt();
			soma += number;
			if(number > maior) maior = number;
			if(number < menor) menor = number;		
			count += 1;
		}
		scanner.close();
		double media = soma / count;
		System.out.println("Soma: " 
							+ soma 
							+ " M�dia: " 
							+ media 
							+ " Maior: " 
							+ maior 
							+ " Menor: " 
							+ menor 
							+ "");
		
	}
}
