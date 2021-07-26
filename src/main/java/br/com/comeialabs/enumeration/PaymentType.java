package br.com.comeialabs.enumeration;

public enum PaymentType {
	
	CREDIT_CARD("Cartão de Crédito"),
	BANK_BILLET("Boleto Bancário");
	
	private String displayName;
	
	private PaymentType(String displayName) {
		this.displayName = displayName;
	}
	
	public String getDisplayName() {
		return displayName;
	}

}
