package com.khaledbaghdadi;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class HomePage extends JPanel {

ImageIcon PLicon= new ImageIcon("C:\\Users\\USP\\eclipse-workspace\\Football Scores\\Icons\\PL.png");
JButton PLbutton = new JButton("Premium League",PLicon);
ImageIcon PDicon= new ImageIcon("C:\\Users\\USP\\eclipse-workspace\\Football Scores\\Icons\\PD.png");
JButton PDbutton = new JButton("La Liga",PDicon);
ImageIcon SAicon= new ImageIcon("C:\\Users\\USP\\eclipse-workspace\\Football Scores\\Icons\\SA.png");
JButton SAbutton = new JButton("Serie A",SAicon);
ImageIcon BLicon= new ImageIcon("C:\\Users\\USP\\eclipse-workspace\\Football Scores\\Icons\\BL.png");
JButton BLbutton = new JButton("Bundesliga ",BLicon);
ImageIcon L1icon= new ImageIcon("C:\\Users\\USP\\eclipse-workspace\\Football Scores\\Icons\\L1.png");
JButton L1button = new JButton("Ligue 1 ",L1icon);
ImageIcon CLicon= new ImageIcon("C:\\Users\\USP\\eclipse-workspace\\Football Scores\\Icons\\CL.png");
JButton CLbutton = new JButton("Champions League ",CLicon);	
public HomePage() {

setPreferredSize(new Dimension(1500, 1500));
setBackground(Color.WHITE);	
add(PLbutton);
add(PDbutton);
add(SAbutton);
add(BLbutton);
add(L1button);
add(CLbutton);
PLbutton.addActionListener(new Competition("PL"));
PDbutton.addActionListener(new Competition("PD"));
SAbutton.addActionListener(new Competition("SA"));
BLbutton.addActionListener(new Competition("BL1"));
L1button.addActionListener(new Competition("L1"));
CLbutton.addActionListener(new Competition("CL"));
}	
	
	
}
