package com.insel.chapter18;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AWTFrame {
	public static void main(String [] args) {
		
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(100, 100);
		f.add(new AWTFrame.DrawPanel());
		f.setVisible(true);
	}
	
	@SuppressWarnings("serial")
	public static class DrawPanel extends JPanel {
		@Override protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawLine(10, 10, 100, 50);
		}
	}

}
