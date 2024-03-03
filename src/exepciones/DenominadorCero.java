package exepciones;

import java.util.logging.Logger;

@SuppressWarnings("serial")
public class DenominadorCero extends RuntimeException {
	Logger logger = Logger.getLogger(getClass().getName());

	public DenominadorCero() {
		logger.info("El denominador no puede ser cero");
	}

}
