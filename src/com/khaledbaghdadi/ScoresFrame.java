package com.khaledbaghdadi;

import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ScoresFrame {
static JFrame  frame = new JFrame("Football Scores");
static Component homepage = new HomePage();
static Component matchday = new MatchDayPanel();
	static int flag;
	static JLabel label;
public static void main (String[]args) {


frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().add(homepage);
frame.pack();
frame.setVisible(true);
frame.setResizable(false);
frame.setLocationRelativeTo(null);
		
}

public static void setFVisible(boolean a){
	frame.setVisible(a);
	
	
}
public static void openMatchDay() {
	frame.getContentPane().add(matchday);
	frame.getContentPane().remove(homepage);
	
}
public static void openResults() throws Exception {
	frame.getContentPane().remove(matchday);
	frame.getContentPane().add(new ResultsPanel());
	
	
}

}
