import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JButton;

public class ReturnBook extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSId;
	private JTextField txtSName;
	private JTextField txtBId;
	private JTextField txtBName;
	private JTextField txtIssuedOn;
	private JTextField txtReturnDate;
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
					ReturnBook frame = new ReturnBook();
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
	public ReturnBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 512);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtSId = new JTextField();
		txtSId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtSId.setBounds(200, 72, 118, 33);
		txtSId.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent evt) {
				txtSId_KeyReleased(evt);
			}
		});
		contentPane.add(txtSId);
		
		JLabel label = new JLabel();
		label.setText("Return Book");
		label.setForeground(new Color(0, 102, 102));
		label.setFont(new Font("Lucida Handwriting", Font.PLAIN, 36));
		label.setBounds(131, 11, 252, 50);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel();
		label_1.setText("Student Id");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(36, 80, 66, 17);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel();
		label_2.setText("Student Name");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(36, 124, 88, 17);
		contentPane.add(label_2);
		
		txtSName = new JTextField();
		txtSName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtSName.setEnabled(false);
		txtSName.setBounds(200, 116, 207, 33);
		contentPane.add(txtSName);
		
		txtBId = new JTextField();
		txtBId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtBId.setEnabled(false);
		txtBId.setBounds(200, 160, 206, 33);
		txtBId.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent evt) {
				txtBId_KeyReleased(evt);
			}
		});
		contentPane.add(txtBId);
		
		JLabel label_3 = new JLabel();
		label_3.setText("Book Id");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(36, 168, 48, 17);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel();
		label_4.setText("Book name");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_4.setBounds(36, 213, 69, 17);
		contentPane.add(label_4);
		
		txtBName = new JTextField();
		txtBName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtBName.setEnabled(false);
		txtBName.setBounds(200, 205, 207, 33);
		contentPane.add(txtBName);
		
		txtIssuedOn = new JTextField();
		txtIssuedOn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtIssuedOn.setEnabled(false);
		txtIssuedOn.setBounds(200, 249, 207, 33);
		contentPane.add(txtIssuedOn);
		
		JLabel label_5 = new JLabel();
		label_5.setText("Issued On");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_5.setBounds(36, 257, 62, 17);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel();
		label_6.setText("Return Date");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_6.setBounds(36, 301, 75, 17);
		contentPane.add(label_6);
		
		txtReturnDate = new JTextField();
		txtReturnDate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtReturnDate.setEnabled(false);
		txtReturnDate.setBounds(200, 293, 206, 33);
		contentPane.add(txtReturnDate);
		
		JButton btnReturn = new JButton();
		btnReturn.setText("Return");
		btnReturn.setForeground(Color.WHITE);
		btnReturn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnReturn.setBackground(new Color(0, 102, 102));
		btnReturn.setBounds(278, 368, 127, 25);
		btnReturn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	btnReturn_ActionPerformed(evt);
            }
        });
		contentPane.add(btnReturn);
		
		JButton btnHome = new JButton();
		btnHome.setText("Home");
		btnHome.setForeground(Color.WHITE);
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnHome.setBackground(new Color(0, 102, 102));
		btnHome.setBounds(10, 436, 74, 23);
		btnHome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	btnHome_ActionPerformed(evt);
            }
        });
		contentPane.add(btnHome);
		
		JButton btnBookDetails = new JButton();
		btnBookDetails.setText("Book Details");
		btnBookDetails.setForeground(Color.WHITE);
		btnBookDetails.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBookDetails.setBackground(new Color(0, 102, 102));
		btnBookDetails.setBounds(114, 436, 99, 23);
		btnBookDetails.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	btnBookDetails_ActionPerformed(evt);
            }
        });
		contentPane.add(btnBookDetails);
		
		JButton btnIssueBook = new JButton();
		btnIssueBook.setText("Issue Book");
		btnIssueBook.setForeground(Color.WHITE);
		btnIssueBook.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnIssueBook.setBackground(new Color(0, 102, 102));
		btnIssueBook.setBounds(257, 436, 91, 23);
		btnIssueBook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	btnIssueBook_ActionPerformed(evt);
            }
        });
		contentPane.add(btnIssueBook);
		
		JButton btnIssuedBookDetails = new JButton();
		btnIssuedBookDetails.setText("Issued Book Details");
		btnIssuedBookDetails.setForeground(Color.WHITE);
		btnIssuedBookDetails.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnIssuedBookDetails.setBackground(new Color(0, 102, 102));
		btnIssuedBookDetails.setBounds(383, 436, 137, 23);
		btnIssuedBookDetails.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	btnIssuedBookDetails_ActionPerformed(evt);
            }
        });
		contentPane.add(btnIssuedBookDetails);
		
		WindowUtils.CenterOnScreen(this);
	}
	
	private void txtSId_KeyReleased(KeyEvent evt) {
		txtBId.setEnabled(false);
		Issue issue = DAO.txtSId_KeyPressed(txtSId.getText());
		
		txtSName.setText(issue.getSname());
		txtBId.setText(issue.getBid());
		txtBName.setText(issue.getBname());
		txtIssuedOn.setText(issue.getIssueDate());
		txtReturnDate.setText(format.format(date));
		
		//enable Bid txt
		if(!txtBId.getText().equals(""))
			txtBId.setEnabled(true);
	}
	
	private void txtBId_KeyReleased(KeyEvent evt) {
		Issue issue = DAO.txtBId_KeyPressed(txtSId.getText(), txtBId.getText());
		
		txtBName.setText(issue.getBname());
		txtIssuedOn.setText(issue.getIssueDate());
		txtReturnDate.setText(format.format(date));
		
		//enable Bid txt
		txtBId.setEnabled(true);
	}

	private void btnReturn_ActionPerformed(ActionEvent evt) 
	{
		if(!txtBName.getText().equals("")) {
			DAO.returnBook(new ReturnDetails(txtSId.getText(), txtSName.getText(), txtBId.getText(), txtBName.getText(), txtIssuedOn.getText(), txtReturnDate.getText()));
			txtSId.setText("");
			txtSName.setText("");
			txtBId.setText("");
			txtBName.setText("");
			txtIssuedOn.setText("");
			txtReturnDate.setText("");
		}
		else 
			JOptionPane.showMessageDialog(this, "This student doesn't have matching book!");
	}
	
	private void btnHome_ActionPerformed(ActionEvent evt) 
	{
		MainLayer mn=new MainLayer();
		mn.setVisible(true);
		this.setVisible(false);
	}
	
	private void btnBookDetails_ActionPerformed(ActionEvent evt) 
	{
        BookDetails bd=new BookDetails();
        bd.setVisible(true);
        this.setVisible(false);
    }
	
	private void btnIssueBook_ActionPerformed(ActionEvent evt) 
	{
        IssueBook ib=new IssueBook();
        ib.setVisible(true);
        this.setVisible(false);
    }

    private void btnIssuedBookDetails_ActionPerformed(ActionEvent evt) 
    {
        IssuedBooks ibs=new IssuedBooks();
        ibs.setVisible(true);
        this.setVisible(false);
    }
}
