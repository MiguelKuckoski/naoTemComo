
package view;

import java.awt.Button;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import vo.Controle;

public class LogadoNaoEstacionado2 extends JFrame {

	private JPanel contentPane;
	private Controle controle;
	private JButton btnEstacionar;
	private JButton btnOpcoes;
	private JButton btnSair;

	/**
	 * Launch the application. Create the frame.
	 * 
	 * @param controle
	 */
	public LogadoNaoEstacionado2(Controle controle) {
		setTitle("N\u00E3o estacionado");
		this.controle = controle;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 315, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		btnEstacionar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEstacionar.setBounds(50, 31, 210, 58);
		contentPane.add(getBtnEstacionar());
		btnOpcoes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnOpcoes.setBounds(60, 249, 189, 39);
		contentPane.add(getBtnOpcoes());
		JButton btnSair = new JButton("SAIR");
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSair.setBounds(60, 299, 189, 39);
		contentPane.add(btnSair);
	}

	public JButton getBtnEstacionar() {
		if (btnEstacionar == null) {
			btnEstacionar = new JButton("ESTACIONAR");
			btnEstacionar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {

				}
			});
		}
		return btnEstacionar;
	}

	public JButton getBtnOpcoes() {
		if (btnOpcoes == null) {
			btnOpcoes = new JButton("OP\u00C7\u00D5ES");
			btnOpcoes.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {

				}
			});

		}
		return btnOpcoes;
	}

	public JButton getBtnSair() {
		if (btnSair == null) {
			btnSair = new JButton("SAIR");
			btnSair.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {

				}
			});

		}
		return btnSair;
	}
}
