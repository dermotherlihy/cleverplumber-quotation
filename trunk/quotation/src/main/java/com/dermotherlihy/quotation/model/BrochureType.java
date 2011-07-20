package com.dermotherlihy.quotation.model;

public enum BrochureType {
	
	WORCHESTER_BOILER(0, "Worchester Boiler");
	
	private final Integer value;
	private final String description;
	
	private BrochureType(Integer value, String description) {
		this.value = value;
		this.description = description;
	}
	
	public Integer getValue() {
		return value;
	}
	public String getDescription() {
		return description;
	}

	
	
}
