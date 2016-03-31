package it.netgrid.search.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.ForeignCollectionField;

import java.math.BigDecimal;

@Entity(name="Contents")
public class Content {
	
	public static final String ID_FIELD_NAME="Id";
	public static final String STATE_CODE_FIELD_NAME = "state_code";
	public static final String MIME_CODE_FIELD_NAME = "mime";
	public static final String ENCODING_CODE_FIELD_NAME = "encoding";
	public static final String TIME_CODE_FIELD_NAME = "time_response";
	public static final String LANGUAGE_CODE_FIELD_NAME = "language";
	public static final String BODY_RAW_FIELD_NAME = "body_raw";
	public static final String CREATIONS_DATE_FIELD_NAME = "creation_date";
	
@Id
@GeneratedValue
@Column(name=ID_FIELD_NAME)	
	private long id;
@Column(name=STATE_CODE_FIELD_NAME)
	private String stateCode;
@Column(name=MIME_CODE_FIELD_NAME)
	private String mime; 
@Column(name=ENCODING_CODE_FIELD_NAME)
	private String encoding;
@Column(name=TIME_CODE_FIELD_NAME)
	private BigDecimal timeResponse;
@Column(name=LANGUAGE_CODE_FIELD_NAME)
	private String lenguage;
@Column(name=BODY_RAW_FIELD_NAME)
	private String bodyRaw; 
@Column(name=CREATIONS_DATE_FIELD_NAME)
	private Date creationDate;

@ForeignCollectionField
private ForeignCollection<SubContent> subContent;

 @OneToOne
 @JoinColumn(name="LAST_SUB_CONTENT_FIELD_NAME" , nullable=true)
 private SubContent lastSubContent;
 


	public Content(){}
	
	public Content(String stateCode, String mime, String encoding, BigDecimal timeResponse, String lenguage, String bodyRaw, Date creationDate){
		this.stateCode = stateCode;
		this.mime = mime;
		this.encoding = encoding;
		this.timeResponse = timeResponse;
		this.lenguage = lenguage;
		this.bodyRaw = bodyRaw ;
		this.creationDate = creationDate;

	}
	
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getMime() {
		return mime;
	}
	public void setMime(String mime) {
		this.mime = mime;
	}
	public String getEncoding() {
		return encoding;
	}
	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}
	public BigDecimal getTimeResponse() {
		return timeResponse;
	}
	public void setTimeResponse(BigDecimal timeResponse) {
		this.timeResponse = timeResponse;
	}
	public String getLenguage() {
		return lenguage;
	}
	public void setLenguage(String lenguage) {
		this.lenguage = lenguage;
	}
	public String getBodyRaw() {
		return bodyRaw;
	}
	public void setBodyRaw(String bodyRaw) {
		this.bodyRaw = bodyRaw;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	

public static void main(String [ ] args)
{
	long startTime = System.currentTimeMillis(); 
	 
	long endTime = System.currentTimeMillis(); 
	System.out.println("Tempo = " + (endTime - startTime)/1000 + " sec"); 
}}