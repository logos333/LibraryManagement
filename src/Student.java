
public class Student 
{
	private String Sid;
	private String Sname;
	private String Sstream;
	private String Sclass;
	private String Saddress;
	
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
	public String getSaddress() {
		return Saddress;
	}
	public void setSaddress(String saddress) {
		Saddress = saddress;
	}
	
	Student(String Sid, String Sname, String Sstream, String Sclass, String Saddress)
	{
		this.Sid = Sid;
		this.Sname = Sname;
		this.Sstream = Sstream;
		this.Sclass = Sclass;
		this.Saddress = Saddress;
	}
	
	Student(String Sid) {
		this(Sid, "", "", "", "");
	}
	
	public String getInfo() {
		return "'"+Sid+ "','" +Sname+ "','" +Sstream+ "','" +Sclass+ "','" +Saddress+"'";
	}
}
