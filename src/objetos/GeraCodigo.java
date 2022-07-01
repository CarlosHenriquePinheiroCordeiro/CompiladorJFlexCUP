package objetos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import compilador.sym;

public class GeraCodigo {

	private Programa programa;
	private Hashtable<Integer, String> tipos 		 = new Hashtable<Integer, String>();
	
	public GeraCodigo(Programa programa) {
		setPrograma(programa);
		setTipos();
	}
	
	public void gerarCodigo() {
		String codigoGerado = "";
		codigoGerado += data();
		codigoGerado += start();
		codigoGerado += main();
		escreverArquivo("codigo-gerado.txt", codigoGerado);
		//getPrograma().geraCodigo();
		//OBS: O program(...) {...} NÃO PRECISA GERAR CÓDIGO, A ÚNICA COISA
		//QUE PRECISA GERAR DELE É INSTANCIAR AS VARIÁVEIS PASSADAS 
		//COMO PARÂMETRO A PARTIR DO PROGRAM, E TAMBÉM O NOME DO program COMO LABEL
	}
	
	private String data() {
		String data = "\t.data\n";
		List<Var> declaracoes = new ArrayList<Var>();
		getDeclaracoesParametrosPrograma(declaracoes);
		getDeclaracaoPorBloco(getPrograma().getBloco(), declaracoes);
		for (Var var : declaracoes) {
			data += getDataVar(var);
		}
		return data;
	}
	
	/**
	 * Retorna as variáveis passadas como argumento para o programa
	 */
	private void getDeclaracoesParametrosPrograma(List<Var> declaracoes) {
		if (getPrograma().getParametros().size() > 0) {
			for (Var var : getPrograma().getParametros()) {
				declaracoes.add(var);
				Registradores.addRegistrador((String)var.getId());
			}
		}
	}
	
	/**
	 * Retorna toda as declarações de variáveis do programa escrito
	 * @param bloco
	 * @param declaracoes
	 * @return
	 */
	private List<Var> getDeclaracaoPorBloco(Bloco bloco, List<Var> declaracoes) {
		if (bloco != null) {
			for (Codigo linha : bloco.getLinhas()) {
				switch (linha.getTipoCodigo()) {
					case TipoCodigo.BLOCO: {
						return getDeclaracaoPorBloco((Bloco)linha, declaracoes);
					}
					case TipoCodigo.DECLARACAO: {
						Var declaracao = (Var)linha;
						declaracoes.add(declaracao);
						Registradores.addRegistrador((String)declaracao.getId());
						break;
					}
					case TipoCodigo.ESTRUTURA: {
						Estrutura est = (Estrutura)linha;
						return getDeclaracaoPorBloco(est.getBloco(), declaracoes);
					}
					default:
						break;
				}
			}
		}
		return declaracoes;
	}
	
	/**
	 * Retorna um código MIPS de uma declaração de variável
	 * @param var
	 * @return
	 */
	private String getDataVar(Var var) {
		return var.getId()+":\t"+getTipoData(var.getTipo())+"\n";
	}
	
	/**
	 * Retorna o tipo de uma variável em código MIPS
	 * @param tipo
	 * @return
	 */
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
	
	private String start() {
		return "";
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

	public void setTipos(Hashtable<Integer, String> tipos) {
		this.tipos = tipos;
	}

	public Hashtable<Integer, String> getTipos() {
		return tipos;
	}

	public void setTipos() {
		this.tipos.put(sym.INT, "word");
	}

	
}
