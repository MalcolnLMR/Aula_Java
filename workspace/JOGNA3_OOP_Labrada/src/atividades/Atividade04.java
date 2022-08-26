package atividades;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {

		System.out.println("Começando");
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
							+ " Média: " 
							+ media 
							+ "");
	}
}
