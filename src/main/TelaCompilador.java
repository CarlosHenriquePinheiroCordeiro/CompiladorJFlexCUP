package main;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;

import compilador.*;

import java.awt.event.ActionListener;
import java.io.FileReader;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

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
		frame.setBounds(100, 100, 817, 501);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel labelTitulo = new JLabel("Compilador");
		labelTitulo.setBounds(373, 11, 103, 14);
		frame.getContentPane().add(labelTitulo);
		
		campoToken = new JTextField();
		campoToken.setBounds(10, 41, 138, 20);
		frame.getContentPane().add(campoToken);
		campoToken.setColumns(10);
		
		JLabel labelToken = new JLabel("Digite um Token:");
		labelToken.setBounds(10, 25, 118, 14);
		frame.getContentPane().add(labelToken);
		
		JTextPane saidaResultado = new JTextPane();
		saidaResultado.setBounds(461, 132, 330, 319);
		frame.getContentPane().add(saidaResultado);
		
		JButton btnCodigo = new JButton("Analisar c\u00F3digo pronto (codigo.txt)");
		btnCodigo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Analise analise = new Analise();
					saidaResultado.setText(analise.analiseCodigoTxt());
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnCodigo.setBounds(551, 27, 202, 49);
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
		
		btnAnaliseToken.setBounds(158, 40, 138, 23);
		frame.getContentPane().add(btnAnaliseToken);
		
		JLabel lblNewLabel = new JLabel("Resultados:");
		lblNewLabel.setBounds(596, 98, 90, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JTextArea campoCodigo = new JTextArea();
		campoCodigo.setBounds(10, 132, 368, 319);
		frame.getContentPane().add(campoCodigo);
		
		JButton btnAnalisarProgramaDigitado = new JButton("Analisar programa digitado");
		btnAnalisarProgramaDigitado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (campoCodigo.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Digite um programa para ser analisdo");
				}
				else {
					Analise analise = new Analise();
					saidaResultado.setText(analise.analiseCodigoDigitado(campoCodigo.getText()));
				}
			}
		});
		btnAnalisarProgramaDigitado.setBounds(158, 98, 220, 23);
		frame.getContentPane().add(btnAnalisarProgramaDigitado);
		
		JLabel lblDigiteUmPrograma = new JLabel("Digite um programa:");
		lblDigiteUmPrograma.setBounds(10, 98, 118, 14);
		frame.getContentPane().add(lblDigiteUmPrograma);

	}
}
