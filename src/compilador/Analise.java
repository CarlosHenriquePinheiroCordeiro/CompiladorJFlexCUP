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
			Symbol simbolo = lexico.next_token();
			retorno = sym.terminalNames[simbolo.sym]+" - "+simbolo.sym;
        } catch(Exception e) {
            e.printStackTrace();
        }    
		return retorno;
	}
	
	public String analiseCodigoTxt() throws FileNotFoundException {
		BufferedReader bf = new BufferedReader(new FileReader("programa.txt"));
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
            retorno    				 = pegaCodigoGerado();
		} catch (Exception e) {
			retorno = e.getMessage();
		}
		return retorno;
	}
	
	public String pegaCodigoGerado() {
		String codigo = "";
		try(
			BufferedReader bf = new BufferedReader(new FileReader("codigo-gerado.txt"))
		) {
			String conteudo = "";
			while (conteudo != null) {
				codigo += conteudo;
				conteudo = bf.readLine();
			}
		} catch (Exception e) {
			codigo = e.getMessage();
		}
		System.out.println(codigo);
		return codigo;
	}


}
