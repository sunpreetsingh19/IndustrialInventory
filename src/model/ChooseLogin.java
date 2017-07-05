package model;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ChooseLogin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public ChooseLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		setVisible(true);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JButton btnUser = new JButton("USER");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnUser, 67, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnUser, -165, SpringLayout.EAST, contentPane);
		contentPane.add(btnUser);
		
		JButton btnAdmin = new JButton("ADMIN");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnAdmin, 28, SpringLayout.SOUTH, btnUser);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnAdmin, -25, SpringLayout.WEST, btnUser);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnAdmin, -136, SpringLayout.EAST, contentPane);
		contentPane.add(btnAdmin);
		
		JLabel lblLoginAs = new JLabel("LOGIN AS");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblLoginAs, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblLoginAs, 0, SpringLayout.WEST, btnUser);
		contentPane.add(lblLoginAs);
		
btnUser.addActionListener(new ActionListener() {

			

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				if(e.getSource()!=null) {
					
				
					LoginPageUser loginuser= new LoginPageUser();
					loginuser.setVisible(true);
					dispose();
					
	
				}}
				catch(Exception ex) {
					
					ex.printStackTrace();
				}
				
			}
			
		});

btnAdmin.addActionListener(new ActionListener() {

	

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
		if(e.getSource()!=null) {
			
		
			LoginPageAdmin loginadmin= new LoginPageAdmin();
			loginadmin.setVisible(true);
			dispose();
			

		}}
		catch(Exception ex) {
			
			ex.printStackTrace();
		}
		
	}
	
});
		
		
	}
}
