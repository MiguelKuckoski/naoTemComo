package view;

import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import extras.VeiculoType;
import vo.Controle;
import vo.Endereco;
import vo.Estacionamento;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EstacionamentoMotos extends Estacionamento {

	/**
	 * Create the panel. 
	 */
	
	private static String estacionamentoNome;
	private static int numeroVagas;
	private static VeiculoType tipoVeiculo;
	private static Endereco endereco;
	
	public EstacionamentoMotos(Controle controle) {
		
		super(getEndereco(),getTipoVeiculo(),getEstacionamentoNome(),getNumeroVagas());

		setBorder(new LineBorder(new Color(0, 0, 0)));
		setBackground(new Color(255, 204, 204));
		
		JPanel panel = new JPanel();
		
		Border bordapretaumpixel = new LineBorder(Color.BLACK, 1);
		
		JButton button = new JButton("");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int posicao = 1;
			}
		});
		button.setContentAreaFilled(false);
		button.setOpaque(true);
		button.setBackground(new Color(0, 153, 51));
		button.setBorderPainted(true);
		button.setBorder(bordapretaumpixel);
		
		JButton button_2 = new JButton("");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int posicao = 7;
			}
		});
		button_2.setContentAreaFilled(false);
		button_2.setOpaque(true);
		button_2.setBackground(new Color(0, 153, 51));
		button_2.setBorderPainted(true);
		button_2.setBorder(bordapretaumpixel);
		
		JButton button_3 = new JButton("");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int posicao = 8;
			}
		});
		button_3.setContentAreaFilled(false);
		button_3.setOpaque(true);
		button_3.setBackground(new Color(0, 153, 51));
		button_3.setBorderPainted(true);
		button_3.setBorder(bordapretaumpixel);
		
		JButton button_4 = new JButton("");
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int posicao = 9;
			}
		});
		button_4.setContentAreaFilled(false);
		button_4.setOpaque(true);
		button_4.setBackground(new Color(0, 153, 51));
		button_4.setBorderPainted(true);
		button_4.setBorder(bordapretaumpixel);
		
		JButton button_5 = new JButton("");
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int posicao = 2;
			}
		});
		button_5.setContentAreaFilled(false);
		button_5.setOpaque(true);
		button_5.setBackground(new Color(0, 153, 51));
		button_5.setBorderPainted(true);
		button_5.setBorder(bordapretaumpixel);
		
		JButton button_6 = new JButton("");
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int posicao = 3;
			}
		});
		button_6.setContentAreaFilled(false);
		button_6.setOpaque(true);
		button_6.setBackground(new Color(0, 153, 51));
		button_6.setBorderPainted(true);
		button_6.setBorder(bordapretaumpixel);
		
		JButton button_7 = new JButton("");
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int posicao = 4;
			}
		});
		button_7.setContentAreaFilled(false);
		button_7.setOpaque(true);
		button_7.setBackground(new Color(0, 153, 51));
		button_7.setBorderPainted(true);
		button_7.setBorder(bordapretaumpixel);
		
		JButton button_8 = new JButton("");
		button_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int posicao = 10;
			}
		});
		button_8.setContentAreaFilled(false);
		button_8.setOpaque(true);
		button_8.setBackground(new Color(0, 153, 51));
		button_8.setBorderPainted(true);
		button_8.setBorder(bordapretaumpixel);
		
		JButton button_9 = new JButton("");
		button_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int posicao = 11;
			}
		});
		button_9.setContentAreaFilled(false);
		button_9.setOpaque(true);
		button_9.setBackground(new Color(0, 153, 51));
		button_9.setBorderPainted(true);
		button_9.setBorder(bordapretaumpixel);
		
		JButton button_10 = new JButton("");
		button_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int posicao = 5;
			}
		});
		button_10.setContentAreaFilled(false);
		button_10.setOpaque(true);
		button_10.setBackground(new Color(0, 153, 51));
		button_10.setBorderPainted(true);
		button_10.setBorder(bordapretaumpixel);
		
		JButton button_11 = new JButton("");
		button_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int posicao = 6;
			}
		});
		button_11.setContentAreaFilled(false);
		button_11.setOpaque(true);
		button_11.setBackground(new Color(0, 153, 51));
		button_11.setBorderPainted(true);
		button_11.setBorder(bordapretaumpixel);
		
		JButton button_12 = new JButton("");
		button_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int posicao = 12;
			}
		});
		button_12.setContentAreaFilled(false);
		button_12.setOpaque(true);
		button_12.setBackground(new Color(0, 153, 51));
		button_12.setBorderPainted(true);
		button_12.setBorder(bordapretaumpixel);
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_10, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_11, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_12, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(61, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(button_11, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
							.addComponent(button_12, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(button_10, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
							.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
							.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
							.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
							.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
							.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
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
			tipoVeiculo = tipoVeiculo.getType("Moto") ;
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
}
