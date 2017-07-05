package model;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class StartPageAdmin extends JFrame {

	private JPanel contentPane;




	
	public StartPageAdmin() {
		
		setTitle("Welcome: "+LoginPageAdmin.username);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JButton btnLogout = new JButton("Log Out");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnLogout, 0, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnLogout, 684, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnLogout, 0, SpringLayout.EAST, contentPane);
	
		
		
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==btnLogout) {
					
					LoginPageAdmin loginadminpage= new LoginPageAdmin();
					dispose();
				}
			}
		});
		contentPane.add(btnLogout);
		
		JPanel optionPanel = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, optionPanel, 42, SpringLayout.NORTH, btnLogout);
		sl_contentPane.putConstraint(SpringLayout.WEST, optionPanel, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, optionPanel, 556, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, optionPanel, 190, SpringLayout.WEST, contentPane);
		optionPanel.setBackground(Color.WHITE);
		contentPane.add(optionPanel);
		
		JPanel mainWindow = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, mainWindow, 0, SpringLayout.NORTH, optionPanel);
		sl_contentPane.putConstraint(SpringLayout.WEST, mainWindow, 11, SpringLayout.EAST, optionPanel);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, mainWindow, 0, SpringLayout.SOUTH, optionPanel);
		sl_contentPane.putConstraint(SpringLayout.EAST, mainWindow, 0, SpringLayout.EAST, contentPane);
		mainWindow.setBackground(Color.WHITE);
		contentPane.add(mainWindow);
		
		
		
	}
}
