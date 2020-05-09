package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		addNumbers.addActionListener(potatoes -> {
		Random A = new Random();
		Random B = new Random();
		int a = A.nextInt(10);
		int b = B.nextInt(10);
		int c = a + b;
		JOptionPane.showMessageDialog(null, "" + a + "+" + b + "=" + c);
		}
		);
		randNumber.addActionListener(potatoes -> {
		Random a = new Random();
		JOptionPane.showMessageDialog(null, "Your random number is " + a.nextInt(200));
		});
		tellAJoke.addActionListener(potatoes -> {
		JOptionPane.showMessageDialog(null, "what do you call a group of rabbits walking"
				+ " backwards? a receeding hareline!");
		});
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
