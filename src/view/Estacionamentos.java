package view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Estacionamentos extends JFrame {

	private JPanel contentPane;
	private JButton btnEstacionamentoPrincipal;
	private JButton btnEstacionamentoDeMotos;
	private JButton btnEstacionamentoDosFundos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Estacionamentos frame = new Estacionamentos();
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
	public Estacionamentos() {
		setTitle("Estacionamento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 389, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnEstacionamentoPrincipal());
		contentPane.add(getBtnEstacionamentoDeMotos());
		contentPane.add(getBtnEstacionamentoDosFundos());
	}
	private JButton getBtnEstacionamentoPrincipal() {
		if (btnEstacionamentoPrincipal == null) {
			btnEstacionamentoPrincipal = new JButton("Estacionamento Principal");
			btnEstacionamentoPrincipal.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnEstacionamentoPrincipal.setBounds(77, 86, 219, 65);
		}
		return btnEstacionamentoPrincipal;
	}
	private JButton getBtnEstacionamentoDeMotos() {
		if (btnEstacionamentoDeMotos == null) {
			btnEstacionamentoDeMotos = new JButton("Estacionamento de Motos");
			btnEstacionamentoDeMotos.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnEstacionamentoDeMotos.setBounds(77, 200, 219, 65);
		}
		return btnEstacionamentoDeMotos;
	}
	private JButton getBtnEstacionamentoDosFundos() {
		if (btnEstacionamentoDosFundos == null) {
			btnEstacionamentoDosFundos = new JButton("Estacionamento dos Fundos");
			btnEstacionamentoDosFundos.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnEstacionamentoDosFundos.setBounds(77, 307, 219, 65);
		}
		return btnEstacionamentoDosFundos;
	}
}
