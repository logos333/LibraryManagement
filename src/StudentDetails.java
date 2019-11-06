import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTable;

public class StudentDetails extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSearchBName;
	private JTable table;
	private JComboBox<String> cmbSearchSStream, cmbSearchSClass;

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
					StudentDetails frame = new StudentDetails();
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
	public StudentDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 806, 578);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel();
		label.setText("Student Details");
		label.setForeground(new Color(0, 102, 102));
		label.setFont(new Font("Lucida Handwriting", Font.PLAIN, 36));
		label.setBounds(229, 11, 340, 50);
		contentPane.add(label);
		
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
		btnHome.setBounds(22, 502, 137, 24);
		contentPane.add(btnHome);
		
		JButton btnIssuedBookDetails = new JButton();
		btnIssuedBookDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnIssuedBookDetails_ActionPerformed(evt);
			}
		});
		btnIssuedBookDetails.setText("Issued Book Details");
		btnIssuedBookDetails.setForeground(Color.WHITE);
		btnIssuedBookDetails.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnIssuedBookDetails.setBackground(new Color(0, 102, 102));
		btnIssuedBookDetails.setBounds(190, 502, 137, 25);
		contentPane.add(btnIssuedBookDetails);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Student Id", "Name", "Sream", "Class", "Address" }));
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 209, 778, 262);
		scrollPane.setViewportView(table);
		if (table.getColumnModel().getColumnCount() > 0) {
			table.getColumnModel().getColumn(0).setPreferredWidth(40);
			table.getColumnModel().getColumn(1).setPreferredWidth(210);
			table.getColumnModel().getColumn(2).setPreferredWidth(150);
			table.getColumnModel().getColumn(3).setPreferredWidth(40);
			table.getColumnModel().getColumn(4).setPreferredWidth(40);
		}
		contentPane.add(scrollPane);
		
		cmbSearchSStream = new JComboBox<String>();
		cmbSearchSStream.setForeground(new Color(204, 0, 0));
		cmbSearchSStream.setModel(new DefaultComboBoxModel<>(new String[] { "Select Stream", "Science", "Commerce", "Arts" }));
		cmbSearchSStream.setEnabled(false);
		cmbSearchSStream.setBounds(199, 154, 185, 29);
		cmbSearchSStream.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				cmbSearchBStream_ActionPerformed(evt);
			}
		});
		contentPane.add(cmbSearchSStream);
		
		cmbSearchSClass = new JComboBox<String>();
		cmbSearchSClass.setForeground(new Color(204, 0, 0));
		cmbSearchSClass.setEnabled(false);
		cmbSearchSClass.setModel(new DefaultComboBoxModel<>(new String[] { "Select Class" }));
		cmbSearchSClass.setBounds(452, 154, 160, 29);
		cmbSearchSClass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				cmbSearchBClass_ActionPerformed(evt);
			}
		});
		contentPane.add(cmbSearchSClass);
		
		JButton btnModifyStudent = new JButton();
		btnModifyStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnModifyStudent_ActionPerformed(evt);
			}
		});
		btnModifyStudent.setText("Modify Student ");
		btnModifyStudent.setForeground(Color.WHITE);
		btnModifyStudent.setBackground(new Color(0, 102, 102));
		btnModifyStudent.setBounds(452, 110, 160, 26);
		contentPane.add(btnModifyStudent);
		
		txtSearchBName = new JTextField();
		txtSearchBName.setForeground(new Color(204, 0, 0));
		txtSearchBName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtSearchBName.setEnabled(false);
		txtSearchBName.setBounds(199, 110, 185, 25);
		txtSearchBName.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent evt) {
				txtSearchBName_KeyReleased(evt);
			}
		});
		contentPane.add(txtSearchBName);
		
		JRadioButton rbByName = new JRadioButton();
		rbByName.setText("Search by Student Name");
		rbByName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rbByName.setBounds(6, 111, 187, 25);
		rbByName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				rbByName_ActionPerformed(evt);
			}
		});
		contentPane.add(rbByName);
		
		JRadioButton rbByClass = new JRadioButton();
		rbByClass.setText("Search By Stream or Class");
		rbByClass.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rbByClass.setBounds(6, 158, 187, 25);
		rbByClass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				rbByClass_ActionPerformed(evt);
			}
		});
		ButtonGroup group = new ButtonGroup();
		group.add(rbByName);
		group.add(rbByClass);
		contentPane.add(rbByClass);
		
		JButton btnIssueBook = new JButton();
		btnIssueBook.setText("Issue Book");
		btnIssueBook.setForeground(Color.WHITE);
		btnIssueBook.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnIssueBook.setBackground(new Color(0, 102, 102));
		btnIssueBook.setBounds(530, 501, 137, 25);
		btnIssueBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnIssueBook_ActionPerformed(evt);
			}
		});
		contentPane.add(btnIssueBook);
		
		JButton btnBookDetails = new JButton();
		btnBookDetails.setText("Book Details");
		btnBookDetails.setForeground(Color.WHITE);
		btnBookDetails.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBookDetails.setBackground(new Color(0, 102, 102));
		btnBookDetails.setBounds(362, 501, 137, 24);
		btnBookDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnBookDetails_ActionPerformed(evt);
			}
		});
		contentPane.add(btnBookDetails);
		
		WindowUtils.CenterOnScreen(this);
		
		//show all books
		DAO.showStudentInfo(txtSearchBName.getText(), (DefaultTableModel) table.getModel());
	}
	
	private void btnIssuedBookDetails_ActionPerformed(ActionEvent evt) {
		IssuedBooks ibs = new IssuedBooks();
		ibs.setVisible(true);
		this.setVisible(false);
	}
	
	private void btnHome_ActionPerformed(ActionEvent evt) {
		MainLayer mn = new MainLayer();
		mn.setVisible(true);
		this.setVisible(false);
	}
	
	private void btnModifyStudent_ActionPerformed(ActionEvent evt) {
		RegisterStudent anb = new RegisterStudent();
		anb.setVisible(true);
		this.setVisible(false);
	}
	
	private void rbByName_ActionPerformed(ActionEvent evt) {
		cmbSearchSStream.setEnabled(false);
		cmbSearchSClass.setEnabled(false);
		txtSearchBName.setEnabled(true);
	}
	
	private void rbByClass_ActionPerformed(ActionEvent evt) {
		txtSearchBName.setEnabled(false);
		cmbSearchSStream.setEnabled(true);
		cmbSearchSClass.setEnabled(true);
	}

	private void cmbSearchBClass_ActionPerformed(ActionEvent evt) {
			DAO.showStudentInfo(cmbSearchSStream.getSelectedItem(), cmbSearchSClass.getSelectedItem(), (DefaultTableModel) table.getModel());
	}

	private void cmbSearchBStream_ActionPerformed(ActionEvent evt) {
		cmbSearchSClass.setEnabled(true);
		cmbSearchSClass.removeAllItems();
		if (cmbSearchSStream.getSelectedItem() == "Science") {
			cmbSearchSClass.addItem("Select Class");
			cmbSearchSClass.addItem("FSc");
			cmbSearchSClass.addItem("SSc");
			cmbSearchSClass.addItem("TSc");
		}
		else if (cmbSearchSStream.getSelectedItem() == "Arts") {
			cmbSearchSClass.addItem("Select Class");
			cmbSearchSClass.addItem("FA");
			cmbSearchSClass.addItem("SA");
			cmbSearchSClass.addItem("TA");
		}
		else if (cmbSearchSStream.getSelectedItem() == "Commerce") {
			cmbSearchSClass.addItem("Select Class");
			cmbSearchSClass.addItem("FCom");
			cmbSearchSClass.addItem("SCom");
			cmbSearchSClass.addItem("TCom");
		}
		else {
			cmbSearchSClass.addItem("Select Class");
		}
		
		DAO.showStudentInfo(cmbSearchSStream.getSelectedItem(), cmbSearchSClass.getSelectedItem(), (DefaultTableModel) table.getModel());
	}

	private void txtSearchBName_KeyReleased(KeyEvent evt) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		DAO.showStudentInfo(txtSearchBName.getText(), model);
	}
	
	private void btnIssueBook_ActionPerformed(ActionEvent evt) {
		IssueBook ib = new IssueBook();
		ib.setVisible(true);
		this.setVisible(false);
	}
	
	private void btnBookDetails_ActionPerformed(ActionEvent evt) 
	{
        BookDetails bd=new BookDetails();
        bd.setVisible(true);
        this.setVisible(false);
    }
}
