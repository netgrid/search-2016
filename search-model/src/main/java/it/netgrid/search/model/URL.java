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



@Entity(name="ulrs")
public class URL {
	
	public static final String ID_FIELD_NAME="url_id";
	public static final String PATH_FIELD_NAME = "url_path";
	public static final String LANGUAGE_FIELD_NAME = "url_language";
	public static final String AUTHOR_FIELD_NAME = "url_author";
	public static final String REGION_FIELD_NAME = "url_region";
	public static final String DATE_CREATE_FIELD_NAME = "url_date_create";
	public static final String DATE_VISIT_FIELD_NAME = "url_date_visit";
	public static final String NUM_CLICK_FIELD_NAME = "url_num_click";
	public static final String STATE_CODE_FIELD_NAME = "url_state_code";
	public static final String LAST_CONTENT_FIELD_NAME = "url_last_content";
	
	@Id
	@GeneratedValue
	@Column(name=ID_FIELD_NAME)
	private long id;
	
	@Column(name=PATH_FIELD_NAME)
	public String path;
	
	@Column(name=LANGUAGE_FIELD_NAME)
	public String language;
	
	@Column(name=AUTHOR_FIELD_NAME)
	public String author;
	
	@Column(name=REGION_FIELD_NAME)
	public String region;
	
	@Column(name=DATE_CREATE_FIELD_NAME)
	public Date dateCreate;
	
	@Column(name=DATE_VISIT_FIELD_NAME)
	public Date dateVisit;
	
	@Column(name=NUM_CLICK_FIELD_NAME)
	public int nClick;
	
	@Column(name=STATE_CODE_FIELD_NAME)
	public int stateCode;
	
	@ForeignCollectionField
	private ForeignCollection<Content> contents;
	
	@OneToOne
	@JoinColumn(name="LAST_CONTENT_FIELD_NAME", nullable=true)
	private Content lastContent;
	
	


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
	
	public Content getLastContent() {
		return lastContent;
	}

	public void setLastContent(Content lastContent) {
		this.lastContent = lastContent;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ForeignCollection<Content> getContents() {
		return contents;
	}

	public void setContents(ForeignCollection<Content> contents) {
		this.contents = contents;
	}
	
}
