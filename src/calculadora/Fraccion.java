package calculadora;


public class Fraccion {
	
	private long numerador;
	private long denominador;
	
	protected Fraccion(long numerador, long denominador) {
		setNumerador(numerador);
		setDenominador(denominador);
	}
	
	public static Fraccion crear(long numerador, long denominador) {
		return new Fraccion(numerador, denominador);
	}

	public long getNumerador() {
		return numerador;
	}

	private void setNumerador(long numerador) {
		this.numerador = numerador;
	}

	public long getDenominador() {
		return denominador;
	}

	private void setDenominador(long denominador) {
		this.denominador = denominador;
		if (this.denominador == 0 ) {
			throw new RuntimeException("No es posible tener un denominador igual a 0");
			
		}
		this.denominador = denominador;
	}

	@Override
	public String toString() {
		return getNumerador() + " / " + getDenominador();
	}
	
	
}
