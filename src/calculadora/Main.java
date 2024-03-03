package calculadora;

public class Main {
	public static void main(String[] args) {
		Fraccion fraccionUno = Fraccion.crear(12, 15);
		Fraccion fraccionDos = Fraccion.crear(12, 6);
		Mixta fraccionMixtaUno = Mixta.crear(2, 1, 4);
		Mixta fraccionMixtaDos = Mixta.crear(4, 7, 4);
		
		System.out.println(Calculadora.sumar(fraccionUno, fraccionDos).toString());
		System.out.println(Calculadora.restar(fraccionUno, fraccionDos).toString());
		System.out.println(Calculadora.multiplicar(fraccionUno, fraccionDos).toString());
		System.out.println(Calculadora.dividir(fraccionUno, fraccionDos).toString());
		System.out.println(Calculadora.fraccionAMixto(fraccionDos).toString());
		System.out.println(Calculadora.mixtoAFraccion(fraccionMixtaUno).toString());
		System.out.println(Calculadora.sumarMixta(fraccionMixtaUno, fraccionMixtaDos).toString());
		System.out.println(Calculadora.restarMixta(fraccionMixtaUno, fraccionMixtaDos).toString());
		System.out.println(Calculadora.multiplicarMixta(fraccionMixtaUno, fraccionMixtaDos).toString());
		System.out.println(Calculadora.dividirMixta(fraccionMixtaUno, fraccionMixtaDos).toString());
//		System.out.println(Calculadora.saberSiEsPropia(fraccionUno));


	}

}
