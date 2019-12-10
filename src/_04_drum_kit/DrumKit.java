package _04_drum_kit;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrumKit implements MouseListener {

	JLabel drumLabelWithImage;

	public void run() throws MalformedURLException {

		// 1. Make a JFrame variable and initialize it using "new JFrame()"
		JFrame chirren = new JFrame();
		// 2. Make the frame visible and
		// set its default close operation to JFrame.EXIT_ON_CLOSE
			chirren.setVisible(true);
			chirren.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 3. Set the size of the frame
			chirren.setPreferredSize(new Dimension(5000,5000));
		// 4. Set the title of the frame
			chirren.setTitle("Be careful");
		// 5. Make a JPanel variable and initialize it using "new JPanel().
			 JPanel sodium = new JPanel();
		// 6. Add the panel to the frame. (The panel is invisible.)
			chirren.add(sodium);
		// 7. Download an image of a drum from the Internet. Drop it into your
		// Eclipse project under "default package".
			
		// 8. Put the name of your image file in a String variable.
			 String drums = "data:image/jpeg;base64,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";
		// 9. Edit the next line to use your String variable
		 drumLabelWithImage = createLabelImage(drums);
			 
		// 10. Add the image to the panel
		 	sodium.add(drumLabelWithImage);
		// 11. Set the layout of the panel to "new GridLayout()"
		 	sodium.setLayout(new GridLayout());
		 	
		// 12. call the pack() method on the frame. Run your program. Do you see
		// your drum image?
		 	chirren.pack();
		// 13. add this mouse listener to drumLabelWithImage
		 	drumLabelWithImage.addMouseListener(this);
		// 18. Add more images to make a drumkit. Remember to add this mouse
		// listener to each one.

	}

	public void mouseClicked(MouseEvent e) {
		// 14. Print "mouse clicked" to the console. Run your program and watch
		// the console to see when this is printed.

		JLabel drumClicked = (JLabel) e.getSource(); // This line gets the label
														// that the mouse
														// clicked on

		// 15. Download a drum sound and drop it into your "default package".
		// You can find it on freesound.org. To download it, log in as
		// leagueofamazing/code4life.

		// 16. If they clicked on the drumImage...

		// 17. ...use the playSound method to play a drum sound. Test to see if
		// it works

	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

		
	}


