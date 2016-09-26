package com.Dgame;


import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainScreen extends JFrame {
	
public GameCode panel;
public MainScreen() {
	panel = new GameCode(this);
	setLayout(new GridLayout (1,1,0,0));
	add(panel);
	Component lab = new JLabel();
	((JLabel) lab).setIcon(new ImageIcon("C://Users//Amir//workspace//D game//res"));
	add(lab);
	
	
	}
}