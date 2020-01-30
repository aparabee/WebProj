package com.coursecube.request;

public class Stores {
	private String class_unit_code;

	public String getStore() {
		return class_unit_code;
	}

	public void setStore(String store) {
		this.class_unit_code = store;
	}

	@Override
	public String toString() {
		return "Stores [class_unit_code=" + class_unit_code + "]";
	}
	
	
}
