
package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class LogadoNaoEstacionado extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void logadoNaoEstacionado() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogadoNaoEstacionado frame = new LogadoNaoEstacionado();
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
	public LogadoNaoEstacionado() {
		setTitle("N\u00E3o estacionado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 315, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton btnEstacionar = new JButton("ESTACIONAR");
		btnEstacionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnEstacionar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEstacionar.setBounds(50, 31, 210, 58);
		contentPane.add(btnEstacionar);
		
		JButton btnOpcoes = new JButton("OP\u00C7\u00D5ES");
		btnOpcoes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnOpcoes.setBounds(60, 249, 189, 39);
		contentPane.add(btnOpcoes);
		
		JButton btnSair = new JButton("SAIR");
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSair.setBounds(60, 299, 189, 39);
		contentPane.add(btnSair);
	}
}
