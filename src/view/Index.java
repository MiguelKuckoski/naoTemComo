package view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import vo.Controle;
import vo.Main;
import vo.Usuario;
import vo.Veiculo;

public class Index extends JFrame {

	private JPanel contentPane;
	private Controle controle;
	private JLabel lblCpf;
	private JLabel lblSenha;
	private JTextField textFieldCpf;
	private JPasswordField passwordField;
	private JButton btnSair;
	private JButton btnLogin;
	private JButton btnCadastrar;
	private Main main = Main.INSTANCIA;
	
	/**
	 * Launch the application.
	 * Create the frame.
	 * @param controle 
	 */
	public Index(Controle controle) {
		this.controle = controle;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 418, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(118)
							.addComponent(getBtnCadastrar(), GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(75)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(getBtnSair(), GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
									.addGap(64)
									.addComponent(getBtnLogin(), GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(getLblCpf())
										.addComponent(getLblSenha()))
									.addGap(33)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(getPasswordField())
										.addComponent(getTextFieldCpf(), 148, 148, Short.MAX_VALUE))))))
					.addContainerGap(94, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(35)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(getLblCpf())
						.addComponent(getTextFieldCpf(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(getLblSenha())
						.addComponent(getPasswordField(), GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addGap(40)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(getBtnLogin(), GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(getBtnSair(), GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
					.addComponent(getBtnCadastrar(), GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
	private JLabel getLblCpf() {
		if (lblCpf == null) {
			lblCpf = new JLabel("CPF");
		}
		return lblCpf;
	}
	private JLabel getLblSenha() {
		if (lblSenha == null) {
			lblSenha = new JLabel("Senha");
		}
		return lblSenha;
	}
	private JTextField getTextFieldCpf() {
		if (textFieldCpf == null) {
			textFieldCpf = new JTextField();
			textFieldCpf.setColumns(10);
		}
		return textFieldCpf;
	}
	private JPasswordField getPasswordField() {
		if (passwordField == null) {
			passwordField = new JPasswordField();
		}
		return passwordField;
	}
	private JButton getBtnSair() {
		if (btnSair == null) {
			btnSair = new JButton("Sair");
			btnSair.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					System.exit(0);
				}
			});
		}
		return btnSair;
	}
	private JButton getBtnLogin() {
		if (btnLogin == null) {
			btnLogin = new JButton("Login");
			btnLogin.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					login();
				}
			});
		}
		return btnLogin;
	}
	private JButton getBtnCadastrar() {
		if (btnCadastrar == null) {
			btnCadastrar = new JButton("Cadastrar");
			btnCadastrar.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					Cadastro cadastro = main.getCadastro();
					cadastro.setVisible(true);
					cadastro.requestFocus();		
					Index index = main.getIndex();
					index.setVisible(false);
							
				}
			});
		}
		return btnCadastrar;
	}
	public void login() {
		// Verifica os dados de login com a lista de usuarios cadastrados.
		String cpf = getTextFieldCpf().getText();
		char[] senhaChar = getPasswordField().getPassword();
		String senha = new String(senhaChar);		
		
		for (Usuario usuario : controle.getUsuarios()) {
			//Comparando os campos digitados com os usuários cadastrados.
			if (usuario.getSenha().equals(senha) && usuario.getCpf().equals(cpf)) {
				controle.setLoggedUser(usuario);
				break;
			}
		}

		if (controle.getLoggedUser() != null) {
			boolean estacionado = false;
			for (Veiculo veiculo : controle.getLoggedUser().getVeiculos()) {
				if (veiculo.isEstacionado()) {
					controle.getLoggedUser().setSelectedVeiculo(veiculo);
					estacionado = true;
					break;
				}
			}	
			
			//Verifica qual sera a proxima tela.
			if (estacionado) {
				LogadoEstacionado logadoEstacionado= main.getLogadoEstacionado();
				logadoEstacionado.setVisible(true);
				logadoEstacionado.requestFocus();
			} else {
				LogadoNaoEstacionado logadoNaoEstacionado = main.getLogadoNaoEstacionado();
				logadoNaoEstacionado.setVisible(true);
				logadoNaoEstacionado.requestFocus();
			}
			
			// torna a tela index invisivel.
			Index index = main.getIndex();
			index.setVisible(false);
			
			
		} else {
			JOptionPane.showMessageDialog(null, "Usuario não cadastrado.", "Erro de login!",
					JOptionPane.WARNING_MESSAGE);
		}
	}

}
