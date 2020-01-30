package com.coursecube.request;

import java.sql.Timestamp;


public class RequestForBs {

	private int class_unit_type;
	private Timestamp  since;
	private Stores stores;
	public int getClass_unit_type() {
		return class_unit_type;
	}
	public void setClass_unit_type(int class_unit_type) {
		this.class_unit_type = class_unit_type;
	}
	public Timestamp getSince() {
		return since;
	}
	public void setSince(Timestamp since) {
		this.since = since;
	}
	public Stores getStores() {
		return stores;
	}
	public void setStores(Stores stores) {
		this.stores = stores;
	}
	@Override
	public String toString() {
		return "RequestForBs [class_unit_type=" + class_unit_type + ", since=" + since + ", stores=" + stores + "]";
	}
	
	
}
