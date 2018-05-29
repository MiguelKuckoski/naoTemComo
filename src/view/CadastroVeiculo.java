package view;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Window.Type;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.MaskFormatter;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import extras.Iview;
import extras.VeiculoType;
import vo.Controle;
import vo.Veiculo;

public class CadastroVeiculo implements Iview {

	private static JFrame frmVeiculos;
	private JButton btnCadastrar;
	private JButton btnExcluir;
	private JTable table;
	private JScrollPane scrollPane;
	protected static List<Veiculo> veiculosNovos = new ArrayList<Veiculo>();
	private static List<Veiculo> veiculos;
	private JLabel lblTipo;
	private JLabel lblPlaca;
	private JLabel lblModelo;
	private JLabel lblCor;
	private JLabel lblAno;
	private JComboBox<VeiculoType> comboBoxVeiculoType;
	private JFormattedTextField textFieldPlaca;
	private JTextField textFieldModelo;
	private JTextField textFieldCor;
	private JFormattedTextField textFieldAno;
	private JSeparator separator;
	private JSeparator separator_1;
	private JButton buttonConfirmar;
	private JButton buttonCancelar;
	protected static CadastroVeiculo window = new CadastroVeiculo();

	/**
	 * Launch the application.
	 * 
	 * @param frame
	 */
	public static void cadastroVeiculo() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroVeiculo.frmVeiculos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CadastroVeiculo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVeiculos = new JFrame();
		frmVeiculos.setType(Type.POPUP);
		frmVeiculos.setResizable(false);
		frmVeiculos.setTitle("Veiculos");
		frmVeiculos.setBounds(100, 100, 600, 600);
		frmVeiculos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVeiculos.getContentPane().setLayout(null);
		frmVeiculos.getContentPane().add(getBtnCadastrar());
		frmVeiculos.getContentPane().add(getBtnExcluir());
		frmVeiculos.getContentPane().add(getScrollPane());
		frmVeiculos.getContentPane().add(getLblTipo());
		frmVeiculos.getContentPane().add(getLblPlaca());
		frmVeiculos.getContentPane().add(getLblModelo());
		frmVeiculos.getContentPane().add(getLblCor());
		frmVeiculos.getContentPane().add(getLblAno());
		frmVeiculos.getContentPane().add(getComboBoxVeiculoType());
		frmVeiculos.getContentPane().add(getTextFieldPlaca());
		frmVeiculos.getContentPane().add(getTextFieldModelo());
		frmVeiculos.getContentPane().add(getTextFieldCor());
		frmVeiculos.getContentPane().add(getTextFieldAno());
		frmVeiculos.getContentPane().add(getSeparator());
		frmVeiculos.getContentPane().add(getSeparator_1());
		frmVeiculos.getContentPane().add(getButtonConfirmar());
		frmVeiculos.getContentPane().add(getButtonCancelar());
		frmVeiculos.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[] { frmVeiculos.getContentPane(),
				getBtnCadastrar(), getBtnExcluir(), getScrollPane(), getTable() }));
		displayValues();
	}

	@Override
	public void cleanValues() {
		getComboBoxVeiculoType().setSelectedIndex(0);
		getTextFieldPlaca().setText("");
		getTextFieldModelo().setText("");
		getTextFieldCor().setText("");
		getTextFieldAno().setText("");

	}

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

	@Override
	public void assignValues() {
		Veiculo veiculo = new Veiculo();
		veiculo.setCor(getTextFieldCor().getText().trim());
		veiculo.setAno(Integer.parseInt(getTextFieldAno().getText()));
		veiculo.setModelo(getTextFieldModelo().getText().trim());
		veiculo.setPlaca(getTextFieldPlaca().getText().trim());
		veiculo.setTipoVeiculo((VeiculoType) getComboBoxVeiculoType().getSelectedItem());

		veiculosNovos.add(veiculo);

	}

	@Override
	public String validateValues() {
		String validacao = "";

		if (getTextFieldPlaca().getText().trim().length() == 0) {
			validacao += "Informe a placa do veiculo.\n";
		} else if (getTextFieldPlaca().getText().trim().length() < 7) {
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

	private JButton getBtnCadastrar() {
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

	private JButton getBtnExcluir() {
		if (btnExcluir == null) {
			btnExcluir = new JButton("Excluir");
			btnExcluir.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					if (getTable().getSelectedRowCount() == 1) {

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
						
						if(veiculo ==null) {
							for (Veiculo veiculo2 : getVeiculos()) {
								if (veiculo2.getPlaca() == placa) {
									veiculo = veiculo2;
									break;
								}
							}
							getVeiculos().remove(veiculo);
						}else {
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

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(52, 240, 476, 250);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}

	public static List<Veiculo> getVeiculosNovos() {
		return veiculosNovos;
	}

	public void setVeiculosNovos(List<Veiculo> veiculos) {
		this.veiculosNovos = veiculos;
	}

	private JLabel getLblTipo() {
		if (lblTipo == null) {
			lblTipo = new JLabel("Tipo ");
			lblTipo.setBounds(42, 29, 46, 14);
		}
		return lblTipo;
	}

	private JLabel getLblPlaca() {
		if (lblPlaca == null) {
			lblPlaca = new JLabel("Placa");
			lblPlaca.setBounds(42, 79, 46, 14);
		}
		return lblPlaca;
	}

	private JLabel getLblModelo() {
		if (lblModelo == null) {
			lblModelo = new JLabel("Modelo");
			lblModelo.setBounds(42, 128, 46, 14);
		}
		return lblModelo;
	}

	private JLabel getLblCor() {
		if (lblCor == null) {
			lblCor = new JLabel("Cor");
			lblCor.setBounds(372, 29, 46, 14);
		}
		return lblCor;
	}

	private JLabel getLblAno() {
		if (lblAno == null) {
			lblAno = new JLabel("Ano");
			lblAno.setBounds(372, 79, 46, 14);
		}
		return lblAno;
	}

	private JComboBox<VeiculoType> getComboBoxVeiculoType() {
		if (comboBoxVeiculoType == null) {
			comboBoxVeiculoType = new JComboBox<>();
			comboBoxVeiculoType.setModel(new DefaultComboBoxModel<>(VeiculoType.values()));
			comboBoxVeiculoType.setBounds(133, 25, 151, 23);
		}
		return comboBoxVeiculoType;
	}

	private JFormattedTextField getTextFieldPlaca() {
		if (textFieldPlaca == null) {
			try {
				textFieldPlaca = new JFormattedTextField(new MaskFormatter("UUU-####"));
				textFieldPlaca.setBounds(133, 75, 151, 22);
				textFieldPlaca.setColumns(10);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return textFieldPlaca;
	}

	private JTextField getTextFieldModelo() {
		if (textFieldModelo == null) {
			textFieldModelo = new JTextField();
			textFieldModelo.setBounds(133, 125, 151, 22);
			textFieldModelo.setColumns(10);
		}
		return textFieldModelo;
	}

	private JTextField getTextFieldCor() {
		if (textFieldCor == null) {
			textFieldCor = new JTextField();
			textFieldCor.setBounds(418, 26, 140, 22);
			textFieldCor.setColumns(10);
		}
		return textFieldCor;
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

	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(6, 226, 584, 2);
		}
		return separator;
	}

	private JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setBounds(-4, 525, 594, 2);
		}
		return separator_1;
	}

	private JButton getButtonConfirmar() {
		if (buttonConfirmar == null) {
			buttonConfirmar = new JButton("Confirmar");
			buttonConfirmar.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					getVeiculos().addAll(getVeiculosNovos());
					Controle controle = null;
					Cadastro.cadastro(controle);
				}
			});
			buttonConfirmar.setBounds(152, 542, 120, 23);
		}
		return buttonConfirmar;
	}

	private JButton getButtonCancelar() {
		if (buttonCancelar == null) {
			buttonCancelar = new JButton("Cancelar");
			buttonCancelar.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					getVeiculosNovos().clear();
					Controle controle = null;
					Cadastro.cadastro(controle);
				}
			});
			buttonCancelar.setBounds(304, 542, 120, 23);
		}
		return buttonCancelar;
	}

	public static List<Veiculo> getVeiculos() {
		if (veiculos == null)
			veiculos = new ArrayList<Veiculo>();
		return veiculos;
	}

	public static void setVeiculos(List<Veiculo> veiculos) {
		CadastroVeiculo.veiculos = veiculos;
	}
}
