//Demonstrate a simple JList
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class ListDemo implements ListSelectionListener {
	JList jlst;
	JLabel jlab;
	JScrollPane jscrlp;
	
	String names[] = {"Sherry","Jon","Rachel",
					  "Sasha","Josselyn","Randy",
					  "Tom","Mary","Ken",
					  "Andrew","Matt","Todd"};
					  
	ListDemo() {
		JFrame frm = new JFrame("JList Demo");
		frm.setLayout(new FlowLayout());
		frm.setSize(200,160);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jlst = new JList(names);
		
		jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		jscrlp = new JScrollPane(jlst);
		jscrlp.setPreferredSize(new Dimension(120,90));
		
		jlab = new JLabel("Please choose a name");
		
		jlst.addListSelectionListener(this);
		
		frm.add(jscrlp);
		frm.add(jlab);
		
		frm.setVisible(true);
	}
	
	public void valueChanged(ListSelectionEvent e) {
		int idx = jlst.getSelectedIndex();
		
		if(idx != -1)
			jlab.setText("Current location: " + names[idx]);
		else
			jlab.setText("Please choose a name.");
	}
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ListDemo();
			}
		});
	}
}
