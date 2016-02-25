package QLab3;

import java.awt.*;
import javax.swing.*;

public class FigurePane extends JPanel{
	public void paintComponent(Graphics comp){
		Graphics2D comp2D = (Graphics2D)comp;
		
		for(int i = 0; i <=480; i+= 32){
			for(int j = 0; j <=480; j+= 32){
				comp2D.setColor(new Color(rgb(),rgb(), rgb()));
				comp2D.drawRect(20+i, 20+j,30, 30);
				comp2D.fillRect(20+i, 20+j,30, 30);
			}
		}
	}
	
	public int rgb(){
		int rgb = (int)(Math.random()*256);
		return rgb;
	}

}
 