package atividade.oop1.hotel;

public class Hospedagem {

	public int altaTemporada;
	public int baixaTemporada;
	
	public Hospedagem() {
		this.altaTemporada = 250;
		this.baixaTemporada = 120;
	}
	
	public int reserva(boolean altaTemporada, int reservas) {
		
		if(altaTemporada) {
			this.altaTemporada -= reservas;
			return this.altaTemporada;
		} else {
			this.baixaTemporada -= reservas;
			return this.baixaTemporada;
		}		
	}
}