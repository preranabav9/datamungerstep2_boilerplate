package com.stackroute.datamunger.query.parser;

import java.util.List;

/* 
 * This class will contain the elements of the parsed Query String such as conditions,
 * logical operators,aggregate functions, file name, fields group by fields, order by
 * fields, Query Type
 * */
public class QueryParameter {
private String FileName, BaseQuery;
private List<Restriction> Restriction;
private List<String> LogicalOperators, Fields, GroupByFields, OrderByFields;
private List<AggregateFunction> AggregateFunctions;
	public String getFileName() {
		return FileName;
	}
	public void setFileName(String fileName) {
		this.FileName = fileName;
	}

	public String getBaseQuery() {
		return BaseQuery;
	}
	public void setBaseQuery(String baseQuery) {
		this.BaseQuery = baseQuery;
	}
	public List<Restriction> getRestrictions() {
		return Restriction;
	}
	public void setRestrictions(List<Restriction> restrictions) {
		this.Restriction = restrictions;
	}

	public List<String> getLogicalOperators() {
		return LogicalOperators;
	}
	public void setLogicalOperators(List<String> logicalOperators) {
		this.LogicalOperators = logicalOperators;
	}
	public List<String> getFields() {
		return  Fields;
	}
	public void setFields(List<String> fields) {
		this.Fields = fields;
	}

	public List<AggregateFunction> getAggregateFunctions() {
		return AggregateFunctions;
	}
	public void setAggregateFunctions(List<AggregateFunction> aggregateFunctions) {
		this.AggregateFunctions = aggregateFunctions;
	}

	public List<String> getGroupByFields() {
		return GroupByFields;
	}
	public void setGroupByFields(List<String> groupByFields) {
		this.GroupByFields = groupByFields;
	}

	public List<String> getOrderByFields() {
		return OrderByFields;
	}
	public void setOrderByFields(List<String> orderByFields) {
		this.OrderByFields = orderByFields;
	}
	}