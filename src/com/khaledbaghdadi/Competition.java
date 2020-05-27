package com.khaledbaghdadi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Competition implements ActionListener {
String comp;
	public Competition(String comp) {
		this.comp=comp;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		ScoresGUI.setComp(comp);
		
		
		
		ScoresFrame.openMatchDay();
		
		ScoresFrame.setFVisible(true);
	
		
		
	}

}
