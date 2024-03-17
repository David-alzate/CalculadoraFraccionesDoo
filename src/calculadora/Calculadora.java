package calculadora;

import exepciones.FraccionNula;

public class Calculadora {

	private Calculadora() {
		super();
	}

	public static Fraccion simplificar(Fraccion fraccion) {
		long mcd = calcularMCD(fraccion.getNumerador(), fraccion.getDenominador());
		long numeradorSimplificado = fraccion.getNumerador() / mcd;
		long denominadorSimplificado = fraccion.getDenominador() / mcd;

		return Fraccion.crear(numeradorSimplificado, denominadorSimplificado);
	}

	private static long calcularMCD(long l, long m) {
		l = Math.abs(l);
		m = Math.abs(m);
		
		while (m != 0) {
			long temp = m;
			m = l % m;
			l = temp;
		}
		return l;
	}

	public static Fraccion sumar(Fraccion fraccionUno, Fraccion fraccionDos) {

		if (UtilObjeto.esNull(fraccionUno)) {
			throw new FraccionNula();
		}

		if (UtilObjeto.esNull(fraccionDos)) {
			throw new FraccionNula();
		}

		long numerador = fraccionUno.getNumerador() * fraccionDos.getDenominador()
				+ fraccionUno.getDenominador() * fraccionDos.getNumerador();
		long denominador = fraccionUno.getDenominador() * fraccionDos.getDenominador();
		return simplificar(Fraccion.crear(numerador, denominador));

	}

	public static Fraccion restar(Fraccion fraccionUno, Fraccion fraccionDos) {

		if (UtilObjeto.esNull(fraccionUno)) {
			throw new FraccionNula();
		}

		if (UtilObjeto.esNull(fraccionDos)) {
			throw new FraccionNula();
		}

		long numerador = fraccionUno.getNumerador() * fraccionDos.getDenominador()
				- fraccionUno.getDenominador() * fraccionDos.getNumerador();
		long denominador = fraccionUno.getDenominador() * fraccionDos.getDenominador();
		return simplificar(Fraccion.crear(numerador, denominador));
	}

	public static Fraccion multiplicar(Fraccion fraccionUno, Fraccion fraccionDos) {

		if (UtilObjeto.esNull(fraccionUno)) {
			throw new FraccionNula();
		}

		if (UtilObjeto.esNull(fraccionDos)) {
			throw new FraccionNula();
		}

		long numerador = fraccionUno.getNumerador() * fraccionDos.getNumerador();
		long denominador = fraccionUno.getDenominador() * fraccionDos.getDenominador();
		return simplificar(Fraccion.crear(numerador, denominador));
	}

	public static Fraccion dividir(Fraccion fraccionUno, Fraccion fraccionDos) {

		if (UtilObjeto.esNull(fraccionUno)) {
			throw new FraccionNula();
		}

		if (UtilObjeto.esNull(fraccionDos)) {
			throw new FraccionNula();
		}

		long numerador = fraccionUno.getNumerador() * fraccionDos.getDenominador();
		long denominador = fraccionUno.getDenominador() * fraccionDos.getNumerador();
		return simplificar(Fraccion.crear(numerador, denominador));
	}

	public static Mixta fraccionAMixto(Fraccion fraccion) {

		if (UtilObjeto.esNull(fraccion)) {
			throw new FraccionNula();
		}
		
		long numerador = fraccion.getNumerador();
		long denominador = fraccion.getDenominador();

		Fraccion fraccionUno = Fraccion.crear(numerador, denominador);
		Fraccion fraccionSimplificada = simplificar(fraccionUno);

		long entero = fraccionSimplificada.getNumerador() / fraccionSimplificada.getDenominador();
		long numeradorMixta = fraccionSimplificada.getNumerador() % fraccionSimplificada.getDenominador();
		long denominadorMixta = fraccionSimplificada.getDenominador();
		return Mixta.crear(entero, numeradorMixta, denominadorMixta);

	}

	public static Fraccion mixtoAFraccion(Mixta mixta) {

		if (UtilObjeto.esNull(mixta)) {
			throw new FraccionNula();
		}

		long numerador = (mixta.getEntero() * mixta.getDenominador()) + mixta.getNumerador();
		long denominador = mixta.getDenominador();

		return simplificar(Fraccion.crear(numerador, denominador));

	}

	public static Mixta sumarMixta(Mixta mixtaUno, Mixta mixtaDos) {

		if (UtilObjeto.esNull(mixtaUno)) {
			throw new FraccionNula();
		}
		
		if (UtilObjeto.esNull(mixtaDos)) {
			throw new FraccionNula();
		}

		Fraccion fraccionUno = mixtoAFraccion(mixtaUno);
		Fraccion fraccionDos = mixtoAFraccion(mixtaDos);
		Fraccion sumaFraccion = sumar(fraccionUno, fraccionDos);
		Mixta mixta = fraccionAMixto(sumaFraccion);
		long entero = (mixta.getEntero());
		long numerador = (mixta.getNumerador());
		long denominador = (mixta.getDenominador());

		return Mixta.crear(entero, numerador, denominador);

	}

	public static Mixta restarMixta(Mixta mixtaUno, Mixta mixtaDos) {

		if (UtilObjeto.esNull(mixtaUno)) {
			throw new FraccionNula();
		}
		
		if (UtilObjeto.esNull(mixtaDos)) {
			throw new FraccionNula();
		}

		Fraccion fraccionUno = mixtoAFraccion(mixtaUno);
		Fraccion fraccionDos = mixtoAFraccion(mixtaDos);
		Fraccion restaFraccion = restar(fraccionUno, fraccionDos);
		Mixta mixta = fraccionAMixto(restaFraccion);
		long entero = (mixta.getEntero());
		long numerador = (mixta.getNumerador());
		long denominador = (mixta.getDenominador());

		return Mixta.crear(entero, numerador, denominador);

	}

	public static Mixta multiplicarMixta(Mixta mixtaUno, Mixta mixtaDos) {

		if (UtilObjeto.esNull(mixtaUno)) {
			throw new FraccionNula();
		}
		
		if (UtilObjeto.esNull(mixtaDos)) {
			throw new FraccionNula();
		}

		Fraccion fraccionUno = mixtoAFraccion(mixtaUno);
		Fraccion fraccionDos = mixtoAFraccion(mixtaDos);
		Fraccion multiplicacionFraccion = multiplicar(fraccionUno, fraccionDos);
		Mixta mixta = fraccionAMixto(multiplicacionFraccion);
		long entero = (mixta.getEntero());
		long numerador = (mixta.getNumerador());
		long denominador = (mixta.getDenominador());

		return Mixta.crear(entero, numerador, denominador);

	}

	public static Mixta dividirMixta(Mixta mixtaUno, Mixta mixtaDos) {

		if (UtilObjeto.esNull(mixtaUno)) {
			throw new FraccionNula();
		}
		
		if (UtilObjeto.esNull(mixtaDos)) {
			throw new FraccionNula();
		}

		Fraccion fraccionUno = mixtoAFraccion(mixtaUno);
		Fraccion fraccionDos = mixtoAFraccion(mixtaDos);
		Fraccion divisionFraccion = dividir(fraccionUno, fraccionDos);
		Mixta mixta = fraccionAMixto(divisionFraccion);
		long entero = (mixta.getEntero());
		long numerador = (mixta.getNumerador());
		long denominador = (mixta.getDenominador());

		return Mixta.crear(entero, numerador, denominador);

	}

	public static boolean saberSiEsPropia(Fraccion fraccion) {
		return fraccion.getNumerador() < fraccion.getDenominador();

	}
}
