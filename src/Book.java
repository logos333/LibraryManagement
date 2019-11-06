
public class Book {
	private String BId, BName, BAuthor, BStream, BClass, BAvailable;
	
	public String getBId() {
		return BId;
	}

	public void setBId(String bId) {
		BId = bId;
	}

	public String getBName() {
		return BName;
	}

	public void setBName(String bName) {
		BName = bName;
	}

	public String getBAuthor() {
		return BAuthor;
	}

	public void setBAuthor(String bAuthor) {
		BAuthor = bAuthor;
	}

	public String getBStream() {
		return BStream;
	}

	public void setBStream(String bStream) {
		BStream = bStream;
	}

	public String getBClass() {
		return BClass;
	}

	public void setBClass(String bClass) {
		BClass = bClass;
	}

	public String getBAvailable() {
		return BAvailable;
	}

	public void setBAvailable(String bAvailable) {
		BAvailable = bAvailable;
	}

	public Book(String BId, String BName, String BAuthor, String BStream, String BClass, String BAvailable) {
		this.BId = BId;
		this.BAuthor = BAuthor;
		this.BAvailable = BAvailable;
		this.BClass = BClass;
		this.BName = BName;
		this.BStream = BStream;
	}
	
	public String BookInfo() {
		return "'"+BId+ "','" + BName+ "','" +BAuthor+ "','" +BStream+ "','" +BClass+ "','" +BAvailable+"'";
	}
	
	public Book(String BId) {
		this(BId, "", "", "", "", "");
	}
}
