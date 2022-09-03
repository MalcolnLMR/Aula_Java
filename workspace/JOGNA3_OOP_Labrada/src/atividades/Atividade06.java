package atividades;

import java.util.Scanner;

public class Atividade06 {
	
	public static double [][] nums;
	
	
	public static void main(String[] args) {
		
		nums = new double[3][2];
		setNums();
		System.out.println(calculate());
		
	}
	
	public static void setNums() {
		
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		while(i < 3) {
			System.out.println("Digite o " + (i+1) + " numero");
			nums[i][0] = scanner.nextDouble();			

			System.out.println("Digite o " + (i+1) + " peso");
			nums[i][1] = scanner.nextDouble();
			
			i++;
		}
		scanner.close();
		
	}
	
	public static double calculate() {
		double total = 0;
		double total_peso = 0;
		
		for (double[] num: nums) {
			total += num[1];
			total_peso += num[0] * num[1];			
		}
		return total / total_peso;
	}	

}
