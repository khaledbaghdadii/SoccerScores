package com.khaledbaghdadi;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.management.timer.Timer;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MatchDayPanel extends JPanel {

JTextField matchday = new JTextField("Enter Match Day.");
JButton search = new JButton("Search");

public MatchDayPanel() {
	
setPreferredSize(new Dimension(1500, 1500));
	
setBackground(Color.WHITE);	


add(matchday);
add(search);
search.addActionListener(new setMatchDay());	


}

public class setMatchDay implements ActionListener {
	


@Override
public void actionPerformed(ActionEvent e) {
	String text = matchday.getText();
	
	ScoresGUI.setMatchDay(text);
	try {
		
		
		ScoresFrame.openResults();
		
		ScoresFrame.setFVisible(true);
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
}
}

}
