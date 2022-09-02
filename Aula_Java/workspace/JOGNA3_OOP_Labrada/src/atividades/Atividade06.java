package atividades;

public class Atividade06 {
	
	public static double num1;
	public static double num2;
	public static double num3;
	public static double wei1;
	public static double wei2;
	public static double wei3;
	
	
	public static void main(String[] args) {
		
		Atividade06.setNum(10, 20, 30);
		Atividade06.setWeight(5, 10, 3);
		
		System.out.println(calculate());
		
	}
	
	public static void setNum(double num1, double num2, double num3) {
		Atividade06.num1 = num1;
		Atividade06.num2 = num2;
		Atividade06.num3 = num3;
	}
	
	public static void setWeight(double num1, double num2, double num3) {
		Atividade06.wei1 = num1;
		Atividade06.wei2 = num2;
		Atividade06.wei3 = num3;
	}
	
	public static double calculate() {
		double result =
				(Atividade06.num1 * Atividade06.wei1 + Atividade06.num2 * Atividade06.wei2 + Atividade06.num3 * Atividade06.wei3) /
				(Atividade06.wei1 + Atividade06.wei2 + Atividade06.wei3);
		return result;
	}
	
	

}
