package com.dermotherlihy.quotation.model;

public enum BrochureType {
	
	NONE(0, "None"),  WORCHESTER_BOILER(1, "Worchester Boiler");
	
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
