package vipul;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Main {
	private static boolean clicked = false;
	private static Scroll scroll;
	public static void main(String[] args) {
		JFrame frame = new JFrame("Scroller");
		frame.setSize(200, 200);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		JButton button = new JButton("Start");
		button.setBounds(50, 60, 100, 50);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked called");
				if(clicked){
					clicked = false;
					button.setText("Start");
					scroll.stop();
				} else{
					clicked = true;
					button.setText("Stop");
					scroll = new Scroll();
					scroll.start();
				}
			}
		});
		frame.add(button);
	}

}
