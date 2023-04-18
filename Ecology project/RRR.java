package eco;
import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;

@SuppressWarnings("serial")
public class RRR extends JFrame {

	private  String[] ways = { "Way 1", "Way 2", "Way 3", "Way 4", "Way 5", "Way 6" };
    private  String[] texts = { "One way to reduce is to reuse. Instead of using plastic bags, bring reusable bags and Tupperware when going shopping or packing food or leftovers.", 
    		"Shop responsibly. When going out, purchase items that are easy to recycle. Avoid items that are individually wrapped or in single servings. Buying in bulk helps to reduce waste.", 
    		"Composting is your friend. Create a compost bin and throw food scraps and various yard waste into your compost bin. You can use leaves and yard trimmings to supplement the compost.", 
    		"Start recycling. Did you know that you can save 9 cubic yards of landfill space by recycling only one ton of cardboard? Over 87% of citizens in the U.S. are able to have their recycling picked up curbside. Utilizing trash removal and recycling services can help you to manage waste effectively.", 
    		"Go paperless. Most stores now offer digital versions of receipts, and you can also receive bills online or on your smart device rather than in the mail. The average person receives around 30 pounds of junk mail every year; reducing this junk mail can make a significant impact.", 
    		"Buy second-hand. Textile waste is rampant in the United States, and purchasing your clothing from second-hand stores will provide you high quality, low-cost clothing items that benefit both you and the environment." };
    
    private JPanel contentPane;
    private JLabel wayLabel;
    private JTextArea wayTextArea;
    private JButton nextButton;
    private int currentIndex = 0;

    public RRR() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 742, 550);
        
        contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);
        contentPane.setBackground(new Color(255,255,255));
        
        JLabel picLabel = new JLabel(new ImageIcon(new ImageIcon(
        		"C:/...file path.../eco_kids.jpg").getImage().getScaledInstance(400, 300, Image.SCALE_DEFAULT)));
        picLabel.setBounds(10, 20, 450, 300);
        contentPane.add(picLabel);
        
        wayLabel = new JLabel(ways[0]);
        wayLabel.setBounds(530, 260, 200, 100);
        wayLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        wayLabel.setForeground(new Color(110,70,60));
        contentPane.add(wayLabel);
        
        wayTextArea = new JTextArea(texts[0]);
        wayTextArea.setFont(new Font("Tahoma", Font.PLAIN, 16));
        wayTextArea.setBounds(35, 340, 600, 100);
        wayTextArea.setLineWrap(true);
        wayTextArea.setWrapStyleWord(true);
        wayTextArea.setEditable(false);
        contentPane.add(wayTextArea);
        
        nextButton = new JButton("Next Way");
        nextButton.setBounds(280, 440, 150, 50);
        nextButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        nextButton.setBackground(new Color(255,255,255));
        nextButton.setForeground(new Color(110,70,60));
        nextButton.setBorder(new LineBorder(new Color(110,70,60),2));
        nextButton.addActionListener(e -> {
            currentIndex = (currentIndex + 1) % ways.length;
            wayLabel.setText(ways[currentIndex]);
            wayTextArea.setText(texts[currentIndex]);
        });
        contentPane.add(nextButton);
    }
}
