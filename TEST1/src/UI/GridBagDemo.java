package UI;
import java.awt.*;
import javax.swing.*;

public class GridBagDemo extends JFrame {
    public static void main(String args[]) {
        GridBagDemo demo = new GridBagDemo();
    }

    public GridBagDemo() {
        init();
        this.setSize(600,600);
        this.setVisible(true);
    }
    public void init() {
        j1 = new JButton("打开");
        j2 = new JButton("保存");
        j3 = new JButton("另存为");
        j4 = new JPanel();
        String[] str = { "java笔记", "C#笔记", "HTML5笔记" };
        j5 = new JComboBox(str);
        j6 = new JTextField();
        j7 = new JButton("清空");
        j8 = new JList(str);
        j9 = new JTextArea();
        j9.setBackground(Color.pink);
        GridBagLayout layout = new GridBagLayout();
        this.setLayout(layout);
        this.add(j1);//把组件添加进jframe
        this.add(j2);
        this.add(j3);
        this.add(j4);
        this.add(j5);
        this.add(j6);
        this.add(j7);
        this.add(j8);
        this.add(j9);
        GridBagConstraints s= new GridBagConstraints();//定义一个GridBagConstraints，
        
        s.fill = GridBagConstraints.BOTH;
        
       
        s.gridwidth=1;
        s.weightx = 0;
        s.weighty=0;
        layout.setConstraints(j1, s);
        s.gridwidth=1;
        s.weightx = 0;
        s.weighty=0;
        layout.setConstraints(j2, s);
        s.gridwidth=1;
        s.weightx = 0;
        s.weighty=0;
        layout.setConstraints(j3, s);
        s.gridwidth=0;
        s.weightx = 0;
        
        s.weighty=0;
        layout.setConstraints(j4, s)
        ;s.gridwidth=2;
        s.weightx = 0;
        s.weighty=0;
        layout.setConstraints(j5, s);
        ;s.gridwidth=4;
        s.weightx = 1;
        s.weighty=0;
        layout.setConstraints(j6, s);
        ;s.gridwidth=0;
        s.weightx = 0;
        s.weighty=0;
        layout.setConstraints(j7, s);
        ;s.gridwidth=2;
        s.weightx = 0;
        s.weighty=1;
        layout.setConstraints(j8, s);
        ;s.gridwidth=5;
        s.weightx = 0;
        s.weighty=1;
        layout.setConstraints(j9, s);
    }
    JButton j1;
    JButton j2;
    JButton j3;
    JPanel j4;
    JComboBox j5;
    JTextField j6;
    JButton j7;
    JList j8;
    JTextArea j9;
}
