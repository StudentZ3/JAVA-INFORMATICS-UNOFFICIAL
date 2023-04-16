package eco;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;

public class ProjectsCopy3 extends JFrame {

	private JPanel contentPane;
	public ProjectsCopy3() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 742, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		contentPane.setSize(742,550);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		ImageIcon img = new ImageIcon("C:/...file path.../informatics leaf frame.jpg");
		Image image = img.getImage();
		Image temp_image = image.getScaledInstance(contentPane.getWidth(),contentPane.getHeight(),Image.SCALE_SMOOTH);
		img = new ImageIcon(temp_image);
		JLabel background = new JLabel ("", img, JLabel.CENTER);
		background.setBounds(0,0,725,510);
		add(background);
		
		JLabel instruction1 = new JLabel("Eco Tip of the Day");
		instruction1.setFont(new Font("Tahoma", Font.ITALIC, 20));
		instruction1.setBounds(510, 30, 200, 40);
		instruction1.setBorder(new LineBorder(new Color(255,255,255),2));
		background.add(instruction1);
		instruction1.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(140, 70, 550, 80);
		lblNewLabel.setBorder(new LineBorder(new Color(110,70,60),2));
		lblNewLabel.setForeground(new Color(110,70,60));
		background.add(lblNewLabel);
		lblNewLabel.setVisible(true);
		String eco_tip = " ";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecology_project_db", "root", "");
            Statement stmt = myCon.createStatement();
	        String s = "SELECT tip_text FROM eco_tips WHERE id = '";
	        Random ran = new Random();
	        int num = ran.nextInt(10)+1;
	        String n = Integer.toString(num);
	        String s1 = s.concat(n);
	        String s2 = s1.concat("'");
            ResultSet rs = stmt.executeQuery(s2);
            rs.next();
            eco_tip = rs.getString(1);
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		lblNewLabel.setText("  " + eco_tip);
		
		JLabel instruction2 = new JLabel("Health Tip of the Day");
		instruction2.setFont(new Font("Tahoma", Font.ITALIC, 20));
		instruction2.setBounds(37, 450, 250, 40);
		instruction2.setBorder(new LineBorder(new Color(255,255,255),2));
		background.add(instruction2);
		instruction2.setVisible(true);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(40, 370, 550, 80);
		lblNewLabel_1.setBorder(new LineBorder(new Color(110,70,60),2));
		lblNewLabel_1.setForeground(new Color(110,70,60));
		background.add(lblNewLabel_1);
		lblNewLabel_1.setVisible(true);
		String health_tip = " ";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecology_project_db", "root", "");
            Statement stmt = myCon.createStatement();
	        String s = "SELECT tip_text FROM health_tips WHERE id = '";
	        Random ran = new Random();
	        int num = ran.nextInt(10)+1;
	        String n = Integer.toString(num);
	        String s1 = s.concat(n);
	        String s2 = s1.concat("'");
            ResultSet rs = stmt.executeQuery(s2);
            rs.next();
            health_tip = rs.getString(1);
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		lblNewLabel_1.setText("  " + health_tip);
		
		JButton btnNewButton_1 = new JButton("Learn more about ecology");
		btnNewButton_1.setText("<html><center>"+"Learn more"+"<br>"+"about ecology"+"</center></html>");
		btnNewButton_1.setBackground(new Color(255,255,255));
		btnNewButton_1.setForeground(new Color(110,70,60));
		btnNewButton_1.setBorder(new LineBorder(new Color(110,70,60),2));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Eco frame1 = new Eco();
				frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				getContentPane().setBackground(Color.white);
				ImageIcon img2 = new ImageIcon("C:/...file path.../second window.jpg");
				Image image2 = img2.getImage();
				Image temp_image2 = image2.getScaledInstance(795,530,Image.SCALE_DEFAULT);
				img2 = new ImageIcon(temp_image2);
				JLabel background2 = new JLabel ("", img2, JLabel.CENTER);
				background2.setBounds(-15,-20,740,530);
				frame1.add(background2);
				frame1.revalidate();
				frame1.repaint();
				frame1.setVisible(true);
				
