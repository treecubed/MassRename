package MassRename;

import java.awt.BorderLayout;

import javax.swing.*;

public class Main {

	public void start(){
		JFrame frame = new JFrame("MassRename");
		
		final JTextArea text1 = new JTextArea();
		final JTextArea text2 = new JTextArea();
		text1.append("Text 1.");
		text2.append("Text 2.               ");
		
		frame.getContentPane().add(
				new JScrollPane (text1),
				BorderLayout.WEST);
		frame.getContentPane().add(
				new JScrollPane (text2),
				BorderLayout.EAST);

		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		m.start();
	}

}
