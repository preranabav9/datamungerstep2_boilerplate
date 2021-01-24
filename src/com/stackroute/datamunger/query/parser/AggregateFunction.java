package com.stackroute.datamunger.query.parser;

/* This class is used for storing name of field, aggregate function for 
 * each aggregate function
 * generate getter and setter for this class,
 * Also override toString method
 * */


public class AggregateFunction {
	private String field;
	private String function;

	// Write logic for constructor
	public AggregateFunction(String field, String function) {
		this.field = field;
		this.function = function;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getfunction() {
		return function;
	}

	public void setfunction(String aggrefunction) {
		this.function = aggrefunction;
	}

	@Override
	public String toString() {
		return "AggregateFunction [field=" + field + ", aggrefunction=" + function + "]";
	}

}
