package view;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JInternalFrame;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Estacionamentos extends JFrame {

	private JPanel contentPane;
	private JButton btnEstacionamentoPrincipal;
	private JButton btnEstacionamentoDeMotos;
	private JButton btnEstacionamentoDosFundos;
	private JSeparator separator;

	/**
	 * Launch the application. Create the frame.
	 */
	public Estacionamentos() {
		setTitle("Estacionamento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 348, 436);
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
			btnEstacionamentoPrincipal.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					EstacionamentoPrincipal estacionamento = new EstacionamentoPrincipal();
					mostrarEstacionamento(estacionamento);
					
				}
			});
			btnEstacionamentoPrincipal.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnEstacionamentoPrincipal.setBounds(53, 24, 219, 65);
		}
		return btnEstacionamentoPrincipal;
	}

	private JButton getBtnEstacionamentoDeMotos() {
		if (btnEstacionamentoDeMotos == null) {
			btnEstacionamentoDeMotos = new JButton("Estacionamento de Motos");
			btnEstacionamentoDeMotos.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnEstacionamentoDeMotos.setBounds(53, 150, 219, 65);
		}
		return btnEstacionamentoDeMotos;
	}

	private JButton getBtnEstacionamentoDosFundos() {
		if (btnEstacionamentoDosFundos == null) {
			btnEstacionamentoDosFundos = new JButton("Estacionamento dos Fundos");
			btnEstacionamentoDosFundos.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnEstacionamentoDosFundos.setBounds(53, 270, 219, 65);
		}
		return btnEstacionamentoDosFundos;
	}
	
	private void mostrarEstacionamento (EstacionamentoPrincipal estacionamento) {
		setBounds(100, 100, 1096, 436);
		contentPane.add(estacionamento).setBounds(374, 11, 700, 369);		
		estacionamento.setVisible(true);
		contentPane.add(getSeparator());
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(350, 0, 1, 377);
		}
		return separator;
	}
}
