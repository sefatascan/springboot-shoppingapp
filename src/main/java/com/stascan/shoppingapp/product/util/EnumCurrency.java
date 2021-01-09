package com.stascan.shoppingapp.product.util;

public enum EnumCurrency {
	USD("Dolar", "$"), EUR("Euro", "€"), TL("Turkish Lira", "₺");

	private String label;
	private String symbol;

	private EnumCurrency(String label, String symbol) {
		this.label = label;
		this.symbol = symbol;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

}