				JLabel link1 = new JLabel("www.globe.gov");
				link1.setFont(new Font("Tahoma", Font.PLAIN, 16));
				link1.setBounds(50, 360, 170, 30);
				link1.addMouseListener(new MouseAdapter() { 
					public void mouseEntered(MouseEvent me) { 
						link1.setForeground(new Color(65,190,255));
					}
					public void mouseExited(MouseEvent me) {
						link1.setForeground(new Color(0,0,0));
					}
			        public void mouseClicked(MouseEvent me) { 
			             Desktop d = Desktop.getDesktop();
				         try {
					         d.browse(new URI("www.globe.gov"));
				         } catch (IOException e1) {
					         e1.printStackTrace();
				         } catch (URISyntaxException e1) {
					         e1.printStackTrace();
				         }   
			          } 
			    }); 
				background2.add(link1);
				link1.setVisible(true);
				
				JLabel link2 = new JLabel("www.nwf.org");
				link2.setFont(new Font("Tahoma", Font.PLAIN, 16));
				link2.setBounds(50, 400, 170, 30);
				link2.addMouseListener(new MouseAdapter() { 
					public void mouseEntered(MouseEvent me) { 
						link2.setForeground(new Color(65,190,255));
					}
					public void mouseExited(MouseEvent me) {
						link2.setForeground(new Color(0,0,0));
					}
			        public void mouseClicked(MouseEvent me) { 
			             Desktop d = Desktop.getDesktop();
				         try {
					         d.browse(new URI("www.nwf.org"));
				         } catch (IOException e1) {
					         e1.printStackTrace();
				         } catch (URISyntaxException e1) {
					         e1.printStackTrace();
				         }   
			          } 
			    }); 
				background2.add(link2);
				link2.setVisible(true);
				
				JLabel link3 = new JLabel("www.earthforce.org");
				link3.setFont(new Font("Tahoma", Font.PLAIN, 16));
				link3.setBounds(50, 440, 170, 30);
				link3.addMouseListener(new MouseAdapter() { 
					public void mouseEntered(MouseEvent me) { 
						link3.setForeground(new Color(65,190,255));
					}
					public void mouseExited(MouseEvent me) {
						link3.setForeground(new Color(0,0,0));
					}
			        public void mouseClicked(MouseEvent me) { 
			             Desktop d = Desktop.getDesktop();
				         try {
					         d.browse(new URI("www.earthforce.org"));
				         } catch (IOException e1) {
					         e1.printStackTrace();
				         } catch (URISyntaxException e1) {
					         e1.printStackTrace();
				         }   
			          } 
			    }); 
				background2.add(link3);
				link3.setVisible(true);
				
				JLabel link4 = new JLabel("www.stroudcenter.org");
				link4.setFont(new Font("Tahoma", Font.PLAIN, 16));
				link4.setBounds(50, 480, 170, 30);
				link4.addMouseListener(new MouseAdapter() { 
					public void mouseEntered(MouseEvent me) { 
						link4.setForeground(new Color(65,190,255));
					}
					public void mouseExited(MouseEvent me) {
						link4.setForeground(new Color(0,0,0));
					}
			        public void mouseClicked(MouseEvent me) { 
			             Desktop d = Desktop.getDesktop();
				         try {
					         d.browse(new URI("www.stroudcenter.org"));
				         } catch (IOException e1) {
					         e1.printStackTrace();
				         } catch (URISyntaxException e1) {
					         e1.printStackTrace();
				         }   
			          } 
			    }); 
				background2.add(link4);
				link4.setVisible(true);
				
				JLabel link5 = new JLabel("www.montana.edu/wwwwet");
				link5.setFont(new Font("Tahoma", Font.PLAIN, 16));
				link5.setBounds(230, 360, 210, 30);
				link5.addMouseListener(new MouseAdapter() { 
					public void mouseEntered(MouseEvent me) { 
						link5.setForeground(new Color(65,190,255));
					}
					public void mouseExited(MouseEvent me) {
						link5.setForeground(new Color(0,0,0));
					}
			        public void mouseClicked(MouseEvent me) { 
			             Desktop d = Desktop.getDesktop();
				         try {
					         d.browse(new URI("www.montana.edu/wwwwet"));
				         } catch (IOException e1) {
					         e1.printStackTrace();
				         } catch (URISyntaxException e1) {
					         e1.printStackTrace();
				         }   
			          } 
			    }); 
				background2.add(link5);
				link5.setVisible(true);
				
