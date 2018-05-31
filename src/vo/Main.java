package vo;

import view.Cadastro;
import view.CadastroVeiculo;
import view.EditarCadastro;
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

	public static void main(String[] params) {
		INSTANCIA.executar();
	}

	private Main() {
		// o controle só é instanciado uma vez, ao iniciar o programa
		controle = new Controle();
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
		usuario.setCpf("000.000.000-00");
		usuario.setSenha("12345");
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



}
