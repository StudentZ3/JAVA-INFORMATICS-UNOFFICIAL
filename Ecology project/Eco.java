package eco;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
@SuppressWarnings("serial")
public class Eco extends JFrame {

	private JPanel contentPane;
	public Eco() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 742, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		getContentPane().setBackground(Color.white);
		ImageIcon img2 = new ImageIcon("C:/...file path.../second window.jpg");
		Image image2 = img2.getImage();
		Image temp_image2 = image2.getScaledInstance(795,530,Image.SCALE_DEFAULT);
		img2 = new ImageIcon(temp_image2);
		JLabel background2 = new JLabel ("", img2, JLabel.CENTER);
		background2.setBounds(-15,-20,740,530);
		contentPane.add(background2);
		contentPane.revalidate();
		contentPane.repaint();
		contentPane.setVisible(true);
		
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
}