				JLabel link6 = new JLabel("www.sciserv.org");
				link6.setFont(new Font("Tahoma", Font.PLAIN, 16));
				link6.setBounds(230, 400, 170, 30);
				link6.addMouseListener(new MouseAdapter() { 
					public void mouseEntered(MouseEvent me) { 
						link6.setForeground(new Color(65,190,255));
					}
					public void mouseExited(MouseEvent me) {
						link6.setForeground(new Color(0,0,0));
					}
			        public void mouseClicked(MouseEvent me) { 
			             Desktop d = Desktop.getDesktop();
				         try {
					         d.browse(new URI("www.sciserv.org"));
				         } catch (IOException e1) {
					         e1.printStackTrace();
				         } catch (URISyntaxException e1) {
					         e1.printStackTrace();
				         }   
			          } 
			    }); 
				background2.add(link6);
				link6.setVisible(true);
				
				JLabel link7 = new JLabel("www.nsta.org");
				link7.setFont(new Font("Tahoma", Font.PLAIN, 16));
				link7.setBounds(230, 440, 170, 30);
				link7.addMouseListener(new MouseAdapter() { 
					public void mouseEntered(MouseEvent me) { 
						link7.setForeground(new Color(65,190,255));
					}
					public void mouseExited(MouseEvent me) {
						link7.setForeground(new Color(0,0,0));
					}
			        public void mouseClicked(MouseEvent me) { 
			             Desktop d = Desktop.getDesktop();
				         try {
					         d.browse(new URI("www.nsta.org"));
				         } catch (IOException e1) {
					         e1.printStackTrace();
				         } catch (URISyntaxException e1) {
					         e1.printStackTrace();
				         }   
			          } 
			    }); 
				background2.add(link7);
				link7.setVisible(true);
				
				JLabel link8 = new JLabel("www.wef.org");
				link8.setFont(new Font("Tahoma", Font.PLAIN, 16));
				link8.setBounds(230, 480, 170, 30);
				link8.addMouseListener(new MouseAdapter() { 
					public void mouseEntered(MouseEvent me) { 
						link8.setForeground(new Color(65,190,255));
					}
					public void mouseExited(MouseEvent me) {
						link8.setForeground(new Color(0,0,0));
					}
			        public void mouseClicked(MouseEvent me) { 
			             Desktop d = Desktop.getDesktop();
				         try {
					         d.browse(new URI("www.wef.org"));
				         } catch (IOException e1) {
					         e1.printStackTrace();
				         } catch (URISyntaxException e1) {
					         e1.printStackTrace();
				         }   
			          } 
			    }); 
				background2.add(link8);
				link8.setVisible(true);
				
				JLabel link9 = new JLabel("www.eelink.net");
				link9.setFont(new Font("Tahoma", Font.PLAIN, 16));
				link9.setBounds(380, 400, 170, 30);
				link9.addMouseListener(new MouseAdapter() { 
					public void mouseEntered(MouseEvent me) { 
						link9.setForeground(new Color(65,190,255));
					}
					public void mouseExited(MouseEvent me) {
						link9.setForeground(new Color(0,0,0));
					}
			        public void mouseClicked(MouseEvent me) { 
			             Desktop d = Desktop.getDesktop();
				         try {
					         d.browse(new URI("www.eelink.net"));
				         } catch (IOException e1) {
					         e1.printStackTrace();
				         } catch (URISyntaxException e1) {
					         e1.printStackTrace();
				         }   
			          } 
			    }); 
				background2.add(link9);
				link9.setVisible(true);
							
