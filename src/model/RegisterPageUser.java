package model;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import javabeans.registerUser;

import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;


public class RegisterPageUser extends JFrame {

	private JPanel contentPane;
	private JTextField txtname;
	private JTextField txtusername;
	private JPasswordField txtpassword;
	private JTextField txtanswer1;
	private JTextField txtanswer2;
	
	public static String name,username,password,question1,question2,answer1,answer2;

	
	public RegisterPageUser() {
		setTitle("Register Employee");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 395, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setResizable(false);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JButton btnrequest = new JButton("Request Administrator");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnrequest, 0, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnrequest, -83, SpringLayout.EAST, contentPane);
		contentPane.add(btnrequest);
		
		JLabel lblName = new JLabel("Name");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblName, 47, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblName, -434, SpringLayout.SOUTH, contentPane);
		contentPane.add(lblName);
		
		JLabel lblUsername = new JLabel("Username");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblUsername, 28, SpringLayout.SOUTH, lblName);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblUsername, 45, SpringLayout.WEST, contentPane);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblPassword, 28, SpringLayout.SOUTH, lblUsername);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblPassword, 0, SpringLayout.EAST, lblUsername);
		contentPane.add(lblPassword);
		
		JLabel lblSecurityQuestions = new JLabel("Security Questions");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblSecurityQuestions, 0, SpringLayout.WEST, lblName);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblSecurityQuestions, -278, SpringLayout.SOUTH, contentPane);
		contentPane.add(lblSecurityQuestions);
		
		JComboBox securityQues1 = new JComboBox();
		sl_contentPane.putConstraint(SpringLayout.WEST, securityQues1, 0, SpringLayout.WEST, lblName);

		securityQues1.addItem("At which place your father is born?");
		securityQues1.addItem("What is your birth place?");
		securityQues1.addItem("What is you mother's maiden name?");
		securityQues1.addItem("How many Siblings do you have?");
		securityQues1.addItem("What is the name of your primary school?");
		securityQues1.addItem("How many children do you have?");
		contentPane.add(securityQues1);
		
		
		
		txtname = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtname, 107, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtname, 98, SpringLayout.EAST, lblName);
		contentPane.add(txtname);
		txtname.setColumns(10);
		
		txtusername = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtusername, 0, SpringLayout.NORTH, lblUsername);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtusername, 0, SpringLayout.EAST, txtname);
		contentPane.add(txtusername);
		txtusername.setColumns(10);
		
		txtpassword = new JPasswordField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtpassword, 0, SpringLayout.NORTH, lblPassword);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtpassword, 0, SpringLayout.WEST, txtname);
		contentPane.add(txtpassword);
		txtpassword.setColumns(10);
		
		txtanswer1 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.WEST, txtanswer1, 47, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtanswer1, -99, SpringLayout.EAST, contentPane);
		contentPane.add(txtanswer1);
		txtanswer1.setColumns(10);
		
		JLabel lblAnswer = new JLabel("Answer 1:");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblAnswer, 0, SpringLayout.WEST, lblName);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblAnswer, -6, SpringLayout.NORTH, txtanswer1);
		contentPane.add(lblAnswer);
		
		JLabel lblQuestion1 = new JLabel("Question 1");
		sl_contentPane.putConstraint(SpringLayout.NORTH, securityQues1, 7, SpringLayout.SOUTH, lblQuestion1);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblQuestion1, 6, SpringLayout.SOUTH, lblSecurityQuestions);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblQuestion1, 0, SpringLayout.WEST, lblName);
		contentPane.add(lblQuestion1);
		
		JLabel lblQuestion = new JLabel("Question 2");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblQuestion, 396, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtanswer1, -6, SpringLayout.NORTH, lblQuestion);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblQuestion, 0, SpringLayout.WEST, lblName);
		contentPane.add(lblQuestion);
		
		JComboBox securityQues2 = new JComboBox();
		securityQues2.setModel(new DefaultComboBoxModel(new String[] {"At which place your father is born?", "What is your birth place?", "What is you mother's maiden name?", "How many Siblings do you have?", "What is the name of your primary school?", "How many children do you have?"}));
		sl_contentPane.putConstraint(SpringLayout.NORTH, securityQues2, 6, SpringLayout.SOUTH, lblQuestion);
		sl_contentPane.putConstraint(SpringLayout.WEST, securityQues2, 0, SpringLayout.WEST, lblName);
		contentPane.add(securityQues2);
		
		JLabel lblAnswer_1 = new JLabel("Answer 2:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblAnswer_1, 6, SpringLayout.SOUTH, securityQues2);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblAnswer_1, 0, SpringLayout.WEST, lblName);
		contentPane.add(lblAnswer_1);
		
		txtanswer2 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtanswer2, 6, SpringLayout.SOUTH, lblAnswer_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtanswer2, 47, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtanswer2, -99, SpringLayout.EAST, contentPane);
		contentPane.add(txtanswer2);
		txtanswer2.setColumns(10);
		
		JButton btnBack = new JButton("Back");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnBack, 0, SpringLayout.NORTH, btnrequest);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnBack, -10, SpringLayout.EAST, contentPane);
		contentPane.add(btnBack);
		
		JLabel mandatory1 = new JLabel("*");
		mandatory1.setToolTipText("mandatory");
		sl_contentPane.putConstraint(SpringLayout.WEST, mandatory1, 3, SpringLayout.EAST, txtname);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, mandatory1, 0, SpringLayout.SOUTH, lblName);
		contentPane.add(mandatory1);
		
		JLabel mandatory2 = new JLabel("*");
		mandatory2.setToolTipText("mandatory");
		sl_contentPane.putConstraint(SpringLayout.WEST, mandatory2, 0, SpringLayout.WEST, mandatory1);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, mandatory2, 0, SpringLayout.SOUTH, txtusername);
		contentPane.add(mandatory2);
		
		JLabel mandatory3 = new JLabel("*");
		mandatory3.setToolTipText("mandatory");
		sl_contentPane.putConstraint(SpringLayout.WEST, mandatory3, 0, SpringLayout.WEST, mandatory1);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, mandatory3, 0, SpringLayout.SOUTH, txtpassword);
		contentPane.add(mandatory3);
		
		//button functionality
		btnrequest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==btnrequest) {
					name=txtname.getText();
					username=txtusername.getText();
					password=txtpassword.getText();
					question1=(securityQues1.getSelectedItem()).toString();
					question2=(securityQues2.getSelectedItem()).toString();
					answer1= txtanswer1.getText();
					answer2= txtanswer2.getText();
					
							try {
								registerUser register= new registerUser();
								int count= register.registeruser();
								
								if(count>0) {
									
									JOptionPane.showMessageDialog(null, "Requested to Administrator");
								}
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}	
						
					}
				}
			
		});
		
		//button back
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==btnBack) {
					LoginPageUser loginuser= new LoginPageUser();
					dispose();
						
					}
				}
			
		});
		
		
	}
}
