package view;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import extras.Estados;
import extras.Iview;
import vo.Usuario;

public class Cadastro extends JFrame implements Iview {

	private JPanel contentPane;
	private JLabel lblDadosPessoais;
	private JLabel lblNome;
	private JTextField textFieldNome;
	private JLabel lblCpf;
	private JTextField textFieldCpf;
	private JLabel lblCnh;
	private JTextField textFieldCnh;
	private JLabel lblEndereo;
	private JLabel lblRua;
	private JLabel lblComplemento;
	private JLabel lblCep;
	private JLabel lblBairro;
	private JTable table;
	private JLabel lblCidade;
	private JLabel lblEstado;
	private JTextField textFieldRua;
	private JTextField textFieldComplemento;
	private JTextField textFieldNumero;
	private JTextField textFieldCep;
	private JTextField textFieldBairro;
	private JTextField textFieldCidade;
	private JComboBox comboBoxEstado;
	private JButton btnCadastrar;
	private JButton btnVoltar;
	private JButton btnVeiculos;
	protected final static Cadastro frame = new Cadastro();
	private static final Index index = new Index();
	private static final LogadoEstacionado logadoEstacionado = new LogadoEstacionado();
	private JLabel lblN;
	private JLabel lblSenha;
	private JPopupMenu popUpCadastroVeiculo;
	private JPasswordField textFieldSenha;

