package calculadora;

public class Mixta extends Fraccion{
	
	private long entero;

	protected Mixta(long entero, long numerador, long denominador) {
		super(numerador, denominador);
		setEntero(entero);
	}
	
	public static Mixta crear(long entero, long numerador, long denominador) {
		return new Mixta(entero, numerador, denominador);
	}

	public long getEntero() {
		return entero;
	}

	private void setEntero(long entero) {
		this.entero = entero;
	}

	@Override
	public String toString() {
		return getEntero() + " -> " + super.toString();
	}
	

}

