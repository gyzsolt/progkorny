package view;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.BoxLayout;
import java.awt.GridLayout;

public class GUI extends JPanel implements view {

	public int getType() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/**
	 * Create the panel.
	 */
	public GUI() {
		setLayout(new GridLayout(0, 2, 0, 0));
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		add(rdbtnNewRadioButton);

	}

}
