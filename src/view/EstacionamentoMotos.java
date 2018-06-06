package view;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import extras.VeiculoType;
import vo.Controle;
import vo.Endereco;
import vo.Estacionamento;

public class EstacionamentoMotos extends Estacionamento {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Create the panel. 
	 */
	
	private static String estacionamentoNome;
	private static int numeroVagas;
	private static VeiculoType tipoVeiculo;
	private static Endereco endereco;

	
	public EstacionamentoMotos(Controle controle) {
		
		super(getEndereco(),getTipoVeiculo(),getEstacionamentoNome(),getNumeroVagas(), controle);

		setBorder(new LineBorder(new Color(0, 0, 0)));
		setBackground(new Color(255, 204, 204));
		
		JPanel panel = new JPanel();
		
		Border bordapretaumpixel = new LineBorder(Color.BLACK, 1);
		
		JButton btnVaga_1 = new JButton("");
		btnVaga_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int posicao = 1;
				verificarVaga(posicao);	
			}
		});
		btnVaga_1.setContentAreaFilled(false);
		btnVaga_1.setOpaque(true);
		btnVaga_1.setBackground(new Color(0, 153, 51));
		btnVaga_1.setBorderPainted(true);
		btnVaga_1.setBorder(bordapretaumpixel);
		
		JButton btnVaga_7 = new JButton("");
		btnVaga_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int posicao = 7;
				verificarVaga(posicao);	
			}
		});
		btnVaga_7.setContentAreaFilled(false);
		btnVaga_7.setOpaque(true);
		btnVaga_7.setBackground(new Color(0, 153, 51));
		btnVaga_7.setBorderPainted(true);
		btnVaga_7.setBorder(bordapretaumpixel);
		
		JButton btnVaga_8 = new JButton("");
		btnVaga_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int posicao = 8;
				verificarVaga(posicao);	
			}
		});
		btnVaga_8.setContentAreaFilled(false);
		btnVaga_8.setOpaque(true);
		btnVaga_8.setBackground(new Color(0, 153, 51));
		btnVaga_8.setBorderPainted(true);
		btnVaga_8.setBorder(bordapretaumpixel);
		
		JButton btnVaga_9 = new JButton("");
		btnVaga_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int posicao = 9;
				verificarVaga(posicao);	
			}
		});
		btnVaga_9.setContentAreaFilled(false);
		btnVaga_9.setOpaque(true);
		btnVaga_9.setBackground(new Color(0, 153, 51));
		btnVaga_9.setBorderPainted(true);
		btnVaga_9.setBorder(bordapretaumpixel);
		
		JButton btnVaga_2 = new JButton("");
		btnVaga_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int posicao = 2;
				verificarVaga(posicao);	
			}
		});
		btnVaga_2.setContentAreaFilled(false);
		btnVaga_2.setOpaque(true);
		btnVaga_2.setBackground(new Color(0, 153, 51));
		btnVaga_2.setBorderPainted(true);
		btnVaga_2.setBorder(bordapretaumpixel);
		
		JButton btnVaga_3 = new JButton("");
		btnVaga_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int posicao = 3;
				verificarVaga(posicao);	
			}
		});
		btnVaga_3.setContentAreaFilled(false);
		btnVaga_3.setOpaque(true);
		btnVaga_3.setBackground(new Color(0, 153, 51));
		btnVaga_3.setBorderPainted(true);
		btnVaga_3.setBorder(bordapretaumpixel);
		
		JButton btnVaga_4 = new JButton("");
		btnVaga_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int posicao = 4;
				verificarVaga(posicao);	
			}
		});
		btnVaga_4.setContentAreaFilled(false);
		btnVaga_4.setOpaque(true);
		btnVaga_4.setBackground(new Color(0, 153, 51));
		btnVaga_4.setBorderPainted(true);
		btnVaga_4.setBorder(bordapretaumpixel);
		
		JButton btnVaga_10 = new JButton("");
		btnVaga_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int posicao = 10;
				verificarVaga(posicao);	
			}
		});
		btnVaga_10.setContentAreaFilled(false);
		btnVaga_10.setOpaque(true);
		btnVaga_10.setBackground(new Color(0, 153, 51));
		btnVaga_10.setBorderPainted(true);
		btnVaga_10.setBorder(bordapretaumpixel);
		
		JButton btnVaga_11 = new JButton("");
		btnVaga_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int posicao = 11;
				verificarVaga(posicao);	
			}
		});
		btnVaga_11.setContentAreaFilled(false);
		btnVaga_11.setOpaque(true);
		btnVaga_11.setBackground(new Color(0, 153, 51));
		btnVaga_11.setBorderPainted(true);
		btnVaga_11.setBorder(bordapretaumpixel);
		
		JButton btnVaga_5 = new JButton("");
		btnVaga_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int posicao = 5;
				verificarVaga(posicao);	
			}
		});
		btnVaga_5.setContentAreaFilled(false);
		btnVaga_5.setOpaque(true);
		btnVaga_5.setBackground(new Color(0, 153, 51));
		btnVaga_5.setBorderPainted(true);
		btnVaga_5.setBorder(bordapretaumpixel);
		
		JButton btnVaga_6 = new JButton("");
		btnVaga_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int posicao = 6;
				verificarVaga(posicao);	
			}
		});
		btnVaga_6.setContentAreaFilled(false);
		btnVaga_6.setOpaque(true);
		btnVaga_6.setBackground(new Color(0, 153, 51));
		btnVaga_6.setBorderPainted(true);
		btnVaga_6.setBorder(bordapretaumpixel);
		
		JButton btnVaga_12 = new JButton("");
		btnVaga_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int posicao = 12;
				verificarVaga(posicao);	
			}
		});
		btnVaga_12.setContentAreaFilled(false);
		btnVaga_12.setOpaque(true);
		btnVaga_12.setBackground(new Color(0, 153, 51));
		btnVaga_12.setBorderPainted(true);
		btnVaga_12.setBorder(bordapretaumpixel);
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnVaga_1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnVaga_2, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnVaga_3, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnVaga_4, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnVaga_5, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnVaga_6, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnVaga_7, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnVaga_8, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnVaga_9, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnVaga_10, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnVaga_11, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnVaga_12, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(61, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnVaga_6, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
							.addComponent(btnVaga_12, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnVaga_5, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
							.addComponent(btnVaga_11, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnVaga_4, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
							.addComponent(btnVaga_10, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnVaga_3, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
							.addComponent(btnVaga_9, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnVaga_2, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
							.addComponent(btnVaga_8, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnVaga_1, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
							.addComponent(btnVaga_7, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE))
					.addContainerGap())
		);
		
		JTextPane txtpnInformativo = new JTextPane();
		txtpnInformativo.setBackground(SystemColor.control);
		txtpnInformativo.setText("Informativo:");
		
		JButton button_1 = new JButton("Ocupado");
		button_1.setEnabled(false);
		button_1.setBackground(Color.RED);
		
		JButton btnDisponvel = new JButton("Disponível");
		btnDisponvel.setEnabled(false);
		btnDisponvel.setBackground(Color.GREEN);
		
		JButton btnVoc = new JButton("Você");
		btnVoc.setEnabled(false);
		btnVoc.setBackground(Color.BLUE);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(button_1, GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
						.addComponent(txtpnInformativo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnDisponvel, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnVoc, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtpnInformativo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(140)
					.addComponent(button_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnDisponvel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnVoc)
					.addContainerGap(66, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		setLayout(groupLayout);
		
		getBtnVagas().add(btnVaga_1);
		getBtnVagas().add(btnVaga_2);
		getBtnVagas().add(btnVaga_3);
		getBtnVagas().add(btnVaga_4);
		getBtnVagas().add(btnVaga_5);
		getBtnVagas().add(btnVaga_6);
		getBtnVagas().add(btnVaga_7);
		getBtnVagas().add(btnVaga_8);
		getBtnVagas().add(btnVaga_9);
		getBtnVagas().add(btnVaga_10);
		getBtnVagas().add(btnVaga_11);
		getBtnVagas().add(btnVaga_12);

	}
	
	public static String getEstacionamentoNome() {
		if(estacionamentoNome == null) {
			estacionamentoNome = "Estacionamento Motos";
		}
		return estacionamentoNome;
	}
	
	public static int getNumeroVagas() {
		if(numeroVagas == 0) {
			numeroVagas = 12;
		}
		return numeroVagas;
			
	}
		
	public static VeiculoType getTipoVeiculo() {
		if(tipoVeiculo == null) {
			tipoVeiculo = VeiculoType.getType("Moto") ;
		}
		return tipoVeiculo;
	}
	
	public static Endereco getEndereco() {
		if(endereco == null) {
			String rua = "Avenida Pedra Branca";
			int cep = 88137-270;
			String bairro = "Pedra Branca";
			String cidade = "Palhoça";
			int numero = 25;
			String complemento = "Estacionamento de Motos";
			String estado = "Santa Catarina";
			Endereco endereco = new Endereco(rua,cep, numero, bairro, estado);
			endereco.setCidade(cidade);
			endereco.setComplemento(complemento);
		}
		return endereco;
	}

	public void verificarVaga(int posicao) {
		EstacionamentoMotos estacionamentoMotos = main.getEstacionamentoMoto();
		
		if(estacionar(posicao,controle.getLoggedUser(), estacionamentoMotos)) {
			getBtnVagas().get(posicao-1).setBackground(Color.BLUE);
			LogadoEstacionado tela = main.getLogadoEstacionado();
			tela.setVisible(true);
			tela.requestFocus();			
			estacionamentoMotos.setVisible(false);
			Estacionamentos estacionamentos = main.getEstacionamentos();
			estacionamentos.setVisible(false);
		}else {
			JOptionPane.showMessageDialog(null, "Vaga ocupada!", "Erro",
					JOptionPane.WARNING_MESSAGE);
		}
	}
}
