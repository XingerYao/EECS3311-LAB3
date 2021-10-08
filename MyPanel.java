package shape;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MyPanel extends JPanel  {
	private int click;
	private String str;
	public void init(int click){
		this.click = click;
	}
	public void sort(String str) {
		this.str=str;
	}
	
	/**
	 * This method displays the created rectangles.
	 */
	
   public  void paintComponent(Graphics g) {
	   	Graphics gg = g.create();
	   
		if (click==1) {	                //set one click on shape button and comes 6 shapes
	   	Color myColor1 = new Color(252, 102, 66);    //show all shapes when 
			gg.setColor(myColor1);
			Circle circle = new Circle(10, 10, 25, 25, myColor1);
			circle.drawShape(gg);
			
			
			
			Color myColor3 = new Color(222, 95, 251);
			gg.setColor(myColor3);
			Circle circle2 = new Circle(160, 200, 60, 60, myColor1);
			circle2.drawShape(gg);

			Color myColor4 = new Color(132, 31, 43);
			gg.setColor(myColor4);
			Rectangle rectangleShape3 = new Rectangle (250, 250, 60, 60, myColor4);
			rectangleShape3.drawShape(gg);
			
			Color myColor5 = new Color(189, 225, 252);
			gg.setColor(myColor5);
			Rectangle rectangleShape4 = new Rectangle (350, 350, 40, 40, myColor5);
			rectangleShape4.drawShape(gg);
			
			
			Color myColor6 = new Color(132, 31, 43);
			gg.setColor(myColor6);
			Circle circle6 = new Circle(450, 450, 60, 60, myColor6);
			circle6.drawShape(gg);
			Color myColor2 = new Color(222, 95, 251);
			gg.setColor(myColor2);
			Rectangle rectangleShape2 = new Rectangle (60, 100, 72, 90, myColor2);
			rectangleShape2.drawShape(gg);
			
			gg.dispose();
		}
		else if (click==2) {
			
			Color myColor2 = new Color(222, 95, 251);
			gg.setColor(myColor2);
			Rectangle rectangleShape2 = new Rectangle (450, 450, 72, 90, myColor2);
			
			Color myColor1 = new Color(252, 102, 66);
			gg.setColor(myColor1);
			Circle circle = new Circle(10, 10, 25, 25, myColor1);
			
			Color myColor5 = new Color(189, 225, 252);
			gg.setColor(myColor5);
			Rectangle rectangleShape4 = new Rectangle (100, 100, 40, 40, myColor5);
			
			
			Color myColor3 = new Color(222, 95, 251);
			gg.setColor(myColor3);
			Circle circle2 = new Circle(188, 191, 60, 60, myColor1);
			
			Color myColor6 = new Color(132, 31, 43);
			gg.setColor(myColor6);
			Circle circle6 = new Circle(268, 289, 60, 60, myColor6);
			
			
			
			Color myColor4 = new Color(132, 31, 43);
			gg.setColor(myColor4);
			Rectangle rectangleShape3 = new Rectangle (361, 361, 60, 60, myColor4);
			
			
			
			Sort<Integer> sort=new Sort<Integer>();
			Integer c1=(int) (Math.PI*circle.getWidth()*circle.getWidth());
			Integer c2=(int) (Math.PI*circle2.getWidth()*circle2.getWidth());
			Integer c3=(int) (Math.PI*circle6.getWidth()*circle6.getWidth());
			
			Integer seq1=rectangleShape4.getWidth()*rectangleShape4.getHeight();
			Integer seq2=rectangleShape3.getWidth()*rectangleShape3.getHeight();
			Integer seq3=rectangleShape2.getWidth()*rectangleShape2.getHeight();
			Integer[] sorts=new Integer[] {c3,c1,c2,seq3,seq1,seq2};
			
		    sort.bubbleSort(sorts);
			
			for (int i = 0; i < sorts.length-1; i++) {
				if (sorts[i] == Math.min(sorts[i], sorts[i + 1])) {
					gg.setColor(myColor1);
					circle.drawShape(gg);
					gg.setColor(myColor5);
					rectangleShape4.drawShape(gg);
					gg.setColor(myColor6);
					circle2.drawShape(gg);
					gg.setColor(myColor3);
					circle6.drawShape(gg);
					gg.setColor(myColor4);
					rectangleShape3.drawShape(gg);
					gg.setColor(myColor2);
					rectangleShape2.drawShape(gg);
				} else {
					break;
				}
			}
			
			
			
			int compareTo = circle.compareTo(rectangleShape2);
			gg.dispose();
		}
   } 
		   
		   
		   
}
