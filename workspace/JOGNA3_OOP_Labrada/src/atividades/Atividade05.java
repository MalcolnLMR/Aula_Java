package atividades;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um n�mero para saber o planeta!");		
		int number = scanner.nextInt();		
		getPlanet(number);		
		scanner.close();
	}
	
	public static void getPlanet(int n) {
		switch(n) {
			case 1:
				System.out.println("Merc�rio");				
				break;
			case 2:
				System.out.println("V�nus");
				break;
			case 3:
				System.out.println("Terra");
				break;
			case 4:
				System.out.println("Marte");
				break;
			case 5:
				System.out.println("J�piter");
				break;
			case 6:
				System.out.println("Saturno");
				break;
			case 7:
				System.out.println("Urano");
				break;
			case 8:
				System.out.println("Neptuno");
				break;
			default:
				System.out.println("Numero Inv�lido!");
				break;				
		}
	}

}
