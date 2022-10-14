package atividades.oop1.inicio;

import atividades.oop1.hotel.Hospedagem;

public class Viagem {
	
	public static void main(String[] args) {
		
		Hospedagem hospedagem = new Hospedagem();
		int restantes = hospedagem.reserva(true, 10);
		System.out.println("Reservas restantes: " + restantes);
		
	}

}
