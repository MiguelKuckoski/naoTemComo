package view;

import vo.Controle;
import vo.Main;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EditarVeiculos extends CadastroVeiculo{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Controle controle;
	private Main main = Main.INSTANCIA;
	
	public EditarVeiculos(Controle controle) {
		getBtnCancelar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				cancelar();
			}
		});
		this.controle = controle;
			
	}
	
	
	private void cancelar() {
		Opcoes opcoes = main.getOpcoes();
		opcoes.setVisible(true);
		opcoes.requestFocus();
		
		EditarVeiculos editarVeiculos = main.getEditarVeiculos();
		editarVeiculos.setVisible(false);
		
	}

	

}
