//demo a push button and handke action events
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonDemo implements ActionListener {
	JLabel jlab;
	
	ButtonDemo() {
		JFrame frm = new JFrame("A Button Example");
		frm.setLayout(new FlowLayout());
		frm.setSize(220,90);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnUp = new JButton("Up");
		JButton btnDown = new JButton("Down");
		
		btnUp.addActionListener(this);
		btnDown.addActionListener(this);
		
		frm.add(btnUp);
		frm.add(btnDown);
		
		jlab = new JLabel("Press a button.");
		
		frm.add(jlab);
		
		frm.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if( e.getActionCommand().equals("Up") )
			jlab.setText("You pressed Up.");
		else
			jlab.setText("You pressed Down.");
	}
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ButtonDemo();
			}
		});
	}
}
