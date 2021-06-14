package Assignment_3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUserName;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 488, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 255, 255));
		panel.setBorder(new CompoundBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(204, 153, 255)), new BevelBorder(BevelBorder.LOWERED, new Color(153, 153, 255), new Color(153, 153, 255), new Color(153, 153, 255), new Color(153, 153, 255))));
		panel.setBounds(0, 0, 474, 386);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new CompoundBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(204, 153, 255)), new BevelBorder(BevelBorder.LOWERED, new Color(153, 153, 255), new Color(153, 153, 255), new Color(153, 153, 255), new Color(153, 153, 255))));
		panel_1.setBackground(new Color(255, 204, 255));
		panel_1.setBounds(10, 10, 457, 92);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("ADMIN LOGIN PAGE");
		lblNewLabel.setBackground(new Color(255, 204, 255));
		lblNewLabel.setFont(new Font("STLiti", Font.PLAIN, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 434, 70);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new CompoundBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(204, 153, 255)), new BevelBorder(BevelBorder.LOWERED, new Color(153, 153, 255), new Color(153, 153, 255), new Color(153, 153, 255), new Color(153, 153, 255))));
		panel_1_1.setBackground(new Color(255, 204, 255));
		panel_1_1.setBounds(10, 110, 457, 267);
		panel.add(panel_1_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new CompoundBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(204, 153, 255)), new BevelBorder(BevelBorder.LOWERED, new Color(153, 153, 255), new Color(153, 153, 255), new Color(153, 153, 255), new Color(153, 153, 255))));
		panel_1_1_1.setBackground(new Color(255, 204, 255));
		panel_1_1_1.setBounds(30, 24, 135, 127);
		panel_1_1.add(panel_1_1_1);
		
		JLabel lblAdmin = new JLabel("");
		lblAdmin.setBounds(10, 10, 115, 107);
		panel_1_1_1.add(lblAdmin);
		
		JLabel lblNewLabel_1 = new JLabel("USERNAME");
		lblNewLabel_1.setFont(new Font("Script MT Bold", Font.PLAIN, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(175, 35, 100, 32);
		panel_1_1.add(lblNewLabel_1);
		
		txtUserName = new JTextField();
		txtUserName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtUserName.setBounds(285, 35, 135, 32);
		panel_1_1.add(txtUserName);
		txtUserName.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("PASSWORD");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Script MT Bold", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(175, 98, 100, 32);
		panel_1_1.add(lblNewLabel_1_1);
		
		txtPassword = new JTextField();
		txtPassword.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtPassword.setColumns(10);
		txtPassword.setBounds(285, 97, 135, 30);
		panel_1_1.add(txtPassword);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Finance f = new Finance();
					if(txtUserName.getText().equals("admin1") && txtPassword.getText().equals("123")) {
						lblAdmin.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\lzw_1\\OneDrive\\Desktop\\Assignment\\Programming II\\Assignment  3\\Logo\\boy.jpg").getImage().getScaledInstance(115, 107, Image.SCALE_DEFAULT)));
						JOptionPane.showMessageDialog(null, "Login Successful");
						f.setModalExclusionType(null);
						f.setVisible(true);
					}
					else if(txtUserName.getText().equals("admin2") && txtPassword.getText().equals("abc")) {
						lblAdmin.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\lzw_1\\OneDrive\\Desktop\\Assignment\\Programming II\\Assignment  3\\Logo\\girl.png").getImage().getScaledInstance(115, 107, Image.SCALE_DEFAULT)));
						JOptionPane.showMessageDialog(null, "Login Successful");
						f.setModalExclusionType(null);
						f.setVisible(true);
					}
					else {
						JOptionPane.showMessageDialog(null, "Login Unsuccessful");
						txtUserName.setText("");
						txtPassword.setText("");
						
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter the username and password");
				}
			}
		});
		btnLogin.setFont(new Font("Goudy Stout", Font.PLAIN, 15));
		btnLogin.setBackground(new Color(204, 255, 255));
		btnLogin.setBounds(30, 188, 150, 48);
		panel_1_1.add(btnLogin);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Admin Login Page", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Goudy Stout", Font.PLAIN, 15));
		btnExit.setBackground(new Color(204, 255, 255));
		btnExit.setBounds(270, 188, 150, 48);
		panel_1_1.add(btnExit);
	}

}
