package com.ewing.bingo;

import javax.swing.SwingUtilities;

public class Bingo {

	private static void launch(){
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run(){
				BingoController c = new BingoController();
				c.addListeners();
			}
		});
	}
	
	public static void main(String[] args){
		launch();
	}
}
