package vo;

import view.Cadastro;
import view.CadastroVeiculo;
import view.Index;
import view.LogadoEstacionado;
import view.LogadoNaoEstacionado2;

public class Main {
	public static final Main INSTANCIA = new Main();
	private Index index;
	private Controle controle;
	private Cadastro cadastro;
	private CadastroVeiculo cadastroVeiculo;
	private LogadoNaoEstacionado2 logadoNaoEstacionado;
	private LogadoEstacionado logadoEstacionado;

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
	
	public LogadoNaoEstacionado2 getLogadoNaoEstacionado() {
		if(logadoNaoEstacionado == null) 
			logadoNaoEstacionado = new LogadoNaoEstacionado2(controle);
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
}
