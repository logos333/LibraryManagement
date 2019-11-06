
public class ReturnDetails 
{
	private String Sid;
	private String Sname;
	private String Bid;
	private String Bname;
	private String IssuedOn;
	private String ReturnDate;
	
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
	public String getIssuedOn() {
		return IssuedOn;
	}
	public void setIssuedOn(String issuedOn) {
		IssuedOn = issuedOn;
	}
	public String getReturnDate() {
		return ReturnDate;
	}
	public void setReturnDate(String returnDate) {
		ReturnDate = returnDate;
	}
	
	ReturnDetails(String Sid, String Sname, String Bid, String Bname, String IssuedOn, String ReturnDate)
	{
		this.Sid = Sid;
		this.Sname = Sname;
		this.Bid = Bid;
		this.Bname = Bname;
		this.IssuedOn = IssuedOn;
		this.ReturnDate = ReturnDate;
	}
	
	public String getInfo() {
		return "'"+Sid+ "','" +Sname+ "','" +Bid+ "','" +Bname+ "','" +IssuedOn+"','"+ReturnDate+"'";
	}
}
