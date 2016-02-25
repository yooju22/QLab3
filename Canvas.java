package QLab3;

import java.awt.*;
import javax.swing.*;

class Canvas extends JFrame{
	public Canvas(){
		super("QLab3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(570, 600);
		FigurePane f = new FigurePane();
		getContentPane().add(f);
	}
}
