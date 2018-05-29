
package view;

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

public class LogadoNaoEstacionado extends JFrame {

	private JPanel contentPane;

	private static final LogadoNaoEstacionado frame = new LogadoNaoEstacionado();
	private static Controle controle;

	/**
	 * Launch the application.
	 * 
	 * @param frame
	 */
	public static void logadoNaoEstacionado(Controle controle) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					setControle(controle);
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
		btnOpcoes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Opcoes.opcoes(getControle());
				frame.setVisible(false);

			}
		});
		btnOpcoes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnOpcoes.setBounds(60, 249, 189, 39);
		contentPane.add(btnOpcoes);

		JButton btnSair = new JButton("SAIR");
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSair.setBounds(60, 299, 189, 39);
		contentPane.add(btnSair);
	}

	public static Controle getControle() {
		return controle;
	}

	public static void setControle(Controle controle) {
		if(LogadoNaoEstacionado.controle == null)
		LogadoNaoEstacionado.controle = controle;
	}
}
