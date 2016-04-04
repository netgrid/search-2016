package it.netgrid.search.model;

public class Document {

	
		private String MimeType;
		private int NParole;
		private int NCaratteri;
		private int NParoleTitolo;
		private String Titolo;
		private String body;
		private int NLink;
		
		public Document(){}
		
		public Document(String MimeType, int NParole, int NCaratteri, int NParoleTitolo, String titolo, String
				body, int NLink){
			this.MimeType=MimeType;
			this.NParole=NParole;
			this.NCaratteri=NCaratteri;
			this.NParoleTitolo=NParoleTitolo;
			this.Titolo=titolo;
			this.body=body;
			this.NLink=NLink;
		}

		public String getMimeType() {
			return MimeType;
		}

		public void setMimeType(String mimeType) {
			MimeType = mimeType;
		}

		public int getNParole() {
			return NParole;
		}

		public void setNParole(int nParole) {
			NParole = nParole;
		}

		public int getNCaratteri() {
			return NCaratteri;
		}

		public void setNCaratteri(int nCaratteri) {
			NCaratteri = nCaratteri;
		}

		public int getNParoleTitolo() {
			return NParoleTitolo;
		}

		public void setNParoleTitolo(int nParoleTitolo) {
			NParoleTitolo = nParoleTitolo;
		}

		public String getTitolo() {
			return Titolo;
		}

		public void setTitolo(String titolo) {
			Titolo = titolo;
		}

		public String getBody() {
			return body;
		}

		public void setBody(String body) {
			this.body = body;
		}

		public int getNLink() {
			return NLink;
		}

		public void setNLink(int nLink) {
			NLink = nLink;
		}
		
		
		
}

