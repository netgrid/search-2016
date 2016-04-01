package it.netgrid.search.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Document {
	
	public static final String NPAROLE_FIELD_NAME="nParole";
	public static final String NCARATTERI_CODE_FIELD_NAME = "nCaratteri";
	public static final String MIMETYPE_CODE_FIELD_NAME = "mimeType";
	public static final String ENCODING_CODE_FIELD_NAME = "encoding";
	public static final String NPAROLETITOLO_CODE_FIELD_NAME = "nParoleTitolo";
	public static final String TITOLO_CODE_FIELD_NAME = "titolo";
	public static final String BODY_FIELD_NAME = "body";
	public static final String NLINK_DATE_FIELD_NAME = "nLink";
	public static final String PARENT_CONTENT_FIELD_NAME="cnt_parent_content";
	
		@Id
		@GeneratedValue
		@Column(name=NPAROLE_FIELD_NAME)	
			private int nParole;
		@Column(name=NCARATTERI_CODE_FIELD_NAME)
		private int nCaratteri;
		@Column(name=MIMETYPE_CODE_FIELD_NAME)
		private String mimeType; 
		@Column(name=NPAROLETITOLO_CODE_FIELD_NAME)
			private int nParoleTitolo;
		@Column(name=TITOLO_CODE_FIELD_NAME)
			private String titolo;
		@Column(name=BODY_FIELD_NAME)
			private String body; 
		@Column(name=NLINK_DATE_FIELD_NAME)
			private int nLink;

		

		@OneToOne
		@JoinColumn(name=PARENT_CONTENT_FIELD_NAME)
		private Content content;
		
		public Document(){}
		
		public Document(String mimeType, int nParole, int nCaratteri, int nParoleTitolo, String titolo, String
				body, int nLink){
			this.mimeType=mimeType;
			this.nParole=nParole;
			this.nCaratteri=nCaratteri;
			this.nParoleTitolo=nParoleTitolo;
			this.titolo=titolo;
			this.body=body;
			this.nLink=nLink;
		}

		public String getMimeType() {
			return mimeType;
		}

		public void setMimeType(String mimeType) {
			this.mimeType = mimeType;
		}

		public int getnParole() {
			return nParole;
		}

		public void setnParole(int nParole) {
			this.nParole = nParole;
		}

		public int getnCaratteri() {
			return nCaratteri;
		}

		public void setnCaratteri(int nCaratteri) {
			this.nCaratteri = nCaratteri;
		}

		public int getnParoleTitolo() {
			return nParoleTitolo;
		}

		public void setnParoleTitolo(int nParoleTitolo) {
			this.nParoleTitolo = nParoleTitolo;
		}

		public String getTitolo() {
			return titolo;
		}

		public void setTitolo(String titolo) {
			this.titolo = titolo;
		}

		public String getBody() {
			return body;
		}

		public void setBody(String body) {
			this.body = body;
		}

		public int getnLink() {
			return nLink;
		}

		public void setnLink(int nLink) {
			this.nLink = nLink;
		}

		public Content getContent() {
			return content;
		}

		public void setContent(Content content) {
			this.content = content;
		}

		
		
}

