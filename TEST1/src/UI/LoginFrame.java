package UI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame implements ActionListener{
	static JTextField name=new JTextField();
	static JPasswordField password=new JPasswordField();

	public LoginFrame(){
		
		this.setLayout(null);
		this.setSize(400,300);
		this.setLocation(100, 100);
		JPanel p1=new JPanel();
		p1.setLayout(null);
		p1.setSize(400,300);
		p1.setLocation(0,0);
		this.add(p1);
		//JTextField name=new JTextField();
		name.setLayout(null);
		name.setSize(200,30);
		name.setLocation(100,50);
		p1.add(name);
		//JPasswordField password=new JPasswordField();
		
		password.setLayout(null);
		password.setSize(200,30);
		password.setLocation(100,90);
		p1.add(password);
		JLabel nameIn=new JLabel("ÕË»§");
		nameIn.setLayout(null);
		nameIn.setSize(50,30);
		nameIn.setLocation(50,50);
		p1.add(nameIn);
		JLabel passIn=new JLabel("ÃÜÂë");
		passIn.setLayout(null);
		passIn.setSize(50,30);
		passIn.setLocation(50,90);
		p1.add(passIn);
		JButton login=new JButton("µÇÂ½");
		login.setLayout(null);
		login.setSize(50,40);
		login.setLocation(100,150);
		login.addActionListener(new LoginListener());
		p1.add(login);
		JButton register=new JButton("×¢²á");
		register.setLayout(null);
		register.setSize(50,40);
		register.setLocation(180,150);
		p1.add(register);
		this.setVisible(true);
		
		
	}	
	
	public static void main(String[] args){
		
		LoginFrame test = new LoginFrame();
		
	}

	/*public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		this.dispose();
		MainFrame mf = new MainFrame();
		
	}*/
	class LoginListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			String s1=name.getText();
			//PasswordField password;
			String s2=String.valueOf(password.getPassword());
			boolean isUser=false;
			try {
				isUser=this.judge(s1,s2);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(isUser==true){
					dispose();
					MainFrame mf=new MainFrame();
				
			}else{
				dispose();
				WrongFrame wf=new WrongFrame();
			}
		}

		
	

    private boolean judge(String id, String password) throws IOException {
		// TODO Auto-generated method stub
		boolean result=false;
		File file = new File("user.txt");
        BufferedReader reader = null;
        
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1; 
            while ((tempString = reader.readLine()) != null) {
            	 if(tempString.split(";")[0].equals(id)&&tempString.split(";")[1].equals(password)){
                 	result = true;
                 }
                 line++;}
          return result;
               
        	
}
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}