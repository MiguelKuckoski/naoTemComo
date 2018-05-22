package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class Opcoes extends JFrame {

	private JPanel contentPane;
	private JButton btnRelatorios;
	private JButton btnVeiculos;
	private JButton btnDadosPessoais;
	private JButton btnEncerrarConta;
	private JButton btnVoltar;

	/**
	 * Launch the application.
	 */
	public static void opcoes() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Opcoes frame = new Opcoes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Opcoes() {
		setTitle("Op\u00E7\u00F5es");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 334, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnRelatorios());
		contentPane.add(getBtnVeiculos());
		contentPane.add(getBtnDadosPessoais());
		contentPane.add(getBtnEncerrarConta());
		contentPane.add(getBtnVoltar());
	}
	private JButton getBtnRelatorios() {
		if (btnRelatorios == null) {
			btnRelatorios = new JButton("Relat\u00F3rios");
			btnRelatorios.setBounds(100, 38, 125, 32);
			btnRelatorios.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
			btnRelatorios.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
		}
		return btnRelatorios;
	}
	private JButton getBtnVeiculos() {
		if (btnVeiculos == null) {
			btnVeiculos = new JButton("Ve\u00EDculos");
			btnVeiculos.setBounds(100, 90, 125, 32);
			btnVeiculos.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnVeiculos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
		}
		return btnVeiculos;
	}
	private JButton getBtnDadosPessoais() {
		if (btnDadosPessoais == null) {
			btnDadosPessoais = new JButton("Dados pessoais");
			btnDadosPessoais.setBounds(100, 142, 125, 32);
			btnDadosPessoais.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return btnDadosPessoais;
	}
	private JButton getBtnEncerrarConta() {
		if (btnEncerrarConta == null) {
			btnEncerrarConta = new JButton("Encerrar conta");
			btnEncerrarConta.setBounds(100, 196, 125, 32);
			btnEncerrarConta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return btnEncerrarConta;
	}
	private JButton getBtnVoltar() {
		if (btnVoltar == null) {
			btnVoltar = new JButton("VOLTAR");
			btnVoltar.setBounds(100, 260, 125, 45);
			btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return btnVoltar;
	}
}
