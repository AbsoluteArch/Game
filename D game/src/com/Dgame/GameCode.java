package com.Dgame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;



//written by AMIR AL.


import javax.swing.JPanel;

import com.Dgame.MainClass;
import com.Dgame.MainScreen;

public class GameCode extends JPanel  implements Runnable{

	

	
	
	//****ENGINE****
	public Rectangle floor;
	
	public int keyRight = KeyEvent.VK_RIGHT;
	public int keyLeft = KeyEvent.VK_LEFT;
	public int keyUp = KeyEvent.VK_UP;
	public int keyDown = KeyEvent.VK_DOWN;
	
	public int fallingFrame = 0;
	public int fallingSpeed  = 0;
	public int movementFallingSpeed = 0;
	public int movementResetSpeed = 0;
	public int movementSpeed = 0;
	public int movementFrame = 0;
	
	
	public boolean objectDefine = false;
	public boolean falling = false;
	public boolean running = true;
	public boolean left = false;
	public boolean right = false;
	
	public int floorheight = 80;
	public int fps= 1000;
	
	//**************
	
	
	
	
	
	//****PLAYER****
	
	public void object() {
		add(new JLabel(new ImageIcon("jump1.png")));
	
	}
	
	
	//***************
	
	
	

	
	
	

	public Thread game;
	
	public GameCode(MainScreen f){
		setBackground(Color.black);
		defineObjects();
		game = new Thread (this);
		game.start();
	
		}
//****LEVEL*************
	void defineObjects(){
		floor = new Rectangle(-10, MainClass.height-floorheight, MainClass.width+10, floorheight);
		
		objectDefine = true;
		
		repaint();
	
	
	}
	
	
	
	public void paint(Graphics g){
		super.paintComponent(g);
		if (objectDefine)  {
			g.setColor(Color.RED);
			g.fillRect(floor.x, floor.y, floor.width, floor.height);
			
			
//*******************			
		}
	}
	
	
	


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

