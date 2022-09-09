package computador;

public class Notebook extends Computador{
	
	Som som = new Som();
	
	public void helloWorld_note() {
		System.out.println("Hello World (do notebook)!");
	}
	
	public Som getSom() {
		return som;		
	}
	
	
}

