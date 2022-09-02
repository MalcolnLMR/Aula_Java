package atividades;

import java.util.Scanner;

public class Atividade03 {
	
	public static double price;
	
	public static void main(String[] args) {
		int discount = -1;
		while (discount == -1) {
			discount = getDiscount();
		}
		System.out.println("Desconto: " + discount);
		System.out.println("Preço: " + price);
	}
	
	public static int getDiscount() {
		Scanner scanner = new Scanner(System.in);
		
		price = scanner.nextInt();
		int discount;
		if (price < 50) {
			discount = 15;			
		} else if (price < 200) {
			discount = 25;
		} else if (price > 200) {
			discount = 35;
		} else {
			System.out.println("Valor inválido");
			discount = -1;			
		}
		scanner.close();
		price -= (price/100)*discount;
		return discount;		
	}
}
