
public class Issue 
{
	private String Sid;
	private String Sname;
	private String Bid;
	private String Bname;
	private String Saddress;
	private String IssueDate;
	private String Sstream;
	private String Sclass;
	
	public String getSid() {
		return Sid;
	}
	public void setSid(String sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getBid() {
		return Bid;
	}
	public void setBid(String bid) {
		Bid = bid;
	}
	public String getBname() {
		return Bname;
	}
	public void setBname(String bname) {
		Bname = bname;
	}
	public String getSaddress() {
		return Saddress;
	}
	public void setSaddress(String saddress) {
		Saddress = saddress;
	}
	public String getIssueDate() {
		return IssueDate;
	}
	public void setIssueDate(String issueDate) {
		IssueDate = issueDate;
	}
	public String getSstream() {
		return Sstream;
	}
	public void setSstream(String sstream) {
		Sstream = sstream;
	}
	public String getSclass() {
		return Sclass;
	}
	public void setSclass(String sclass) {
		Sclass = sclass;
	}
	
	Issue(String Sid, String Sname, String Bid, String Bname, String IssueDate)
	{
		this.Sid = Sid;
		this.Sname = Sname;
		this.Bid = Bid;
		this.Bname = Bname;
		this.IssueDate = IssueDate;
	}
	
	public Issue() {
		this("", "", "", "", "");
	}
	
	public String getInfo() {
		return "'"+Sid+ "','" +Sname+ "','" +Bid+ "','" +Bname+ "','" +Saddress+ "','" +IssueDate+ "','" +Sstream+ "','" +Sclass+"'";
	}
}
