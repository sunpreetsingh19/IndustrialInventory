package controller;

import java.awt.EventQueue;

import model.ChooseLogin;
import model.LoginPageUser;

public class main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChooseLogin frame = new ChooseLogin();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
