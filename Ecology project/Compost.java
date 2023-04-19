package eco;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;
import javax.swing.border.*;

@SuppressWarnings("serial")
public class Compost extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JLabel imageLabel;
    private JLabel stepLabel;
    private JButton nextButton;
    private JButton learnMoreButton;

    private String[] steps = { "Step 1: Combine Green and Brown Materials", "Step 2: Water Your Compost Pile", "Step 3: Stir Your Compost Pile",
            "Step 4: Feed Your Garden with Compost" };
    private String[] images = { "C:/1 ZZB TEMP/jSQL INFORMATICS/Group project/compost1.jpg", 
    		"C:/1 ZZB TEMP/jSQL INFORMATICS/Group project/compost2.jpg",
    		"C:/1 ZZB TEMP/jSQL INFORMATICS/Group project/compost3.jpg", 
    		"C:/1 ZZB TEMP/jSQL INFORMATICS/Group project/compost4.jpg" };
    private int currentStep = 0;

    public Compost() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 742, 550);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.setBackground(new Color(255,255,255));

        // Image Label
        ImageIcon imageIcon = new ImageIcon(images[currentStep]);
        Image image = imageIcon.getImage().getScaledInstance(300, 400, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(image);
        imageLabel = new JLabel(imageIcon);
        imageLabel.setBounds(200, 90, 300, 400);
        contentPane.add(imageLabel);

        // Step Label
        stepLabel = new JLabel(steps[currentStep]);
        stepLabel.setBounds(200, 15, 500, 50);
        stepLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		stepLabel.setForeground(new Color(110,70,60));
        contentPane.add(stepLabel);

        // Next Button
        nextButton = new JButton("Next Step");
        nextButton.setBounds(530, 440, 140, 50);
        nextButton.addActionListener(this);
        nextButton.setForeground(new Color(110,70,60));
		nextButton.setBackground(new Color(255,255,255));
		nextButton.setBorder(new LineBorder(new Color(110,70,60),2));
		nextButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        contentPane.add(nextButton);

        // Learn More Button
        learnMoreButton = new JButton("Learn More");
        learnMoreButton.setBounds(30, 440, 140, 50);
        learnMoreButton.addActionListener(this);
        learnMoreButton.setForeground(new Color(110,70,60));
        learnMoreButton.setBackground(new Color(255,255,255));
        learnMoreButton.setBorder(new LineBorder(new Color(110,70,60),2));
        learnMoreButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        contentPane.add(learnMoreButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nextButton) {
            currentStep = (currentStep + 1) % steps.length;
            ImageIcon imageIcon = new ImageIcon(images[currentStep]);
            Image image = imageIcon.getImage().getScaledInstance(300, 400, Image.SCALE_SMOOTH);
            imageIcon = new ImageIcon(image);
            imageLabel.setIcon(imageIcon);
            stepLabel.setText(steps[currentStep]);
        } else if (e.getSource() == learnMoreButton) {
            String url = "https://www.bhg.com/gardening/yard/compost/how-to-compost/";
            try {
				java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    }
}
