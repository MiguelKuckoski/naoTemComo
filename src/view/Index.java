package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;

import vo.Controle;
import vo.Usuario;
import vo.Veiculo;

public class Index {

	private JFrame frame;
	private JLabel lblCpf;
	private JFormattedTextField cpfField;
	private JLabel lblPassword;
	private JPasswordField passwordField;
	private JButton btnSair;
	private JButton btnLogin;
	private JButton btnCadastrar;
	protected static final Index window = new Index();	

	/**
	 * Launch the application.
	 * 
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public Index() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 385, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(getLblPassword(), GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
								.addComponent(getLblCpf(), GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(getTextFieldCpf(), GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
								.addComponent(getPasswordField(), GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(60)
							.addComponent(getBtnSair(), GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
							.addGap(54)
							.addComponent(getBtnLogin(), GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)))
					.addGap(62))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(90)
					.addComponent(getBtnCadastrar(), GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(95, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(getLblCpf(), GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(getTextFieldCpf(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(getLblPassword(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(getPasswordField()))
					.addGap(37)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(getBtnLogin(), GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(getBtnSair(), GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(157)
					.addComponent(getBtnCadastrar())
					.addGap(36))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
	private JLabel getLblCpf() {
		if (lblCpf == null) {
			lblCpf = new JLabel("CPF");
			lblCpf.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lblCpf;
	}
	private JFormattedTextField getTextFieldCpf() {
		if (cpfField == null) {
			try {
				cpfField = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			cpfField.setColumns(10);
		}
		return cpfField;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Senha");
			lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lblPassword;
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
		}
		return btnSair;
	}
	private JButton getBtnLogin() {
		if (btnLogin == null) {
			btnLogin = new JButton("Login");
			btnLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
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
				public void mouseClicked(MouseEvent arg0) {
					
					Cadastro cadastro = new Cadastro();
					cadastro.cleanValues();
					
					CadastroVeiculo cadastroVeiculo = new CadastroVeiculo();
					cadastroVeiculo.cleanValues();		
					
					Cadastro.cadastro(frame);

				}
			});
		}
		return btnCadastrar;
	}
	
	public void login() {
		//Verifica os dados de login com a lista de usuarios cadastrados.
		String cpf = getTextFieldCpf().getText();
		char[] senhaChar = getPasswordField().getPassword();
		String senha = new String(senhaChar);
		if(Controle.getUsuarios() == null) {
			JOptionPane.showMessageDialog(null, "Usuario não cadastrado.", "Erro de login!",
					JOptionPane.WARNING_MESSAGE);
		}else {
			List<Usuario> usuarios = Controle.getUsuarios();
			for (Usuario usuario : usuarios) {
				if(usuario.getSenha().equals(senha) && usuario.getCpf().equals(cpf)) {
					Controle.setLoggedUser(usuario);
					break;
				}
			}
			
			if(Controle.getLoggedUser() != null) {
				boolean estacionado = false;
				for (Veiculo veiculo : Controle.getLoggedUser().getVeiculos()) {
					if(veiculo.isEstacionado()) {
						Controle.getLoggedUser().setSelectedVeiculo(veiculo);
						estacionado = true;
						break;
					}
				}
				
				if(estacionado) {
					LogadoEstacionado.logadoEstacionado(frame, window);
				}else {
					LogadoNaoEstacionado.logadoNaoEstacionado(frame, window);
				}
				
				
			}else {
				JOptionPane.showMessageDialog(null, "Usuario não cadastrado.", "Erro de login!",
						JOptionPane.WARNING_MESSAGE);
			}
		}
		
	}
}
