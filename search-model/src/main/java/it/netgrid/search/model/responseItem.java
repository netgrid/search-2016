package it.netgrid.search.model;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity(name="ResponseItem")
public class ResponseItem {
	
	response r=new response();
	
	public static final String ID_FIELD_NAME="Id";
	public static final String URL_CODE_FIELD_NAME = "Url_code";
	public static final String TITLE_CODE_FIELD_NAME = "title";
	public static final String BODY_PATCH_CODE_FIELD_NAME = "body_patch";
	public static final String DATA_CODE_FIELD_NAME = "data";
	

	@Id
	@GeneratedValue
	@Column(name=ID_FIELD_NAME)	
	private long id;
	@Column(name=URL_CODE_FIELD_NAME)
	private String url;
	@Column(name=TITLE_CODE_FIELD_NAME)
	private String title;
	@Column(name=BODY_PATCH_CODE_FIELD_NAME)
	private String bodyPatch;
	@Column(name=DATA_CODE_FIELD_NAME)
	private  Date data;
	
	public ResponseItem(){}
	
	public ResponseItem(String url,String title,String bodyPatch,Date data){
		this.url=url;
		this.title=title;
		this.bodyPatch=bodyPatch;
		this.data=data;
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
		return bodyPatch;
	}

	public void setBodyPatch(String bodyPatch) {
		this.bodyPatch = bodyPatch;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
}
