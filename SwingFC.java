//A swing-based file comparison utility

import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SwingFC implements ActionListener {
	JTextField txtFirst;
	JTextField txtSecond;
	
	JButton btnCompute;
	
	JLabel lblFirst, lblSecond;
	JLabel lblResult;
	
	SwingFC() {
		JFrame frm = new JFrame("A Text Field Example");
		frm.setLayout(new FlowLayout());
		frm.setSize(200,190);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lblFirst = new JLabel("First File");
		lblSecond = new JLabel("Second File");
		lblResult = new JLabel("");
		
		txtFirst = new JTextField(14);
		txtSecond = new JTextField(14);
		
		btnCompute = new JButton("Compare");
		btnCompute.addActionListener(this);
		
		frm.add(lblFirst);
		frm.add(txtFirst);
		frm.add(lblSecond);
		frm.add(txtSecond);
		frm.add(btnCompute);
		frm.add(lblResult);
		
		frm.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		int i = 0, j = 0;
		
		if( txtFirst.getText().equals("") ) {
			lblResult.setText("First file name missing.");
			return;
		}
		
		if( txtSecond.getText().equals("") ) {
			lblResult.setText("Second file name missing.");
			return;
		}
		
		try
		{
			FileInputStream f1 = new FileInputStream(txtFirst.getText());
			FileInputStream f2 = new FileInputStream(txtSecond.getText());
			
			do
			{
				i = f1.read();
				j = f2.read();
				
				if( i != j )
					break;
			} while (i != -1 && j != -1);
			
			if( i != j )
				lblResult.setText("Files are not the same.");
			else
				lblResult.setText("Files are the same.");
		}
		catch (IOException exc)
		{
			lblResult.setText("Error");
		}	
	}
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new SwingFC();
			}
		});
	}
}
