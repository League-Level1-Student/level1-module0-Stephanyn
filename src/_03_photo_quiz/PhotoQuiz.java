package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// â€œCopy Image Addressâ€�)
		String snail = "https://i.pinimg.com/originals/76/ef/fc/76effc449bbe559f7f6f41b079d3edb1.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component image = createImage(snail);
		// 3. use the "createImage()" method below to initialize your Component
			
		// 4. add the image to the quiz window
			quizWindow.add(image);
		// 5. call the pack() method on the quiz window
			quizWindow.pack();
		// 6. ask a question that relates to the image
			JLabel Q = new JLabel();
			String REEEE = JOptionPane.showInputDialog("Where is the snail from?");
			
		// 7. print "CORRECT" if the user gave the right answer
				if (REEEE. equals("adventure time")) {
					JOptionPane.showMessageDialog(image, "CORRECT!");
				}else {
					JOptionPane.showMessageDialog(image, "INCORRECT.");
				}
		// 8. print "INCORRECT" if the answer is wrong
				
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 1//
				quizWindow.remove(image);
		// 10. find another image and create it (might take more than one line
		// of code)
				String pig = "https://cdn140.picsart.com/265624933007211.png?r1024x1024";
				Component pork = createImage(pig);
				quizWindow.add(pork);
				quizWindow.pack();
				JLabel animal =  new JLabel();
				String bacon = JOptionPane.showInputDialog("Where is this character from?");
				if (bacon. equals("gravity falls")) {
					JOptionPane.showMessageDialog(pork, "CORRECT!");
				}else {
					JOptionPane.showMessageDialog(pork, "INCORRECT.");
				}
		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
