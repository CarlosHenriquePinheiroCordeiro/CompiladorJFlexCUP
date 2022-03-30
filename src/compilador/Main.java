package compilador;

public class Main {

	public static void main(String[] args) {
		try {
			//String arquivo = "def_lexico.flex";
	        //File arq = new File(arquivo);
	        jflex.Main.generate(args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
