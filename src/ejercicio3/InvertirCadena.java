package ejercicio3;

public class InvertirCadena {

	public String invertir(String cadena) {
		
		String cadenaInvertida="";
		
		for (int i=cadena.length();i>=0;i--) {
			
			cadenaInvertida=cadenaInvertida+cadena.charAt(i);
			
		}
		
		return cadenaInvertida;
		
	}
	
	
}
