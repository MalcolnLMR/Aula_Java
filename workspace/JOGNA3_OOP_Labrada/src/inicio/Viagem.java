package inicio;

import hotel.Hospedagem;

public class Viagem {
	
	public static void main(String[] args) {
		
		Hospedagem hospedagem = new Hospedagem();
		int restantes = hospedagem.reserva(true, 10);
		System.out.println("Reservas restantes: " + restantes);
		
	}

}
