package view;

import java.awt.EventQueue;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import extras.Estados;
import extras.Iview;

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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JComboBox comboBox;
	private JButton btnCadastrar;
	private JButton btnVoltar;
	private JButton btnVeiculos;
	protected final static Cadastro frame = new Cadastro();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		setBounds(100, 100, 425, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(getLblDadosPessoais(), GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(getLblNome(), GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
						.addComponent(getLblCpf(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(getLblCnh(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(getTextFieldCpf(), GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
						.addComponent(getTextFieldCnh(), GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
						.addComponent(getTextFieldNome(), GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
					.addGap(79))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(39)
					.addComponent(getTable(), GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(356, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(getLblEndereo(), GroupLayout.PREFERRED_SIZE, 363, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(23, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(getLblComplemento())
						.addComponent(getLblRua())
						.addComponent(getLblCep())
						.addComponent(getLblBairro())
						.addComponent(getLblCidade())
						.addComponent(getLblEstado()))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(getTextField(), GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(getTextFieldRua(), GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(getTextFieldNumero(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(getTextFieldComplemento(), GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
						.addComponent(getTextField_1(), GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(getComboBox(), Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(getTextField_2(), Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)))
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(getBtnCadastrar())
					.addGap(41)
					.addComponent(getBtnVoltar())
					.addContainerGap(203, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(getBtnVeiculos(), GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(255, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(getLblDadosPessoais(), GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(getLblNome(), GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(getTextFieldNome(), GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(getLblCpf(), GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(getTextFieldCpf(), GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(getLblCnh(), GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(getTextFieldCnh(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(getLblEndereo(), GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(getLblRua())
						.addComponent(getTextFieldRua(), GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(getTextFieldNumero(), GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(getLblComplemento())
						.addComponent(getTextFieldComplemento(), GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(getLblCep())
						.addComponent(getTextField(), GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(getLblBairro())
						.addComponent(getTextField_1(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(getTable(), GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(getLblCidade())
						.addComponent(getTextField_2(), GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(getLblEstado())
						.addComponent(getComboBox(), GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(37)
					.addComponent(getBtnVeiculos(), GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(getBtnCadastrar())
						.addComponent(getBtnVoltar()))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}

	@Override
	public void cleanValues() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assignValues() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validateValues() {
		// TODO Auto-generated method stub
		
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
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
		}
		return textField_2;
	}
	private JComboBox<Estados> getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox<Estados>();
		}
		return comboBox;
	}
	private JButton getBtnCadastrar() {
		if (btnCadastrar == null) {
			btnCadastrar = new JButton("Cadastrar");
		}
		return btnCadastrar;
	}
	private JButton getBtnVoltar() {
		if (btnVoltar == null) {
			btnVoltar = new JButton("Voltar");
		}
		return btnVoltar;
	}
	private JButton getBtnVeiculos() {
		if (btnVeiculos == null) {
			btnVeiculos = new JButton("Veiculos");
		}
		return btnVeiculos;
	}
}
