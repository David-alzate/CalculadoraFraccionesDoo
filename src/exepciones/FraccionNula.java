package exepciones;

import java.util.logging.Logger;

@SuppressWarnings("serial")
public class FraccionNula extends RuntimeException {
	Logger logger = Logger.getLogger(getClass().getName());

	public FraccionNula() {
		logger.info("La Fraccion no puede estar vacia");
	}

}
