package Lab1;
import java.awt.*;
import java.awt.event.*;
public class ME extends MouseAdapter{
	Label l;
	Frame f;
	ME(){
		f=new Frame();
		l=new Label();
		f.add(l);
		f.addMouseListener(this);
		f.addMouseMotionListener(this);
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(null);
		l.setBounds(200,50,100,20);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}
	public void mouseClicked(MouseEvent me){
		l.setText("Mouse Clicked");
	}
	public void mouseMoved(MouseEvent me){
		l.setText("Mouse Moved");
	}
	public void mouseReleased(MouseEvent me){
		l.setText("Mouse Released");
	}
	public void mouseDragged(MouseEvent me){
		l.setText("Mouse Dragged");
	}
	public void mousePressed(MouseEvent me){
		l.setText("Mouse Pressed");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ME();
	}

}
