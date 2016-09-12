package UI;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WrongFrame extends JFrame{
	public WrongFrame(){
		JLabel b=new JLabel("´íÎó");
		this.setSize(150,100);
		this.center(this);
		JPanel p=new JPanel();
		this.add(p);
		p.add(b);
		this.setVisible(true);
		
	}
	public static void center(JFrame frame){
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = frame.getWidth();
        int height = frame.getHeight();
        frame.setLocation( (screensize.width - width) / 2,
                      (screensize.height - height) / 2);
    }
}
