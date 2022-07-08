package objetos;

import java.util.Hashtable;

public abstract class Registradores {

	private static Hashtable<String, String> reg = new Hashtable<String, String>();
	private static int countRegistradores = 0;
	
	/**
	 * Adiciona um registrador ao código
	 * @param idVar
	 */
	public static void addRegistrador(String idVar) {
		reg.put(idVar, "$t"+countRegistradores);
		countRegistradores++;
	}
	
	/**
	 * Retorna um registrador pelo nome da variável
	 * @param idVar
	 * @return
	 */
	public static String getRegistrador(String idVar) {
		String registrador = null;
		if (reg.containsKey(idVar)) {
			registrador = reg.get(idVar);
		}
		return registrador;
	}
	
	/**
	 * Gera um registrador e retorna a sua chave
	 * @return
	 */
	public static String geraRegistrador() {
		String registrador = "$t"+countRegistradores;
		countRegistradores++;
		return registrador;
	}
	
	
}
