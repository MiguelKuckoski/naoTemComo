package view;

import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.MaskFormatter;

import extras.Iview;
import extras.VeiculoType;
import vo.Controle;
import vo.Main;
import vo.Usuario;
import vo.Veiculo;

public class CadastroVeiculo extends JFrame implements Iview {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblTipo;
	private JComboBox<VeiculoType> comboBoxVeiculoType;
	private JLabel lblCor;
	private JTextField textFieldCor;
	private JLabel lblPlaca;
	private JFormattedTextField textFieldPlaca;
	private JLabel lblAno;
	private JFormattedTextField textFieldAno;
	private JLabel lblModelo;
	private JTextField textFieldModelo;
	private JSeparator separator;
	private JScrollPane scrollPane;
	private JTable table;
	private List<Veiculo> veiculosNovos;
	private List<Veiculo> veiculos;
	private Main main = Main.INSTANCIA;
	private JButton btnCancelar;
	private JButton btnConfirmar;
	private JButton btnCadastrar;
	private JButton btnExcluir;
	private JLabel lblCamposObrigatrios;
	private boolean validacaoPlaca;
	private Controle controle;

	/**
	 * Create the frame.
	 */
	public CadastroVeiculo(Controle controle) {
		this.controle = controle;
		setTitle("Veiculos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addGap(26)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup().addComponent(getLblPlaca()).addGap(62))
								.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(getLblTipo(), GroupLayout.PREFERRED_SIZE, 69,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18)))
						.addComponent(getLblModelo()))
				.addGap(18)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(getComboBoxVeiculoType(), 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(getTextFieldPlaca(), GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
						.addComponent(getTextFieldModelo(), GroupLayout.PREFERRED_SIZE, 151,
								GroupLayout.PREFERRED_SIZE))
				.addGap(85)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(getLblCor(), GroupLayout.PREFERRED_SIZE, 52,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(getLblAno()))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(getTextFieldAno(), GroupLayout.PREFERRED_SIZE, 140,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(getTextFieldCor(), GroupLayout.PREFERRED_SIZE, 140,
												GroupLayout.PREFERRED_SIZE)))
						.addComponent(getLblCamposObrigatrios()))
				.addContainerGap(11, Short.MAX_VALUE))
				.addComponent(getSeparator(), Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(34)
						.addComponent(getBtnCadastrar(), GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
						.addGap(35)
						.addComponent(getBtnExcluir(), GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(265, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(27)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(96)
										.addComponent(getBtnConfirmar(), GroupLayout.PREFERRED_SIZE, 120,
												GroupLayout.PREFERRED_SIZE)
										.addGap(34).addComponent(getBtnCancelar(), GroupLayout.PREFERRED_SIZE, 120,
												GroupLayout.PREFERRED_SIZE))
								.addComponent(getScrollPane(), GroupLayout.PREFERRED_SIZE, 520,
										GroupLayout.PREFERRED_SIZE))
						.addContainerGap(27, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addGap(28)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(getLblCor(), GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(getComboBoxVeiculoType(), GroupLayout.PREFERRED_SIZE, 23,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(getTextFieldCor(), GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(getLblTipo(), GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
				.addGap(35)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(getLblPlaca())
						.addComponent(getTextFieldPlaca(), GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(getLblAno())
						.addComponent(getTextFieldAno(), GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
				.addGap(33)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addComponent(getLblModelo())
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(getTextFieldModelo(), GroupLayout.PREFERRED_SIZE, 22,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(getLblCamposObrigatrios())))
				.addGap(44)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(getBtnCadastrar())
						.addComponent(getBtnExcluir()))
				.addGap(31)
				.addComponent(getSeparator(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(getScrollPane(), GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE).addGap(18)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(getBtnCancelar())
						.addComponent(getBtnConfirmar()))
				.addContainerGap()));
		contentPane.setLayout(gl_contentPane);
	}

	/*** Gets e Sets ***/
	private JLabel getLblAno() {
		if (lblAno == null) {
			lblAno = new JLabel("Ano  *");
		}
		return lblAno;
	}

	private JFormattedTextField getTextFieldAno() {
		if (textFieldAno == null) {
			try {
				textFieldAno = new JFormattedTextField(new MaskFormatter("####"));
				textFieldAno.setColumns(10);
				textFieldAno.setBounds(418, 76, 140, 23);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return textFieldAno;
	}

	private JLabel getLblModelo() {
		if (lblModelo == null) {
			lblModelo = new JLabel("Modelo  *");
		}
		return lblModelo;
	}

	private JTextField getTextFieldModelo() {
		if (textFieldModelo == null) {
			textFieldModelo = new JTextField();
			textFieldModelo.setColumns(10);
		}
		return textFieldModelo;
	}

	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
		}
		return separator;
	}

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}

	private JTable getTable() {
		if (table == null) {

			table = new JTable();

			DefaultTableModel model = new DefaultTableModel();

			Object[] columnsName = new Object[5];

			columnsName[0] = "Tipo";
			columnsName[1] = "Placa";
			columnsName[2] = "Modelo";
			columnsName[3] = "Ano";
			columnsName[4] = "Cor";

			model.setColumnIdentifiers(columnsName);
			table.setModel(model);
		}
		return table;
	}

	public List<Veiculo> getVeiculos() {
		if (veiculos == null)
			veiculos = new ArrayList<Veiculo>();
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

	public List<Veiculo> getVeiculosNovos() {
		if (veiculosNovos == null) {
			veiculosNovos = new ArrayList<Veiculo>();
		}
		return veiculosNovos;
	}

	public void setVeiculosNovos(List<Veiculo> veiculos) {
		if (veiculosNovos == null) {
			veiculosNovos = new ArrayList<Veiculo>();
		}
		this.veiculosNovos = veiculos;
	}

	public JButton getBtnCancelar() {
		if (btnCancelar == null) {
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					getVeiculosNovos().clear();
					setVisible(false);
					main.getCadastro().setVisible(true);
					main.getCadastro().requestFocus();
				}
			});
			btnCancelar.setBounds(304, 542, 120, 23);
		}
		return btnCancelar;
	}

	public JButton getBtnCadastrar() {
		if (btnCadastrar == null) {
			btnCadastrar = new JButton("Cadastrar");
			btnCadastrar.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					save();
					cleanValues();
				}
			});
			btnCadastrar.setBounds(52, 185, 120, 23);
		}
		return btnCadastrar;
	}

	public JButton getBtnExcluir() {
		if (btnExcluir == null) {
			btnExcluir = new JButton("Excluir");
			btnExcluir.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					if (getTable().getSelectedRowCount() == 1) {
						getTable().removeAll();
						TableModel model = getTable().getModel();
						String placa = ((DefaultTableModel) model).getValueAt(getTable().getSelectedRow(), 1)
								.toString();

						Veiculo veiculo = null;

						for (Veiculo veiculo2 : getVeiculosNovos()) {
							if (veiculo2.getPlaca() == placa) {
								veiculo = veiculo2;
								break;
							}
						}

						if (veiculo == null) {
							for (Veiculo veiculo2 : getVeiculos()) {
								if (veiculo2.getPlaca() == placa) {
									veiculo = veiculo2;
									break;
								}
							}
							getVeiculos().remove(veiculo);
						} else {
							getVeiculosNovos().remove(veiculo);
						}
						displayValues();
					}
				}
			});
			btnExcluir.setBounds(202, 185, 120, 23);
		}
		return btnExcluir;
	}

	public JButton getBtnConfirmar() {
		if (btnConfirmar == null) {
			btnConfirmar = new JButton("Confirmar");
			btnConfirmar.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					getVeiculos().addAll(getVeiculosNovos());
					getVeiculosNovos().clear();
					Cadastro cadastro = main.getCadastro();

					cadastro.setVisible(true);
					cadastro.requestFocus();

					CadastroVeiculo cadastroVeiculo = main.getCadastroVeiculo();
					cadastroVeiculo.setVisible(false);
				}
			});
			btnConfirmar.setBounds(152, 542, 120, 23);
		}
		return btnConfirmar;
	}

	private JLabel getLblTipo() {
		if (lblTipo == null) {
			lblTipo = new JLabel("Tipo  *");
		}
		return lblTipo;
	}

	private JComboBox<VeiculoType> getComboBoxVeiculoType() {
		if (comboBoxVeiculoType == null) {
			comboBoxVeiculoType = new JComboBox<>();
			comboBoxVeiculoType.setModel(new DefaultComboBoxModel<>(VeiculoType.values()));
			comboBoxVeiculoType.setBounds(133, 25, 151, 23);
		}
		return comboBoxVeiculoType;
	}

	private JLabel getLblCor() {
		if (lblCor == null) {
			lblCor = new JLabel("Cor  *");
		}
		return lblCor;
	}

	private JTextField getTextFieldCor() {
		if (textFieldCor == null) {
			textFieldCor = new JTextField();
			textFieldCor.setColumns(10);
		}
		return textFieldCor;
	}

	private JLabel getLblPlaca() {
		if (lblPlaca == null) {
			lblPlaca = new JLabel("Placa  *");
		}
		return lblPlaca;
	}

	private JFormattedTextField getTextFieldPlaca() {
		if (textFieldPlaca == null) {
			try {
				textFieldPlaca = new JFormattedTextField(new MaskFormatter("UUU-####"));
				textFieldPlaca.addFocusListener(new FocusAdapter() {
					@Override
					public void focusLost(FocusEvent arg0) {
						if (getTextFieldPlaca().getText().length() == 8) {
							validacaoPlaca = validarPlaca();
						} else {
							JOptionPane.showMessageDialog(null, "Placa inválida", "error", JOptionPane.ERROR_MESSAGE);
						}
					}
				});
				textFieldPlaca.setBounds(133, 75, 151, 22);
				textFieldPlaca.setColumns(10);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return textFieldPlaca;
	}

	private JLabel getLblCamposObrigatrios() {
		if (lblCamposObrigatrios == null) {
			lblCamposObrigatrios = new JLabel("* Campos Obrigatórios");
			lblCamposObrigatrios.setForeground(Color.RED);
		}
		return lblCamposObrigatrios;
	}

	/*******************/

	// Limpa os campos de texto da tela.
	public void cleanValues() {
		getComboBoxVeiculoType().setSelectedIndex(0);
		getTextFieldPlaca().setText("");
		getTextFieldModelo().setText("");
		getTextFieldCor().setText("");
		getTextFieldAno().setText("");

	}

	// Mostra as inforações na tela.
	public void displayValues() {
		Object[] rowData = new Object[5];
		TableModel model = getTable().getModel();
		((DefaultTableModel) model).setRowCount(0);

		for (int i = 0; i < getVeiculosNovos().size(); i++) {
			rowData[0] = getVeiculosNovos().get(i).getTipoVeiculo().toString();
			rowData[1] = getVeiculosNovos().get(i).getPlaca();
			rowData[2] = getVeiculosNovos().get(i).getModelo();
			rowData[3] = getVeiculosNovos().get(i).getAno();
			rowData[4] = getVeiculosNovos().get(i).getCor();

			((DefaultTableModel) model).addRow(rowData);
		}

		if (getVeiculos().size() > 0) {
			for (int i = 0; i < getVeiculos().size(); i++) {
				rowData[0] = getVeiculos().get(i).getTipoVeiculo().toString();
				rowData[1] = getVeiculos().get(i).getPlaca();
				rowData[2] = getVeiculos().get(i).getModelo();
				rowData[3] = getVeiculos().get(i).getAno();
				rowData[4] = getVeiculos().get(i).getCor();

				((DefaultTableModel) model).addRow(rowData);
			}

		}

	}

	// Faz a chamada de metodos para salvar os dados.
	@Override
	public void save() {
		String validacao = validateValues();

		if (validacao == null) {
			assignValues();
			displayValues();
		} else {
			JOptionPane.showMessageDialog(null, "Preencha todos os campos: \n " + validacao, "WARNING",
					JOptionPane.WARNING_MESSAGE);
		}

	}

	// Cria o objeto com seus respectivos dados.
	public void assignValues() {
		Veiculo veiculo = new Veiculo();
		veiculo.setCor(getTextFieldCor().getText().trim());
		veiculo.setAno(Integer.parseInt(getTextFieldAno().getText()));
		veiculo.setModelo(getTextFieldModelo().getText().trim());
		veiculo.setPlaca(getTextFieldPlaca().getText().trim());
		veiculo.setTipoVeiculo((VeiculoType) getComboBoxVeiculoType().getSelectedItem());

		getVeiculosNovos().add(veiculo);

	}

	// Valida os campos obrigatórios.
	public String validateValues() {
		String validacao = "";

		if (getTextFieldPlaca().getText().trim().length() == 0) {
			validacao += "Informe a placa do veiculo.\n";
		} else if (!validacaoPlaca) {
			validacao += "Placa incorreta.\n";
		}

		if (getTextFieldModelo().getText().trim().length() == 0) {
			validacao += "Informe o modelo do veiculo.\n";
		}

		if (getTextFieldAno().getText().trim().length() == 0) {
			validacao += "Informe o ano do veiculo.\n";
		}

		if (getTextFieldCor().getText().trim().length() == 0) {
			validacao += "Informe a cor do veiculo.\n";
		}

		if (validacao.trim().length() == 0) {
			return null;
		} else {
			return validacao;
		}

	}

	// Valida se a placa já está cadastrada.
	private boolean validarPlaca() {
		for (Usuario usuario : controle.getUsuarios()) {
			for (Veiculo veiculo : usuario.getVeiculos()) {
				if (getTextFieldPlaca().getText().equals(veiculo.getPlaca())) {
					JOptionPane.showMessageDialog(null, "Placa já cadastrada", "Error", JOptionPane.ERROR_MESSAGE);
					return false;
				}
			}

			for (Veiculo veiculo : getVeiculosNovos()) {
				if (getTextFieldPlaca().getText().equals(veiculo.getPlaca())) {
					JOptionPane.showMessageDialog(null, "Placa já cadastrada", "Error", JOptionPane.ERROR_MESSAGE);
					return false;
				}
			}

			for (Veiculo veiculo : getVeiculos()) {
				if (getTextFieldPlaca().getText().equals(veiculo.getPlaca())) {
					JOptionPane.showMessageDialog(null, "Placa já cadastrada", "Error", JOptionPane.ERROR_MESSAGE);
					return false;
				}
			}

		}
		return true;
	}

	// reseta a table.
	public void listClear() {
		DefaultTableModel model = (DefaultTableModel) getTable().getModel();
		model.setRowCount(0);
		this.veiculos.clear();
		this.veiculosNovos.clear();
	}

}
