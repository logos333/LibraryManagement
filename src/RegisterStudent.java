import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.*;

public class RegisterStudent extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSId;
	private JTextField txtSName;
	private JComboBox<String> cmbStream;
	private JComboBox<String> cmbClass;
	private JTextArea txtAddress;
	private JButton btnRegister, btnDelete;

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
					RegisterStudent frame = new RegisterStudent();
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
	public RegisterStudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 549);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label = new JLabel();
		label.setText("Student Registration");
		label.setForeground(new Color(0, 102, 102));
		label.setFont(new Font("Lucida Handwriting", Font.PLAIN, 36));
		label.setBounds(71, 11, 426, 50);
		contentPane.add(label);

		JLabel label_1 = new JLabel();
		label_1.setText("Student Id");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(109, 90, 66, 17);
		contentPane.add(label_1);

		txtSId = new JTextField();
		txtSId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtSId.setBounds(257, 82, 205, 33);
		txtSId.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent evt) {
				txtSId_KeyReleased(evt);
			}
		});
		contentPane.add(txtSId);

		JLabel label_2 = new JLabel();
		label_2.setText("Student Name");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(109, 152, 88, 17);
		contentPane.add(label_2);

		txtSName = new JTextField();
		txtSName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtSName.setBounds(257, 144, 205, 33);
		contentPane.add(txtSName);

		JLabel label_3 = new JLabel();
		label_3.setText("Stream");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(109, 211, 44, 17);
		contentPane.add(label_3);

		cmbStream = new JComboBox<String>();
		cmbStream.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cmbStream.setBounds(257, 208, 205, 23);
		cmbStream.setModel(new DefaultComboBoxModel<>(new String[] { "Select Stream", "Commerce", "Science", "Arts" }));
		cmbStream.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				cmbStream_ActionPerformed(evt);
			}
		});
		contentPane.add(cmbStream);

		JLabel label_4 = new JLabel();
		label_4.setText("Class");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_4.setBounds(109, 262, 30, 17);
		contentPane.add(label_4);

		cmbClass = new JComboBox<String>();
		cmbClass.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cmbClass.setBounds(257, 259, 205, 23);
		cmbClass.setEnabled(false);
		contentPane.add(cmbClass);

		JLabel label_5 = new JLabel();
		label_5.setText("Address");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_5.setBounds(109, 317, 48, 17);
		contentPane.add(label_5);

		txtAddress = new JTextArea();
		txtAddress.setRows(5);
		txtAddress.setFont(new Font("Monospaced", Font.PLAIN, 14));
		txtAddress.setColumns(20);
		txtAddress.setBounds(258, 314, 204, 104);
		contentPane.add(txtAddress);

		btnRegister = new JButton();
		btnRegister.setText("Register");
		btnRegister.setForeground(Color.WHITE);
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnRegister.setBackground(new Color(0, 102, 102));
		btnRegister.setBounds(254, 432, 93, 25);
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnRegister_ActionPerformed(evt);
			}
		});
		contentPane.add(btnRegister);

		JButton btnHome = new JButton();
		btnHome.setText("Home");
		btnHome.setForeground(Color.WHITE);
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnHome.setBackground(new Color(0, 102, 102));
		btnHome.setBounds(10, 476, 88, 23);
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
		btnBookDetails.setBounds(129, 476, 99, 23);
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
		btnIssueBook.setBounds(257, 476, 91, 23);
		btnIssueBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnIssueBook_ActionPerformed(evt);
			}
		});
		contentPane.add(btnIssueBook);

		JButton btnReturnBook = new JButton();
		btnReturnBook.setText("Return Book");
		btnReturnBook.setForeground(Color.WHITE);
		btnReturnBook.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnBook.setBackground(new Color(0, 102, 102));
		btnReturnBook.setBounds(380, 476, 99, 23);
		btnReturnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnReturnBook_ActionPerformed(evt);
			}
		});
		contentPane.add(btnReturnBook);

		JButton btnIssuedBookDetails = new JButton();
		btnIssuedBookDetails.setText("Issued Book Details");
		btnIssuedBookDetails.setForeground(Color.WHITE);
		btnIssuedBookDetails.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnIssuedBookDetails.setBackground(new Color(0, 102, 102));
		btnIssuedBookDetails.setBounds(507, 476, 137, 23);
		btnIssuedBookDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnIssuedBookDetails_ActionPerformed(evt);
			}
		});
		contentPane.add(btnIssuedBookDetails);

		btnDelete = new JButton();
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnDelete_ActionPerformed(e);
			}
		});
		btnDelete.setEnabled(false);
		btnDelete.setText("Delete");
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDelete.setBackground(new Color(204, 0, 0));
		btnDelete.setBounds(370, 432, 91, 25);
		contentPane.add(btnDelete);
		
		WindowUtils.CenterOnScreen(this);
	}

	private void btnReturnBook_ActionPerformed(ActionEvent evt) {
		ReturnBook rb = new ReturnBook();
		rb.setVisible(true);
		this.setVisible(false);
	}

	private void btnRegister_ActionPerformed(ActionEvent evt) {
		if (txtSId.getText().equals(""))
			JOptionPane.showMessageDialog(this, "Please enter StudentId");
		else if (txtSName.getText().equals(""))
			JOptionPane.showMessageDialog(this, "Please enter Student Name");
		else if (cmbStream.getSelectedItem() == "Select Stream")
			JOptionPane.showMessageDialog(this, "Please select stream");
		else if (cmbClass.getSelectedItem() == "Select Class")
			JOptionPane.showMessageDialog(this, "Please select class");
		else if (txtAddress.getText().equals(""))
			JOptionPane.showMessageDialog(this, "Please enter Address");
		else {
			if(0!=DAO.registerStudent(
					new Student(txtSId.getText(), txtSName.getText(), cmbStream.getSelectedItem().toString(),
							cmbClass.getSelectedItem().toString(), txtAddress.getText())))
			{
				txtSId.setText("");
				txtSId_KeyReleased(null);
//				txtSName.setText("");
//				txtAddress.setText("");
			}
			else
				JOptionPane.showMessageDialog(this, "Registration failed!");
		}
	}

	private void cmbStream_ActionPerformed(ActionEvent evt) {
		cmbClass.removeAllItems();
		if (cmbStream.getSelectedItem() == "Science") {
			cmbClass.addItem("Select Class");
			cmbClass.addItem("FSc");
			cmbClass.addItem("SSc");
			cmbClass.addItem("TSc");

			cmbClass.setEnabled(true);
		} else if (cmbStream.getSelectedItem() == "Arts") {
			cmbClass.addItem("Select Class");
			cmbClass.addItem("FA");
			cmbClass.addItem("SA");
			cmbClass.addItem("TA");

			cmbClass.setEnabled(true);
		} else if (cmbStream.getSelectedItem() == "Commerce") {
			cmbClass.addItem("Select Class");
			cmbClass.addItem("FCom");
			cmbClass.addItem("SCom");
			cmbClass.addItem("TCom");

			cmbClass.setEnabled(true);
		} else
			cmbClass.setEnabled(false);

	}

	private void btnHome_ActionPerformed(ActionEvent evt) {
		MainLayer mn = new MainLayer();
		mn.setVisible(true);
		this.setVisible(false);
	}

	private void btnBookDetails_ActionPerformed(ActionEvent evt) {
		BookDetails bd = new BookDetails();
		bd.setVisible(true);
		this.setVisible(false);
	}

	private void btnIssueBook_ActionPerformed(ActionEvent evt) {
		IssueBook ib = new IssueBook();
		ib.setVisible(true);
		this.setVisible(false);
	}

	private void btnIssuedBookDetails_ActionPerformed(ActionEvent evt) {
		IssuedBooks ibs = new IssuedBooks();
		ibs.setVisible(true);
		this.setVisible(false);
	}

	private void txtSId_KeyReleased(KeyEvent evt) {
		btnDelete.setEnabled(false);
		Student student = DAO.searchStudentId(txtSId.getText());
		if (student == null || student.getSname().equals("")) {
			btnRegister.setText("Register");
			btnRegister.removeActionListener(btnRegister.getActionListeners()[0]);
			btnRegister.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					btnRegister_ActionPerformed(evt);
				}
			});
			txtSName.setText("");
			txtAddress.setText("");
			cmbStream.setSelectedIndex(0);
		} else {
			btnDelete.setEnabled(true);
			txtSName.setText(student.getSname());
			txtAddress.setText(student.getSaddress());
			cmbStream.setSelectedItem(student.getSstream());
			cmbClass.setSelectedItem(student.getSclass());

			btnRegister.setText("Update");
			btnRegister.removeActionListener(btnRegister.getActionListeners()[0]);
			btnRegister.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					btnUpdate_ActionPerformed(evt);
				}
			});
		}
	}

	private void btnUpdate_ActionPerformed(ActionEvent evt) {
		if (0 != DAO.updateStudent(new Student(txtSId.getText(), txtSName.getText(),
				cmbStream.getSelectedItem().toString(), cmbClass.getSelectedItem().toString(), txtAddress.getText()))) {
			JOptionPane.showMessageDialog(this, "Update Successfuly!");
		} else {
			JOptionPane.showMessageDialog(this, "Error while Updating!");
		}
	}

	// delete btn
	private void btnDelete_ActionPerformed(ActionEvent evt) {
		if (JOptionPane.showConfirmDialog(this, 
				"Do you want to delete " + txtSName.getText() + "?", "Delete", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
			if (0 != DAO.deleteStudent(txtSId.getText())) {
				JOptionPane.showMessageDialog(this, "Deleted Successfuly!");
				txtSId.setText("");
				txtSName.setText("");
				txtAddress.setText("");
				cmbStream.setSelectedIndex(0);
			} else {
				JOptionPane.showMessageDialog(this, "Error while deleting!");
			}
		}
	}

}
