package view;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import vo.Controle;

public class LogsShow extends JFrame {

	/**
	 * 
	 */
	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTable table;
	private Controle controle;

	/**
	 * Create the frame.
	 */
	public LogsShow(Controle controle) {
		this.controle = controle;
		setTitle("Veiculos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(27)
						.addComponent(getScrollPane(), GroupLayout.PREFERRED_SIZE, 520, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(27, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
						.addComponent(getScrollPane(), GroupLayout.PREFERRED_SIZE, 529, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		contentPane.setLayout(gl_contentPane);
	}

	public void displayValues() {
		Object[] rowData = new Object[5];
		TableModel model = getTable().getModel();
		((DefaultTableModel) model).setRowCount(0);
		
		for(String aux[]: controle.lerLog("todos")) {
		
		for (int i = 0; i < aux.length; i++) {
			rowData[0] = aux[0];
			rowData[1] = aux[1];
			rowData[2] = aux[2];
			rowData[3] = aux[3];
			rowData[4] = aux[4];

			((DefaultTableModel) model).addRow(rowData);
		}
		}

//		if (getVeiculos().size() > 0) {
//			for (int i = 0; i < getVeiculos().size(); i++) {
//				rowData[0] = getVeiculos().get(i).getTipoVeiculo().toString();
//				rowData[1] = getVeiculos().get(i).getPlaca();
//				rowData[2] = getVeiculos().get(i).getModelo();
//				rowData[3] = getVeiculos().get(i).getAno();
//				rowData[4] = getVeiculos().get(i).getCor();
//
//				((DefaultTableModel) model).addRow(rowData);
//			}
//
//		}

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

			columnsName[0] = "Ação";
			columnsName[1] = "Nome";
			columnsName[2] = "Estacionamento";
			columnsName[3] = "Placa";
			columnsName[4] = "Data";

			model.setColumnIdentifiers(columnsName);
			table.setModel(model);
		}
		return table;
	}
}
