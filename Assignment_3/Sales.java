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
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Sales extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	private JTextField txtTotalParticipant;
	private JTextField txtEventExpenses;
	private JTextField txtTotalFees;
	private JTextField txtTotalSponsor;
	private JTextField txtIncome;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sales frame = new Sales();
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
	public Sales() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 608);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel.setBackground(new Color(176, 224, 230));
		panel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(65, 105, 225)));
		panel.setBounds(0, 0, 936, 571);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(65, 105, 225)));
		panel_1.setBackground(new Color(175, 238, 238));
		panel_1.setBounds(10, 10, 916, 85);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("EVENT SALES REPORT");
		lblNewLabel.setFont(new Font("Viner Hand ITC", Font.PLAIN, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 896, 65);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(65, 105, 225)));
		panel_1_1.setBackground(new Color(176, 224, 230));
		panel_1_1.setBounds(10, 105, 383, 378);
		panel.add(panel_1_1);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(65, 105, 225)));
		panel_1_1_2.setBackground(new Color(175, 238, 238));
		panel_1_1_2.setBounds(10, 10, 363, 59);
		panel_1_1.add(panel_1_1_2);
		
		JLabel lblNewLabel_1 = new JLabel("EVENT");
		lblNewLabel_1.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 10, 343, 39);
		panel_1_1_2.add(lblNewLabel_1);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(65, 105, 225)));
		panel_1_1_1_1.setBackground(new Color(176, 224, 230));
		panel_1_1_1_1.setBounds(10, 88, 363, 51);
		panel_1_1.add(panel_1_1_1_1);
		
		JRadioButton rdbtnEvent1 = new JRadioButton("EVENT 1");
		buttonGroup_1.add(rdbtnEvent1);
		rdbtnEvent1.setBounds(6, 6, 353, 39);
		panel_1_1_1_1.add(rdbtnEvent1);
		rdbtnEvent1.setBackground(new Color(153, 255, 255));
		rdbtnEvent1.setFont(new Font("STLiti", Font.PLAIN, 20));
		rdbtnEvent1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTotalParticipant.setText("250 participants");
				txtTotalFees.setText("875");
				txtEventExpenses.setText("2000");
				txtTotalSponsor.setText("2500");
				txtIncome.setText("3500");;
				
			}
		});
		
		JPanel panel_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(65, 105, 225)));
		panel_1_1_1_1_1.setBackground(new Color(176, 224, 230));
		panel_1_1_1_1_1.setBounds(10, 160, 363, 51);
		panel_1_1.add(panel_1_1_1_1_1);
		
		JRadioButton rdbtnEvent2 = new JRadioButton("EVENT 2");
		buttonGroup_1.add(rdbtnEvent2);
		rdbtnEvent2.setFont(new Font("STLiti", Font.PLAIN, 20));
		rdbtnEvent2.setBounds(6, 6, 353, 39);
		panel_1_1_1_1_1.add(rdbtnEvent2);
		rdbtnEvent2.setBackground(new Color(153, 255, 255));
		rdbtnEvent2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTotalParticipant.setText("150 participants");
				txtTotalFees.setText("375");
				txtEventExpenses.setText("1000");
				txtTotalSponsor.setText("3000");
				txtIncome.setText("2735");
			}
		});
		
		JPanel panel_1_1_1_1_2 = new JPanel();
		panel_1_1_1_1_2.setLayout(null);
		panel_1_1_1_1_2.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(65, 105, 225)));
		panel_1_1_1_1_2.setBackground(new Color(176, 224, 230));
		panel_1_1_1_1_2.setBounds(10, 238, 363, 51);
		panel_1_1.add(panel_1_1_1_1_2);
		
		JRadioButton rdbtnEvent3 = new JRadioButton("EVENT 3");
		buttonGroup_1.add(rdbtnEvent3);
		rdbtnEvent3.setFont(new Font("STLiti", Font.PLAIN, 20));
		rdbtnEvent3.setBounds(6, 6, 353, 39);
		panel_1_1_1_1_2.add(rdbtnEvent3);
		rdbtnEvent3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTotalParticipant.setText("500 participants");
				txtTotalFees.setText("2000");
				txtEventExpenses.setText("3000");
				txtTotalSponsor.setText("5000");
				txtIncome.setText("4000");		
			}
		});
		rdbtnEvent3.setBackground(new Color(153, 255, 255));
		
		JPanel panel_1_1_1_1_2_1 = new JPanel();
		panel_1_1_1_1_2_1.setLayout(null);
		panel_1_1_1_1_2_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(65, 105, 225)));
		panel_1_1_1_1_2_1.setBackground(new Color(176, 224, 230));
		panel_1_1_1_1_2_1.setBounds(10, 317, 363, 51);
		panel_1_1.add(panel_1_1_1_1_2_1);
		
		JRadioButton rdbtnEvent4 = new JRadioButton("EVENT 4");
		buttonGroup_1.add(rdbtnEvent4);
		rdbtnEvent4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTotalParticipant.setText("-");
				txtTotalFees.setText("-");
				txtEventExpenses.setText("-");
				txtTotalSponsor.setText("-");
				txtIncome.setText("-");	
			}
		});
		rdbtnEvent4.setBounds(6, 6, 353, 39);
		panel_1_1_1_1_2_1.add(rdbtnEvent4);
		rdbtnEvent4.setFont(new Font("STLiti", Font.PLAIN, 20));
		rdbtnEvent4.setBackground(new Color(153, 255, 255));
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(65, 105, 225)));
		panel_1_1_1.setBackground(new Color(176, 224, 230));
		panel_1_1_1.setBounds(403, 105, 523, 378);
		panel.add(panel_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("TOTAL PARTICIPANT");
		lblNewLabel_2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 10, 212, 44);
		panel_1_1_1.add(lblNewLabel_2);
		
		txtTotalParticipant = new JTextField();
		txtTotalParticipant.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtTotalParticipant.setBounds(232, 10, 281, 44);
		panel_1_1_1.add(txtTotalParticipant);
		txtTotalParticipant.setColumns(10);
		
		txtEventExpenses = new JTextField();
		txtEventExpenses.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtEventExpenses.setColumns(10);
		txtEventExpenses.setBounds(232, 164, 281, 44);
		panel_1_1_1.add(txtEventExpenses);
		
		JLabel lblNewLabel_2_1 = new JLabel("EVENT EXPENSES (RM)");
		lblNewLabel_2_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(10, 164, 212, 44);
		panel_1_1_1.add(lblNewLabel_2_1);
		
		txtTotalFees = new JTextField();
		txtTotalFees.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtTotalFees.setColumns(10);
		txtTotalFees.setBounds(232, 89, 281, 44);
		panel_1_1_1.add(txtTotalFees);
		
		JLabel lblNewLabel_2_2 = new JLabel("TOTAL FEES (RM)");
		lblNewLabel_2_2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblNewLabel_2_2.setBounds(10, 89, 212, 44);
		panel_1_1_1.add(lblNewLabel_2_2);
		
		txtTotalSponsor = new JTextField();
		txtTotalSponsor.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtTotalSponsor.setColumns(10);
		txtTotalSponsor.setBounds(232, 242, 281, 44);
		panel_1_1_1.add(txtTotalSponsor);
		
		JLabel lblNewLabel_2_3 = new JLabel("TOTAL SPONSOR (RM)");
		lblNewLabel_2_3.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblNewLabel_2_3.setBounds(10, 242, 212, 44);
		panel_1_1_1.add(lblNewLabel_2_3);
		
		txtIncome = new JTextField();
		txtIncome.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtIncome.setColumns(10);
		txtIncome.setBounds(232, 324, 281, 44);
		panel_1_1_1.add(txtIncome);
		
		JLabel lblNewLabel_2_4 = new JLabel("INCOME (RM)");
		lblNewLabel_2_4.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblNewLabel_2_4.setBounds(10, 324, 212, 44);
		panel_1_1_1.add(lblNewLabel_2_4);
		
		JButton btnNewButton = new JButton("RETURN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finance f = new Finance();
				f.setModalExclusionType(null);
				f.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Showcard Gothic", Font.PLAIN, 30));
		btnNewButton.setBackground(new Color(153, 255, 255));
		btnNewButton.setBounds(98, 493, 240, 68);
		panel.add(btnNewButton);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Event Sales Report", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Showcard Gothic", Font.PLAIN, 30));
		btnExit.setBackground(new Color(153, 255, 255));
		btnExit.setBounds(577, 493, 240, 68);
		panel.add(btnExit);
	}
}
