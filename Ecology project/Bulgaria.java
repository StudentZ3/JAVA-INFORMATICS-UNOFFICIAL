package eco;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

@SuppressWarnings("serial")
public class Bulgaria extends JFrame {
	
	private JPanel contentPane;
	public Bulgaria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 742, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(255,255,255));
		
		JLabel lblNewLabel_6= new JLabel(new ImageIcon(new ImageIcon(
				"C:/...file path.../welcome to Bulgaria.png").getImage().getScaledInstance(506,150,Image.SCALE_DEFAULT)));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(68, 11, 506, 150);
		contentPane.add(lblNewLabel_6);

		JLabel lblNewLabel = new JLabel("Sofia: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(68, 438, 595, 39);
		contentPane.add(lblNewLabel);	

		JLabel lblNewLabel_1 = new JLabel("Burgas: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(68, 188, 595, 39);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Varna: ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(68, 238, 595, 39);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Veliko Tarnovo: ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(68, 288, 595, 39);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Gabrovo: ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(68, 338, 595, 39);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Plovdiv: ");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(68, 388, 595, 39);
		contentPane.add(lblNewLabel_5);

		JButton btnNewButton = new JButton("https://www.tripadvisor.com/Tourism-g616049-Burgas_Province-Vacations.html");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String url = "https://www.tripadvisor.com/Tourism-g616049-Burgas_Province-Vacations.html";
	            try {
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(212, 190, 429, 39);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("https://www.tripadvisor.com/Tourism-g295392-Varna_Varna_Province-Vacations.html");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String url = "https://www.tripadvisor.com/Tourism-g295392-Varna_Varna_Province-Vacations.html";
	            try {
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1.setBounds(212, 238, 429, 39);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("https://www.tripadvisor.com/Attractions-g303653-Activities-c63-Veliko_Tarnovo_Veliko_Tarnovo_Province.html");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String url = "https://www.tripadvisor.com/Attractions-g303653-Activities-c63-Veliko_Tarnovo_Veliko_Tarnovo_Province.html";
	            try {
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_2.setBounds(212, 288, 429, 39);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("https://www.tripadvisor.com/Tourism-g1157423-Gabrovo_Gabrovo_Province-Vacations.html");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String url = "https://www.tripadvisor.com/Tourism-g1157423-Gabrovo_Gabrovo_Province-Vacations.html";
	            try {
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_3.setBounds(212, 338, 429, 39);
		contentPane.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("https://www.tripadvisor.com/Tourism-g295391-Plovdiv_Plovdiv_Province-Vacations.html");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String url = "https://www.tripadvisor.com/Tourism-g295391-Plovdiv_Plovdiv_Province-Vacations.html";
	            try {
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_4.setBounds(212, 388, 429, 39);
		contentPane.add(btnNewButton_4);


		JButton btnNewButton_5 = new JButton("https://www.tripadvisor.com/Tourism-g294452-Sofia_Sofia_Region-Vacations.html");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String url = "https://www.tripadvisor.com/Tourism-g294452-Sofia_Sofia_Region-Vacations.html";
	            try {
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_5.setBounds(212, 438, 429, 39);
		contentPane.add(btnNewButton_5);
	}
}
