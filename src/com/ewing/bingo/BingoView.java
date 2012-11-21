package com.ewing.bingo;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class BingoView extends JFrame{

	private static final long serialVersionUID = 1L;
	private JTabbedPane tabs = null;
	private JPanel addCardPanel = null;
	private JPanel callNumPanel = null;
	private String[] letters = {"B", "I", "N", "G", "O"};
	private JLabel[] labels;
	private JTextField[] entries;
	private JButton addCardButton;
	private JLabel cardIDLabel;
	
	
	public BingoView(){
		super();
		init();
	}
	
	private void init(){
		this.setTitle("Bingo Tracker");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(getTabs());
		this.pack();
		this.setVisible(true);
	}
	
	private JTabbedPane getTabs(){
		if(tabs == null){
			tabs = new JTabbedPane();
			tabs.add("Enter Card", getAddCardPanel());
			tabs.add("Call Number", getCallNumPanel());
		}
		return tabs;
	}
	
	private JPanel getAddCardPanel(){
		if(addCardPanel == null){
			addCardPanel = new JPanel();
			addCardPanel.setLayout(new GridLayout(7, 5));
			//addCardPanel.setPreferredSize(new java.awt.Dimension(500,500));
			
			// Make and add labels
			labels = new JLabel[5];
			for(int i = 0; i < 5; ++i){
				labels[i] = new JLabel(letters[i], JLabel.CENTER);
				addCardPanel.add(labels[i]);
			}
			
			// Make and add entries
			entries = new JTextField[25]; // We only need 24 since the middle space is FREE
			for(int i = 0; i < 25; ++i){
				entries[i] = new JTextField();
				if(i == 12){
					addCardPanel.add(new JLabel("FREE", JLabel.CENTER));			
					entries[i].setText("-1");
				}
				else
					addCardPanel.add(entries[i]);
			}
			
			// Add card button
			addCardButton = new JButton("Add");
			addCardPanel.add(addCardButton);
			
			// Add ID Label
			cardIDLabel = new JLabel();
			addCardPanel.add(cardIDLabel);
		}
		return addCardPanel;
	}
	
	private JPanel getCallNumPanel(){
		if(callNumPanel == null){
			callNumPanel = new JPanel();
			
		}
		return callNumPanel;
	}
	
	public int[][] getCard(){
		int[][] temp = new int[5][5];
		for(int i = 0; i < 5; ++i)
			for(int j = 0; j < 5; ++j)
				temp[i][j] = Integer.parseInt(entries[i*5+j].getText());
				
		return temp;
	}
	
	public void addListeners(ActionListener al){
		addCardButton.addActionListener(al);
	}
	
	public void clear(){
		for(JTextField f : entries)
			f.setText("");
		entries[12].setText("-1");
	}
	
	public void setIDLabel(String id){
		cardIDLabel.setText(id);
	}
}
