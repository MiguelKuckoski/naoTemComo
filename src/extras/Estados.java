	package extras;

public enum Estados {
	ACRE("AC", "ACRE"),
	ALAGOAS("AL", "ALAGOAS"),
	AMAPA("AP", "AMAP�"),
	AMAZONAS("AM", "AMAZONAS"),
	BAHIA("BA", "BAHIA"),
	CEARA("CE", "CEAR�"),
	DISTRITO_FEDERAL("DF", "DISTRITO FEDERAL"),
	ESPIRITO_SANTO("ES", "ESP�RITO SANTO"),
	GOIAS("GO", "GOI�S"),
	MARANHAO("MA", "MARANH�O"),
	MATO_GROSSO("MT", "MATO GROSSO"),
	MATO_GROSSO_DO_SUL("MS", "MATO GROSSO DO SUL"),
	MINAS_GERAIS("MG", "MINAS GERAIS"),
	PARA("PA", "PAR�"),
	PARAIBA("PB", "PARA�BA"),
	PARANA("PR", "PARAN�"),
	PERNAMBUCO("PE", "PERNAMBUCO"),
	PIAUI("PI", "PIAU�"),
	RIO_DE_JANEIRO("RJ", "RIO DE JANEIRO"),
	RIO_GRANDE_DO_NORTE("RN", "RIO GRANDE DO NORTE"),
	RIO_GRANDE_DO_SUL("RS", "RIO GRANDE DO SUL"),
	RONDONIA("RO", "ROND�NIA"),
	RORAIMA("RR", "RORAIMA"),
	SANTA_CATARINA("SC", "SANTA CATARINA"),
	SAO_PAULO("SP", "S�O PAULO"),
	SERGIPE("SE", "SERGIPE"),
	TOCANTINS("TO", "TOCANTINS");
	

	private final String acronym;
	private final String name;

	private Estados(String acronym, String state) {
		this.acronym = acronym;
		this.name = state;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name;
	}

}