				JLabel link10 = new JLabel("www.usda.gov");
				link10.setFont(new Font("Tahoma", Font.PLAIN, 16));
				link10.setBounds(380, 440, 170, 30);
				link10.addMouseListener(new MouseAdapter() { 
					public void mouseEntered(MouseEvent me) { 
						link10.setForeground(new Color(65,190,255));
					}
					public void mouseExited(MouseEvent me) {
						link10.setForeground(new Color(0,0,0));
					}
			        public void mouseClicked(MouseEvent me) { 
			             Desktop d = Desktop.getDesktop();
				         try {
					         d.browse(new URI("www.usda.gov"));
				         } catch (IOException e1) {
					         e1.printStackTrace();
				         } catch (URISyntaxException e1) {
					         e1.printStackTrace();
				         }   
			          } 
			    }); 
				background2.add(link10);
				link10.setVisible(true);
				
				JLabel link11 = new JLabel("www.epa.gov/enviroed");
				link11.setFont(new Font("Tahoma", Font.PLAIN, 16));
				link11.setBounds(370, 480, 190, 30);
				link11.addMouseListener(new MouseAdapter() { 
					public void mouseEntered(MouseEvent me) { 
						link11.setForeground(new Color(65,190,255));
					}
					public void mouseExited(MouseEvent me) {
						link11.setForeground(new Color(0,0,0));
					}
			        public void mouseClicked(MouseEvent me) { 
			             Desktop d = Desktop.getDesktop();
				         try {
					         d.browse(new URI("www.epa.gov/enviroed"));
				         } catch (IOException e1) {
					         e1.printStackTrace();
				         } catch (URISyntaxException e1) {
					         e1.printStackTrace();
				         }   
			          } 
			    }); 
				background2.add(link11);
				link11.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_1.setBounds(100, 170, 150, 80);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Join green initiatives");
		btnNewButton_2.setText("<html><center>"+"Join green"+"<br>"+"initiatives"+"</center></html>");
		btnNewButton_2.setBackground(new Color(255,255,255));
		btnNewButton_2.setForeground(new Color(110,70,60));
		btnNewButton_2.setBorder(new LineBorder(new Color(110,70,60),2));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Initiatives frame2 = new Initiatives();
				frame2.setVisible(true);
				frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_2.setBounds(290, 170, 150, 80);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("How to compost at home");
		btnNewButton_3.setText("<html><center>"+"How to compost"+"<br>"+"at home"+"</center></html>");
		btnNewButton_3.setBackground(new Color(255,255,255));
		btnNewButton_3.setForeground(new Color(110,70,60));
		btnNewButton_3.setBorder(new LineBorder(new Color(110,70,60),2));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Compost frame3 = new Compost();
				frame3.setVisible(true);
				frame3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_3.setBounds(480, 170, 150, 80);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("How to Reuse Reduce Recycle");
		btnNewButton_4.setText("<html><center>"+"How to Reuse"+"<br>"+"Reduce Recycle"+"</center></html>");
		btnNewButton_4.setBackground(new Color(255,255,255));
		btnNewButton_4.setForeground(new Color(110,70,60));
		btnNewButton_4.setBorder(new LineBorder(new Color(110,70,60),2));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RRR frame4 = new RRR();
				frame4.setVisible(true);
				frame4.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_4.setBounds(100, 270, 150, 80);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("How to grow an urban garden");
		btnNewButton_5.setText("<html><center>"+"How to grow"+"<br>"+"an urban garden"+"</center></html>");
		btnNewButton_5.setBackground(new Color(255,255,255));
		btnNewButton_5.setForeground(new Color(110,70,60));
		btnNewButton_5.setBorder(new LineBorder(new Color(110,70,60),2));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Garden frame5 = new Garden();
				frame5.setVisible(true);
				frame5.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_5.setBounds(290, 270, 150, 80);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Take a walk around Bulgaria");
		btnNewButton_6.setText("<html><center>"+"Take a walk"+"<br>"+"around Bulgaria"+"</center></html>");
		btnNewButton_6.setBackground(new Color(255,255,255));
		btnNewButton_6.setForeground(new Color(110,70,60));
		btnNewButton_6.setBorder(new LineBorder(new Color(110,70,60),2));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bulgaria frame6 = new Bulgaria();
				frame6.setVisible(true);
				frame6.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_6.setBounds(480, 270, 150, 80);
		contentPane.add(btnNewButton_6);
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProjectsCopy3 frame = new ProjectsCopy3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
