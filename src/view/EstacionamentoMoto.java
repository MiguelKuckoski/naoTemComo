package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class EstacionamentoMoto extends JFrame {

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 * Create the frame.
	 */
	public EstacionamentoMoto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 439);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnEstacionar = new JButton("Estacionar");
		btnEstacionar.setBackground(new Color(0, 153, 51));
		
		JButton button = new JButton("Estacionar");
		button.setBackground(new Color(0, 153, 51));
		
		JButton button_1 = new JButton("Estacionar");
		button_1.setBackground(new Color(0, 153, 51));
		
		JButton button_2 = new JButton("Estacionar");
		button_2.setBackground(new Color(0, 153, 51));
		
		JButton button_3 = new JButton("Estacionar");
		button_3.setBackground(new Color(0, 153, 51));
		
		JButton button_4 = new JButton("Estacionar");
		button_4.setBackground(new Color(0, 153, 51));
		
		JButton button_5 = new JButton("Estacionar");
		button_5.setBackground(new Color(0, 153, 51));
		
		JButton button_6 = new JButton("Estacionar");
		button_6.setBackground(new Color(0, 153, 51));
		
		JButton button_7 = new JButton("Estacionar");
		button_7.setBackground(new Color(0, 153, 51));
		
		JButton button_8 = new JButton("Estacionar");
		button_8.setBackground(new Color(0, 153, 51));
		
		JButton button_9 = new JButton("Estacionar");
		button_9.setBackground(new Color(0, 153, 51));
		
		JButton button_10 = new JButton("Estacionar");
		button_10.setBackground(new Color(0, 153, 51));
		
		JButton button_11 = new JButton("Estacionar");
		button_11.setBackground(new Color(0, 153, 51));
		
		JButton button_12 = new JButton("Estacionar");
		button_12.setBackground(new Color(0, 153, 51));
		
		JButton btnVoltar = new JButton("Voltar");
		
		JInternalFrame internalFrame = new JInternalFrame("Informativo:");
		internalFrame.setVisible(true);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(internalFrame, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
						.addComponent(btnVoltar, GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnEstacionar))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(button_12, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_11, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(button_10, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnVoltar, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(internalFrame, GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
								.addComponent(button, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnEstacionar, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_10, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_11, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_12, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		
		JButton btnEstacionado = new JButton("Ocupado");
		btnEstacionado.setEnabled(false);
		btnEstacionado.setBackground(new Color(255, 0, 0));
		btnEstacionado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnDesestacionado = new JButton("Desocupado");
		btnDesestacionado.setEnabled(false);
		btnDesestacionado.setBackground(new Color(0, 255, 0));
		btnDesestacionado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnVoc = new JButton("Você");
		btnVoc.setEnabled(false);
		btnVoc.setBackground(new Color(0, 51, 255));
		GroupLayout groupLayout = new GroupLayout(internalFrame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnEstacionado, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
						.addComponent(btnDesestacionado, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
						.addComponent(btnVoc, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(143)
					.addComponent(btnEstacionado)
					.addGap(18)
					.addComponent(btnDesestacionado)
					.addGap(18)
					.addComponent(btnVoc)
					.addContainerGap(37, Short.MAX_VALUE))
		);
		internalFrame.getContentPane().setLayout(groupLayout);
		contentPane.setLayout(gl_contentPane);
	}
}
