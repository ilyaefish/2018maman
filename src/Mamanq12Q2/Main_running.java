package Mamanq12Q2;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main_running {

	public static void main(String[] args) throws CloneNotSupportedException {
		JFrame frame = new JFrame("Tester");

		
			
			DrawPanel panel = new DrawPanel();
//			panel.add(oval);
			frame.add(panel);
			frame.setSize(400,400);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			System.out.println("stop");
		}
	}


