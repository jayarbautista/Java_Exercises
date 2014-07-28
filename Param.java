//Pass a parameter to an applet
import java.awt.*;
import java.applet.*;

/*
<applet code="Param" width=300 height=80>
<param name=author value="Herb Schildt">
<param name=purpose value="Demonstrate Parameters">
<param name=version value="2">
</applet>
*/

public class Param extends Applet {
	String author;
	String purpose;
	int version;
	
	public void start() {
		String temp;
		
		author = getParameter("author");
		if(author == null)
			author = "not found";
			
		purpose = getParameter("purpose");
		if(purpose == null)
			purpose = "not found";
			
		temp = getParameter("version");
		try
		{
			if(temp != null)
				version = Integer.parseInt(temp);
			else
				version = 0;
		}
		catch (NumberFormatException exc)
		{
			version = -1;
		}
	}
	
	public void paint(Graphics g) {
		g.drawString("Purpose: " + purpose ,10,20);
		g.drawString("By: " + author, 10,40);
		g.drawString("Version: " + version,10,60);
	}
}
