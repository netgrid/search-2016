package it.netgrid.search.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Response")
public class response {
	
	ResponseItem ri=new ResponseItem();
	
	public static final String ID_FIELD_NAME ="idResult";
	public static final String QUERY_FIELD_NAME ="query";
	public static final String TEMPO_QUERY_FIELD_NAME ="tempo_query";
	public static final String RESULT_TOTAL_FIELD_NAME ="result_total";
	
	@Id
	@GeneratedValue
	@Column(name=ID_FIELD_NAME)
	private String idResult;
	@Column(name=QUERY_FIELD_NAME)
	private String query;
	@Column(name=TEMPO_QUERY_FIELD_NAME)
	private double tempoQuery;
	@Column(name=RESULT_TOTAL_FIELD_NAME)
	private int risultTotali;
	
	public response(){}
	
	public response(String idResult, String query, double tempoQuery,int risultTotali){
		this.idResult=idResult;
		this.query=query;
		this.tempoQuery=tempoQuery;
		this.risultTotali=risultTotali;
	}

	public String getIdResult() {
		return idResult;
	}

	public void setIdResult(String idResult) {
		this.idResult = idResult;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public double getTempoQuery() {
		return tempoQuery;
	}

	public void setTempoQuery(double tempoQuery) {
		this.tempoQuery = tempoQuery;
	}

	public int getRisultTotali() {
		return risultTotali;
	}

	public void setRisultTotali(int risultTotali) {
		this.risultTotali = risultTotali;
	}
	
}
