package com.ewing.bingo;


public class BingoController implements java.awt.event.ActionListener{

	private BingoView view;
	private BingoModel model;
	
	public BingoController(){
		view = new BingoView();
		model = new BingoModel();
		view.setIDLabel(model.getCurrentID());
	}
	
	public void addListeners(){
		view.addListeners(this);
	}
	
	@Override
	public void actionPerformed(java.awt.event.ActionEvent e){
		//System.out.println("Button pressed.");
//		BingoCard temp = new BingoCard(view.getCard());
//		// Add temp BingoCard to Model
//		model.addCard(temp);
//		// Clear card
//		view.clear();
//		// Set the IDLabel to the next ID
//		view.setIDLabel(model.getCurrentID());
		if(e.getActionCommand() == "AddCard"){
			cardAdded();
		} else if(e.getActionCommand() == "CallNum"){
			numberCalled();
		} else{
			System.out.println("Something went terribly wrong!!");
		}
	}
	
	private void cardAdded(){
		BingoCard temp = new BingoCard(view.getCard());
		// Add temp BingoCard to Model
		model.addCard(temp);
		// Clear card
		view.clear();
		// Set the IDLabel to the next ID
		view.setIDLabel(model.getCurrentID());
	}
	
	private void numberCalled(){
		System.out.println("Adding functionality in a bit");
	}
}
