import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public void showButton () {
		System.out.println("Button Clicked");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		 JButton button = new JButton();
		    frame.add(button);
		    frame.pack();
		 button.addActionListener(this);
		 int rand = new Random().nextInt(5);		
		if(rand == 0) {
			JOptionPane.showMessageDialog(null," Con Mazola nunca estas sola. ");
		}else if (rand == 1) {
			JOptionPane.showMessageDialog(null, "If you're feeling upsetti or regretti eat spagetti. ");
		}else if (rand == 2) {
			JOptionPane.showMessageDialog(null, "You wot m8?!");
		}else if (rand == 3) {
			JOptionPane.showMessageDialog(null, "Having anxiety is like perpetually hearing the boss/enemy music but never seeing the threat. ");
		}else if (rand == 4) {
			JOptionPane.showMessageDialog(null, "Cobra chickens are scary");
		}
		
		
		 
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo!!");
	}
}

