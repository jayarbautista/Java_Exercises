//First Simple Swing Program
import javax.swing.*;

public class SwingDemo {
	
	SwingDemo() {
		//create a new JFrame Container
		JFrame jfrm = new JFrame("A Simple Swing Application");
		
		//give the frame an initial size
		jfrm.setSize(275,100);
		
		//terminate the program when the user closes the application
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Create a text-based label
		JLabel jlab = new JLabel(" Swing defines the modern Java GUI.");
		
		//add the label to the content pane
		jfrm.add(jlab); 
		
		//jfrm.getContentPane().add(jlab); --- old style in JDK 5
		
		//display the frame
		jfrm.setVisible(true);
	}
	
	public static void main(String args[]) {
		//create the frame on the event dispatching thread.
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new SwingDemo();
			}
		});
		
		//new SwingDemo(); --- invalid, might lead to problems
	}
}
