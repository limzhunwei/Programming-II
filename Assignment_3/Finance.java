package Assignment_3;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Finance extends JFrame {

	private JPanel contentPane;
    private JTextField txtTotalFees;
    private JTextField txtTotalDonation;
    private JTextField txtTotalSponsor;
    private JTextField txtTotalExpense;
    private JTable table;
    private JTextField txtNetIncome;
    private JTextField txtIncomeTaxReduction;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finance frame = new Finance();
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
		public Finance() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 999, 635);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 204), new Color(0, 0, 255), new Color(0, 0, 204), new Color(0, 0, 255)));
			panel.setBackground(new Color(51, 204, 255));
			panel.setBounds(0, 0, 985, 598);
			contentPane.add(panel);
			panel.setLayout(null);
			
			JPanel panel_1 = new JPanel();
			panel_1.setLayout(null);
			panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 204), new Color(0, 0, 255), new Color(0, 0, 204), new Color(0, 0, 255)));
			panel_1.setBackground(new Color(153, 255, 255));
			panel_1.setBounds(10, 10, 965, 81);
			panel.add(panel_1);
			
			JLabel lblNewLabel = new JLabel("UN WOMEN FINANCE REPORT");
			lblNewLabel.setBackground(new Color(153, 204, 255));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Segoe Script", Font.PLAIN, 40));
			lblNewLabel.setBounds(10, 10, 945, 61);
			panel_1.add(lblNewLabel);
			
			JPanel panel_1_1 = new JPanel();
			panel_1_1.setLayout(null);
			panel_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 204), new Color(0, 0, 255), new Color(0, 0, 204), new Color(0, 0, 255)));
			panel_1_1.setBackground(new Color(51, 204, 255));
			panel_1_1.setBounds(10, 101, 367, 385);
			panel.add(panel_1_1);
			
			JLabel lblTotalFees = new JLabel("TOTAL FEES (RM)");
			lblTotalFees.setFont(new Font("ROG Fonts", Font.PLAIN, 14));
			lblTotalFees.setBounds(10, 94, 185, 33);
			panel_1_1.add(lblTotalFees);
			
			JLabel lblMonth = new JLabel("MONTH");
			lblMonth.setFont(new Font("ROG Fonts", Font.PLAIN, 14));
			lblMonth.setBounds(10, 10, 185, 33);
			panel_1_1.add(lblMonth);
			
			JLabel lblTotalDonation = new JLabel("TOTAL DONATION (RM)");
			lblTotalDonation.setFont(new Font("ROG Fonts", Font.PLAIN, 13));
			lblTotalDonation.setBounds(10, 137, 185, 33);
			panel_1_1.add(lblTotalDonation);
			
			JLabel lblTotalSponsor = new JLabel("TOTAL SPONSOR (RM)");
			lblTotalSponsor.setFont(new Font("ROG Fonts", Font.PLAIN, 13));
			lblTotalSponsor.setBounds(10, 180, 185, 33);
			panel_1_1.add(lblTotalSponsor);
			
			JLabel lblTotalExpenses = new JLabel("TOTAL EXPENSE (RM)");
			lblTotalExpenses.setFont(new Font("ROG Fonts", Font.PLAIN, 13));
			lblTotalExpenses.setBounds(10, 223, 185, 33);
			panel_1_1.add(lblTotalExpenses);
			
			JLabel lblNetIncome = new JLabel("NET INCOME (RM)");
			lblNetIncome.setFont(new Font("ROG Fonts", Font.PLAIN, 14));
			lblNetIncome.setBounds(10, 266, 185, 33);
			panel_1_1.add(lblNetIncome);
			
			JLabel lblIncomeTaxReduction = new JLabel("INCOME TAX REDUCTION (RM)");
			lblIncomeTaxReduction.setFont(new Font("ROG Fonts", Font.PLAIN, 15));
			lblIncomeTaxReduction.setBounds(10, 309, 347, 33);
			panel_1_1.add(lblIncomeTaxReduction);
			
			JLabel lblEvent = new JLabel("EVENT AMOUNT");
			lblEvent.setFont(new Font("ROG Fonts", Font.PLAIN, 14));
			lblEvent.setBounds(10, 53, 185, 33);
			panel_1_1.add(lblEvent);
			
			txtTotalFees = new JTextField();
			txtTotalFees.setFont(new Font("Segoe Print", Font.PLAIN, 14));
			txtTotalFees.setBounds(205, 94, 152, 33);
			panel_1_1.add(txtTotalFees);
			txtTotalFees.setColumns(10);
			
			JComboBox monthComboBox = new JComboBox();
			monthComboBox.setBackground(new Color(153, 255, 255));
			monthComboBox.setFont(new Font("Segoe Print", Font.PLAIN, 13));
			monthComboBox.setModel(new DefaultComboBoxModel(new String[] {"~ Select Month ~", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
			monthComboBox.setBounds(205, 10, 152, 33);
			panel_1_1.add(monthComboBox);
			
			JComboBox eventComboBox = new JComboBox();
			eventComboBox.setBackground(new Color(153, 255, 255));
			eventComboBox.setModel(new DefaultComboBoxModel(new String[] {"~ Select Amount ~", "0", "1", "2", "3", "4"}));
			eventComboBox.setFont(new Font("Segoe Print", Font.PLAIN, 13));
			eventComboBox.setBounds(205, 53, 152, 33);
			panel_1_1.add(eventComboBox);
			
			txtTotalDonation = new JTextField();
			txtTotalDonation.setFont(new Font("Segoe Print", Font.PLAIN, 14));
			txtTotalDonation.setColumns(10);
			txtTotalDonation.setBounds(205, 137, 152, 33);
			panel_1_1.add(txtTotalDonation);
			
			txtTotalSponsor = new JTextField();
			txtTotalSponsor.setFont(new Font("Segoe Print", Font.PLAIN, 14));
			txtTotalSponsor.setColumns(10);
			txtTotalSponsor.setBounds(205, 180, 152, 33);
			panel_1_1.add(txtTotalSponsor);
			
			txtTotalExpense = new JTextField();
			txtTotalExpense.setFont(new Font("Segoe Print", Font.PLAIN, 14));
			txtTotalExpense.setColumns(10);
			txtTotalExpense.setBounds(205, 223, 152, 33);
			panel_1_1.add(txtTotalExpense);
			
			txtNetIncome = new JTextField();
			txtNetIncome.setEditable(false);
			txtNetIncome.setFont(new Font("Segoe Print", Font.PLAIN, 14));
			txtNetIncome.setColumns(10);
			txtNetIncome.setBounds(205, 266, 152, 33);
			panel_1_1.add(txtNetIncome);
			
			txtIncomeTaxReduction = new JTextField();
			txtIncomeTaxReduction.setEditable(false);
			txtIncomeTaxReduction.setFont(new Font("Segoe Print", Font.PLAIN, 15));
			txtIncomeTaxReduction.setColumns(10);
			txtIncomeTaxReduction.setBounds(10, 342, 347, 33);
			panel_1_1.add(txtIncomeTaxReduction);
			
			JPanel panel_1_1_1 = new JPanel();
			panel_1_1_1.setLayout(null);
			panel_1_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 204), new Color(0, 0, 255), new Color(0, 0, 204), new Color(0, 0, 255)));
			panel_1_1_1.setBackground(new Color(51, 204, 255));
			panel_1_1_1.setBounds(387, 101, 588, 385);
			panel.add(panel_1_1_1);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 10, 568, 303);
			panel_1_1_1.add(scrollPane);
			
			table = new JTable();
			table.setBackground(new Color(153, 255, 255));
			table.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"MONTH", "EVENT AMOUNT", "TOTAL FEES (RM)", "TOTAL DONATION (RM)", "TOTAL SPONSOR (RM)", "TOTAL EXPENSE (RM)", "NET INCOME (RM)", "INCOME TAX REDUCTION (RM)"
				}
			));
			scrollPane.setViewportView(table);
			
			JButton btnUpload = new JButton("UPLOAD");
			btnUpload.setBackground(new Color(153, 255, 255));
			btnUpload.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						File file = new File("C:\\Users\\lzw_1\\OneDrive\\Desktop\\Assignment\\Programming II\\Assignment  3\\Finance.txt");
						if(!file.exists()) {
							file.createNewFile();
							}
						FileWriter fw = new FileWriter(file.getAbsoluteFile());
						BufferedWriter bw = new BufferedWriter(fw);
						
						for (int i=0; i<table.getRowCount(); i++) {
							for (int j=0; j<table.getColumnCount(); j++) {
								bw.write(table.getModel().getValueAt(i, j) + "  |  ");
								}
							bw.write("\n_____________________________________________________________________\n");
							}
							bw.close();
							fw.close();
							JOptionPane.showMessageDialog(null, "Data Uploaded");
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			});
			btnUpload.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 20));
			btnUpload.setBounds(217, 328, 130, 47);
			panel_1_1_1.add(btnUpload);
			
			JButton btnNewButton_1 = new JButton("SALES REPORT");
			btnNewButton_1.setBackground(new Color(153, 255, 255));
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Sales s = new Sales();
					s.setModalExclusionType(null);
					s.setVisible(true);
				}
			});
			btnNewButton_1.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 20));
			btnNewButton_1.setBounds(414, 328, 164, 47);
			panel_1_1_1.add(btnNewButton_1);
			
			JPanel panel_1_1_1_1 = new JPanel();
			panel_1_1_1_1.setLayout(null);
			panel_1_1_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 204), new Color(0, 0, 255), new Color(0, 0, 204), new Color(0, 0, 255)));
			panel_1_1_1_1.setBackground(new Color(51, 204, 255));
			panel_1_1_1_1.setBounds(10, 508, 965, 80);
			panel.add(panel_1_1_1_1);
			
			JButton btnNewButton = new JButton("CALCULATE");
			btnNewButton.setBackground(new Color(153, 255, 255));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						double tf = Double.parseDouble(txtTotalFees.getText());
						double td = Double.parseDouble(txtTotalDonation.getText());
						double ts = Double.parseDouble(txtTotalSponsor.getText());
						double te = Double.parseDouble(txtTotalExpense.getText());
						double netIncome = tf + td + ts - te;
						double taxReduction = netIncome*0.10;
						
						txtNetIncome.setText(String.format("%.2f", netIncome));
						txtIncomeTaxReduction.setText(String.format("%.2f", taxReduction));
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Please enter finance report");
					}
				}
			});
			btnNewButton.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 20));
			btnNewButton.setBounds(10, 10, 130, 60);
			panel_1_1_1_1.add(btnNewButton);
			
			JButton btnAddRecord = new JButton("ADD RECORD");
			btnAddRecord.setBackground(new Color(153, 255, 255));
			btnAddRecord.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					if(monthComboBox.getSelectedIndex()!=0 && eventComboBox.getSelectedIndex() != 0) {
						DefaultTableModel model = (DefaultTableModel) table.getModel();
					
							model.addRow(new Object[]{
							monthComboBox.getSelectedItem(),
							eventComboBox.getSelectedItem(),
							txtTotalFees.getText(),
							txtTotalDonation.getText(),
							txtTotalSponsor.getText(),
							txtTotalExpense.getText(),
							txtNetIncome.getText(),
							txtIncomeTaxReduction.getText()
			
							});
					
							if (table.getSelectedRow() == -1) {
								if (table.getRowCount() == 0) {
									JOptionPane.showMessageDialog(null, "Finance Update confirmed", "Finance Management System",
									JOptionPane.OK_OPTION);
								}
							}
						}
					else {
						JOptionPane.showMessageDialog(null, "Please enter finance report");
					}
				}
				
			});
			btnAddRecord.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 20));
			btnAddRecord.setBounds(172, 10, 140, 60);
			panel_1_1_1_1.add(btnAddRecord);
			
			JButton btnDelete = new JButton("DELETE");
			btnDelete.setBackground(new Color(153, 255, 255));
			btnDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					DefaultTableModel model = (DefaultTableModel)table.getModel();
					if(table.getSelectedRow()==-1) {
						if(table.getRowCount()==0) {
							JOptionPane.showMessageDialog(null,"No data to delete",
									"Finance Management System", JOptionPane.OK_OPTION);
						}else {
							JOptionPane.showMessageDialog(null,"Select a row to delete",
									"Finance Management System", JOptionPane.OK_OPTION);
						}
					}else {
						model.removeRow(table.getSelectedRow());
					}
				}
			});
			btnDelete.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 20));
			btnDelete.setBounds(508, 10, 130, 60);
			panel_1_1_1_1.add(btnDelete);
			
			JButton btnReset = new JButton("RESET");
			btnReset.setBackground(new Color(153, 255, 255));
			btnReset.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					monthComboBox.setSelectedItem("~ Select Month ~");
					eventComboBox.setSelectedItem("~ Select Amount ~");
					txtTotalFees.setText("");
					txtTotalDonation.setText("");
					txtTotalSponsor.setText("");
					txtTotalExpense.setText("");
					txtNetIncome.setText("");
					txtIncomeTaxReduction.setText("");
				
				}
			});
			btnReset.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 20));
			btnReset.setBounds(345, 10, 130, 60);
			panel_1_1_1_1.add(btnReset);
			
			JButton btnPrint = new JButton("PRINT");
			btnPrint.setBackground(new Color(153, 255, 255));
			btnPrint.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						table.print();
					} catch (java.awt.print.PrinterException e) {
						System.err.format("No printer found", e.getMessage());
					}
				}
			});
			btnPrint.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 20));
			btnPrint.setBounds(667, 10, 130, 60);
			panel_1_1_1_1.add(btnPrint);
			
			JButton btnExit = new JButton("EXIT");
			btnExit.setBackground(new Color(153, 255, 255));
			btnExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JFrame frame = new JFrame();
					if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Finance Management System", 
							JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
						System.exit(0);
					}
				}
			});
			btnExit.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 20));
			btnExit.setBounds(825, 10, 130, 60);
			panel_1_1_1_1.add(btnExit);
		}

}
