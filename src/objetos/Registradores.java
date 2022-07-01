package objetos;

import java.util.Hashtable;

public abstract class Registradores {

	private static Hashtable<String, String> reg = new Hashtable<String, String>();
	private static int countRegistradores = 0;
	
	/**
	 * Adiciona um registrador ao c�digo
	 * @param idVar
	 */
	public static void addRegistrador(String idVar) {
		reg.put(idVar, "$t"+countRegistradores);
		countRegistradores++;
	}
	
	/**
	 * Retorna um registrador pelo nome da vari�vel
	 * @param idVar
	 * @return
	 */
	public static String getRegistrador(String idVar) {
		return reg.get(idVar);
	}
	
	
}
