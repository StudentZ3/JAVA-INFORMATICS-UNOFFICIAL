package eco;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class RRR extends JFrame {

    private  String[] ways = { "Way 1", "Way 2", "Way 3", "Way 4", "Way 5", "Way 6" };
    private  ImageIcon[] images = { new ImageIcon("way1.png"), new ImageIcon("way2.png"), new ImageIcon("way3.png"), new ImageIcon("way4.png"), new ImageIcon("way5.png"), new ImageIcon("way6.png") };
    private  String[] texts = { "Text for Way 1", "Text for Way 2", "Text for Way 3", "Text for Way 4", "Text for Way 5", "Text for Way 6" };
    
    private JPanel contentPane;
    private JLabel howToLabel;
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
        
        howToLabel = new JLabel("How to?");
        howToLabel.setBounds(50, 50, 100, 30);
        contentPane.add(howToLabel);
        
        wayLabel = new JLabel(images[0]);
        wayLabel.setBounds(50, 100, 400, 300);
        contentPane.add(wayLabel);
        
        wayTextArea = new JTextArea(texts[0]);
        wayTextArea.setBounds(500, 250, 200, 150);
        wayTextArea.setLineWrap(true);
        wayTextArea.setWrapStyleWord(true);
        wayTextArea.setEditable(false);
        contentPane.add(wayTextArea);
        
        nextButton = new JButton("Next Way");
        nextButton.setBounds(500, 200, 100, 30);
        nextButton.addActionListener(e -> {
            currentIndex = (currentIndex + 1) % ways.length;
            wayLabel.setIcon(images[currentIndex]);
            wayTextArea.setText(texts[currentIndex]);
        });
        contentPane.add(nextButton);
    }
}
