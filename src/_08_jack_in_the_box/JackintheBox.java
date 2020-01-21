package _08_jack_in_the_box;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JackintheBox {
	public void Jack() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		button.setText("Surprise!!!");
			frame.add(button);
			frame.pack();
			button.addActionListener(this);
		

	
	}	
		int clicked = Integer.parseInt("button");
	}
