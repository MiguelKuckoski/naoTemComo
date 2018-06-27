package view;

import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import extras.Iview;
import vo.Controle;
import vo.Main;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SelecionarPerspectiva extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtLogs;	
	private Controle controle;
	/**
	 * Create the frame.
	 * @param controle 
	 */
	public SelecionarPerspectiva(Controle controle) {
		this.controle = controle;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 387, 489);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnEstacionamento = new JButton("LISTAR TODOS");
		btnEstacionamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mostrarLog("todos");
			}
		});
		
		JButton btnEstacionamentoPrincipal = new JButton("ESTACIONAMENTO PRINCIPAL");
		btnEstacionamentoPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarLog("principal");
			}
		});
		btnEstacionamentoPrincipal.setToolTipText("ESTACIONAMENTO");
		
		JButton btnEstacionamentoDeMotos = new JButton("ESTACIONAMENTO DE MOTOS");
		btnEstacionamentoDeMotos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarLog("motos");
			}
		});
		
		JButton btnEstacionamentoDosFundos = new JButton("ESTACIONAMENTO DOS FUNDOS");
		btnEstacionamentoDosFundos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarLog("fundos");
			}
		});
		
		JButton btnVoltar = new JButton("VOLTAR");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Main main = Main.INSTANCIA;
				main.getOpcoes().setVisible(true);
			}
		});
		
		txtLogs = new JTextField();
		txtLogs.setFont(new Font("Tahoma", Font.BOLD, 43));
		txtLogs.setEditable(false);
		txtLogs.setBackground(SystemColor.activeCaption);
		txtLogs.setForeground(SystemColor.text);
		txtLogs.setText("Logs:");
		txtLogs.setColumns(10);
		

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnEstacionamento, GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
								.addComponent(btnEstacionamentoPrincipal, GroupLayout.PREFERRED_SIZE, 341, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnEstacionamentoDeMotos, GroupLayout.PREFERRED_SIZE, 341, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnEstacionamentoDosFundos, GroupLayout.PREFERRED_SIZE, 341, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(114)
							.addComponent(txtLogs, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnVoltar, GroupLayout.PREFERRED_SIZE, 341, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(2)
					.addComponent(txtLogs, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnEstacionamento, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnEstacionamentoPrincipal, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnEstacionamentoDeMotos, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnEstacionamentoDosFundos, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
					.addComponent(btnVoltar, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
		);
		contentPane.setLayout(gl_contentPane);
	}

	// Mostra os relatorios correspondentes ao estacionamento selecionado.
	public void mostrarLog(String tipo) {
		LogsShow logs = new LogsShow(controle, tipo);
		logs.setVisible(true);
		logs.requestFocus();
	}
}
