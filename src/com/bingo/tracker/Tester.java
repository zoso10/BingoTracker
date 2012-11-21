package com.bingo.tracker;

import javax.swing.SwingUtilities;

public class Tester {

	private static void launch(){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new BingoView().setVisible(true);
			}
		});
	}
	
	public static void main(String[] args){
		launch();
	}
}
