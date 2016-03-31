package it.netgrid.search.model;

import java.util.Date;

public class URL {

	public String path;
	public String language;
	public String author;
	public String region;
	public Date dateCreate;
	public Date dateVisit;
	public int nClick;
	public int stateCode;
	
	public URL(){}
	
	public URL(String path, String language, String author, String region, Date dateCreate, Date dateVisit, int nClick, int stateCode){
		this.path=path;
		this.language=language;
		this.author=author;
		this.region=region;
		this.dateCreate=dateCreate;
		this.dateVisit=dateVisit;
		this.nClick=nClick;
		this.stateCode=stateCode;
	}

	
	public String getPath() {
		return path;
	}

	
	public void setPath(String path) {
		this.path = path;
	}

	
	public String getLanguage() {
		return language;
	}

	
	public void setLanguage(String language) {
		this.language = language;
	}

	
	public String getAuthor() {
		return author;
	}

	
	public void setAuthor(String author) {
		this.author = author;
	}

	
	public String getRegion() {
		return region;
	}

	
	public void setRegion(String region) {
		this.region = region;
	}

	
	public Date getDateCreate() {
		return dateCreate;
	}

	
	public void setDateCreate(Date dateCreate) {
		this.dateCreate = dateCreate;
	}

	
	public Date getDateVisit() {
		return dateVisit;
	}

	
	public void setDateVisit(Date dateVisit) {
		this.dateVisit = dateVisit;
	}

	
	public int getnClick() {
		return nClick;
	}

	
	public void setnClick(int nClick) {
		this.nClick = nClick;
	}

	
	public int getStateCode() {
		return stateCode;
	}

	
	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	
	
	
}
