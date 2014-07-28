//A simple Swing-based Applets
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="MySwingApplet" height=80 width=200>
</applet>
*/

public class MySwingApplet extends JApplet {
	JButton btnUp;
	JButton btnDown;
	
	JLabel jlab;
	
	public void init() {
		try
		{
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					makeGUI();
				}
			});
		}
		catch (Exception exc)
		{
			System.out.println(exc);
		}
	}
	
	public void makeGUI() {
		setLayout(new FlowLayout());
		
		btnUp = new JButton("Up");
		btnDown = new JButton("Down");
		
		btnUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jlab.setText("You pressed UP.");
			}
		});
		
		btnDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jlab.setText("You pressed DOWN.");
			}
		});
		
		add(btnUp);
		add(btnDown);
		
		jlab = new JLabel("Press a button.");
		
		add(jlab);
	}
}
