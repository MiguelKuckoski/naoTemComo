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
			btnVeiculos.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
				}
			});
			btnVeiculos.setBounds(100, 90, 125, 32);
			btnVeiculos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return btnVeiculos;
	}

	private JButton getBtnDadosPessoais() {
		if (btnDadosPessoais == null) {
			btnDadosPessoais = new JButton("Dados pessoais");
			btnDadosPessoais.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
				}
			});
			btnDadosPessoais.setBounds(100, 141, 125, 32);
			btnDadosPessoais.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return btnDadosPessoais;
	}

	private JButton getBtnEncerrarConta() {
		if (btnEncerrarConta == null) {
			btnEncerrarConta = new JButton("Encerrar conta");
			btnEncerrarConta.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (controle.getLoggedUser().getSelectedVeiculo().isEstacionado()) {
						controle.removeUsuario(controle.getLoggedUser());
						String[] args = null;
						Index.main(args);
						frame.setVisible(false);
					} else {
						JOptionPane.showMessageDialog(null, "Remove seu carro da vaga.", "Erro!",
								JOptionPane.WARNING_MESSAGE);
					}

				}
			});
			btnEncerrarConta.setBounds(100, 196, 125, 32);
			btnEncerrarConta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return btnEncerrarConta;
	}

	private JButton getBtnVoltar() {
		if (btnVoltar == null) {
			btnVoltar = new JButton("VOLTAR");
			btnVoltar.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (controle.getLoggedUser().getSelectedVeiculo().isEstacionado()) {

						LogadoEstacionado logadoEstacionado = main.getLogadoEstacionado();
						logadoEstacionado.setVisible(true);
						logadoEstacionado.requestFocus();

						Opcoes opcoes = main.getOpcoes();
						opcoes.setVisible(false);

				//		LogadoEstacionado.logadoEstacionado(controle);

					} else {
						//LogadoNaoEstacionado logadoNaoEstacionado = main.getLogadoNaoEstacionado();

						// LogadoNaoEstacionado.logadoNaoEstacionado(controle);
					}
				}
			});
			btnVoltar.setBounds(100, 260, 125, 45);
			btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return btnVoltar;
	}

}
