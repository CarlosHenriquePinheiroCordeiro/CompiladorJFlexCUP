package objetos;

import java.util.Hashtable;

public abstract class Operadores {

	private static Hashtable<String, String> operadores = null;
	
	public static Hashtable<String, String> getOperadores() {
		if (operadores == null) {
			setOperadores();
		}
		return operadores;
	}
	
	public static String getOperador(String op) {
		return getOperadores().get(op);
	}
	
	private static void setOperadores() {
		operadores = new Hashtable<String, String>();
		operadores.put("+" 		, "add");
		operadores.put("-" 		, "sub");
		operadores.put("*" 		, "mult");
		operadores.put("/" 		, "div");
		operadores.put("=" 		, "move");
		operadores.put("=="		, "beq");
		operadores.put("<" 		, "blt");
		operadores.put("<="		, "ble");
		operadores.put(">" 		, "bgt");
		operadores.put(">="		, "bge");
		operadores.put("!="		, "bne");
		operadores.put("SOMA" 	, "add");
		operadores.put("SUB" 	, "sub");
		operadores.put("MULT" 	, "mult");
		operadores.put("DIV" 	, "div");
	}
	
	
}
