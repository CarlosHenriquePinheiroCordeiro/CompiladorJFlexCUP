package objetos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GeraCodigo {

	private Programa programa;
	
	public GeraCodigo(Programa programa) {
		setPrograma(programa);
	}
	
	public void gerarCodigo() {
		escreverArquivo("codigo-gerado.txt", "Hello World");
		//getPrograma().geraCodigo();
		//OBS: O program(...) {...} N�O PRECISA GERAR C�DIGO, A �NICA COISA
		//QUE PRECISA GERAR DELE � INSTANCIAR AS VARI�VEIS PASSADAS 
		//COMO PAR�METRO A PARTIR DO PROGRAM, E TAMB�M O NOME DO program COMO LABEL
	}
	
	public void escreverArquivo(String caminho, String conteudo) {
		try (
				FileWriter     criadorArquivo 	= new FileWriter(caminho, false);
				BufferedWriter buffer 			= new BufferedWriter(criadorArquivo);
				PrintWriter    escritorArquivo 	= new PrintWriter(buffer);
			)
		{
			escritorArquivo.append(conteudo);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Programa getPrograma() {
		return programa;
	}

	public void setPrograma(Programa programa) {
		this.programa = programa;
	}
	
	
}
