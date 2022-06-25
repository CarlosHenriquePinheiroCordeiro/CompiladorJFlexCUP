package objetos;

public class GeraCodigo {

	private Programa programa;
	
	public GeraCodigo(Programa programa) {
		setPrograma(programa);
	}
	
	public void gerarCodigo() {
		getPrograma().geraCodigo();
		//OBS: O program(...) {...} N�O PRECISA GERAR C�DIGO, A �NICA COISA
		//QUE PRECISA GERAR DELE � INSTANCIAR AS VARI�VEIS PASSADAS 
		//COMO PAR�METRO A PARTIR DO PROGRAM, E TAMB�M O NOME DO program COMO LABEL
	}

	public Programa getPrograma() {
		return programa;
	}

	public void setPrograma(Programa programa) {
		this.programa = programa;
	}
	
	
}
