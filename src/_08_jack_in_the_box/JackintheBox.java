package _08_jack_in_the_box;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JackintheBox implements ActionListener {
	private int clicked = 0;
	public void Jack() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		button.setText("Surprise!!!");
			frame.add(button);
			frame.pack();
			button.addActionListener(this);
			
			
		}

	 
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			clicked ++;
		}
		
			// TODO Auto-generated method stub
			
		}
	
