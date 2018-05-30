package vo;

import view.Cadastro;
import view.CadastroVeiculo;
import view.Index;
import view.LogadoEstacionado;
import view.LogadoNaoEstacionado;

public class Main {
	public static final Main INSTANCIA = new Main();
	private Index index;
	private Controle controle;
	private Cadastro cadastro;
	private CadastroVeiculo cadastroVeiculo;
	private LogadoNaoEstacionado logadoNaoEstacionado;
	private LogadoEstacionado logadoEstacionado;

	public static void main(String[] params) {
		INSTANCIA.executar();
	}

	private Main() {
		// o controle só é instanciado uma vez, ao iniciar o programa
		controle = new Controle();
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


}
