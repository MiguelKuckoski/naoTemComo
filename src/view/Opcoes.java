
package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import vo.Controle;
import vo.Main;
import java.awt.Color;

public class Opcoes extends JFrame {

	private JPanel contentPane;
	private JButton btnRelatorios;
	private JButton btnVeiculos;
	private JButton btnDadosPessoais;
	private JButton btnEncerrarConta;
	private JButton btnVoltar;
	private Controle controle;
	Main main = Main.INSTANCIA;

	/**
	 * Create the frame.
	 * 
	 * @param controle
	 */
	public Opcoes(Controle controle) {
		this.controle = controle;
		setTitle("Op\u00E7\u00F5es");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 349, 482);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
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
			btnRelatorios.setBounds(74, 43, 170, 49);
			btnRelatorios.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
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
			btnVeiculos.setBounds(74, 103, 170, 49);
			btnVeiculos.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					EditarVeiculos editarVeiculos= main.getEditarVeiculos();
					editarVeiculos.setVisible(true);
					editarVeiculos.requestFocus();
					
					Opcoes opcoes = main.getOpcoes();
					opcoes.setVisible(false);
				}
			});
			btnVeiculos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return btnVeiculos;
	}

	private JButton getBtnDadosPessoais() {
		if (btnDadosPessoais == null) {
			btnDadosPessoais = new JButton("Dados pessoais");
			btnDadosPessoais.setBounds(74, 163, 170, 49);
			btnDadosPessoais.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					EditarCadastro editarCadastro = main.getEditarCadastro();
					editarCadastro.setVisible(true);
					editarCadastro.requestFocus();

					Opcoes opcoes = main.getOpcoes();
					opcoes.setVisible(false);
				}
			});
			btnDadosPessoais.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
				}
			});
			btnDadosPessoais.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return btnDadosPessoais;
	}
	private JButton getBtnEncerrarConta() {
		if (btnEncerrarConta == null) {
			btnEncerrarConta = new JButton("Encerrar conta");
			btnEncerrarConta.setBounds(74, 223, 170, 51);
			btnEncerrarConta.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					controle.removeUsuario();
					Index index = main.getIndex();
					index.setVisible(true);
					index.requestFocus();
					
					Opcoes opcoes = main.getOpcoes();
					opcoes.setVisible(false);
				}	
			});
			btnEncerrarConta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return btnEncerrarConta;
	}
	private JButton getBtnVoltar() {
		if (btnVoltar == null) {
			btnVoltar = new JButton("VOLTAR");
			btnVoltar.setBounds(100, 315, 125, 45);
			btnVoltar.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (controle.getLoggedUser().getSelectedVeiculo().getEstacionado() != null) {

						LogadoEstacionado logadoEstacionado = main.getLogadoEstacionado();
						logadoEstacionado.setVisible(true);
						logadoEstacionado.requestFocus();

						Opcoes opcoes = main.getOpcoes();
						opcoes.setVisible(false);

					} else {
						LogadoNaoEstacionado logadoNaoEstacionado = main.getLogadoNaoEstacionado();
						logadoNaoEstacionado.setVisible(true);
						logadoNaoEstacionado.requestFocus();
						
						Opcoes opcoes = main.getOpcoes();
						opcoes.setVisible(false);
					}
				}
			});
			btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return btnVoltar;
	}
}
