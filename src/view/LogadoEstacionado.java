package view;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import vo.Controle;
import vo.Estacionamento;
import vo.Main;

public class LogadoEstacionado extends JFrame {

	private JPanel contentPane;
	private Controle controle;
	private JButton btnSair;
	private JButton btnDesestacionar;
	private JButton btnOpcoes;
	private Main main = Main.INSTANCIA;
	private Estacionamento estacionamentoAtual = null;


	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 * @param estacionamento 
	 */
	public LogadoEstacionado(Controle controle, Estacionamento estacionamento) {
		this.controle = controle;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1096, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane
				.setHorizontalGroup(
						gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
								.createSequentialGroup().addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup().addGap(52).addComponent(
												getBtnSair(), GroupLayout.PREFERRED_SIZE, 189,
												GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup().addGap(79)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addComponent(getBtnOpcoes(), GroupLayout.PREFERRED_SIZE, 129,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(getBtnDesestacionar(), GroupLayout.PREFERRED_SIZE,
																129, GroupLayout.PREFERRED_SIZE))))
								.addContainerGap(48, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addGap(31)
				.addComponent(getBtnDesestacionar(), GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE).addGap(31)
				.addComponent(getBtnOpcoes(), GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE).addGap(172)
				.addComponent(getBtnSair(), GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)));
		contentPane.setLayout(gl_contentPane);
		
		contentPane.add(estacionamento).setBounds(374, 11, 700, 369);
		estacionamento.setVisible(true);
		estacionamento.displayValues();
		estacionamento.requestFocus();
		
	}

	private JButton getBtnSair() {
		if (btnSair == null) {
			btnSair = new JButton("SAIR");
			btnSair.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					Index index = main.getIndex();
					index.setVisible(true);
					index.requestFocus();					
					LogadoEstacionado logadoEstacionado = main.getLogadoEstacionado();
					logadoEstacionado.dispose();
					logadoEstacionado.setVisible(false);
					controle.setLoggedUser(null);
				}
			});
			btnSair.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return btnSair;
	}

	private JButton getBtnDesestacionar() {
		if (btnDesestacionar == null) {
			btnDesestacionar = new JButton("Desestacionar");
			btnDesestacionar.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					
					
//					LogadoEstacionado logadoEstacionado = main.getLogadoEstacionado();
//					logadoEstacionado.setVisible(false);
				}
			});
		}
		return btnDesestacionar;
	}

	private JButton getBtnOpcoes() {
		if (btnOpcoes == null) {
			btnOpcoes = new JButton("Opções");
			btnOpcoes.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					Opcoes opcoes = main.getOpcoes();
					opcoes.setVisible(true);
					opcoes.requestFocus();
					LogadoEstacionado logadoEstacionado = main.getLogadoEstacionado();
					logadoEstacionado.setVisible(false);
				}
			});
		}
		return btnOpcoes;
	}

	public void mostrarTela(Estacionamento estacionamento) {
		if(estacionamentoAtual != null) {
			estacionamentoAtual.setVisible(false);
		}
		
		estacionamentoAtual = estacionamento;
		
		setBounds(100, 100, 1096, 436);
		contentPane.add(estacionamentoAtual).setBounds(374, 11, 700, 369);	
		estacionamentoAtual.displayValues();
		estacionamentoAtual.setVisible(true);	
		
	/*	
		contentPane.add(estacionamento).setBounds(374, 11, 700, 369);
		estacionamento.setVisible(true);
		estacionamento.requestFocus();*/
	}
}