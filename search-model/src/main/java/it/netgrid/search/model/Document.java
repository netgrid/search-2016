package it.netgrid.search.model;

public class Document {

	
		private String mimeType;
		private int nParole;
		private int nCaratteri;
		private int nParoleTitolo;
		private String titolo;
		private String body;
		private int nLink;
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

