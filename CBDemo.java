//Demonstrate check boxes
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CBDemo implements ItemListener {
	JLabel lblSelected;
	JLabel lblChanged;
	JCheckBox cbAlpha, cbBeta, cbGamma;
	
	CBDemo() {
		JFrame frm = new JFrame("A Checkbox Example");
		frm.setLayout(new FlowLayout());
		frm.setSize(240,120);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lblSelected = new JLabel();
		lblChanged = new JLabel();
		
		cbAlpha = new JCheckBox("Alpha");
		cbBeta = new JCheckBox("Beta");
		cbGamma = new JCheckBox("Gamma");
		
		cbAlpha.addItemListener(this);
		cbBeta.addItemListener(this);
		cbGamma.addItemListener(this);
		
		frm.add(cbAlpha);
		frm.add(cbBeta);
		frm.add(cbGamma);
		frm.add(lblSelected);
		frm.add(lblChanged);
		
		frm.setVisible(true);
	}
	
	public void itemStateChanged(ItemEvent e) {
		String str = "";
		
		JCheckBox cb = (JCheckBox)e.getItem();
		
		if( cb.isSelected() )
			lblChanged.setText(cb.getText() + " was just selected.");
		else
			lblChanged.setText(cb.getText() + " was just cleared.");
			
		if(cbAlpha.isSelected())
			str += "Alpha ";
		if(cbBeta.isSelected())
			str += "Beta ";
		if(cbGamma.isSelected())
			str += "Gamma";
		
		lblSelected.setText("Selected check boxes: " + str);
	}
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new CBDemo();
			}
		});
	}
}
