package it.netgrid.search.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.ForeignCollectionField;

@Entity(name="responses")
public class Response {
	
	public static final String ID_FIELD_NAME ="rsp_id";
	public static final String QUERY_FIELD_NAME ="rsp_query";
	public static final String QUERY_TIME_FIELD_NAME ="rsp_query_time";
	public static final String TOTAL_COUNT_FIELD_NAME ="rsp_total_count";
	
	@Id
	@GeneratedValue
	@Column(name=ID_FIELD_NAME)
	private String id;
	@Column(name=QUERY_FIELD_NAME)
	private String query;
	@Column(name=QUERY_TIME_FIELD_NAME)
	private double queryTime;
	@Column(name=TOTAL_COUNT_FIELD_NAME)
	private long totalCount;
	
	@ForeignCollectionField
	private ForeignCollection<ResponseItem> items;
	
	public Response(){}
	
	public Response(String id, String query, double queryTime,int totalCount){
		this.id=id;
		this.query=query;
		this.queryTime=queryTime;
		this.totalCount=totalCount;
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

	public double getQueryTime() {
		return queryTime;
	}

	public void setQueryTime(double queryTime) {
		this.queryTime = queryTime;
	}

	public long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}

	public ForeignCollection<ResponseItem> getItems() {
		return items;
	}

	public void setItems(ForeignCollection<ResponseItem> items) {
		this.items = items;
	}
}
