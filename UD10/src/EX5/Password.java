package EX5;

public class Password {
	protected int longitud;
	protected String pass;
	
	public Password() {
		this.longitud = 8;
		this.pass = "1234qwEr";
	}
	
	public Password(int longitud, String pass){
		this.longitud = longitud;
		this.pass = pass;
	}
	
	public boolean esFuerte() {
		char[] cpass = this.pass.toCharArray();
		int numMayus = 0;
		int numMinus = 0;
		int numNum = 0;
		
		for (int i = 0; i < cpass.length; i++) {
			
			if (Character.isUpperCase(cpass[i])) {
				numMayus++;
			} else if (Character.isLowerCase(cpass[i])) {
				numMinus++;
			} else {
				numNum++;
			}
		}
		
		if (numMayus > 2 && numMinus > 1 && numNum > 5) {
			return true;
		} else {
			return false;
		}
	}
	
	public void generarPassword() {
		char[] randompass = new char[this.longitud];
		
	}
}
