package shape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
/*
 This class is about to control the functions of two buttons
 */
public class Controller {
	
	private MyFrame mainFrame;

	
	public void init(MyFrame mainFrame) {
		this.mainFrame = mainFrame;
	}
	
	public void control(MyPanel panel,int click,String message){
		if (message.equals("loading")) {
			panel.init(1);      //let the click attribute in myPanel be 1 when ShapeLoading is clicked
			mainFrame.repaint();
		
		}else if(message.equals("sorting")) {
			panel.init(2);           //let the click attribute in myPanel be 2 when ShapeLoading is clicked
			mainFrame.repaint();

		}
		
	}
	
}