	/**
	 * Launch the application.
	 */
	public static void cadastro() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(getLblDadosPessoais(), GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(getLblNome(), GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
								.addComponent(getLblCpf(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE))
						.addGap(26)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(getTextFieldCpf(), GroupLayout.PREFERRED_SIZE, 194,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(getTextFieldNome(), GroupLayout.PREFERRED_SIZE, 193,
										GroupLayout.PREFERRED_SIZE))
						.addGap(32)
						.addGroup(
								gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(getLblCnh(), GroupLayout.PREFERRED_SIZE, 47,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(getLblSenha()))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(getTextFieldCnh(), GroupLayout.PREFERRED_SIZE, 157,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(getTextFieldSenha(), GroupLayout.PREFERRED_SIZE, 157,
										GroupLayout.PREFERRED_SIZE))
						.addGap(126))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(39)
						.addComponent(getTable(), GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(643, Short.MAX_VALUE))
				.addGroup(
						gl_contentPane.createSequentialGroup().addContainerGap()
								.addComponent(getLblEndereo(), GroupLayout.PREFERRED_SIZE, 363,
										GroupLayout.PREFERRED_SIZE)
								.addContainerGap(310, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(getLblComplemento()).addComponent(getLblRua()).addComponent(getLblCep())
								.addComponent(getLblBairro()).addComponent(getLblCidade()).addComponent(getLblEstado()))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(getTextFieldCep(), GroupLayout.PREFERRED_SIZE, 216,
										GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(getTextFieldRua(), GroupLayout.PREFERRED_SIZE, 215,
												GroupLayout.PREFERRED_SIZE)
										.addGap(59)
										.addComponent(getLblN(), GroupLayout.PREFERRED_SIZE, 43,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(getTextFieldNumero(),
												GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addComponent(getTextFieldComplemento(), GroupLayout.PREFERRED_SIZE, 214,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(getTextFieldBairro(), GroupLayout.PREFERRED_SIZE, 215,
										GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(getComboBoxEstado(), Alignment.LEADING, 0,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(getTextFieldCidade(), Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
												215, Short.MAX_VALUE)))
						.addContainerGap(197, Short.MAX_VALUE))
				.addGroup(
						gl_contentPane.createSequentialGroup().addContainerGap().addComponent(getBtnCadastrar())
								.addGap(41)
								.addComponent(getBtnVoltar(), GroupLayout.PREFERRED_SIZE, 78,
										GroupLayout.PREFERRED_SIZE)
								.addContainerGap(473, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
						.addComponent(getBtnVeiculos(), GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(542, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addComponent(getLblDadosPessoais(), GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(getLblNome(), GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(getTextFieldNome(), GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(getLblSenha())
						.addComponent(getTextFieldSenha(), GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
				.addGap(7)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(getLblCpf(), GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(getTextFieldCpf(), GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(getTextFieldCnh(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(getLblCnh(), GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
				.addGap(44).addComponent(getLblEndereo(), GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
						.createSequentialGroup().addGap(11)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(getLblRua())
								.addComponent(getTextFieldRua(), GroupLayout.PREFERRED_SIZE, 24,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(getTextFieldNumero(), GroupLayout.PREFERRED_SIZE, 22,
										GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(getLblComplemento()).addComponent(getTextFieldComplemento(),
										GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(getLblCep())
								.addComponent(getTextFieldCep(), GroupLayout.PREFERRED_SIZE, 25,
										GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(getLblBairro())
								.addComponent(getTextFieldBairro(), GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(getTable(), GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(getLblCidade())
								.addComponent(getTextFieldCidade(), GroupLayout.PREFERRED_SIZE, 24,
										GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(getLblEstado())
								.addComponent(getComboBoxEstado(), GroupLayout.PREFERRED_SIZE, 23,
										GroupLayout.PREFERRED_SIZE))
						.addGap(37)
						.addComponent(getBtnVeiculos(), GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(getBtnCadastrar())
								.addComponent(getBtnVoltar(), GroupLayout.PREFERRED_SIZE, 23,
										GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(getLblN(), GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap()));
		contentPane.setLayout(gl_contentPane);
	}

	@Override
	public void cleanValues() {
		// TODO Auto-generated method stub

	}

	@Override
	public void save() {
		String validacao = validateValues();

		if (validacao == null) {
			assignValues();
			// TODO dao?
			setInvisible();
			logadoEstacionado.setVisible();
		} else {
			JOptionPane.showMessageDialog(null, "Preencha todos os campos: \n " + validacao, "WARNING",
					JOptionPane.WARNING_MESSAGE);
		}

	}

	@Override
	public void assignValues() {
		Usuario usuario = new Usuario();
		usuario.setNome(getTextFieldNome().getText());
		usuario.setSenha(getTextFieldSenha().getText());
		usuario.setCpf(getTextFieldCpf().getText());
		usuario.setCnh(getTextFieldCnh().getText());
		usuario.setRua(getTextFieldRua().getText());
		usuario.setNum(Integer.parseInt(getTextFieldNumero().getText()));
		usuario.setBairro(getTextFieldBairro().getText());
		usuario.setCep(Integer.parseInt(getTextFieldCep().getText()));
		usuario.setEstado(getComboBoxEstado().getName());

		if (getTextFieldComplemento().getText().length() > 0) {
			usuario.setComplemento(getTextFieldComplemento().getText());
		}
		if (getTextFieldCidade().getText().length() > 0) {
			usuario.setCidade(getTextFieldCidade().getText());
		}
	}

	@Override
	public String validateValues() {
		String validacao = "";

		boolean numCasa = true;
		boolean cep = true;

		try {
			int i = Integer.parseInt(getTextFieldNumero().getText());
		} catch (NumberFormatException nfe) {
			numCasa = false;
		}

		try {
			int i = Integer.parseInt(getTextFieldNumero().getText());
		} catch (NumberFormatException nfe) {
			cep = false;
		}

		if (getTextFieldNome().getText().length() == 0) {
			validacao += "Informe o nome. \n";
		}
		if (getTextFieldCnh().getText().length() == 0) {
			validacao += "Informe o numero da CNH. \n";
		}
		if (getTextFieldCpf().getText().length() == 0) {
			validacao += "Informe o numero do CPF. \n";
		}
		if (getTextFieldRua().getText().length() == 0) {
			validacao += "Informe o nome da rua. \n";
		}
		
		if (!numCasa) {
			validacao = "Numero da casa incorreto. Informe apenas numeros.";
		} else if (getTextFieldNumero().getText().length() == 0) {
			validacao += "Informe o numero da casa. \n";
		}
		
		if (!cep) {
			validacao += "Cep incorreto. Informe apenas numeros.";
		} else if (getTextFieldCep().getText().length() == 0) {
			validacao += "Informe o cep. \n";
		}
		if (getTextFieldBairro().getText().length() == 0) {
			validacao += "Informe o bairro \n";
		}
		if (getComboBoxEstado().getSelectedIndex() < 1) {
			validacao += "Selecione o estado";
		}
		if (validacao.length() > 0) {
			return validacao;
		} else {
			return null;
		}

	}

	private JLabel getLblDadosPessoais() {
		if (lblDadosPessoais == null) {
			lblDadosPessoais = new JLabel("Dados Pessoais");
			lblDadosPessoais.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lblDadosPessoais;
	}

	private JLabel getLblNome() {
		if (lblNome == null) {
			lblNome = new JLabel("Nome Completo");
		}
		return lblNome;
	}

	private JTextField getTextFieldNome() {
		if (textFieldNome == null) {
			textFieldNome = new JTextField();
			textFieldNome.setColumns(10);
		}
		return textFieldNome;
	}

	private JLabel getLblCpf() {
		if (lblCpf == null) {
			lblCpf = new JLabel("CPF");
		}
		return lblCpf;
	}

	private JTextField getTextFieldCpf() {
		if (textFieldCpf == null) {
			textFieldCpf = new JTextField();
			textFieldCpf.setColumns(10);
		}
		return textFieldCpf;
	}

	private JLabel getLblCnh() {
		if (lblCnh == null) {
			lblCnh = new JLabel("CNH");
		}
		return lblCnh;
	}

	private JTextField getTextFieldCnh() {
		if (textFieldCnh == null) {
			textFieldCnh = new JTextField();
			textFieldCnh.setColumns(10);
		}
		return textFieldCnh;
	}

	private JLabel getLblEndereo() {
		if (lblEndereo == null) {
			lblEndereo = new JLabel("Endere\u00E7o");
			lblEndereo.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lblEndereo;
	}

	private JLabel getLblRua() {
		if (lblRua == null) {
			lblRua = new JLabel("Rua");
		}
		return lblRua;
	}

	private JLabel getLblComplemento() {
		if (lblComplemento == null) {
			lblComplemento = new JLabel("Complemento");
		}
		return lblComplemento;
	}

	private JLabel getLblCep() {
		if (lblCep == null) {
			lblCep = new JLabel("Cep");
		}
		return lblCep;
	}

	private JLabel getLblBairro() {
		if (lblBairro == null) {
			lblBairro = new JLabel("Bairro");
		}
		return lblBairro;
	}

	private JTable getTable() {
		if (table == null) {
			table = new JTable();
		}
		return table;
	}

	private JLabel getLblCidade() {
		if (lblCidade == null) {
			lblCidade = new JLabel("Cidade");
		}
		return lblCidade;
	}

	private JLabel getLblEstado() {
		if (lblEstado == null) {
			lblEstado = new JLabel("Estado");
		}
		return lblEstado;
	}

	private JTextField getTextFieldRua() {
		if (textFieldRua == null) {
			textFieldRua = new JTextField();
			textFieldRua.setColumns(10);
		}
		return textFieldRua;
	}

	private JTextField getTextFieldComplemento() {
		if (textFieldComplemento == null) {
			textFieldComplemento = new JTextField();
			textFieldComplemento.setColumns(10);
		}
		return textFieldComplemento;
	}

	private JTextField getTextFieldNumero() {
		if (textFieldNumero == null) {
			textFieldNumero = new JTextField();
			textFieldNumero.setColumns(10);
		}
		return textFieldNumero;
	}

	private JTextField getTextFieldCep() {
		if (textFieldCep == null) {
			textFieldCep = new JTextField();
			textFieldCep.setColumns(10);
		}
		return textFieldCep;
	}

	private JTextField getTextFieldBairro() {
		if (textFieldBairro == null) {
			textFieldBairro = new JTextField();
			textFieldBairro.setColumns(10);
		}
		return textFieldBairro;
	}

	private JTextField getTextFieldCidade() {
		if (textFieldCidade == null) {
			textFieldCidade = new JTextField();
			textFieldCidade.setColumns(10);
		}
		return textFieldCidade;
	}

	private JComboBox<Estados> getComboBoxEstado() {
		if (comboBoxEstado == null) {
			comboBoxEstado = new JComboBox<Estados>();
		}
		return comboBoxEstado;
	}

	private JButton getBtnCadastrar() {
		if (btnCadastrar == null) {
			btnCadastrar = new JButton("Cadastrar");
			btnCadastrar.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					save();
				}
			});
		}
		return btnCadastrar;
	}

	private JButton getBtnVoltar() {
		if (btnVoltar == null) {
			btnVoltar = new JButton("Voltar");
			btnVoltar.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					setInvisible();
					index.setVisible();
				}
			});
		}
		return btnVoltar;
	}

	private JButton getBtnVeiculos() {
		if (btnVeiculos == null) {
			btnVeiculos = new JButton("Veiculos");
			btnVeiculos.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					CadastroVeiculo.popUpCadastroVeiculo();
				}
			});
		}
		return btnVeiculos;
	}

	public void setVisible() {
		frame.setVisible(true);
	}

	public void setInvisible() {
		frame.setVisible(false);
	}

	private JLabel getLblN() {
		if (lblN == null) {
			lblN = new JLabel("N\u00BA");
		}
		return lblN;
	}

	private JLabel getLblSenha() {
		if (lblSenha == null) {
			lblSenha = new JLabel("Senha");
		}
		return lblSenha;
	}

	private JPopupMenu getPopUpCadastroVeiculo() {
		if (popUpCadastroVeiculo == null) {
			popUpCadastroVeiculo = new JPopupMenu();
		}
		return popUpCadastroVeiculo;
	}

	private JPasswordField getTextFieldSenha() {
		if (textFieldSenha == null) {
			textFieldSenha = new JPasswordField();
			textFieldSenha.setColumns(10);
		}

		return textFieldSenha;
	}
}
