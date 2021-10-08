package shape;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener{
	private MyPanel MyPanel;
	private Controller controller;
	private int i=0;
	private String message;
	


	public ButtonListener(shape.MyPanel myPanel, Controller controller,String message) {
		super();
		this.MyPanel = myPanel;
		this.controller = controller;
		this.message=message;
	}





	@Override
	public void actionPerformed(ActionEvent e) {
		i++;
		if (i>6) {
			i=0;
		}
		// TODO Auto-generated method stub
		controller.control(MyPanel,i,message);
	}

}
