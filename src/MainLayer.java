import java.awt.EventQueue;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainLayer extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					for(UIManager.LookAndFeelInfo info: UIManager.getInstalledLookAndFeels()) {
						if("Nimbus".equals(info.getName())){
							UIManager.setLookAndFeel(info.getClassName());
							break;
						}
					}
					MainLayer frame = new MainLayer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainLayer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 775, 555);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel();
		label.setBounds(10, 120, 250, 250);
		contentPane.add(label);
		
		JButton btnBookDetails = new JButton();
		btnBookDetails.setText("Book Details");
		btnBookDetails.setForeground(Color.WHITE);
		btnBookDetails.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnBookDetails.setBackground(new Color(0, 102, 102));
		btnBookDetails.setBounds(64, 381, 181, 37);
		btnBookDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnBookDetails_ActionPerformed(evt);
			}
		});
		contentPane.add(btnBookDetails);
		
		JButton btnIssueBook = new JButton();
		btnIssueBook.setText("Issue Book");
		btnIssueBook.setForeground(Color.WHITE);
		btnIssueBook.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnIssueBook.setBackground(new Color(0, 102, 102));
		btnIssueBook.setBounds(311, 381, 165, 37);
		btnIssueBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnIssueBook_ActionPerformed(evt);
			}
		});
		contentPane.add(btnIssueBook);
		
		JButton btnAddNewBook = new JButton();
		btnAddNewBook.setText("Manage Books");
		btnAddNewBook.setForeground(Color.WHITE);
		btnAddNewBook.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAddNewBook.setBackground(new Color(0, 102, 102));
		btnAddNewBook.setBounds(205, 436, 143, 23);
		btnAddNewBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnAddNewBook_ActionPerformed(evt);
			}
		});
		contentPane.add(btnAddNewBook);
		
		JButton btnIssuedBookDetails = new JButton();
		btnIssuedBookDetails.setText("Issued Book Details");
		btnIssuedBookDetails.setForeground(Color.WHITE);
		btnIssuedBookDetails.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnIssuedBookDetails.setBackground(new Color(0, 102, 102));
		btnIssuedBookDetails.setBounds(325, 470, 137, 23);
		btnIssuedBookDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnIssuedBooks_ActionPerformed(evt);
			}
		});
		contentPane.add(btnIssuedBookDetails);
		
		JButton btnStudentDetails = new JButton();
		btnStudentDetails.setText("Student Details");
		btnStudentDetails.setForeground(Color.WHITE);
		btnStudentDetails.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnStudentDetails.setBackground(new Color(0, 102, 102));
		btnStudentDetails.setBounds(432, 436, 141, 23);
		btnStudentDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnStudentDetails_ActionPerformed(evt);
			}
		});
		contentPane.add(btnStudentDetails);
		
		JButton btnReturnBook = new JButton();
		btnReturnBook.setText("Return Book");
		btnReturnBook.setForeground(Color.WHITE);
		btnReturnBook.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnReturnBook.setBackground(new Color(0, 102, 102));
		btnReturnBook.setBounds(533, 381, 181, 37);
		btnReturnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnReturnBook_ActionPerformed(evt);
			}
		});
		contentPane.add(btnReturnBook);
		
		JLabel label_1 = new JLabel();
		label_1.setBounds(523, 120, 176, 250);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel();
		label_2.setBounds(331, 120, 108, 250);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel();
		label_3.setText("Library ");
		label_3.setForeground(new Color(0, 204, 204));
		label_3.setFont(new Font("Lucida Handwriting", Font.PLAIN, 24));
		label_3.setBounds(331, 68, 149, 41);
		label_2.setIcon(new ImageIcon(getClass().getResource("./images/Issue_Book.png")));
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel();
		label_4.setText("University Library");
		label_4.setForeground(new Color(0, 102, 102));
		label_4.setFont(new Font("Footlight MT Light", Font.PLAIN, 56));
		label_4.setBounds(196, 11, 415, 52);
		label.setIcon(new ImageIcon(getClass().getResource("./images/Book_Details.png")));
		contentPane.add(label_4);
		
		label_1.setIcon(new ImageIcon(getClass().getResource("./images/Return_Books.png")));
		
		WindowUtils.CenterOnScreen(this);
	}

	private void btnAddNewBook_ActionPerformed(ActionEvent evt) {
		AddNewBook anb = new AddNewBook();
		anb.setVisible(true);
		this.setVisible(false);
	}

	private void btnStudentDetails_ActionPerformed(ActionEvent evt) {
		StudentDetails r = new StudentDetails();
		r.setVisible(true);
		this.setVisible(false);
	}

	private void btnIssueBook_ActionPerformed(ActionEvent evt) {
		IssueBook ib = new IssueBook();
		ib.setVisible(true);
		this.setVisible(false);
	}

	private void btnReturnBook_ActionPerformed(ActionEvent evt) {
		ReturnBook rb = new ReturnBook();
		rb.setVisible(true);
		this.setVisible(false);
	}

	private void btnIssuedBooks_ActionPerformed(ActionEvent evt) {
		IssuedBooks ibs = new IssuedBooks();
		ibs.setVisible(true);
		this.setVisible(false);
	}

	private void btnBookDetails_ActionPerformed(ActionEvent evt) {
		BookDetails bd = new BookDetails();
		bd.setVisible(true);
		this.setVisible(false);
	}
	
}
