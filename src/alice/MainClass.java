package alice;

import javax.swing.JFrame;
import bob.BobPanel;
public class MainClass{

	public static void main(String[] args) {
		AlicePanel aliceAction = new AlicePanel();
		aliceAction.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aliceAction.setSize(400, 700);
		aliceAction.setLocation(0, 0);
		aliceAction.setResizable(false);
		aliceAction.setVisible(true);
		
		BobPanel bobAction = new BobPanel();
		bobAction.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bobAction.setSize(400, 700);
		bobAction.setLocation(600, 0);
		bobAction.setResizable(false);
		bobAction.setVisible(true);
		aliceAction.setSize(500, 700);
		aliceAction.setLocation(0, 0);
		aliceAction.setResizable(false);
		aliceAction.setVisible(true);
	}
	
}
