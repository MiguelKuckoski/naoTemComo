package view;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import extras.Iview;
import vo.Veiculo;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Window.Type;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.DisplayMode;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JSeparator;

public class CadastroVeiculo implements Iview {

	private JFrame frmVeiculos;
	private JButton btnCadastrar;
	private JButton buttonRemovever;
	private JTable table;
	private JScrollPane scrollPane;
	private ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
	private JLabel lblTipo;
	private JLabel lblPlaca;
	private JLabel lblModelo;
	private JLabel lblCor;
	private JLabel lblAno;
	private JComboBox comboBoxVeiculoType;
	private JTextField textFieldPlaca;
	private JTextField textFieldModelo;
	private JTextField textFieldCor;
	private JTextField textFieldAno;
	private JSeparator separator;

	/**
	 * Launch the application.
	 */
	public static void popUpCadastroVeiculo() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroVeiculo window = new CadastroVeiculo();
					window.frmVeiculos.setVisible(true);
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
		frmVeiculos.getContentPane().add(getButtonRemovever());
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
		frmVeiculos.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[] { frmVeiculos.getContentPane(),
				getBtnCadastrar(), getButtonRemovever(), getScrollPane(), getTable() }));
	}

	@Override
	public void cleanValues() {
		// TODO Auto-generated method stub

	}

	public void displayValues() {
		Object[] rowData = new Object[5];
		TableModel model = getTable().getModel();
		((DefaultTableModel) model).setRowCount(0);

		for (int i = 0; i < getVeiculos().size(); i++) {
			rowData[0] = getVeiculos().get(i).getTipoVeiculo();
			rowData[1] = getVeiculos().get(i).getPlaca();
			rowData[2] = getVeiculos().get(i).getModelo();
			rowData[3] = getVeiculos().get(i).getAno();
			rowData[4] = getVeiculos().get(i).getCor();
			((DefaultTableModel) model).addRow(rowData);
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
//		veiculo.setTipoVeiculo(getComboBoxVeiculoType().getSelectedItem().toString());
		
		veiculos.add(veiculo);

	}

	@Override
	public String validateValues() {
		String validacao = "";
		boolean ano = true;

		try {
			int i = Integer.parseInt(getTextFieldAno().getText());
		} catch (NumberFormatException nfe) {
			ano = false;
		}

		if (getTextFieldPlaca().getText().trim().length() == 0) {
			validacao += "Informe a placa do veiculo.\n";
		}

		if (getTextFieldModelo().getText().trim().length() == 0) {
			validacao += "Informe o modelo do veiculo.\n";
		}

		if (!ano) {
			validacao += "Ano incorreto. Informe apenas numeros.\n";
		} else if (getTextFieldAno().getText().trim().length() == 0) {
			validacao += "Informe o ano do veiculo.\n";
		}
		
		if(getTextFieldCor().getText().trim().length() == 0 ) {
			validacao += "Informe a cor do veiculo.\n";
		}
		
//		if(getComboBoxVeiculoType().getSelectedIndex() == 0) {
//			validacao += "Informe o tipo do veiculo";
//		}
		
		if(validacao.trim().length() == 0) {
			return null;
		}else {
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
				}
			});
			btnCadastrar.setBounds(52, 185, 89, 23);
		}
		return btnCadastrar;
	}

	private JButton getButtonRemovever() {
		if (buttonRemovever == null) {
			buttonRemovever = new JButton("Excluir");
			buttonRemovever.setBounds(202, 185, 97, 22);
		}
		return buttonRemovever;
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
			// table.getColumnModel().getColumn(0).setResizable(false);
			// table.getColumnModel().getColumn(1).setResizable(false);
			// table.getColumnModel().getColumn(2).setResizable(false);
			// table.getColumnModel().getColumn(3).setResizable(false);
		}
		return table;
	}

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(52, 295, 476, 250);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}

	public ArrayList<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(ArrayList<Veiculo> veiculos) {
		this.veiculos = veiculos;
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

	private JComboBox getComboBoxVeiculoType() {
		if (comboBoxVeiculoType == null) {
			comboBoxVeiculoType = new JComboBox();
			comboBoxVeiculoType.setBounds(133, 25, 151, 23);
		}
		return comboBoxVeiculoType;
	}

	private JTextField getTextFieldPlaca() {
		if (textFieldPlaca == null) {
			textFieldPlaca = new JTextField();
			textFieldPlaca.setBounds(133, 75, 151, 22);
			textFieldPlaca.setColumns(10);
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

	private JTextField getTextFieldAno() {
		if (textFieldAno == null) {
			textFieldAno = new JTextField();
			textFieldAno.setBounds(418, 76, 140, 23);
			textFieldAno.setColumns(10);
		}
		return textFieldAno;
	}

	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(10, 252, 584, 2);
		}
		return separator;
	}
}
