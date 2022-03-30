package compilador;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class TelaCompilador {

	private JFrame frame;
	private JTextField campoToken;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCompilador window = new TelaCompilador();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaCompilador() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel labelTitulo = new JLabel("Compilador");
		labelTitulo.setBounds(184, 11, 103, 14);
		frame.getContentPane().add(labelTitulo);
		
		campoToken = new JTextField();
		campoToken.setBounds(10, 51, 138, 20);
		frame.getContentPane().add(campoToken);
		campoToken.setColumns(10);
		
		JLabel labelToken = new JLabel("Digite um Token:");
		labelToken.setBounds(10, 35, 118, 14);
		frame.getContentPane().add(labelToken);
		
		JTextPane saidaResultado = new JTextPane();
		saidaResultado.setBounds(229, 51, 195, 199);
		frame.getContentPane().add(saidaResultado);
		
		JButton btnCodigo = new JButton("Analisar c\u00F3digo pronto (txt)");
		btnCodigo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Scanner in = new Scanner(new FileReader("codigo.txt"));
					String arquivo = "";
					while (in.hasNextLine()) {
					    String line = in.nextLine();
					    arquivo += line;
					}
					saidaResultado.setText(arquivo);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnCodigo.setBounds(10, 208, 195, 42);
		frame.getContentPane().add(btnCodigo);
		
		JButton btnAnaliseToken = new JButton("Analisar Token");
		btnAnaliseToken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (campoToken.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Informe um Token para ser analisdo");
				}
				else {
					Analise analise = new Analise();
					saidaResultado.setText(analise.analiseToken(campoToken.getText()));
				}
			}
		});
		
		btnAnaliseToken.setBounds(10, 77, 138, 23);
		frame.getContentPane().add(btnAnaliseToken);
		
		JLabel lblNewLabel = new JLabel("Resultados:");
		lblNewLabel.setBounds(299, 35, 90, 14);
		frame.getContentPane().add(lblNewLabel);
	}
}
