//Use a text field
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TFDemo implements ActionListener {
	JTextField jtf;
	JButton jbtnRev;
	JLabel jlabPrompt, jlabContents;
	
	TFDemo() {
		JFrame frm = new JFrame("A Text Field Example");
		frm.setLayout(new FlowLayout());
		frm.setSize(240,120);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jtf = new JTextField(10);
		jtf.setActionCommand("myTF");
		
		jbtnRev = new JButton("Reverse");
		
		jtf.addActionListener(this);
		jbtnRev.addActionListener(this);
		
		jlabPrompt = new JLabel("Enter text:");
		jlabContents = new JLabel("");
		
		frm.add(jlabPrompt);
		frm.add(jtf);
		frm.add(jbtnRev);
		frm.add(jlabContents);
		
		frm.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if( e.getActionCommand().equals("Reverse") ) {
			String orgstr = jtf.getText();
			String resstr = "";
			
			for( int i = orgstr.length()-1; i >= 0; i-- )
				resstr += orgstr.charAt(i);
				
			jtf.setText(resstr);
		}
		
		else {
			jlabContents.setText("You pressed ENTER. Text is: " + jtf.getText());
		}
	}
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					new TFDemo();
				}
		});
	}
}
