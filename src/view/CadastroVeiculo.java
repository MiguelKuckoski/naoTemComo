package view;

import java.awt.Component;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import extras.Iview;
import vo.Veiculo;

public class CadastroVeiculo implements Iview{

	private JFrame frmVeiculos;
	private JButton btnCadastrar;
	private JButton buttonRemovever;
	private JTable table;
	private JScrollPane scrollPane;

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
		frmVeiculos.setResizable(false);
		frmVeiculos.setTitle("Veiculos");
		frmVeiculos.setBounds(100, 100, 502, 332);
		frmVeiculos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVeiculos.getContentPane().setLayout(null);
		frmVeiculos.getContentPane().add(getBtnCadastrar());
		frmVeiculos.getContentPane().add(getButtonRemovever());
		frmVeiculos.getContentPane().add(getScrollPane());
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
		Veiculo veiculo = new Veiculo("ABC-8787", "Sandero", 2013, "Moto");
		veiculo.setCor("Prata");
	}

	@Override
	public String validateValues() {
		// TODO Auto-generated method stub
		return null;
	}
	private JButton getBtnCadastrar() {
		if (btnCadastrar == null) {
			btnCadastrar = new JButton("Cadastrar");
			btnCadastrar.setBounds(25, 4, 89, 23);
		}
		return btnCadastrar;
	}
	private JButton getButtonRemovever() {
		if (buttonRemovever == null) {
			buttonRemovever = new JButton("Excluir");
			buttonRemovever.setBounds(138, 5, 97, 22);
		}
		return buttonRemovever;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();;
			table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			table.setModel(new DefaultTableModel(new Object[][]{}, new String[]{
					"Tipo", "Placa", "Modelo", "Ano", "Cor"
				}
			) {
				/**
				 * 
				 */
				private static final long serialVersionUID = 9133274547336225665L;
				boolean[] columnEditables = new boolean[] {
					false, false, false , false
				};
				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];
				}
			});
			table.getColumnModel().getColumn(0).setResizable(false);
			table.getColumnModel().getColumn(1).setResizable(false);
			table.getColumnModel().getColumn(2).setResizable(false);
			table.getColumnModel().getColumn(3).setResizable(false);		
		}
		return table;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 42, 476, 250);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
}
