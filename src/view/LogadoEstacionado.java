package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class LogadoEstacionado extends JFrame {

	private JPanel contentPane;
	private static final LogadoEstacionado frame = new LogadoEstacionado();

	/**
	 * Launch the application.
	 */
	public static void logadoEstacionado() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
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
	public LogadoEstacionado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	public void setVisible() {
		frame.setVisible(true);
	}
	
	public void setInvisible() {
		frame.setVisible(false);
	}

}
