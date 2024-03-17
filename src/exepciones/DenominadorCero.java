package exepciones;

public class DenominadorCero extends RuntimeException {

	public DenominadorCero() {
		System.out.println("El denominador no puede ser cero");
	}

}
