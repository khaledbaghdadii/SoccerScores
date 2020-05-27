package com.khaledbaghdadi;

import java.awt.Color;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ResultsPanel extends JPanel {
	JTextArea results;
	
	public ResultsPanel() throws Exception {
		
		setPreferredSize(new Dimension(1500, 1500));
		
		setBackground(Color.WHITE);	
		
		results = new JTextArea(ScoresGUI.getResult().toString());
		
		add(results);
	}
	
}
