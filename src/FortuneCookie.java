import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FortuneCookie implements ActionListener {
	public void showButton () {
		System.out.println("Button Clicked");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		 JButton button = new JButton();
		    frame.add(button);
		    frame.pack();
		 button.addActionListener(this);
		 
		
		
		
		 
	}
}

public class FortuneCookieRunner {
    public static void main(String[] args) {
        new FortuneCookie().showButton();
  }
}