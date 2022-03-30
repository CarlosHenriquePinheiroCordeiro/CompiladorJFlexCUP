package compilador;

import java.io.Reader;
import java.io.StringReader;
import java.util.Scanner;

public class Analise {
	
	public String analiseToken(String token) {
		String retorno = "";
		try {
			Reader entrada = new StringReader(token);
			Lexico lexico = new Lexico(entrada);
			retorno = sym.terminalNames[lexico.next_token().sym];
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retorno;
	}
	
	
}
