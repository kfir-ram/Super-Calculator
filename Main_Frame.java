package UI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Window.Type;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Frame;

public class Main_Frame {

	private JFrame frame;
	private JTextField txtSuperCalculator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Frame window = new Main_Frame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main_Frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		txtSuperCalculator = new JTextField();
		txtSuperCalculator.setText("Super Calculator - The Most Amazing Calculator In the World");
		txtSuperCalculator.setFont(new Font("NanumMyeongjo", Font.BOLD, 14));
		txtSuperCalculator.setBounds(10, 10, 445, 20);
		panel.add(txtSuperCalculator);
		txtSuperCalculator.setColumns(10);
		
		JButton btnBasicCalculator = new JButton("Basic Calculator");
		btnBasicCalculator.setFont(new Font("NanumMyeongjo", Font.BOLD, 16));
		btnBasicCalculator.setBounds(10, 50, 200, 50);
		panel.add(btnBasicCalculator);
		
		JButton btnAdvancedCalculator = new JButton("Advanced Calculator");
		btnAdvancedCalculator.setFont(new Font("NanumMyeongjo", Font.BOLD, 16));
		btnAdvancedCalculator.setBounds(10, 110, 200, 50);
		panel.add(btnAdvancedCalculator);
		
		JButton btnBaseCalculator = new JButton("Base Calculator");
		btnBaseCalculator.setFont(new Font("NanumMyeongjo", Font.BOLD, 16));
		btnBaseCalculator.setBounds(10, 170, 200, 50);
		panel.add(btnBaseCalculator);

		JButton btnFunctionCalculator = new JButton("Function Calculator");
		btnFunctionCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Function_Calculator_Frame function_frame = new Function_Calculator_Frame();
				function_frame.Function_Frame();
				
			}
		});
		btnFunctionCalculator.setFont(new Font("NanumMyeongjo", Font.BOLD, 16));
		btnFunctionCalculator.setBounds(10, 230, 200, 50);
		panel.add(btnFunctionCalculator);
		
		JButton btnFibonacciSeries = new JButton("Fibonacci Series");
		btnFibonacciSeries.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fibonacci_Series_Frame fib_frame = new Fibonacci_Series_Frame();
				fib_frame.Fib_Frame();
				//close();
				
			}
		});
		btnFibonacciSeries.setFont(new Font("NanumMyeongjo", Font.BOLD, 16));
		btnFibonacciSeries.setBounds(10, 290, 200, 50);
		panel.add(btnFibonacciSeries);
		
		JButton btnPrimeFactorization = new JButton("Prime Factorization");
		btnPrimeFactorization.setFont(new Font("NanumMyeongjo", Font.BOLD, 16));
		btnPrimeFactorization.setBounds(10, 350, 200, 50);
		panel.add(btnPrimeFactorization);
		
		
		JTextArea txtrMenu = new JTextArea();
		txtrMenu.setText("Basic calculator - you can use the"
				+ "\nbasic operators \"+\", \"-\", \"*\" and \"/\"."
				+ "\n\n\nAdvanced Calculator - you can use the"
				+ "\nadvanced operators \"power\", \"root\","
				+ "\n\"factorial\", \"e\" and \"Pi\"."
				+ "\n\nBase calculator - converting a number"
				+ "\nto different bases such as Base2,"
				+ "\nBase4,Base 8, Base10 and Base16."
				+ "\n\nFunction Calculator - solve a function"
				+ "\nof up to X^3, Min/Max & intersection"
				+ "\npoints, Limit Calculations."
				+ "\n\nFibonacci Series - gives you the"
				+ "\nvalue of the N's index in"
				+ "\nfibonacci series."
				+ "\n\nPrime Factorization - gives you the"
				+ "\nprimes factorization of a given number.");
		txtrMenu.setBounds(230, 50, 250, 350);
		panel.add(txtrMenu);
		

		
	}
	
	public void close() {
		//WindowEvent winClosingEvent = new WindowEvent(this.WindowEvent.WINDOW_CLOSING);
	}
}