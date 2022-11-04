package atividades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Atividade09 {
	
	private static BufferedReader reader;
	private static int sumEven = 0, sumOdd = 0;
	
	public static void main(String[] args) {
		try {
			reader = new BufferedReader(new FileReader("C:/Users/fatecscs/Documents/GitHub/Aula_Java/workspace/JOGNA3_OOP_Labrada/src/entradas/dados.txt"));
			String line = null;
			int aux;	
			
			while((line = reader.readLine()) != null) {
				try {
					aux = Integer.parseInt(line);					
				} catch (NumberFormatException e) {
					continue;
				}
				if(aux % 2 == 0) {
					sumEven += aux;
					continue;
				}
				sumOdd += aux;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(reader != null) reader.close();
			} catch (IOException e2) {
				
			}
		}		
		System.out.print("Os valores são IMPARES: " + sumOdd + " PARES: " + sumEven);	
	}

}
