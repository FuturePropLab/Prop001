package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MainFrame extends JFrame{
	JMenuBar b=new JMenuBar();
	GridBagLayout layout ;
	GridBagConstraints s;
	JFrame j=new JFrame();
	JPanel Mainp=new JPanel();
	JPanel p;
	
	public MainFrame(){
		j=this;
		this.setLayout(layout);
		this.setSize(500,500);
		//this.setLocation(100,100);	
		
		layout = new GridBagLayout();
		s= new GridBagConstraints();
		this.setLayout(layout);
		
		
		b=new JMenuBar();
		b.setBackground(Color.BLUE);
		s.fill = GridBagConstraints.BOTH;
		s.gridwidth=1;
		s.weightx=0;
		s.weighty=0;
		layout.setConstraints(b,s);
		this.add(b);
		JButton j1=new JButton("添加记录");
		b.add(j1);
		j1.addActionListener(new AddListener());
		JButton j2=new JButton("查看记录");
		b.add(j2);
		j2.addActionListener(new FindListener());
		JButton j3=new JButton("退出");
		b.add(j3);
		j3.addActionListener(new ExitListener());
		
		
		p=new JPanel();
		//p.setBackground(Color.BLACK);
		p.setLayout(new BorderLayout());
		s.gridwidth=0;
		s.weightx=0;
		s.weighty=0;
		layout.setConstraints(p, s);
		this.add(p);
		
		
		//JPanel p2=new JPanel();
		Mainp.setBackground(Color.LIGHT_GRAY);
		s.gridwidth=0;
		s.gridheight=0;
		s.weightx=1;
		s.weighty=1;
		layout.setConstraints(Mainp, s);
		this.add(Mainp);
		
/*		JPanel p1=new JPanel();
		p1.setBackground(Color.BLACK);
		
		s.fill = GridBagConstraints.BOTH;
//		s.gridx=0;
//		s.gridy=0;
		s.gridheight=1;
		s.gridwidth=2;
		s.weightx = 1;
		s.weighty = 1;
		layout.setConstraints(p1, s);
		
		this.add(p1);
		
		JPanel p2=new JPanel();
		p2.setBackground(Color.BLUE);
		s.fill = GridBagConstraints.BOTH;
//		s.gridx=1;
//		s.gridy=0;
		s.gridheight=1;
		s.gridwidth=0;
		s.weightx = 2;
		s.weighty = 1;
		layout.setConstraints(p2, s);
		this.add(p2);
		
		
		JPanel p3=new JPanel();
		p3.setBackground(Color.CYAN);
		s.fill=GridBagConstraints.BOTH;
//		s.gridx=0;
//		s.gridy=1;
		s.gridheight=1;
		s.gridwidth=0;
		//s.weightx = 1;
		//s.weighty = 1;
		layout.setConstraints(p3, s);
		this.add(p3);
		
		JPanel p4=new JPanel();
		p4.setBackground(Color.RED);
		s.fill=GridBagConstraints.BOTH;
//		s.gridx=0;
//		s.gridy=1;
		s.gridheight=0;
		s.gridwidth=0;
		s.weightx = 1;
		s.weighty = 2;
		layout.setConstraints(p4, s);
		this.add(p4);
		
		JPanel p5=new JPanel();*/
		
		
		
		
		
		
		
		
		
		
		this.setVisible(true);
	}
	
	public static void main(String[] args){
		MainFrame test = new MainFrame();
		
	}
	
	class AddListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String[]columNames={"销售员编号","货物编号","销售数目","总计价格"};
			String[][] content = {{"1","1","1","1"}};
			   JButton confirm=new JButton("确认");
		        //Mainp.add(confirm, BorderLayout.NORTH);
			//JTable table=new JTable();
			//table.setBackground(Color.BLUE);
			//p.add(table);
			JTable table = new JTable(content,columNames);
	        table.setPreferredScrollableViewportSize(new Dimension(550, 30));
	        JScrollPane scrollPane = new JScrollPane(table);
//	        j.getContentPane().add(scrollPane, BorderLayout.CENTER);
	       // j.setTitle("表格测试窗口");
//	        j.pack();
//	        table.setBackground(Color.yellow);
//	        scrollPane.setBackground(Color.blue);
//	        Mainp.setBackground(Color.red);
	        Mainp.add(scrollPane,BorderLayout.NORTH);
	        Mainp.add(confirm, BorderLayout.SOUTH);
	        Mainp.repaint();
	        j.repaint();
	        j.revalidate();
	       
//	        System.out.println("test");
	        //j.setVisible(true);
			
			
		}
}
	class FindListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			Mainp.setBackground(Color.PINK);
			
		}
	}
	
	class ExitListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			j.dispose();
			
		
		}
	}
	
}
