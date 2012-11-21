package com.bingo.tracker;

import javax.swing.SwingUtilities;

public class BingoTracker {

	private static void launch(){
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run(){
				
			}
		});
	}
	
	public void main(String[] args){
		launch();
	}
}
