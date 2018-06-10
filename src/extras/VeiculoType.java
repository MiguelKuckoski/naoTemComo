package extras;

public enum VeiculoType {
		
		CARRO("1","CARRO"),
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
		
		public boolean compare(String comparison) {
			return this.code.equals(comparison) || this.name.equalsIgnoreCase(comparison);
		}
		
		public static VeiculoType getType(String tipo) {
			for(VeiculoType s : VeiculoType.values())
				if(s.compare(tipo))
					return s;
			return null;
		}
		

}
