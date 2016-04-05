package it.netgrid.search.model;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity(name="response_items")
public class ResponseItem {

	public static final String ID_FIELD_NAME="rsi_id";
	public static final String URL_CODE_FIELD_NAME = "rsi_url_code";
	public static final String TITLE_CODE_FIELD_NAME = "rsi_title";
	public static final String BODY_PATCH_CODE_FIELD_NAME = "rsi_body_patch";
	public static final String DATA_CODE_FIELD_NAME = "rsi_date";
	
	@Id
	@GeneratedValue
	@Column(name=ID_FIELD_NAME)	
	private long id;
	@Column(name=URL_CODE_FIELD_NAME)
	private String url;
	@Column(name=TITLE_CODE_FIELD_NAME)
	private String title;
	@Column(name=BODY_PATCH_CODE_FIELD_NAME)
	private String bodyPatches;
	@Column(name=DATA_CODE_FIELD_NAME)
	private  Date date;
	
	@ManyToOne
	@JoinColumn()
	private response response;
	
	public ResponseItem(){}
	
	public ResponseItem(String url,String title,String bodyPatch,Date date){
		this.url=url;
		this.title=title;
		this.bodyPatches=bodyPatch;
		this.date=date;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBodyPatch() {
		return bodyPatches;
	}

	public void setBodyPatch(String bodyPatch) {
		this.bodyPatches = bodyPatch;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
