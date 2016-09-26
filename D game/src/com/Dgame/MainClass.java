package com.Dgame;
import javax.swing.JFrame;

import com.Dgame.MainScreen;
public class MainClass {
	public static MainScreen f = new MainScreen();
	public static int width = 800;
	public static int height = 600;
	public static void main(String args[] ){
		f = new MainScreen();
		f.setSize(width, height);
		f.setResizable(true);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("Warriors of Shazam v1.0");
		f.setLocationRelativeTo(null);

	}
}