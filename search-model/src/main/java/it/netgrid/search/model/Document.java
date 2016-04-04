package it.netgrid.search.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity(name="documents")
public class Document {
	
	public static final String NWORDS_FIELD_NAME="doc_n_words";
	public static final String NCHARS_CODE_FIELD_NAME = "doc_n_chars";
	public static final String MIMETYPE_CODE_FIELD_NAME = "doc_mime_type";
	public static final String ENCODING_CODE_FIELD_NAME = "doc_encoding";
	public static final String NTITLEWORDS_CODE_FIELD_NAME = "doc_n_title_words";
	public static final String TITLE_CODE_FIELD_NAME = "doc_title";
	public static final String BODY_FIELD_NAME = "doc_body";
	public static final String NLINK_FIELD_NAME = "doc_n_link";
	public static final String PARENT_CONTENT_FIELD_NAME="doc_parent_content";
	
		@Id
		@GeneratedValue
		@Column(name=NWORDS_FIELD_NAME)	
			private int nWords;
		
		@Column(name=NCHARS_CODE_FIELD_NAME)
		private int nChars;
		
		@Column(name=MIMETYPE_CODE_FIELD_NAME)
		private String mimeType; 
		
		@Column(name=NTITLEWORDS_CODE_FIELD_NAME)
			private int nTitleWords;
		
		@Column(name=TITLE_CODE_FIELD_NAME)
			private String title;
		
		@Column(name=BODY_FIELD_NAME)
			private String body; 
		
		@Column(name=NLINK_FIELD_NAME)
			private int nLink;

		

		@OneToOne
		@JoinColumn(name=PARENT_CONTENT_FIELD_NAME)
		private Content content;
		
		public Document(){}
		
		public Document(String mimeType, int nWords, int nChars, int nTitleWords, String title, String
				body, int nLink){
			this.mimeType=mimeType;
			this.nWords=nWords;
			this.nChars=nChars;
			this.nTitleWords=nTitleWords;
			this.title=title;
			this.body=body;
			this.nLink=nLink;
		}

	

		public int getnWords() {
			return nWords;
		}

		public void setnWords(int nWords) {
			this.nWords = nWords;
		}

		public int getnChars() {
			return nChars;
		}

		public void setnChars(int nChars) {
			this.nChars = nChars;
		}

		public String getMimeType() {
			return mimeType;
		}

		public void setMimeType(String mimeType) {
			this.mimeType = mimeType;
		}

		public int getnTitleWords() {
			return nTitleWords;
		}

		public void setnTitleWords(int nTitleWords) {
			this.nTitleWords = nTitleWords;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
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

