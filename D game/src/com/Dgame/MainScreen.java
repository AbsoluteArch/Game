package com.Dgame;


import java.awt.GridLayout;

import javax.swing.JFrame;

public class MainScreen extends JFrame {
	
public GameCode panel;
public MainScreen() {
	panel = new GameCode(this);
	setLayout(new GridLayout (1,1,0,0));
	add(panel);
	}
}