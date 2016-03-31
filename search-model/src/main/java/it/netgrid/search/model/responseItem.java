package it.netgrid.search.model;
import java.util.*;
public class responseItem {
	
	String url,title,bodyPatch;
	 Date data;
	
	public responseItem(){}
	
	public responseItem(String url,String title,String bodyPatch,Date data){
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
