package com.bingo.tracker;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class BingoView extends JFrame{
	
	private static final long serialVersionUID = 1L;
	//private JPanel contentPanel = null;
	// I think I'll go with Tabs, all fancy n' stuff
	private JTabbedPane tabs = null;
	private JPanel cardPanel = null;
	private JPanel numberPanel = null;
	
	
	public BingoView(){
		super();
		init();
	}
	
	private void init(){
		this.setSize(500, 550);
		this.setTitle("Bingo Tracker");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(getTabs());
	}
	
	private JTabbedPane getTabs(){
		if(tabs == null){
			tabs = new JTabbedPane();
			tabs.add("Enter Card", getCardPanel());
			tabs.add("Enter Number", getNumberPanel());
		}
		return tabs;
	}
	
	private JPanel getCardPanel(){
		if(cardPanel == null){
			cardPanel = new CardPanel();
		}
		return cardPanel;
	}
	
	private JPanel getNumberPanel(){
		if(numberPanel == null){
			numberPanel = new JPanel();
		}
		return numberPanel;
	}

}
