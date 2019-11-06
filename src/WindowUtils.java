

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

//////////////////Class for getting the size of the screen and locate the frame in the center of the screen/////////////////

public class WindowUtils {
	static Dimension size = Toolkit.getDefaultToolkit().getScreenSize();	
	static int screenW = size.width;
	static int screenH = size.height;
	
	public static void CenterOnScreen(JFrame frame)
	{
		frame.setBounds(screenW/2-frame.getWidth()/2, screenH/2-frame.getHeight()/2, frame.getWidth(), frame.getHeight());
	}
}
