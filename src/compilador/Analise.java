package compilador;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
	
	public String analiseCodigoTxt() throws FileNotFoundException {
		BufferedReader bf = new BufferedReader(new FileReader("codigo.txt"));
		return analiseCompleta(bf);
	}
	
	public String analiseCodigoDigitado(String programa) {
		Reader inputString = new StringReader(programa);
		return analiseCompleta(new BufferedReader(inputString));
	}
	
	public String analiseCompleta(BufferedReader bf) {
		String retorno = "";
		try {
            ComplexSymbolFactory csf = new ComplexSymbolFactory();
            Lexico lex 			     = new Lexico(bf, csf);
            Parser p   				 = new Parser(lex, csf);
            Symbol i   				 = p.parse();
            retorno    				 = sym.terminalNames[i.sym];
		} catch (Exception e) {
			retorno = e.getMessage();
		}
		return retorno;
	}


}
