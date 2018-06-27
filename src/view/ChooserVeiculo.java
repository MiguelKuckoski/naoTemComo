package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import vo.Controle;
import vo.Main;
import vo.Veiculo;

public class ChooserVeiculo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	private JButton btnConfirmar;
	private JScrollPane scrollPane;
	private JTable table;
	private Controle controle;

	public ChooserVeiculo(Controle controle) {
		this.controle = controle;
		setBounds(100, 100, 294, 215);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(getScrollPane(), GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(getBtnConfirmar())
							.addGap(93))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(getScrollPane(), GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
					.addComponent(getBtnConfirmar()))
		);
		contentPane.setLayout(gl_contentPane);
	}

	/*** Gets e Sets ***/
	private JTable getTable() {
		if (table == null) {

			table = new JTable();

			DefaultTableModel model = new DefaultTableModel();

			Object[] columnsName = new Object[3];

			columnsName[0] = "Tipo";
			columnsName[1] = "Placa";
			columnsName[2] = "Modelo";

			model.setColumnIdentifiers(columnsName);
			table.setModel(model);
		}
		return table;
	}

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}

	private JButton getBtnConfirmar() {
		if (btnConfirmar == null) {
			btnConfirmar = new JButton("Confirmar");
			btnConfirmar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if (getTable().getSelectedRowCount() == 1) {

						TableModel model = getTable().getModel();
						String placa = ((DefaultTableModel) model).getValueAt(getTable().getSelectedRow(), 1)
								.toString();

						for (Veiculo veiculo : controle.getLoggedUser().getVeiculos()) {
							if (veiculo.getPlaca() == placa) {
								controle.getLoggedUser().setSelectedVeiculo(veiculo);
								break;
							}
						}

						setVisible(false);
						Main.INSTANCIA.getLogadoNaoEstacionado().requestFocus();

					}

				}
			});
		}
		return btnConfirmar;
	}
	
	/*******************/

	// Mostra as inforações na tela.
	public void displayValues() {
		Object[] rowData = new Object[3];
		TableModel model = getTable().getModel();
		((DefaultTableModel) model).setRowCount(0);

		for (int i = 0; i < controle.getLoggedUser().getVeiculos().size(); i++) {
			rowData[0] = controle.getLoggedUser().getVeiculos().get(i).getTipoVeiculo().toString();
			rowData[1] = controle.getLoggedUser().getVeiculos().get(i).getPlaca();
			rowData[2] = controle.getLoggedUser().getVeiculos().get(i).getModelo();

			((DefaultTableModel) model).addRow(rowData);
		}

	}

}
