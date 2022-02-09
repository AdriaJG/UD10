import java.util.Random;

public class EX3 extends Exception {
	int numeroAleatorio;
	
	public EX3() {
		System.out.println("Generando numero aleatorio...");
		this.numeroAleatorio = new Random().nextInt(1000);
		System.out.println("El numero aleatorio es : " + this.numeroAleatorio);
	}
	
	public void comprovacion() throws ErrorNumero {
		if (this.numeroAleatorio % 2 == 0) {
			throw new ErrorNumero("El numero es par");
		} else {
			throw new ErrorNumero("El numero es impar");
		}
	}
	
}

class ErrorNumero extends Exception {
	public ErrorNumero(String error) {
		super(error);
	}
}
