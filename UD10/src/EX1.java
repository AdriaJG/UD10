import javax.swing.JOptionPane;

public class EX1 {
	static int intents;
	static int aleatori;
	
	static void crearAleatori() {
		
		aleatori = Integer.valueOf((int) ((Math.random() * 499) + 1));
		System.out.println(aleatori);
	}
	
	static void numaleatorio() {
		intents ++;
		try {
		int respuesta = Integer.parseInt(JOptionPane.showInputDialog("Adivina el numero"));
		if (respuesta == aleatori) {
			JOptionPane.showMessageDialog(null, "Has endevinat el numero amb " + intents + " intents");
		} else if(respuesta < aleatori) {
			JOptionPane.showMessageDialog(null, "El numero aleatori es major al introduit");
			numaleatorio();
		} else if(respuesta > aleatori) {
			JOptionPane.showMessageDialog(null, "El numero aleatori es menor al introduit");
			numaleatorio();
		} else {
			numaleatorio();
		}
		} catch (Exception e) {
			System.out.println(e);
			numaleatorio();
		}
	}
}
