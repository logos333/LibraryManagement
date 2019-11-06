import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IssuedBooks extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JComboBox<String> cmbClass, cmbStream;

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
					IssuedBooks frame = new IssuedBooks();
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
	public IssuedBooks() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 853, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnAddNewBook = new JButton();
		btnAddNewBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnAddNewBook_ActionPerformed(evt);
			}
		});
		btnAddNewBook.setText("Manage Books");
		btnAddNewBook.setForeground(Color.WHITE);
		btnAddNewBook.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAddNewBook.setBackground(new Color(0, 102, 102));
		btnAddNewBook.setBounds(264, 417, 109, 23);
		contentPane.add(btnAddNewBook);

		JButton btnHome = new JButton();
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnHome_ActionPerformed(e);
			}
		});
		btnHome.setText("Home");
		btnHome.setForeground(Color.WHITE);
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnHome.setBackground(new Color(0, 102, 102));
		btnHome.setBounds(10, 417, 91, 23);
		contentPane.add(btnHome);

		JButton btnBookDetails = new JButton();
		btnBookDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnBookDetails_ActionPerformed(e);
			}
		});
		btnBookDetails.setText("Book Details");
		btnBookDetails.setForeground(Color.WHITE);
		btnBookDetails.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBookDetails.setBackground(new Color(0, 102, 102));
		btnBookDetails.setBounds(130, 417, 99, 23);
		contentPane.add(btnBookDetails);

		JButton btnIssueBook = new JButton();
		btnIssueBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnIssueBook_ActionPerformed(e);
			}
		});
		btnIssueBook.setText("Issue Book");
		btnIssueBook.setForeground(Color.WHITE);
		btnIssueBook.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnIssueBook.setBackground(new Color(0, 102, 102));
		btnIssueBook.setBounds(408, 417, 91, 23);
		contentPane.add(btnIssueBook);

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
		btnReturnBook.setBounds(547, 417, 99, 23);
		contentPane.add(btnReturnBook);

		JButton btnStudentRegistration = new JButton();
		btnStudentRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnStudentDetails_ActionPerformed(e);
			}
		});
		btnStudentRegistration.setText("Student Details");
		btnStudentRegistration.setForeground(Color.WHITE);
		btnStudentRegistration.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnStudentRegistration.setBackground(new Color(0, 102, 102));
		btnStudentRegistration.setBounds(685, 417, 141, 23);
		contentPane.add(btnStudentRegistration);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 132, 816, 246);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Student Id", "Student Name", "Book Id",
				"Book Name", "Student Address", "Issue Date" }));
		scrollPane.setViewportView(table);
		if (table.getColumnModel().getColumnCount() > 0) {
			table.getColumnModel().getColumn(0).setPreferredWidth(40);
			table.getColumnModel().getColumn(1).setPreferredWidth(150);
			table.getColumnModel().getColumn(2).setPreferredWidth(30);
			table.getColumnModel().getColumn(3).setPreferredWidth(150);
			table.getColumnModel().getColumn(4).setPreferredWidth(200);
			table.getColumnModel().getColumn(5).setPreferredWidth(60);
		}

		cmbStream = new JComboBox<String>();
		cmbStream.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cmbStream.setBounds(168, 103, 150, 23);
		cmbStream.setModel(new DefaultComboBoxModel<>(new String[] { "Select Stream", "Commerce", "Science", "Arts" }));
		cmbStream.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmbStream_ActionPerformed(e);
			}
		});
		contentPane.add(cmbStream);

		JLabel label = new JLabel();
		label.setText("Stream");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(95, 106, 44, 17);
		contentPane.add(label);

		JLabel label_1 = new JLabel();
		label_1.setText("Class");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(457, 106, 30, 17);
		contentPane.add(label_1);

		cmbClass = new JComboBox<String>();
		cmbClass.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cmbClass.setBounds(520, 103, 150, 23);
		cmbClass.setModel(new DefaultComboBoxModel<>(new String[] { "Select Class" }));
		cmbClass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				cmbClass_ActionPerformed(evt);
			}
		});
		contentPane.add(cmbClass);

		JLabel label_2 = new JLabel();
		label_2.setText("Issued Book Details");
		label_2.setForeground(new Color(0, 102, 102));
		label_2.setFont(new Font("Lucida Handwriting", Font.PLAIN, 36));
		label_2.setBounds(168, 11, 392, 50);
		contentPane.add(label_2);
		
		WindowUtils.CenterOnScreen(this);
		
		//show all issuedBooks
		DAO.showIssuedBook(cmbStream.getSelectedItem(), cmbClass.getSelectedItem(), (DefaultTableModel) table.getModel());
	}

	// events

	private void btnHome_ActionPerformed(ActionEvent evt) {
		MainLayer mn = new MainLayer();
		mn.setVisible(true);
		this.setVisible(false);
	}

	private void cmbStream_ActionPerformed(ActionEvent evt) {
		cmbClass.removeAllItems();
		if (cmbStream.getSelectedItem() == "Science") {
			cmbClass.addItem("Select Class");
			cmbClass.addItem("FSc");
			cmbClass.addItem("SSc");
			cmbClass.addItem("TSc");
		}
		else if (cmbStream.getSelectedItem() == "Arts") {
			cmbClass.addItem("Select Class");
			cmbClass.addItem("FA");
			cmbClass.addItem("SA");
			cmbClass.addItem("TA");
		}
		else if (cmbStream.getSelectedItem() == "Commerce") {
			cmbClass.addItem("Select Class");
			cmbClass.addItem("FCom");
			cmbClass.addItem("SCom");
			cmbClass.addItem("TCom");
		}
		else {
			cmbClass.addItem("Select Class");
		}
		
		DAO.showIssuedBook(cmbStream.getSelectedItem(), cmbClass.getSelectedItem(), (DefaultTableModel) table.getModel());
	}

	private void cmbClass_ActionPerformed(ActionEvent evt) {
		DAO.showIssuedBook(cmbStream.getSelectedItem(), cmbClass.getSelectedItem(), (DefaultTableModel) table.getModel());
	}

	private void btnBookDetails_ActionPerformed(ActionEvent evt) {
		BookDetails bd = new BookDetails();
		bd.setVisible(true);
		this.setVisible(false);
	}

	private void btnAddNewBook_ActionPerformed(ActionEvent evt) {
		AddNewBook anb = new AddNewBook();
		anb.setVisible(true);
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

	private void btnStudentDetails_ActionPerformed(ActionEvent evt) {
		StudentDetails r = new StudentDetails();
		r.setVisible(true);
		this.setVisible(false);
	}

}
