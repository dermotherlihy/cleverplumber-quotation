package com.dermotherlihy.quotation.model;

public enum QuoteType {
	
	BOILER(0, "Boiler"), OTHER(1, "OTHER");
	
	private final Integer value;
	private final String description;
	
	QuoteType(int value, String description) {
		this.value=value;
		this.description=description;
	}

	public Integer getValue() {
		return value;
	}

	public String getDescription() {
		return description;
	}
}

