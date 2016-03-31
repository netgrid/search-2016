package it.netgrid.search.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="contents")
public class Content { //classe content

	public static final String ID_FIELD_NAME="cnt_id";
	public static final String STATE_CODE_FIELD_NAME="cnt_state_code"; 
	public static final String MIME_FIELD_NAME="cnt_mime"; 
	public static final String ENCODING_FIELD_NAME="cnt_encoding"; 
	public static final String TIME_RESPONSE_FIELD_NAME="cnt_time_response"; 
	public static final String LANGUAGE_FIELD_NAME="cnt_language"; 
	public static final String BODY_RAW_FIELD_NAME="cnt_body_raw"; 
	public static final String CREATION_DATE_FIELD_NAME="cnt_creation_date"; 
	
	@Id
	@GeneratedValue	
	@Column(name=ID_FIELD_NAME)
	private long id; 
	@Column(name=STATE_CODE_FIELD_NAME)
	private String stateCode;
	@Column(name=MIME_FIELD_NAME)
	private String mime; 
	@Column(name=ENCODING_FIELD_NAME)
	private String encoding;
	@Column(name=TIME_RESPONSE_FIELD_NAME)
	private String timeResponse;
	@Column(name=LANGUAGE_FIELD_NAME)
	private String language;
	@Column(name=BODY_RAW_FIELD_NAME)
	private String bodyRaw; 
	@Column(name=CREATION_DATE_FIELD_NAME)
	private String creationDate;
	
	public Content(){}
	
	public Content(String stateCode, String mime, String encoding, String timeResponse, String language, String bodyRaw, String creationDate){
		this.stateCode = stateCode;
		this.mime = mime;
		this.encoding = encoding;
		this.timeResponse = timeResponse;
		this.language = language;
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
	public String getTimeResponse() {
		return timeResponse;
	}
	public void setTimeResponse(String timeResponse) {
		this.timeResponse = timeResponse;
	}
	public String getLenguage() {
		return language;
	}
	public void setLenguage(String language) {
		this.language = language;
	}
	public String getBodyRaw() {
		return bodyRaw;
	}
	public void setBodyRaw(String bodyRaw) {
		this.bodyRaw = bodyRaw;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	
}
	

