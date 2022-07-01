package objetos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import compilador.sym;

public abstract class GeraCodigo {

	private static Programa programa;
	private static List<Var> declaracoes 		    = new ArrayList<Var>();
	private static Hashtable<Integer, String> tipos = new Hashtable<Integer, String>();
	
	public static void gerarCodigo() {
		String codigoGerado = "";
		setTipos();
		codigoGerado += data();
		codigoGerado += start();
		codigoGerado += main();
		escreverArquivo("codigo-gerado.txt", codigoGerado);
		//getPrograma().geraCodigo();
		//OBS: O program(...) {...} NÃO PRECISA GERAR CÓDIGO, A ÚNICA COISA
		//QUE PRECISA GERAR DELE É INSTANCIAR AS VARIÁVEIS PASSADAS 
		//COMO PARÂMETRO A PARTIR DO PROGRAM, E TAMBÉM O NOME DO program COMO LABEL
	}
	
	/**
	 * Gera a seção de "data" do código
	 * @return
	 */
	private static String data() {
		String data = "\t.data\n";
		for (Var var : getDeclaracoes()) {
			data += getDataVar(var);
		}
		return data;
	}
	
	/**
	 * Retorna um código MIPS de uma declaração de variável
	 * @param var
	 * @return
	 */
	private static String getDataVar(Var var) {
		return var.getId()+":\t"+getTipoData(var.getTipo())+"\n";
	}
	
	/**
	 * Retorna o tipo de uma variável em código MIPS
	 * @param tipo
	 * @return
	 */
	private static String getTipoData(Object tipo) {
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
	
	/**
	 * Retorna o código gerado para a seção "start"
	 * @return
	 */
	private static String start() {
		String start = "\n__start:\n";
		for (Var var : getDeclaracoes()) {
			start += "lw\t"+Registradores.getRegistrador((String)var.getId())+", "+(String)var.getId()+"\n";
		}
		start += "\tdone\n";
		return start;
	}
	
	private static String main() {
		String main = "\nmain:";
		main += getPrograma().getBloco().geraCodigo();
		return main;
	}
	
	
	private static void escreverArquivo(String caminho, String conteudo) {
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

	public static Programa getPrograma() {
		return programa;
	}

	public static void setPrograma(Programa programa) {
		GeraCodigo.programa = programa;
	}

	public static Hashtable<Integer, String> getTipos() {
		return GeraCodigo.tipos;
	}

	private static void setTipos() {
		GeraCodigo.tipos.put(sym.INT, "word");
	}
	
	/**
	 * Adiciona uma declaração de variável para a lista de declarações
	 * @param var
	 */
	public static void adicionaDeclaracao(Var var) {
		getDeclaracoes().add(var);
	}
	
	public static List<Var> getDeclaracoes() {
		return declaracoes;
	}

	
}
