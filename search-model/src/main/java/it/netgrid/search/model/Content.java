package it.netgrid.search.model;

import java.util.Date;
import java.math.BigDecimal;


public class Content {

	
	private String stateCode;
	private String mime; 
	private String encoding;
	private BigDecimal timeResponse;
	private String lenguage;
	private String bodyRaw; 
	private Date creationDate;
	
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