package tests;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;

public class TabTest extends JFrame{

	private static final long serialVersionUID = 1L;
	private JTabbedPane pane = null;
	
	public TabTest(){
		super();
		init();
	}
	
	private void init(){
		this.setSize(650, 500);
		this.setTitle("Tabs anyone?");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(getPane());
	}
	
	private JTabbedPane getPane(){
		if(pane == null){
			pane = new JTabbedPane();
			pane.addTab("Tab 1", new JPanel());
			pane.addTab("Tab 2", new JPanel());
			pane.addTab("Tab 3", new JPanel());
		}
		return pane;
	}
	
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new TabTest().setVisible(true);
			}
		});
	}
}
