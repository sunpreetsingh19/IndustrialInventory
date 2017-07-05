package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class LoginPageAdmin extends JFrame {

	private JPanel contentPane;
	private JTextField txtLoginId;
	private JPasswordField passwordField;
	
	public JButton btnLogin, btnRegister, btnForgotUsernamepassword, btnBack;
	
	

	public LoginPageAdmin() {
		setTitle("Login Account");
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);

		JLabel lblNewLabel = new JLabel("Username");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 107, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel, -152, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel, -249, SpringLayout.EAST, contentPane);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Password");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 25, SpringLayout.SOUTH, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel_1, -5, SpringLayout.EAST, lblNewLabel);
		contentPane.add(lblNewLabel_1);

		txtLoginId = new JTextField();
		txtLoginId.setToolTipText("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtLoginId, 0, SpringLayout.NORTH, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtLoginId, 10, SpringLayout.EAST, lblNewLabel);
		contentPane.add(txtLoginId);
		txtLoginId.setColumns(10);

		JLabel label = new JLabel("?");
		label.setToolTipText("Your Login ID");
		sl_contentPane.putConstraint(SpringLayout.WEST, label, 10, SpringLayout.EAST, txtLoginId);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, label, 0, SpringLayout.SOUTH, lblNewLabel);
		contentPane.add(label);

		passwordField = new JPasswordField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, passwordField, -3, SpringLayout.NORTH, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, passwordField, 15, SpringLayout.EAST, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, passwordField, 0, SpringLayout.EAST, txtLoginId);
		passwordField.setColumns(10);
		contentPane.add(passwordField);

		JLabel label_1 = new JLabel("?");
		sl_contentPane.putConstraint(SpringLayout.NORTH, label_1, 0, SpringLayout.NORTH, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, label_1, 0, SpringLayout.WEST, label);
		label_1.setToolTipText("Your Password");
		contentPane.add(label_1);

		 btnLogin = new JButton("Login");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnLogin, 23, SpringLayout.SOUTH, passwordField);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnLogin, 0, SpringLayout.WEST, lblNewLabel);
		contentPane.add(btnLogin);

		btnRegister = new JButton("Register");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnRegister, 0, SpringLayout.WEST, txtLoginId);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnRegister, 0, SpringLayout.SOUTH, btnLogin);
		contentPane.add(btnRegister);

		btnForgotUsernamepassword = new JButton("Forgot Username/Password");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnForgotUsernamepassword, 0, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnForgotUsernamepassword, 0, SpringLayout.EAST, contentPane);
		contentPane.add(btnForgotUsernamepassword);

		JLabel lblUserLoginAccount = new JLabel("ADMINISTRATOR LOGIN ACCOUNT");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblUserLoginAccount, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblUserLoginAccount, 0, SpringLayout.EAST, btnRegister);
		contentPane.add(lblUserLoginAccount);

		 btnBack = new JButton("Back");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnBack, 36, SpringLayout.EAST, btnRegister);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnBack, 0, SpringLayout.SOUTH, btnLogin);
		contentPane.add(btnBack);

		
		
	
		
		
		
				// Button Login Actions
	btnLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if (e.getSource() == btnLogin) {
						String username = txtLoginId.getText();
						String password = passwordField.getText();
						if (username.equals("bunny") && password.equals("bunnny")) {
							StartPageAdmin startpageadmin = new StartPageAdmin();
							startpageadmin.setVisible(true);
							setVisible(false);
							dispose();

						} else {
							JOptionPane.showMessageDialog(null, null, "Incorrect Username/Password Combination", 0);
						}
						
						
					}
				} catch (Exception ex) {

					ex.printStackTrace();
				}

			}

		});
	
	

		// Back Button Actions
		btnBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if (e.getSource() != null) {

						ChooseLogin chooseLogin = new ChooseLogin();
						chooseLogin.setVisible(true);
						dispose();

					}
				} catch (Exception ex) {

					ex.printStackTrace();
				}

			}

		});
		
		
	}
	




	
}

