package compilador;

import java.io.Reader;
import java.io.StringReader;
import java.util.Scanner;

import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.Symbol;

public class Analise {
	
	public String analiseToken(String token) {
		String retorno = "";
		try{
			Reader entrada = new StringReader(token);
			ComplexSymbolFactory symbolFactory = new ComplexSymbolFactory();
			Lexico lexico = new Lexico(entrada,symbolFactory);
			retorno = sym.terminalNames[lexico.next_token().sym];
        } catch(Exception e) {
            e.printStackTrace();
        }    
		return retorno;
	}
	
	public String analiseCompleta(String codigo) {
		String retorno = "";
		try {
            ComplexSymbolFactory csf = new ComplexSymbolFactory();
            Reader entrada = new StringReader(codigo);
            Lexico lex = new Lexico(entrada,csf);
            Parser p = new Parser(lex, csf);
            Symbol i = p.parse();;
            retorno =sym.terminalNames[i.sym];
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retorno;
	}
	
	
}
