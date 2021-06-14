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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.SystemColor;

public class EventDescription extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EventDescription frame = new EventDescription();
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
	public EventDescription() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 666);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 250));
		panel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(102, 0, 204)));
		panel.setBounds(0, 0, 986, 629);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(102, 0, 204)));
		panel_1.setBackground(new Color(175, 238, 238));
		panel_1.setBounds(10, 10, 966, 80);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("EVENT DESCRIPTION");
		lblNewLabel.setFont(new Font("Castellar", Font.PLAIN, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 946, 60);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(102, 0, 204)));
		panel_1_1_1.setBackground(new Color(135, 206, 235));
		panel_1_1_1.setBounds(393, 100, 583, 519);
		panel.add(panel_1_1_1);
		
		JTextPane txtpnEventNameDate = new JTextPane();
		txtpnEventNameDate.setEditable(false);
		txtpnEventNameDate.setBackground(new Color(175, 238, 238));
		txtpnEventNameDate.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 17));
		txtpnEventNameDate.setText("Event Name: \r\n\r\nDate: \r\n\r\nTime: \r\n\r\nLocation: \r\n\r\nFees: \r\n\r\nMax Participant: \r\n\r\nPrize: \r\n\r\nEvent Website: ");
		txtpnEventNameDate.setBounds(10, 10, 563, 499);
		panel_1_1_1.add(txtpnEventNameDate);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(102, 0, 204)));
		panel_1_1.setBackground(new Color(135, 206, 250));
		panel_1_1.setBounds(10, 100, 373, 297);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("EVENT");
		lblNewLabel_1.setBackground(new Color(135, 206, 235));
		lblNewLabel_1.setFont(new Font("Modern No. 20", Font.ITALIC, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 10, 353, 51);
		panel_1_1.add(lblNewLabel_1);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(102, 0, 204)));
		panel_1_1_1_1.setBackground(new Color(175, 238, 238));
		panel_1_1_1_1.setBounds(10, 10, 353, 51);
		panel_1_1.add(panel_1_1_1_1);
		
		JComboBox eventComboBox = new JComboBox();
		eventComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(eventComboBox.getSelectedIndex() == 1) {
					txtpnEventNameDate.setText("Event Name: Youth Activism for Gender Equality in Nationality Laws "
							+ "\r\n\r\nDate: 1 June 2021"
							+ "\r\n\r\nTime: 5:00 p.m."
							+ "\r\n\r\nLocation: Online"
							+ "\r\n\r\nFees: RM3.50"
							+ "\r\n\r\nMax Participant: 250 participants"
							+ "\r\n\r\nPrize: You will get voucher worth RM50!"
							+ "\r\n\r\nEvent Website: https://www.unwomen.org/en/news/events/2021/06/event-youth-activism-for-gender-equality-in-nationality-laws"
							+ "\r\n\r\nIf you donate more than RM500, you can get a tax reduction of 5%!"
							+ "\r\nIf you donate more than RM2000, you can get a tax reduction of 10%!");
				}
				else if(eventComboBox.getSelectedIndex() == 2) {
					txtpnEventNameDate.setText("Event Name: Path to equal: New Indices on Gender Equality and Women's Empowerment"
							+ "\r\n\r\nDate: 15 July 2021"
							+ "\r\n\r\nTime:8:00 p.m."
							+ "\r\n\r\nLocation: Online, Zoom"
							+ "\r\n\r\nFees: RM2.50"
							+ "\r\n\r\nMax Participant: 150 participants"
							+ "\r\n\r\nPrize: You will get voucher worth RM150!"
							+ "\r\n\r\nEvent Website: https://www.unwomen.org/en/news/events/2021/07/event-path-to-equal-new-indices-on-gender-equality-and-womens-empowerment"
							+ "\r\n\r\nIf you donate more than RM500, you can get a tax reduction of 5%!"
							+ "\r\nIf you donate more than RM2000, you can get a tax reduction of 10%!");
				}
				else if(eventComboBox.getSelectedIndex() == 3) {
					txtpnEventNameDate.setText("Event Name: Generation Equality Forum: Paris"
							+ "\r\n\r\nDate: 30 June 2021 - 2 July 2021"
							+ "\r\n\r\nTime: 9:00 p.m."
							+ "\r\n\r\nLocation: Online"
							+ "\r\n\r\nFees: RM4.00"
							+ "\r\n\r\nMax Participant:  500 participants"
							+ "\r\n\r\nPrize: There is no prize for this event!"
							+ "\r\n\r\nEvent Website: https://forum.generationequality.org/home"
							+ "\r\n\r\nIf you donate more than RM500, you can get a tax reduction of 5%!"
							+ "\r\nIf you donate more than RM2000, you can get a tax reduction of 10%!");
				}
			}
		});
		eventComboBox.setBackground(new Color(175, 238, 238));
		eventComboBox.setFont(new Font("Lucida Handwriting", Font.PLAIN, 20));
		eventComboBox.setModel(new DefaultComboBoxModel(new String[] {"~ Select Event ~", "Event 1", "Event 2", "Event 3"}));
		eventComboBox.setBounds(10, 90, 353, 39);
		panel_1_1.add(eventComboBox);
		
		
		
		JButton btnNewButton = new JButton("REGISTER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registration p = new Registration();
				p.setModalExclusionType(null);
				p.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(175, 238, 238));
		btnNewButton.setBounds(20, 432, 353, 51);
		panel.add(btnNewButton);
		btnNewButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Event Description", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setBackground(new Color(175, 238, 238));
		btnExit.setBounds(20, 512, 353, 51);
		panel.add(btnExit);
		btnExit.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
	}
}
