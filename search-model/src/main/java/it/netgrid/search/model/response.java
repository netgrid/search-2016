package it.netgrid.search.model;

public class response {
	
	String idResult, query;
	double tempoQuery;
	int risultTotali;
	
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
