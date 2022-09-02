package atividades;

import java.util.Scanner;

public class Atividade02 {
	
	public static void main(String[] args) {
		expressions(2, 4);
		divide();
	}
	
	public static void expressions(int x, int y) {
		System.out.println("x + y = " + (x+=y));		
		System.out.println("x - y = " + (x-=y));		
		System.out.println("x - (-y) = " + (x-=(-y)));		
		System.out.println("x * (-y) = " + (x*=(-y)));
		
	}
	
	public static void divide() {
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextInt();
		double b = 0;
		boolean Zero = true;
		
		while(Zero) {
			b = scanner.nextInt();
			if(b == 0) {				
				System.out.println("O Divisor não pode ser zero");
			} else {
				Zero = false;
			}
		}
		
		scanner.close();		
		System.out.println("" + (a/b));		
	}	
}
