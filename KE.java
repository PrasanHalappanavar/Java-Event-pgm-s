package Lab2;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class KE extends Applet implements KeyListener{
	String str="KEY EVENT";
	int x=40, y=40;
	public void init(){
		setBackground(Color.YELLOW);
		setForeground(Color.RED);
		addKeyListener(this);
	}
	public void keyPressed(KeyEvent ke){
		str="Key Pressed";
		repaint();
	}
	public void keyReleased(KeyEvent ke){
		str="Key Released";
		repaint();
	}
	public void keyTyped(KeyEvent ke){
		str="Key Typed";
		repaint();
	}
	public void paint(Graphics g){
		g.drawString(str,x,y);
	}
}

