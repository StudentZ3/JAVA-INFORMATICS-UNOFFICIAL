package eco;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

@SuppressWarnings("serial")
public class Garden extends JFrame {

	private JPanel contentPane;
	private JLabel stepLabel;
	private JTextArea instructionLabel;
	private JButton nextButton;
	private JButton learnMoreButton;
	private int stepCount;

	public Garden() {
		// Set up the frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 742, 550);
		
		// Create the content pane
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(255,255,255));
		
		// Create the step label
		stepLabel = new JLabel("Step 1. Define your space");
		stepLabel.setBounds(280, 30, 350, 60);
		stepLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		stepLabel.setForeground(new Color(110,70,60));
		contentPane.add(stepLabel);
		
		// Create the instruction label
		instructionLabel = new JTextArea("Assess your available space and determine the garden size you want. The size and environmental conditions of your space will dictate the plants and layout you can have.");
		instructionLabel.setBounds(50, 120, 600, 300);
		instructionLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		instructionLabel.setLineWrap(true); // Set text to wrap
		instructionLabel.setWrapStyleWord(true); // Wrap at word boundaries
		contentPane.add(instructionLabel);
				
		// Create the next button
		nextButton = new JButton("Next Step");
		nextButton.setBounds(50, 430, 150, 50);
		nextButton.setForeground(new Color(110,70,60));
		nextButton.setBackground(new Color(255,255,255));
		nextButton.setBorder(new LineBorder(new Color(110,70,60),2));
		nextButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		nextButton.addActionListener(event -> {
			stepCount = (stepCount + 1) % 7;
			updateInstruction();
		});
		contentPane.add(nextButton);
		
		// Create the learn more button
		learnMoreButton = new JButton("Learn More");
		learnMoreButton.setBounds(520, 430, 150, 50);
		learnMoreButton.setForeground(new Color(110,70,60));
		learnMoreButton.setBackground(new Color(255,255,255));
		learnMoreButton.setBorder(new LineBorder(new Color(110,70,60),2));
		learnMoreButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		learnMoreButton.addActionListener(event -> {
			try {
				java.awt.Desktop.getDesktop().browse(new java.net.URI("https://medium.com/land-and-ladle/7-steps-to-an-easy-urban-garden-4b1d25b5c2b1"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		contentPane.add(learnMoreButton);
		
		// Initialize the step count
		stepCount = 0;
	}
	
	private void updateInstruction() {
		switch (stepCount) {
			case 0:
				stepLabel.setText("Step 1. Define your space.");
				instructionLabel.setText("Assess your available space and determine the garden size you want. The size and environmental conditions of your space will dictate the plants and layout you can have.");
				break;
			case 1:
				stepLabel.setText("Step 2. Pick your pot.");
				instructionLabel.setText("If you can't have gardening beds, use potted plants. When choosing pots, consider how many plants you want in each, what type of plants you want, and the number of pots. Combine tall and short plants to optimize space and humidity. Be imaginative with your pots, using hanging ones, trellises, and windowsills to add visual appeal.");
				break;
			case 2:
				stepLabel.setText("Step 3. Choose your plants.");
				instructionLabel.setText("Creating an urban garden is exciting. Choose what you love but keep these guidelines in mind. Plant only what you have space for and what you really want to eat. Start small and don't overcrowd your plants. Many urban gardens have themed components like favorite meals. While aesthetics matter, the main thing is the use you get from your investment.");
				break;
			case 3:
				stepLabel.setText("Step 4. Pot your plant.");
				instructionLabel.setText(" First, make sure your pots have holes in the bottom for drainage. Use potting soil with the right nutrients and organic fertilizer to enrich it. Potted plants require less maintenance and offer mobility. This allows you to move them around to adjust sunlight exposure.");
				break;
			case 4:
				stepLabel.setText("Step 5. Seed or seedling?");
				instructionLabel.setText("Starting from seed takes longer, and there's a higher risk of failure. Seedlings are recommended, but growing plants from scratch can be fun too. Both options have their benefits.");
				break;
			case 5:
				stepLabel.setText("Step 6. Water’s where it’s at.");
				instructionLabel.setText("You can test your gardening skills with manual or automatic watering. Advanced watering systems are available, but they're expensive. Manual watering is cheaper. Water level monitors are available if you're worried about over or under-watering.");
				break;
			case 6:
				stepLabel.setText("Step 7. Have fun.");
				instructionLabel.setText("Create an urban garden that is your oasis. It's an opportunity to enhance your living space, develop new skills and grow fresh produce. Mistakes will happen, but you can always try again next season.");
				break;
		}
	}
}
