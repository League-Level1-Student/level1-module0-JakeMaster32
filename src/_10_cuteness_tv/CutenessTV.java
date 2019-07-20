package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JButton button1 = new JButton("Ducks");
	JButton button2 = new JButton("Frog");
	JButton button3 = new JButton("Unicorns");

	public static void main(String[] args) {
		CutenessTV cute = new CutenessTV();
		cute.GUI();
	}

	public void GUI() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(button1)) {

			playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");

		}
		if (e.getSource().equals(button2)) {
			playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
		}
		if (e.getSource().equals(button3)) {
			playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
		}
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI(videoID);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
