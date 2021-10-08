package shape;

import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;



public class MyFrame extends JFrame{
	public MyPanel paneldraw;
	private JButton loadingShape;
	private JButton sortingShape;
	private Controller controller;
	
	
	public MyFrame(Controller controller) throws HeadlessException {
		super();
		this.controller = controller;
	}


	public void init() {
		
		paneldraw = new MyPanel();
		loadingShape = new JButton("LoadingShape");
		sortingShape = new JButton("SortingShape");
		paneldraw.add(loadingShape);
		paneldraw.add(sortingShape);
		paneldraw.setPreferredSize(new Dimension(500, 80));
		loadingShape.addActionListener(new ButtonListener(paneldraw, controller,"loading"));
		sortingShape.addActionListener(new ButtonListener(paneldraw, controller,"sorting"));
		Dimension preferredSize = new Dimension(160, 60);
		this.setTitle("Display shapes ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.add(paneldraw);
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
