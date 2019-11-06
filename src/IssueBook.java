import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class IssueBook extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSId;
	private JTextField txtSName;
	private JTextField txtBId;
	private JTextField txtAvailabe;
	private JTextField txtBName;
	private JTextField txtIssueDate;
	Date date = new Date();
	SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
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
					IssueBook frame = new IssueBook();
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
	public IssueBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 775, 532);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel();
		label.setText("Issue Book");
		label.setForeground(new Color(0, 102, 102));
		label.setFont(new Font("Lucida Handwriting", Font.PLAIN, 36));
		label.setBounds(290, 11, 209, 50);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel();
		label_1.setText("Student Id");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(201, 95, 66, 17);
		contentPane.add(label_1);
		
		txtSId = new JTextField();
		txtSId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtSId.setBounds(327, 87, 130, 33);
		txtSId.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent evt) {
				txtSId_KeyReleased(evt);
			}
		});
		contentPane.add(txtSId);
		
		JLabel label_2 = new JLabel();
		label_2.setText("Student Name");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(201, 149, 88, 17);
		contentPane.add(label_2);
		
		txtSName = new JTextField();
		txtSName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtSName.setEnabled(false);
		txtSName.setBounds(327, 141, 261, 33);
		contentPane.add(txtSName);
		
		JLabel label_3 = new JLabel();
		label_3.setText("Book Id");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(201, 200, 48, 17);
		contentPane.add(label_3);
		
		txtBId = new JTextField();
		txtBId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtBId.setBounds(328, 192, 260, 33);
		txtBId.setEnabled(false);
		txtBId.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent evt) {
				txtBId_KeyReleased(evt);
			}
		});
		contentPane.add(txtBId);
		
		JLabel label_4 = new JLabel();
		label_4.setText("Available");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_4.setBounds(201, 249, 53, 17);
		contentPane.add(label_4);
		
		txtAvailabe = new JTextField();
		txtAvailabe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtAvailabe.setEnabled(false);
		txtAvailabe.setBounds(327, 241, 261, 33);
		contentPane.add(txtAvailabe);
		
		JLabel label_5 = new JLabel();
		label_5.setText("Book name");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_5.setBounds(201, 297, 69, 17);
		contentPane.add(label_5);
		
		txtBName = new JTextField();
		txtBName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtBName.setEnabled(false);
		txtBName.setBounds(327, 289, 261, 33);
		contentPane.add(txtBName);
		
		JLabel label_6 = new JLabel();
		label_6.setText("Issue Date");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_6.setBounds(201, 345, 65, 17);
		contentPane.add(label_6);
		
		txtIssueDate = new JTextField();
		txtIssueDate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtIssueDate.setEnabled(false);
		txtIssueDate.setBounds(327, 337, 261, 33);
		contentPane.add(txtIssueDate);
		
		JButton btnIssue = new JButton();
		btnIssue.setText("Issue");
		btnIssue.setForeground(Color.WHITE);
		btnIssue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnIssue.setBackground(new Color(0, 102, 102));
		btnIssue.setBounds(449, 405, 139, 25);
		btnIssue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnIssue_ActionPerformed(evt);
			}
		});
		contentPane.add(btnIssue);
		
		JButton btnStudentRegistration = new JButton();
		btnStudentRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnStudentDetails_ActionPerformed(evt);
			}
		});
		btnStudentRegistration.setText("Student Details");
		btnStudentRegistration.setForeground(Color.WHITE);
		btnStudentRegistration.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnStudentRegistration.setBackground(new Color(0, 102, 102));
		btnStudentRegistration.setBounds(20, 465, 119, 23);
		contentPane.add(btnStudentRegistration);
		
		JButton btnHome = new JButton();
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnHome_ActionPerformed(evt);
			}
		});
		btnHome.setText("Home");
		btnHome.setForeground(Color.WHITE);
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnHome.setBackground(new Color(0, 102, 102));
		btnHome.setBounds(161, 465, 119, 23);
		contentPane.add(btnHome);
		
		JButton btnBookDetails = new JButton();
		btnBookDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnBookDetails_ActionPerformed(evt);
			}
		});
		btnBookDetails.setText("Book Details");
		btnBookDetails.setForeground(Color.WHITE);
		btnBookDetails.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBookDetails.setBackground(new Color(0, 102, 102));
		btnBookDetails.setBounds(297, 465, 130, 23);
		contentPane.add(btnBookDetails);
		
		JButton btnReturnBook = new JButton();
		btnReturnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnReturnBook_ActionPerformed(e);
			}
		});
		btnReturnBook.setText("Return Book");
		btnReturnBook.setForeground(Color.WHITE);
		btnReturnBook.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnBook.setBackground(new Color(0, 102, 102));
		btnReturnBook.setBounds(449, 465, 131, 23);
		contentPane.add(btnReturnBook);
		
		JButton btnIssuedBookDetails = new JButton();
		btnIssuedBookDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnIssuedBookDetails_ActionPerformed(e);
			}
		});
		btnIssuedBookDetails.setText("Issued Book Details");
		btnIssuedBookDetails.setForeground(Color.WHITE);
		btnIssuedBookDetails.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnIssuedBookDetails.setBackground(new Color(0, 102, 102));
		btnIssuedBookDetails.setBounds(599, 465, 150, 23);
		contentPane.add(btnIssuedBookDetails);
		
		WindowUtils.CenterOnScreen(this);
	}
	
	private void btnHome_ActionPerformed(ActionEvent evt) {
		MainLayer mn = new MainLayer();
		mn.setVisible(true);
		this.setVisible(false);
	}

	private void btnIssue_ActionPerformed(ActionEvent evt) {
		if (txtAvailabe.getText().equals(""))
			JOptionPane.showMessageDialog(this, "Book doesn't exist!");
		else if(txtAvailabe.getText().equals("NO"))
			JOptionPane.showMessageDialog(this, "Book was already taken!");
		else {
				DAO.btnIssue(new Issue(txtSId.getText(), txtSName.getText(),txtBId.getText(),txtBName.getText(), txtIssueDate.getText()));
				txtBName.setText("");
				txtSId.setText("");
				txtSName.setText("");
				txtBId.setText("");
				txtAvailabe.setText("");
		}
	}

	private void btnBookDetails_ActionPerformed(ActionEvent evt) {
		BookDetails bd = new BookDetails();
		bd.setVisible(true);
		this.setVisible(false);
	}

	private void btnReturnBook_ActionPerformed(ActionEvent evt) {
		ReturnBook rb = new ReturnBook();
		rb.setVisible(true);
		this.setVisible(false);
	}

	private void btnStudentDetails_ActionPerformed(ActionEvent evt) {
		StudentDetails r = new StudentDetails();
		r.setVisible(true);
		this.setVisible(false);
	}

	private void btnIssuedBookDetails_ActionPerformed(ActionEvent evt) {
		IssuedBooks ibs = new IssuedBooks();
		ibs.setVisible(true);
		this.setVisible(false);
	}

	private void txtSId_KeyReleased(KeyEvent evt) {
		txtBId.setEnabled(false);
		txtSName.setText(DAO.txtSId(txtSId.getText()));
		if(!txtSName.getText().equals(""))
			txtBId.setEnabled(true);
		txtIssueDate.setText(format.format(date));
	}

	private void txtBId_KeyReleased(KeyEvent evt) {
		String[] str = DAO.txtBId(txtBId.getText());
		txtAvailabe.setText(str[0]);
		txtBName.setText(str[1]);
	}

}
