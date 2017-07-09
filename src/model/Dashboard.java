package model;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import javafx.geometry.Insets;
import view.ActiveOrderList;

public class Dashboard extends JFrame {

	private JPanel contentPane;
	public JPanel mainWindow;

	
	public Dashboard() {
		
setTitle("Welcome: "+LoginPageUser.username);
		
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
		
		JPanel optionPanel = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, optionPanel, 42, SpringLayout.NORTH, btnLogout);
		sl_contentPane.putConstraint(SpringLayout.WEST, optionPanel, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, optionPanel, 556, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, optionPanel, 190, SpringLayout.WEST, contentPane);
		optionPanel.setBackground(Color.WHITE);
		contentPane.add(optionPanel);
		
		 mainWindow = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, mainWindow, 0, SpringLayout.NORTH, optionPanel);
		sl_contentPane.putConstraint(SpringLayout.WEST, mainWindow, 11, SpringLayout.EAST, optionPanel);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, mainWindow, 0, SpringLayout.SOUTH, optionPanel);
		SpringLayout sl_optionPanel = new SpringLayout();
		optionPanel.setLayout(sl_optionPanel);
		
		JButton ActiveOrder = new JButton("Active Orders");
		sl_optionPanel.putConstraint(SpringLayout.NORTH, ActiveOrder, 10, SpringLayout.NORTH, optionPanel);
		sl_optionPanel.putConstraint(SpringLayout.WEST, ActiveOrder, 10, SpringLayout.WEST, optionPanel);
		optionPanel.add(ActiveOrder);
		sl_contentPane.putConstraint(SpringLayout.EAST, mainWindow, 0, SpringLayout.EAST, contentPane);
		mainWindow.setBackground(Color.WHITE);
		ActiveOrder.setForeground(Color.BLUE);
	
		ActiveOrder.setFocusPainted(false);
		ActiveOrder.setContentAreaFilled(false);
		ActiveOrder.setBorderPainted(false);
		ActiveOrder.setOpaque(false);
		contentPane.add(mainWindow);
		mainWindow.setLayout(new SpringLayout());
		//button active order
		ActiveOrder.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==ActiveOrder) {
					ActiveOrder.setForeground(Color.MAGENTA);

					JLabel label1 = new JLabel("Active Orders");
					mainWindow.add(label1);
					mainWindow.revalidate();

				}
				
			}
		});
	
	
// button logout
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==btnLogout) {
					
					LoginPageUser loginadminpage= new LoginPageUser();
					dispose();
				}
			}
		});
		contentPane.add(btnLogout);
	}	
}
