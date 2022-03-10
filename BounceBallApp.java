package week23_bouncyBallGame_MANYBalls_problem;
import javax.swing.*;
public class BounceBallApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.add(new BallControl());
		frame.setTitle("Bouncy");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
