package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import vo.Controle;

public class LogadoEstacionado extends JFrame {

	private JPanel contentPane;
	private Controle controle;

 
	/**
	 *Launch the application. 
	 * Create the frame.
	 * @param controle 
	 */
	
	public LoOgadoEstacionado(Controle controle) {
		this.controle = controle;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
}
