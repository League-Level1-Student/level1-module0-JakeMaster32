package _07_fortune_cookie;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	JFrame frame;

	public void showButton() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println("Button clicked");
		JButton button = new JButton();
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo!");
		int rand = new Random().nextInt(5);
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "You will buy new clothes");
		} else if (rand == 1) {
			JOptionPane.showMessageDialog(null, "Auggie will not make it to level 1");
		} else if (rand == 2) {
			JOptionPane.showMessageDialog(null, "Next time you look in the mirror you will see a monster");
		} else if (rand == 3) {
			JOptionPane.showMessageDialog(null, "Jake is Awesome");
		} else if (rand == 4) {
			JOptionPane.showMessageDialog(null, "You will breathe within the next 3 minutes");
		}
	}

}
