package vo;

import java.util.ArrayList;

import extras.VeiculoType;
import view.Cadastro;
import view.CadastroVeiculo;
import view.ChooserVeiculo;
import view.EditarCadastro;
import view.EditarVeiculos;
import view.EstacionamentoFundo;
import view.EstacionamentoMotos;
import view.EstacionamentoPrincipal;
import view.Estacionamentos;
import view.Index;
import view.LogadoEstacionado;
import view.LogadoNaoEstacionado;
import view.Opcoes;

public class Main {
	public static final Main INSTANCIA = new Main();
	private Index index;
	private Controle controle;
	private Cadastro cadastro;
	private CadastroVeiculo cadastroVeiculo;
	private LogadoNaoEstacionado logadoNaoEstacionado;
	private LogadoEstacionado logadoEstacionado;
	private Opcoes opcoes;
	private EditarCadastro editarCadastro;
	private Estacionamentos estacionamentos;
	private EstacionamentoPrincipal estacionamentoPrincipal;
	private EstacionamentoFundo estacionamentoFundo;
	private EstacionamentoMotos estacionamentoMotos;
	private EditarVeiculos editarVeiculos;
	private ChooserVeiculo chooserVeiculo;
	
	
	public static void main(String[] params) {
		INSTANCIA.executar();
	}

	private Main() {
		// o controle só é instanciado uma vez, ao iniciar o programa
		controle = new Controle();
		controle.addEstacionamento(estacionamentoPrincipal);
		controle.addEstacionamento(estacionamentoFundo);
		controle.addEstacionamento(estacionamentoMotos);
		
		populateCadastro();
	}
	
	/**
	 * Create the application.
	 * 
	 * @wbp.parser.entryPoint
	 */
    private void executar() {
        // esse programa aqui simplesmente apresenta a Tela1
    	Index tela = getIndex();
        tela.setVisible(true);
    }

	public Cadastro getCadastro() {
		if(cadastro == null)
			cadastro = new Cadastro(controle);
		return cadastro;
	}

	public CadastroVeiculo getCadastroVeiculo() {
		if(cadastroVeiculo == null) 
			cadastroVeiculo = new CadastroVeiculo(controle);
		return cadastroVeiculo;
	}

	public Index getIndex() {
		if(index == null)
			index = new Index(controle);
		return index;
	}
	
	public LogadoNaoEstacionado getLogadoNaoEstacionado() {
		if(logadoNaoEstacionado == null) 
			logadoNaoEstacionado = new LogadoNaoEstacionado(controle);
		return logadoNaoEstacionado;
	}

	public LogadoEstacionado getLogadoEstacionado() {
		if(logadoEstacionado == null) {
			logadoEstacionado = new LogadoEstacionado(controle);
		}
		return logadoEstacionado;
	}


	public void populateCadastro() {
		Usuario usuario = new Usuario();
		usuario.setNome("Teste nome");
		usuario.setCpf("000.000.000-00");
		usuario.setSenha("12345");
	
		usuario.setCnh("88888888");
		usuario.setRua("Teste rua");
		usuario.setNum(69);
		usuario.setBairro("Teste bairro");
		usuario.setCep(88090740);
		
		usuario.setEstado("Santa Catarina");
		
		VeiculoType type = VeiculoType.getType("MOTO");
		Veiculo veiculo = new Veiculo("XXX-3222","Factor", 2009, type, "cinza");
		ArrayList<Veiculo> vArray = new ArrayList<Veiculo>();
		vArray.add(veiculo);
		usuario.setVeiculos(vArray);
		usuario.setSelectedVeiculo(veiculo);
		controle.addUsuarios(usuario);
		
	}
	
	public Opcoes getOpcoes() {
		if(opcoes == null) 
			opcoes = new Opcoes(controle);
		return opcoes;
	}

	public EditarCadastro getEditarCadastro() {
		if(editarCadastro == null) {
			editarCadastro = new EditarCadastro(controle);
		}
		return editarCadastro;
	}

	public Estacionamentos getEstacionamentos() {
		if(estacionamentos == null) {
			estacionamentos = new Estacionamentos();
		}
		return estacionamentos;
	}

	public EstacionamentoPrincipal getEstacionamentoPrincipal() {
		if(estacionamentoPrincipal == null) {
			estacionamentoPrincipal = new EstacionamentoPrincipal(controle);
		}
		return estacionamentoPrincipal;
	}

	public EstacionamentoFundo getEstacionamentoFundo() {
		if(estacionamentoFundo == null) {
			estacionamentoFundo = new EstacionamentoFundo(controle);
		}
		return estacionamentoFundo;
	}
	public EstacionamentoMotos getEstacionamentoMoto() {
		if(estacionamentoMotos == null) {
			estacionamentoMotos = new EstacionamentoMotos(controle);
		}
		return estacionamentoMotos;
	}

	public EditarVeiculos getEditarVeiculos() {
		if(editarVeiculos == null)
			editarVeiculos = new EditarVeiculos(controle);
		return editarVeiculos;
	}
	
	public ChooserVeiculo getChooserVeiculo() {
		if(chooserVeiculo == null)
			chooserVeiculo = new ChooserVeiculo(controle);
		return chooserVeiculo;
	}

}
