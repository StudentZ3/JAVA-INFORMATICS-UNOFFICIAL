package eco;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
@SuppressWarnings("serial")
public class Initiatives extends JFrame {

	private JPanel contentPane;
	public Initiatives() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 742, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		getContentPane().setBackground(Color.white);
		ImageIcon img3 = new ImageIcon("C:/...file path.../third window.jpg");
		Image image3 = img3.getImage();
		Image temp_image3 = image3.getScaledInstance(760,530,Image.SCALE_DEFAULT);
		img3.setImage(temp_image3);
		JLabel background3 = new JLabel ("", img3, JLabel.CENTER);
		background3.setBounds(-5,-20,740,530);
		contentPane.add(background3);
		contentPane.revalidate();
		contentPane.repaint();
		contentPane.setVisible(true);
		
		ImageIcon arrow = new ImageIcon("C:/...file path.../arrow.jpg");
		
		ImageIcon img31 = new ImageIcon("C:/...file path.../third.first window.jpg");
		Image image31 = img31.getImage();
		Image temp_image31 = image31.getScaledInstance(730,530,Image.SCALE_DEFAULT);
		img31.setImage(temp_image31);
		
		ImageIcon img32 = new ImageIcon("C:/...file path.../third.second window.jpg");
		Image image32 = img32.getImage();
		Image temp_image32 = image32.getScaledInstance(730,530,Image.SCALE_DEFAULT);
		img32.setImage(temp_image32);
		
		ImageIcon img33 = new ImageIcon("C:/...file path.../third.third window.jpg");
		Image image33 = img33.getImage();
		Image temp_image33 = image33.getScaledInstance(730,520,Image.SCALE_DEFAULT);
		img33.setImage(temp_image33);
		
		JLabel link12 = new JLabel("https://www.greenmatch.co.uk/?page_id=64167&preview=true#Projects");
		
		JButton backButton = new JButton("BACK");
		backButton.setFont(new Font("Tahoma", Font.ITALIC, 18));
		
		JButton arrowButton1 = new JButton(arrow);
		JButton arrowButton2 = new JButton(arrow);
		JButton arrowButton3 = new JButton(arrow);
		
		arrowButton1.setBounds(525, 240, 140, 55);
		arrowButton1.setVisible(true);
		background3.add(arrowButton1);
		arrowButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				arrowButton1.setVisible(false);
				arrowButton2.setVisible(false);
				arrowButton3.setVisible(false);
				background3.setIcon(img31);
		        backButton.setBounds(235, 490, 120, 45);
		        backButton.setVisible(true);
				background3.add(backButton);
				backButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						arrowButton1.setVisible(true);
						arrowButton2.setVisible(true);
						arrowButton3.setVisible(true);
						backButton.setVisible(false);
						link12.setVisible(false);
						background3.setIcon(img3);
					}
				});
			}
		});
		arrowButton2.setBounds(330, 300, 140, 55);
		arrowButton2.setVisible(true);
		background3.add(arrowButton2);
		arrowButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				arrowButton1.setVisible(false);
				arrowButton2.setVisible(false);
				arrowButton3.setVisible(false);
				background3.setIcon(img32);
				backButton.setBounds(0, 490, 120, 45);
		        backButton.setVisible(true);
				background3.add(backButton);
				backButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						arrowButton1.setVisible(true);
						arrowButton2.setVisible(true);
						arrowButton3.setVisible(true);
						backButton.setVisible(false);
						link12.setVisible(false);
						background3.setIcon(img3);
					}
				});
			}
		});
		arrowButton3.setBounds(390, 360, 140, 55);
		arrowButton3.setVisible(true);
		background3.add(arrowButton3);
		arrowButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				arrowButton1.setVisible(false);
				arrowButton2.setVisible(false);
				arrowButton3.setVisible(false);
				link12.setFont(new Font("Tahoma", Font.PLAIN, 18));
				link12.setBounds(360, 470, 350, 30);
				link12.addMouseListener(new MouseAdapter() { 
					public void mouseEntered(MouseEvent me) { 
						link12.setForeground(new Color(65,190,255));
					}
					public void mouseExited(MouseEvent me) {
						link12.setForeground(new Color(0,0,0));
					}
			        public void mouseClicked(MouseEvent me) { 
			             Desktop d = Desktop.getDesktop();
				         try {
					         d.browse(new URI("https://www.greenmatch.co.uk/?page_id=64167&preview=true#Projects"));
				         } catch (IOException e1) {
					         e1.printStackTrace();
				         } catch (URISyntaxException e1) {
					         e1.printStackTrace();
				         }   
			          } 
			    }); 
				background3.add(link12);
				link12.setVisible(true);
				
				background3.setIcon(img33);
				backButton.setBounds(430, 290, 120, 45);
		        backButton.setVisible(true);
				background3.add(backButton);
				backButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						arrowButton1.setVisible(true);
						arrowButton2.setVisible(true);
						arrowButton3.setVisible(true);
						backButton.setVisible(false);
						link12.setVisible(false);
						background3.setIcon(img3);
					}
				});
			}
		});
	}
}
