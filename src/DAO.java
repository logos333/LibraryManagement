import java.sql.*;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DAO {
	static ResultSet rs;

	public static boolean addBookButton(Book book) {
		try (Connection con = dbConnection.dbConnector()) {
			System.out.println("insert into books values(" + book.BookInfo() + ")");
			con.createStatement().executeUpdate("insert into books values(" + book.BookInfo() + ")");
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
			return false;
		}
		JOptionPane.showMessageDialog(null, "Book with id = " + book.getBId() + " successfully added!");
		return true;
	}
	


	public static void ShowBookInfo(Object streamSelectedItem, Object classSelectedItem, DefaultTableModel model) {
		try (Connection con = dbConnection.dbConnector()) {
			if ( streamSelectedItem == null || classSelectedItem == null || (streamSelectedItem.equals("Select Stream") && classSelectedItem.equals("Select Class")))
				rs = con.createStatement().executeQuery("select * from books");
			else if(!streamSelectedItem.equals("Select Stream") && !classSelectedItem.equals("Select Class"))
				rs = con.createStatement().executeQuery("select * from books where stream='" + streamSelectedItem
						+ "' and class='" + classSelectedItem + "';");
			else
				rs = con.createStatement().executeQuery("select * from books where stream = '"+streamSelectedItem+"';");
			// DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.setRowCount(0);
			while (rs.next()) {
				Object[] row = { rs.getString("Bid"), rs.getString("Bname"), rs.getString("Author"),
						rs.getString("Stream"), rs.getString("Class"), rs.getString("Available") };
				model.addRow(row);
			}
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Cannot find Book!");
		}
	}
	

	public static void ShowBookInfo(String txt, DefaultTableModel model) {
		try (Connection con = dbConnection.dbConnector()) {
			rs = con.createStatement().executeQuery("select * from books where Bname LIKE \"%" + txt + "%\";");
			// DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.setRowCount(0);
			while (rs.next()) {
				Object[] row = { rs.getString("Bid"), rs.getString("Bname"), rs.getString("Author"),
						rs.getString("Stream"), rs.getString("Class"), rs.getString("Available") };
				model.addRow(row);
			}
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "no such books!");
		}
	}

	public static void btnIssue(Issue issue) {
		try (Connection con = dbConnection.dbConnector()) {
			// get address, stream, class
			rs = con.createStatement().executeQuery("select * from student where Sid = '" + issue.getSid() + "';");
			if (rs.next()) {
				issue.setSstream(rs.getString("Stream"));
				issue.setSaddress(rs.getString("Sadd"));
				issue.setSclass(rs.getString("Class"));
			}

			// btn event
			con.createStatement().executeUpdate("insert into issue values(" + issue.getInfo() + ");");

			JOptionPane.showMessageDialog(null,
					"Book with id = " + issue.getBid() + " has been issued to " + issue.getSname());
			con.createStatement().executeUpdate("update books set Available='NO' where Bid='" + issue.getBid() + "';");

		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

	public static String[] txtBId(String BId) {
		String[] str = { "", "" };
		try (Connection con = dbConnection.dbConnector()) {
			rs = con.createStatement().executeQuery("select * from books where Bid='" + BId + "';");
			if (rs.next()) {
				str[0] = rs.getString("Available");
				str[1] = rs.getString("Bname");
			}
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		return str;
	}

	public static String txtSId(String SId) {
		String str = "";
		try (Connection con = dbConnection.dbConnector()) {
			rs = con.createStatement().executeQuery("select * from student where Sid='" + SId + "';");
			if (rs.next()) {
				str = rs.getString("Sname");
			}
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		return str;
	}

	public static void showIssuedBook(Object streamSelectedItem, Object classSelectedItem, DefaultTableModel model) {
		try (Connection con = dbConnection.dbConnector()) {
			if ( streamSelectedItem == null || classSelectedItem == null || (streamSelectedItem.equals("Select Stream") && classSelectedItem.equals("Select Class")))
				rs = con.createStatement().executeQuery("select * from issue");
			else if(!streamSelectedItem.equals("Select Stream") && !classSelectedItem.equals("Select Class"))
				rs = con.createStatement().executeQuery("select * from issue where stream='" + streamSelectedItem
						+ "' and class='" + classSelectedItem + "';");
			else
				rs = con.createStatement().executeQuery("select * from issue where stream = '"+streamSelectedItem+"';");
			model.setRowCount(0);
			while (rs.next()) {
				Object[] row = { rs.getString("Sid"), rs.getString("Sname"), rs.getString("Bid"), rs.getString("Bname"),
						rs.getString("Sadd"), rs.getString("IssueDate") };
				model.addRow(row);
			}
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

	public static int registerStudent(Student student) {
		int flag = 0;
		try (Connection con = dbConnection.dbConnector()) {
			flag  = con.createStatement().executeUpdate("insert into student values(" + student.getInfo() + ");");
			JOptionPane.showMessageDialog(null, "Thank you " + student.getSname() + "\nYou are registered now");

		} catch (SQLException e) {
			if (e.getErrorCode() == 1062)
				JOptionPane.showMessageDialog(null,
						"StudentId is a primary key, duplicate entry is not allowed\nIt should be unique");
			else
				JOptionPane.showMessageDialog(null, "connection error");
		}
		return flag;
	}

	public static Issue txtSId_KeyPressed(String Sid) {
		Issue issue = new Issue();
		issue.setSid(Sid);
		try (Connection con = dbConnection.dbConnector()) {
			rs = con.createStatement().executeQuery("select * from issue where Sid='" + Sid + "';");
			if (rs.next()) {
				issue.setSname(rs.getString("Sname"));
				issue.setBid(rs.getString("Bid"));
				issue.setBname(rs.getString("Bname"));
				issue.setIssueDate(rs.getString("IssueDate"));
			}

		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		return issue;
	}

	public static Issue txtBId_KeyPressed(String Sid, String Bid) {
		Issue issue = new Issue();
		issue.setBid(Bid);
		try (Connection con = dbConnection.dbConnector()) {
			rs = con.createStatement()
					.executeQuery("select * from issue where Bid='" + Bid + "' and Sid ='" + Sid + "';");
			if (rs.next()) {
				issue.setBname(rs.getString("Bname"));
				issue.setIssueDate(rs.getString("IssueDate"));
			}

		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		return issue;
	}

	public static void returnBook(ReturnDetails returnDetails) {
		try (Connection con = dbConnection.dbConnector()) {

			rs = con.createStatement().executeQuery("select * from issue where Sid='" + returnDetails.getSid() + "';");

			if (rs.next()) {
				con.createStatement().executeUpdate("insert into returndetails values(" + returnDetails.getInfo() + ");");
				con.createStatement().executeUpdate("delete from issue where Sid='" + returnDetails.getSid() + "' and Bid = '"+returnDetails.getBid()+"';");
				con.createStatement().executeUpdate("update books set Available='YES' where Bid='" + returnDetails.getBid() + "';");
				JOptionPane.showMessageDialog(null, "Thank you! visit again");
			} else
				JOptionPane.showMessageDialog(null, "No book is issued on this id currently");
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	
	//student
	
	public static void showStudentInfo(String txt, DefaultTableModel model) {
		try (Connection con = dbConnection.dbConnector()) {
			rs = con.createStatement().executeQuery("select * from student where Sname LIKE \"%" + txt + "%\";");
			model.setRowCount(0);
			while (rs.next()) {
				Object[] row = { rs.getString("Sid"), rs.getString("Sname"), rs.getString("Stream"),
						rs.getString("Class"), rs.getString("Sadd") };
				model.addRow(row);
			}
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Cannot find such Student!");
		}
	}
	
	
	public static void showStudentInfo(Object streamSelectedItem, Object classSelectedItem, DefaultTableModel model) {
		try (Connection con = dbConnection.dbConnector()) {
				if ( streamSelectedItem == null || classSelectedItem == null || (streamSelectedItem.equals("Select Stream") && classSelectedItem.equals("Select Class")))
					rs = con.createStatement().executeQuery("select * from student");
				else if(!streamSelectedItem.equals("Select Stream") && !classSelectedItem.equals("Select Class"))
					rs = con.createStatement().executeQuery("select * from student where stream='" + streamSelectedItem
							+ "' and class='" + classSelectedItem + "';");
				else
					rs = con.createStatement().executeQuery("select * from student where stream = '"+streamSelectedItem+"';");
			model.setRowCount(0);
			while (rs.next()) {
				Object[] row = { rs.getString("Sid"), rs.getString("Sname"), rs.getString("Stream"),
						rs.getString("Class"), rs.getString("Sadd") };
				model.addRow(row);
			}
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Cannot find such Student!");
		}
	}

	public static Student searchStudentId(String Sid) {
		Student student = new Student(Sid);
		try (Connection con = dbConnection.dbConnector()) {
			rs = con.createStatement().executeQuery("select * from student where Sid = '" + Sid + "';");
			while (rs.next()) {
				student.setSname(rs.getString("Sname"));
				student.setSstream(rs.getString("Stream"));
				student.setSclass(rs.getString("Class"));
				student.setSaddress(rs.getString("Sadd"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Cannot find such Student!");
		}
		return student;
	}
	
	public static int updateStudent(Student student) {
		int flag = 0;
		try (Connection con = dbConnection.dbConnector()) {
			flag = con.createStatement().executeUpdate("UPDATE student SET Sname = '"+student.getSname()+"', Stream = '"+student.getSstream()+"', Class = '"+student.getSclass()+"', Sadd = '"+student.getSaddress()+"' WHERE (Sid = '"+student.getSid()+"');");
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Cannot update this Student!");
		}
		return flag;
	}
	
	//delete student
	public static int deleteStudent(String Sid) {
		int flag = 0;
		try (Connection con = dbConnection.dbConnector()) {
			flag = con.createStatement().executeUpdate("delete from student where Sid = '" + Sid + "';");
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Cannot find such Student!");
		}
		return flag;
	}
	
	//delete book
	public static int deleteBook(String Bid) {
		int flag = 0;
		try (Connection con = dbConnection.dbConnector()) {
			flag = con.createStatement().executeUpdate("delete from books where Bid = '" + Bid + "';");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public static Book searchBId(String Bid) {
		Book book = new Book(Bid);
		try (Connection con = dbConnection.dbConnector()) {
			rs = con.createStatement().executeQuery("select * from books where Bid = '" + Bid + "';");
			while (rs.next()) {
				book.setBName(rs.getString("Bname"));
				book.setBStream(rs.getString("Stream"));
				book.setBClass(rs.getString("Class"));
				book.setBAuthor(rs.getString("Author"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Cannot find such Student!");
		}
		return book;
	}
}
