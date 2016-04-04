package it.netgrid.search.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="responses")
public class response {
	
	ResponseItem ri=new ResponseItem();
	
	public static final String ID_FIELD_NAME ="resp_id";
	public static final String QUERY_FIELD_NAME ="resp_query";
	public static final String TIME_QUERY_FIELD_NAME ="resp_time_query";
	public static final String RESULT_TOTAL_FIELD_NAME ="resp_result_total";
	
	@Id
	@GeneratedValue
	@Column(name=ID_FIELD_NAME)
	private String id;
	@Column(name=QUERY_FIELD_NAME)
	private String query;
	@Column(name=TIME_QUERY_FIELD_NAME)
	private double timeQuery;
	@Column(name=RESULT_TOTAL_FIELD_NAME)
	private int risultTotal;
	
	public response(){}
	
	public response(String id, String query, double timeQuery,int risultTotal){
		this.id=id;
		this.query=query;
		this.timeQuery=timeQuery;
		this.risultTotal=risultTotal;
	}

	public String getId() {
		return id;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public double getTimeQuery() {
		return timeQuery;
	}

	public void setTimeQuery(double timeQuery) {
		this.timeQuery = timeQuery;
	}

	public int getRisultTotal() {
		return risultTotal;
	}

	public void setRisultTotal(int risultTotal) {
		this.risultTotal = risultTotal;
	}
	
}
