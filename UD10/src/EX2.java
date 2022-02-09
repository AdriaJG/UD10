
public class EX2 {
	static void escepciones() throws Exception {
		throw new ElError("Errores que pasan");
	}
	
}

class ElError extends Exception { 

	public ElError(String error) {
        super(error);
    }
}
