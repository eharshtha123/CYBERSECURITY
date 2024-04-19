package SAMPLE;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JEditorPane;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class studentreg {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentreg window = new studentreg();
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
	public studentreg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 128, 128));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ROLL NO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(24, 36, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(24, 61, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("BRANCH");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(24, 95, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("GENDER");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(24, 136, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("PROGRAMING LANG");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(10, 185, 109, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		tb1 = new JTextField();
		tb1.setBounds(171, 33, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(171, 58, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"select", "cse", "cs", "ece", "it"}));
		cb1.setBounds(171, 91, 86, 22);
		frame.getContentPane().add(cb1);
		
		
		JRadioButton rb1 = new JRadioButton("male");
		rb1.setFont(new Font("Tahoma", Font.BOLD, 11));
		rb1.setBackground(new Color(0, 255, 255));
		rb1.setBounds(166, 132, 65, 23);
		frame.getContentPane().add(rb1);
		
		JRadioButton rb2 = new JRadioButton("female");
		rb2.setFont(new Font("Tahoma", Font.BOLD, 11));
		rb2.setBackground(new Color(255, 255, 128));
		rb2.setBounds(249, 132, 71, 23);
		frame.getContentPane().add(rb2);
		
		
		
		JCheckBox c1 = new JCheckBox("C");
		c1.setFont(new Font("Tahoma", Font.BOLD, 11));
		c1.setBackground(new Color(255, 0, 0));
		c1.setBounds(171, 181, 33, 23);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("JAVA");
		c2.setFont(new Font("Tahoma", Font.BOLD, 11));
		c2.setBackground(new Color(0, 255, 128));
		c2.setBounds(233, 181, 55, 23);
		frame.getContentPane().add(c2);
		
		
		
		
		JCheckBox c3 = new JCheckBox("PYTHON");
		c3.setFont(new Font("Tahoma", Font.BOLD, 11));
		c3.setBounds(310, 181, 71, 23);
		frame.getContentPane().add(c3);
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String roll=tb1.getText();
				String name=tb2.getText();
				String branch=(String) cb1.getSelectedItem();
				String gender="";
				String langs="";
				if(rb1.isSelected())
				{
					gender="male";
			
				}
				if(rb2.isSelected())
				{
					gender="female";
				}
				if(c1.isSelected())
				{
					langs=langs+"c";
				}
				if(c2.isSelected())
				{
					langs=langs+"java";
				}
				if(c3.isSelected())
				{
					langs=langs+"python";
				}
				JOptionPane.showMessageDialog(btnNewButton,"ROLL NO:"+roll+
						"\n NAME :"+name+"\n BRANCH :"+branch+
						"\n  GENDER:"+gender+"\n PROG LANGS:" +langs);
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic Medium", Font.BOLD, 11));
		btnNewButton.setForeground(new Color(0, 0, 255));
		btnNewButton.setBounds(168, 223, 89, 27);
		frame.getContentPane().add(btnNewButton);
		JLabel lblNewLabel_5 = new JLabel("STUDENT REGISTRATION");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(127, 2, 193, 20);
		frame.getContentPane().add(lblNewLabel_5);
		
		
		
		
	}
}
