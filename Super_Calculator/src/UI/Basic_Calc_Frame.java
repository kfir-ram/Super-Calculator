package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import Utility.Basic_Calculator;

public class Basic_Calc_Frame {

	private JFrame frame;
	private JTextField in_textField;
	

	/**
	 * Launch the application.
	 */
	public void Basic_Frame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Basic_Calc_Frame window = new Basic_Calc_Frame();
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
	public Basic_Calc_Frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 390, 374);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JTextPane out_textPane = new JTextPane();
		out_textPane.setBounds(10, 10, 380, 70);
		panel.add(out_textPane);
		

		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String t = in_textField.getText();
				in_textField.setText(t + "0");
			}
			});
		
		btn_0.setBounds(10, 290, 45, 30);
		panel.add(btn_0);
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String t = in_textField.getText();
				in_textField.setText(t + "1");
			}
			});
		
		btn_1.setBounds(10, 250, 45, 30);
		panel.add(btn_1);
		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String t = in_textField.getText();
				in_textField.setText(t + "4");
			}
			});
		btn_4.setBounds(10, 212, 45, 30);
		panel.add(btn_4);
		
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String t = in_textField.getText();
				in_textField.setText(t + "7");
			}
			});
		btn_7.setBounds(10, 170, 45, 30);
		panel.add(btn_7);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String t = in_textField.getText();
				in_textField.setText(t + "2");
			}
			});
		btn_2.setBounds(65, 250, 45, 30);
		panel.add(btn_2);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String t = in_textField.getText();
				in_textField.setText(t + "5");
			}
			});
		btn_5.setBounds(65, 210, 45, 30);
		panel.add(btn_5);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String t = in_textField.getText();
				in_textField.setText(t + "8");
			}
			});
		btn_8.setBounds(65, 170, 45, 30);
		panel.add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String t = in_textField.getText();
				in_textField.setText(t + "9");
			}
			});
		btn_9.setBounds(120, 170, 45, 30);
		panel.add(btn_9);
		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String t = in_textField.getText();
				in_textField.setText(t + "6");
			}
			});
		btn_6.setBounds(120, 210, 45, 30);
		panel.add(btn_6);
		
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String t = in_textField.getText();
				in_textField.setText(t + "3");
			}
			});
		btn_3.setBounds(120, 250, 45, 30);
		panel.add(btn_3);
		
		JButton dot_btn = new JButton(".");
		dot_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String t = in_textField.getText();
				in_textField.setText(t + ".");
			}
			});
		dot_btn.setBounds(65, 290, 45, 30);
		panel.add(dot_btn);
		
		JButton equal_btn = new JButton("=");
		equal_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String t = in_textField.getText();
				String temp = Basic_Calculator.Previous_parentheses(t);
				out_textPane.setText(temp);
				in_textField.setText("");
			}
			});
		equal_btn.setBounds(120, 290, 45, 30);
		panel.add(equal_btn);
		
		JButton del_btn = new JButton("DEL");
		del_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				StringBuffer t = new StringBuffer();
				t.append(in_textField.getText());
				t.deleteCharAt(t.length()-1);
				in_textField.setText(t.toString());
				
			}
			});
		del_btn.setBounds(210, 170, 80, 30);
		panel.add(del_btn);
		
		JButton AC_btn = new JButton("AC");
		AC_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				in_textField.setText("");
			}
			});
		AC_btn.setBounds(300, 170, 80, 30);
		panel.add(AC_btn);
		
		JButton btn_plus = new JButton("+");
		btn_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String t = in_textField.getText();
				in_textField.setText(t + " + ");
			}
			});
		btn_plus.setBounds(210, 210, 45, 30);
		panel.add(btn_plus);
		
		JButton btn_minus = new JButton("-");
		btn_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String t = in_textField.getText();
				in_textField.setText(t + " - ");
			}
			});
		btn_minus.setBounds(210, 250, 45, 30);
		panel.add(btn_minus);
		
		JButton btn_division = new JButton("/");
		btn_division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String t = in_textField.getText();
				in_textField.setText(t + " / ");
			}
			});
		btn_division.setBounds(270, 210, 45, 30);
		panel.add(btn_division);
		
		JButton btn_multiply = new JButton("*");
		btn_multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String t = in_textField.getText();
				in_textField.setText(t + " * ");
			}
			});
		btn_multiply.setBounds(270, 250, 45, 30);
		panel.add(btn_multiply);
		
		JButton btn_Rbrackets = new JButton(")");
		btn_Rbrackets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String t = in_textField.getText();
				in_textField.setText(t + " ) ");
			}
			});
		btn_Rbrackets.setBounds(330, 210, 45, 30);
		panel.add(btn_Rbrackets);
		
		JButton btn_Lbrackets = new JButton("(");
		btn_Lbrackets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String t = in_textField.getText();
				in_textField.setText(t + " ( ");
			}
			});
		btn_Lbrackets.setBounds(330, 250, 45, 30);
		panel.add(btn_Lbrackets);
		
		in_textField = new JTextField();
		in_textField.setBounds(10, 85, 380, 35);
		panel.add(in_textField);
		in_textField.setColumns(10);
	}
}

