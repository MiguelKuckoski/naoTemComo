package extras;

public enum VeiculoType {
		
		CARRO("1","Carro"),
		MOTO("2", "MOTO");
		
		
		private final String code;
		private final String name;

		private VeiculoType(String code, String name) {
			this.code = code;
			this.name = name;
		}

		public String getCode() {
			return code;
		}
		
		@Override
		public String toString() {
			return name;
		}

}
