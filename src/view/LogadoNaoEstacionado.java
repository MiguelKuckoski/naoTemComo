
package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
