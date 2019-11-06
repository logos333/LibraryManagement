import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.UIManager;

public class AddNewBook extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBId;
	private JTextField txtBName;
	private JTextField txtBAuthor;
	private JComboBox<String> cmbBStream, cmbBClass;
	private JButton btnDelete;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
						if ("Nimbus".equals(info.getName())) {
							UIManager.setLookAndFeel(info.getClassName());
							break;
						}
					}
					AddNewBook frame = new AddNewBook();
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
	public AddNewBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label = new JLabel();
		label.setText("Book Id");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(28, 81, 48, 17);
		contentPane.add(label);

		JLabel lblManageBooks = new JLabel();
		lblManageBooks.setText("Manage Books");
		lblManageBooks.setForeground(new Color(0, 102, 102));
		lblManageBooks.setFont(new Font("Lucida Handwriting", Font.PLAIN, 36));
		lblManageBooks.setBounds(10, 11, 326, 50);
		contentPane.add(lblManageBooks);

		txtBId = new JTextField();
		txtBId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtBId.setBounds(151, 73, 334, 33);
		txtBId.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent evt) {
				txtBId_KeyReleased(evt);
			}
		});
		contentPane.add(txtBId);

		txtBName = new JTextField();
		txtBName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtBName.setBounds(151, 117, 334, 33);
		contentPane.add(txtBName);

		JLabel label_2 = new JLabel();
		label_2.setText("Book Name");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(28, 125, 70, 17);
		contentPane.add(label_2);

		JLabel label_3 = new JLabel();
		label_3.setText("Author");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(28, 169, 42, 17);
		contentPane.add(label_3);

		txtBAuthor = new JTextField();
		txtBAuthor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtBAuthor.setBounds(151, 161, 334, 33);
		contentPane.add(txtBAuthor);

		cmbBStream = new JComboBox<String>();
		cmbBStream.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cmbBStream.setBounds(151, 205, 160, 23);
		cmbBStream
				.setModel(new DefaultComboBoxModel<>(new String[] { "Select Stream", "Commerce", "Science", "Arts" }));
		cmbBStream.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				cmbBStream_ActionPerformed(evt);
			}
		});
		contentPane.add(cmbBStream);

		JLabel label_4 = new JLabel();
		label_4.setText("Stream");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_4.setBounds(28, 208, 44, 17);
		contentPane.add(label_4);

		JLabel label_5 = new JLabel();
		label_5.setText("Class");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_5.setBounds(28, 242, 30, 17);
		contentPane.add(label_5);

		cmbBClass = new JComboBox<String>();
		cmbBClass.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cmbBClass.setBounds(151, 239, 160, 23);
		cmbBClass.setModel(new DefaultComboBoxModel<>(new String[] { "Select Class" }));
		contentPane.add(cmbBClass);

		JButton btnAdd = new JButton();
		btnAdd.setText("Add");
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAdd.setBackground(new Color(0, 102, 102));
		btnAdd.setBounds(151, 301, 144, 25);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnAdd_ActionPerformed(evt);
			}
		});
		contentPane.add(btnAdd);

		JButton btnHome = new JButton();
		btnHome.setText("Home");
		btnHome.setForeground(Color.WHITE);
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnHome.setBackground(new Color(0, 102, 102));
		btnHome.setBounds(10, 372, 88, 23);
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnCancel_ActionPerformed(evt);
			}
		});
		contentPane.add(btnHome);

		JButton btnIssueBook = new JButton();
		btnIssueBook.setText("Issue Book");
		btnIssueBook.setForeground(Color.WHITE);
		btnIssueBook.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnIssueBook.setBackground(new Color(0, 102, 102));
		btnIssueBook.setBounds(122, 372, 91, 23);
		btnIssueBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnIssueBook_ActionPerformed(evt);
			}
		});
		contentPane.add(btnIssueBook);

		JButton btnReturnBook = new JButton();
		btnReturnBook.setText("Return Book");
		btnReturnBook.setForeground(Color.WHITE);
		btnReturnBook.setBackground(new Color(0, 102, 102));
		btnReturnBook.setBounds(250, 373, 108, 23);
		btnReturnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnReturnBook_ActionPerformed(evt);
			}
		});
		contentPane.add(btnReturnBook);

		JButton btnIssuedBookDetails = new JButton();
		btnIssuedBookDetails.setText("Issued Book Details");
		btnIssuedBookDetails.setForeground(Color.WHITE);
		btnIssuedBookDetails.setBackground(new Color(0, 102, 102));
		btnIssuedBookDetails.setBounds(386, 373, 144, 23);
		btnIssuedBookDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnIssuedBookDetails_ActionPerformed(evt);
			}
		});
		contentPane.add(btnIssuedBookDetails);

		JButton btnBookDetails = new JButton();
		btnBookDetails.setText("Book Details");
		btnBookDetails.setForeground(Color.WHITE);
		btnBookDetails.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBookDetails.setBackground(new Color(0, 102, 102));
		btnBookDetails.setBounds(562, 372, 99, 23);
		btnBookDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnBookDetails_ActionPerformed(evt);
			}
		});
		contentPane.add(btnBookDetails);

		btnDelete = new JButton();
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnDelete_ActionPerformed(e);
			}
		});
		btnDelete.setText("Delete");
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDelete.setBackground(new Color(204, 0, 0));
		btnDelete.setBounds(323, 301, 162, 25);
		btnDelete.setEnabled(false);
		contentPane.add(btnDelete);
		
		WindowUtils.CenterOnScreen(this);
	}

	private void btnAdd_ActionPerformed(ActionEvent evt) {
		if (txtBId.getText().equals(""))
			JOptionPane.showMessageDialog(this, "Please enter Book id");
		else if (txtBName.getText().equals(""))
			JOptionPane.showMessageDialog(this, "Please enter Book name");
		else if (txtBAuthor.getText().equals(""))
			JOptionPane.showMessageDialog(this, "Please enter author name");
		else if (cmbBStream.getSelectedItem().equals("Select Stream"))
			JOptionPane.showMessageDialog(this, "Please select stream");
		else if (cmbBClass.getSelectedItem().equals("Select Class"))
			JOptionPane.showMessageDialog(this, "Please select class");
		else {
			if (DAO.addBookButton(new Book(txtBId.getText(), txtBName.getText(), txtBAuthor.getText(),
					cmbBStream.getSelectedItem().toString(), cmbBClass.getSelectedItem().toString(), "YES"))) {
				txtBId.setText("");
				txtBName.setText("");
				txtBAuthor.setText("");
				cmbBStream.setSelectedIndex(0);
				cmbBClass.removeAllItems();
				cmbBClass.addItem("Select Class");
			}
		}
	}

	private void btnCancel_ActionPerformed(ActionEvent evt) {
		MainLayer mn = new MainLayer();
		mn.setVisible(true);
		this.setVisible(false);
	}

	private void cmbBStream_ActionPerformed(ActionEvent evt) {
		cmbBClass.removeAllItems();
		if (cmbBStream.getSelectedItem() == "Science") {
			cmbBClass.addItem("Select Class");
			cmbBClass.addItem("FSc");
			cmbBClass.addItem("SSc");
			cmbBClass.addItem("TSc");
		}
		else if (cmbBStream.getSelectedItem() == "Arts") {
			cmbBClass.removeAllItems();
			cmbBClass.addItem("Select Class");
			cmbBClass.addItem("FA");
			cmbBClass.addItem("SA");
			cmbBClass.addItem("TA");
		}
		else if (cmbBStream.getSelectedItem() == "Commerce") {
			cmbBClass.removeAllItems();
			cmbBClass.addItem("Select Class");
			cmbBClass.addItem("FCom");
			cmbBClass.addItem("SCom");
			cmbBClass.addItem("TCom");
		}
		else
			cmbBClass.addItem("Select Class");
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

	private void btnIssuedBookDetails_ActionPerformed(ActionEvent evt) {
		IssuedBooks ibs = new IssuedBooks();
		ibs.setVisible(true);
		this.setVisible(false);
	}

	private void btnBookDetails_ActionPerformed(ActionEvent evt) {
		BookDetails bd = new BookDetails();
		bd.setVisible(true);
		this.setVisible(false);
	}

	// delete btn
	private void btnDelete_ActionPerformed(ActionEvent evt) {
		if (!txtBId.getText().equals("")) {
			if (JOptionPane.showConfirmDialog(this, "Do you want to delete " + txtBName.getText() + "?", "Delete",
					JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
				if (0 != DAO.deleteBook(txtBId.getText())) {
					JOptionPane.showMessageDialog(this, "Deleted Successfuly!");
					txtBId.setText("");
					txtBName.setText("");
					txtBAuthor.setText("");
					cmbBStream.setSelectedIndex(0);
					btnDelete.setEnabled(false);
				} else {
					JOptionPane.showMessageDialog(this, "Cannot find such book!");
				}
			}
		} else
			JOptionPane.showMessageDialog(this, "Book id cannot be empty!");
		
	}
	
	private void txtBId_KeyReleased(KeyEvent evt) {
		btnDelete.setEnabled(false);
		Book book= DAO.searchBId(txtBId.getText());
		if (book == null || book.getBName().equals("")) {
			txtBName.setText("");
			txtBAuthor.setText("");
			cmbBStream.setSelectedIndex(0);
//			cmbBClass.removeAllItems();
//			cmbBClass.addItem("Select Class");
		} else {
			btnDelete.setEnabled(true);
			txtBName.setText(book.getBName());
			txtBAuthor.setText(book.getBAuthor());
			cmbBStream.setSelectedItem(book.getBStream());
			cmbBClass.setSelectedItem(book.getBClass());
		}
	}

}
