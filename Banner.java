//Applet and Thread
import java.awt.*;
import java.applet.*;

/*
<applet code="Banner" width=300 height=50>
</applet>
*/

public class Banner extends Applet implements Runnable {
	String msg = "Java Rules the Web. ";
	Thread thrd;
	boolean stopFlag;
	
	//initialize thread to null
	public void init() {
		thrd = null;
	}
	
	public void start() {
		thrd = new Thread(this);
		stopFlag = false;
		thrd.start();
	}
	
	public void run() {
		//redisplay banner
		for(;;) {
			try
			{
				repaint();
				Thread.sleep(250);
				if(stopFlag)
					break;
			}
			catch (InterruptedException exc)
			{
				System.out.println(exc);
			}
			
		}
	}
	
	//pause the banner
	public void stop() {
		stopFlag = true;
		thrd = null;
	}
	
	//display the banner
	public void paint(Graphics g) {
		char ch;
		ch = msg.charAt(0);
		msg = msg.substring(1,msg.length());
		msg += ch;
		g.drawString(msg,50,30);
	}
}
