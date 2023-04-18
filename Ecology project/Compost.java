package eco;
import java.awt.Image;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class Compost extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JLabel imageLabel;
    private JLabel stepLabel;
    private JButton nextButton;
    private JButton learnMoreButton;

    private String[] steps = { "Step 1: Combine Green and Brown Materials", "Step 2: Water Your Compost Pile", "Step 3: Stir Your Compost Pile",
            "Step 4: Feed Your Garden with Compost" };
    private String[] images = { "/Users/vicky/Desktop/step1.jpg", "/Users/vicky/Desktop/step2.jpg", "/Users/vicky/Desktop/step3.jpg", "/Users/vicky/Desktop/step4.jpg" };
    private int currentStep = 0;

    public Compost() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 742, 550);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Image Label
        ImageIcon imageIcon = new ImageIcon(images[currentStep]);
        Image image = imageIcon.getImage().getScaledInstance(350, 300, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(image);
        imageLabel = new JLabel(imageIcon);
        imageLabel.setBounds(25, 25, 350, 300);
        contentPane.add(imageLabel);

        // Step Label
        stepLabel = new JLabel(steps[currentStep]);
        stepLabel.setBounds(400, 25, 300, 50);
        contentPane.add(stepLabel);

        // Next Button
        nextButton = new JButton("Next Step");
        nextButton.setBounds(400, 100, 200, 50);
        nextButton.addActionListener(this);
        contentPane.add(nextButton);

        // Learn More Button
        learnMoreButton = new JButton("Learn More");
        learnMoreButton.setBounds(400, 175, 200, 50);
        learnMoreButton.addActionListener(this);
        contentPane.add(learnMoreButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nextButton) {
            currentStep = (currentStep + 1) % steps.length;
            ImageIcon imageIcon = new ImageIcon(images[currentStep]);
            Image image = imageIcon.getImage().getScaledInstance(350, 300, Image.SCALE_SMOOTH);
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
