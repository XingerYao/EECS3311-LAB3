package shape;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Run {
	static JButton btn1;	
	static JButton btn2;
	static MyPanel rects;
	/**
	    * This is the main method of the class.
	    * @param args
	    */
	   public static void main(String[] args) {
		  
		   Controller controller=new Controller();
		   MyFrame mainFrame = new MyFrame(controller);
			
			mainFrame.init();
			
			controller.init(mainFrame);
	   }
}
