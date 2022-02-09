
public class APP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EX1.crearAleatori();
		EX1.numaleatorio();
		try {
			EX2.escepciones();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Excepcion capturada con menssaje : " + e);
		}
		
		EX3 test = new EX3();
		
		try {
			test.comprovacion();
		} catch (ErrorNumero e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("FINAL");
	}

}
