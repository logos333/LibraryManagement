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

public class BookDetails extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSearchBName;
	private JTable table;
	private JComboBox<String> cmbSearchBStream, cmbSearchBClass;

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
					BookDetails frame = new BookDetails();
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
	public BookDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 806, 578);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel();
		label.setText("Book Details");
		label.setForeground(new Color(0, 102, 102));
		label.setFont(new Font("Lucida Handwriting", Font.PLAIN, 36));
		label.setBounds(260, 11, 253, 50);
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
		btnHome.setBounds(56, 502, 94, 23);
		contentPane.add(btnHome);
		
		JButton btnIssueBook = new JButton();
		btnIssueBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnIssueBook_ActionPerformed(evt);
			}
		});
		btnIssueBook.setText("Issue Book");
		btnIssueBook.setForeground(Color.WHITE);
		btnIssueBook.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnIssueBook.setBackground(new Color(0, 102, 102));
		btnIssueBook.setBounds(229, 502, 105, 23);
		contentPane.add(btnIssueBook);
		
		JButton btnReturnBook = new JButton();
		btnReturnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnReturnBook_ActionPerformed(evt);
			}
		});
		btnReturnBook.setText("Return Book");
		btnReturnBook.setForeground(Color.WHITE);
		btnReturnBook.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnBook.setBackground(new Color(0, 102, 102));
		btnReturnBook.setBounds(402, 502, 99, 23);
		contentPane.add(btnReturnBook);
		
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
		btnIssuedBookDetails.setBounds(571, 502, 137, 23);
		contentPane.add(btnIssuedBookDetails);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Book Id", "Book Name", "Author", "Sream", "Class", "Available" }));
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
			table.getColumnModel().getColumn(5).setPreferredWidth(40);
		}
		contentPane.add(scrollPane);
		
		cmbSearchBStream = new JComboBox<String>();
		cmbSearchBStream.setForeground(new Color(204, 0, 0));
		cmbSearchBStream.setModel(new DefaultComboBoxModel<>(new String[] { "Select Stream", "Science", "Commerce", "Arts" }));
		cmbSearchBStream.setEnabled(false);
		cmbSearchBStream.setBounds(208, 154, 185, 29);
		cmbSearchBStream.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				cmbSearchBStream_ActionPerformed(evt);
			}
		});
		contentPane.add(cmbSearchBStream);
		
		cmbSearchBClass = new JComboBox<String>();
		cmbSearchBClass.setForeground(new Color(204, 0, 0));
		cmbSearchBClass.setEnabled(false);
		cmbSearchBClass.setModel(new DefaultComboBoxModel<>(new String[] { "Select Class" }));
		cmbSearchBClass.setBounds(452, 154, 160, 29);
		cmbSearchBClass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				cmbSearchBClass_ActionPerformed(evt);
			}
		});
		contentPane.add(cmbSearchBClass);
		
		JButton btnAddNewBook = new JButton();
		btnAddNewBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnAddNewBook_ActionPerformed(evt);
			}
		});
		btnAddNewBook.setText("Manage Books");
		btnAddNewBook.setForeground(Color.WHITE);
		btnAddNewBook.setBackground(new Color(0, 102, 102));
		btnAddNewBook.setBounds(452, 110, 160, 26);
		contentPane.add(btnAddNewBook);
		
		txtSearchBName = new JTextField();
		txtSearchBName.setForeground(new Color(204, 0, 0));
		txtSearchBName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtSearchBName.setEnabled(false);
		txtSearchBName.setBounds(208, 110, 185, 25);
		txtSearchBName.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent evt) {
				txtSearchBName_KeyReleased(evt);
			}
		});
		contentPane.add(txtSearchBName);
		
		JRadioButton rbByName = new JRadioButton();
		rbByName.setText("Search by Book Name");
		rbByName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rbByName.setBounds(6, 111, 151, 25);
		rbByName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				rbByName_ActionPerformed(evt);
			}
		});
		contentPane.add(rbByName);
		
		JRadioButton rbByClass = new JRadioButton();
		rbByClass.setText("Search By Stream or Class");
		rbByClass.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rbByClass.setBounds(6, 158, 185, 25);
		rbByClass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				rbByClass_ActionPerformed(evt);
			}
		});
		ButtonGroup group = new ButtonGroup();
		group.add(rbByName);
		group.add(rbByClass);
		contentPane.add(rbByClass);
		
		WindowUtils.CenterOnScreen(this);
		
		//show all books
		DAO.ShowBookInfo(txtSearchBName.getText(), (DefaultTableModel) table.getModel());
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
	
	private void btnHome_ActionPerformed(ActionEvent evt) {
		MainLayer mn = new MainLayer();
		mn.setVisible(true);
		this.setVisible(false);
	}
	
	private void btnAddNewBook_ActionPerformed(ActionEvent evt) {
		AddNewBook anb = new AddNewBook();
		anb.setVisible(true);
		this.setVisible(false);
	}
	
	private void rbByName_ActionPerformed(ActionEvent evt) {
		cmbSearchBStream.setEnabled(false);
		cmbSearchBClass.setEnabled(false);
		txtSearchBName.setEnabled(true);
	}
	
	private void rbByClass_ActionPerformed(ActionEvent evt) {
		txtSearchBName.setEnabled(false);
		cmbSearchBStream.setEnabled(true);
		cmbSearchBClass.setEnabled(false);
	}

	private void cmbSearchBClass_ActionPerformed(ActionEvent evt) {
		DAO.ShowBookInfo(cmbSearchBStream.getSelectedItem(), cmbSearchBClass.getSelectedItem(), (DefaultTableModel) table.getModel());
	}

	private void cmbSearchBStream_ActionPerformed(ActionEvent evt) {
		cmbSearchBClass.setEnabled(true);
		cmbSearchBClass.removeAllItems();
		if (cmbSearchBStream.getSelectedItem() == "Science") {
			cmbSearchBClass.addItem("Select Class");
			cmbSearchBClass.addItem("FSc");
			cmbSearchBClass.addItem("SSc");
			cmbSearchBClass.addItem("TSc");
		}
		else if (cmbSearchBStream.getSelectedItem() == "Arts") {
			cmbSearchBClass.addItem("Select Class");
			cmbSearchBClass.addItem("FA");
			cmbSearchBClass.addItem("SA");
			cmbSearchBClass.addItem("TA");
		}
		else if (cmbSearchBStream.getSelectedItem() == "Commerce") {
			cmbSearchBClass.addItem("Select Class");
			cmbSearchBClass.addItem("FCom");
			cmbSearchBClass.addItem("SCom");
			cmbSearchBClass.addItem("TCom");
		}
		else {
			cmbSearchBClass.addItem("Select Class");
		}
		
		DAO.ShowBookInfo(cmbSearchBStream.getSelectedItem(), cmbSearchBClass.getSelectedItem(), (DefaultTableModel) table.getModel());
	}

	private void txtSearchBName_KeyReleased(KeyEvent evt) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		DAO.ShowBookInfo(txtSearchBName.getText(), model);
	}

}
