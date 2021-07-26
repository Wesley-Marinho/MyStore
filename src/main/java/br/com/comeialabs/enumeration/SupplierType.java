package br.com.comeialabs.enumeration;

public enum SupplierType {
	
	PHYSICAL_PERSON("Pessoa Física"),
	LEGAL_PERSON("Pessoa Jurídica");
	
	private String displayName;
	
	private SupplierType(String displayName) {
		this.displayName = displayName;
	}
	
	public String getDisplayName() {
		return displayName;
	}

}
