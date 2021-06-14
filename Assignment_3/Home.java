package Assignment_3;



import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;

public class Home extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private final ButtonGroup btnGroupRice = new ButtonGroup();
	private final ButtonGroup btnGroupMeat = new ButtonGroup();
	private JTextField nameField;
	private JTable table;
	private final ButtonGroup btnGroupPayment = new ButtonGroup();
	private JTextField AmountField;
	private String paymentMethod = " ";
	private double total = 0;
	private JTextField textFieldTot;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 694, 482);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Home");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Home");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPswd frame = new LoginPswd();
				frame.setVisible(true);
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem_7);
		
		JMenu mnNewMenu_1 = new JMenu("About Us");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Company");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompanyBackground frame = new CompanyBackground();
				frame.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Employees");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employees frame = new Employees();
				frame.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_2 = new JMenu("Customer");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Order");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerReg frame = new CustomerReg();
				frame.setVisible(true);
			}
		});
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Registration");
		mntmNewMenuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerReg frame = new CustomerReg();
				frame.setVisible(true);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_8);
		mnNewMenu_2.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_3 = new JMenu("Finance");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Sales");
		mnNewMenu_3.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Billing");
		mnNewMenu_3.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_4 = new JMenu("Product");
		menuBar.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Menu");
		mnNewMenu_4.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Marketing");
		mnNewMenu_4.add(mntmNewMenuItem_6);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 250, 154));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.ORANGE));
		panel.setBounds(10, 11, 658, 421);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(49, 11, 558, 55);
		panel.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.ORANGE));
		panel_1.setBackground(new Color(0, 250, 154));
		
		JLabel lblNewLabel = new JLabel("AZMAN NASI KANDAQ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(142, 11, 246, 29);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.ORANGE));
		panel_1_1.setBackground(new Color(0, 250, 154));
		panel_1_1.setBounds(30, 340, 618, 55);
		panel.add(panel_1_1);
		
		JButton btnNewButton_1 = new JButton("EXIT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Membership Registration System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnNewButton_1.setBounds(10, 11, 89, 23);
		panel_1_1.add(btnNewButton_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.ORANGE));
		panel_1_2.setBackground(new Color(0, 250, 154));
		panel_1_2.setBounds(242, 89, 365, 138);
		panel.add(panel_1_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 345, 91);
		panel_1_2.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Rice", "Price", "Meat", "Price", "Total"
			}
		));
		scrollPane.setViewportView(table);
		
		JRadioButton rbtnBeriyani = new JRadioButton("BERIYANI RICE");
		rbtnBeriyani.setSelected(true);
		btnGroupRice.add(rbtnBeriyani);
		rbtnBeriyani.setBounds(174, 234, 109, 23);
		panel.add(rbtnBeriyani);
		
		JRadioButton rbtnFriedRice = new JRadioButton("FRIED RICE");
		btnGroupRice.add(rbtnFriedRice);
		rbtnFriedRice.setBounds(305, 234, 109, 23);
		panel.add(rbtnFriedRice);
		
		JLabel lblRice = new JLabel("RICE");
		lblRice.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRice.setBounds(59, 238, 109, 14);
		panel.add(lblRice);
		
		JRadioButton rbtnChicken = new JRadioButton("CHICKEN");
		rbtnChicken.setSelected(true);
		btnGroupMeat.add(rbtnChicken);
		rbtnChicken.setBounds(174, 270, 109, 23);
		panel.add(rbtnChicken);
		
		JRadioButton rbtnBeef = new JRadioButton("BEEF");
		btnGroupMeat.add(rbtnBeef);
		rbtnBeef.setBounds(305, 270, 109, 23);
		panel.add(rbtnBeef);
		
		JRadioButton rbtnLamb = new JRadioButton("LAMB");
		btnGroupMeat.add(rbtnLamb);
		rbtnLamb.setBounds(431, 270, 109, 23);
		panel.add(rbtnLamb);
		
		JLabel lblMeat = new JLabel("MEAT");
		lblMeat.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMeat.setBounds(59, 274, 46, 14);
		panel.add(lblMeat);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblName.setBounds(30, 120, 46, 14);
		panel.add(lblName);
		
		nameField = new JTextField();
		nameField.setBounds(82, 118, 150, 20);
		panel.add(nameField);
		nameField.setColumns(10);
		
		JButton btnOrder = new JButton("ORDER");
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String rice = " ";
				String priceR = " ";
				double priceBeriyani = 8.00;
				double priceFriedRice = 6.00;
								
				if (rbtnBeriyani.isSelected()) {
					rice = rbtnBeriyani.getText();
					priceR = Double. toString(priceBeriyani); //convert double into String
				} else {
					rice = rbtnFriedRice.getText();
					priceR = Double. toString(priceFriedRice);
				}
				
				String meat = " ";
				String priceM = " ";
				double priceChicken = 6.00;
				double priceBeef = 7.00;
				double priceLamb = 10.00;
				
				if (rbtnChicken.isSelected()) {
					meat = rbtnChicken.getText();
					priceM = Double. toString(priceChicken);
				} 
				else if (rbtnBeef.isSelected()) {
					meat = rbtnBeef.getText();
					priceM = Double. toString(priceBeef);
				}
				else {
					meat = rbtnLamb.getText();
					priceM = Double. toString(priceLamb);
				}
				
				double totalPrice = Double.parseDouble(priceR) + Double.parseDouble(priceM); //convert String to double
				String totalPriceStr = Double. toString(totalPrice);
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						nameField.getText(),
						rice,
						priceR,
						meat,
						priceM,
						totalPriceStr,
												
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Partipant Information Update confirmed", "Sum With Us Management System",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		btnOrder.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnOrder.setBounds(545, 303, 89, 23);
		panel.add(btnOrder);
		
		JCheckBox chckbxCash = new JCheckBox("Cash");
		chckbxCash.setSelected(true);
		btnGroupPayment.add(chckbxCash);
		chckbxCash.setBounds(92, 151, 57, 20);
		panel.add(chckbxCash);
		
		JCheckBox chckbxCard = new JCheckBox("Card");
		btnGroupPayment.add(chckbxCard);
		chckbxCard.setBounds(155, 151, 75, 20);
		panel.add(chckbxCard);
		
		JLabel lblPayment = new JLabel("Payment");
		lblPayment.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPayment.setBounds(30, 157, 75, 14);
		panel.add(lblPayment);
		
		JButton btnAmount = new JButton("TOTAL AMOUNT");
		btnAmount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (chckbxCash.isSelected()) {
					paymentMethod = "Cash";
					
				} else {
					paymentMethod = "Card";
				}
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
			    // iterate over all columns
			    for (int i = 0 ; i < model.getRowCount() ; i++) {
			        // null or not Integer will throw exception
			        String s = String.valueOf(model.getValueAt(i, 5));
			        
			        total += Double.parseDouble(s);
			    }
			    
			    textFieldTot = new JTextField();
				textFieldTot.setEditable(false);
				textFieldTot.setFont(new Font("Tahoma", Font.BOLD, 12));
				textFieldTot.setBounds(174, 309, 86, 20);
				panel.add(textFieldTot);
				textFieldTot.setColumns(10);
				String result=String.valueOf(total);  
				textFieldTot.setText(result);  
				
			}
		});
		btnAmount.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAmount.setBounds(30, 306, 132, 23);
		panel.add(btnAmount);
		
		
		
		
		
	}
	
	/*AmountField = new JTextField();
	AmountField.setBounds(174, 309, 86, 20);
	//AmountField.setText(paymentMethod); //set Text Field with User Payment method
	String t = Double. toString(total);
	System.out.println(t);
	AmountField.setText(t); 
	//AmountField.setToolTipText(t); 
	panel.add(AmountField);
	AmountField.setColumns(10);*/
	
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
