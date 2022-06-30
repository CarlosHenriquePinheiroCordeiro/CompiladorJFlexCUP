package objetos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import compilador.sym;

public class GeraCodigo {

	private Programa programa;
	
	public GeraCodigo(Programa programa) {
		setPrograma(programa);
	}
	
	public void gerarCodigo() {
		String codigoGerado = "";
		codigoGerado += data();
		codigoGerado += main();
		escreverArquivo("codigo-gerado.s", codigoGerado);
		//getPrograma().geraCodigo();
		//OBS: O program(...) {...} NÃO PRECISA GERAR CÓDIGO, A ÚNICA COISA
		//QUE PRECISA GERAR DELE É INSTANCIAR AS VARIÁVEIS PASSADAS 
		//COMO PARÂMETRO A PARTIR DO PROGRAM, E TAMBÉM O NOME DO program COMO LABEL
	}
	
	private String data() {
		String data = "\t.data\n";
		if (getPrograma().getParametros().size() > 0) {
			for (Var var : getPrograma().getParametros()) {
				data += var.getId()+":\t"+getTipoData(var.getTipo())+"\n";
			}
		}
		return data;
	}
	
	private String getTipoData(Object tipo) {
		String tipoData = "";
		switch ((int)tipo) {
			case sym.INT: {
				tipoData += ".word";
				break;
			}
			default:
				break;
		}
		return tipoData;
	}
	
	private String main() {
		String main = "";
		return "";
	}
	
	
	private void escreverArquivo(String caminho, String conteudo) {
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
