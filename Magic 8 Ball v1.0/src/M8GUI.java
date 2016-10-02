import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



@SuppressWarnings("serial")
public class M8GUI extends JFrame implements ActionListener{
	public static JButton think;

	JPanel panelControl;
	JPanel centerPanel;
	
	JPanel panel;
	JLabel display;
	JTextField question;
	 boolean stuff=true;
	
	M8GUI() {
		
		super("Magic 8 Ball v1.0");
		panel = new JPanel();
		panelControl=new JPanel();
		centerPanel = new JPanel();
		init();
		display = new JLabel("");
		panelControl.add(display);
		
		this.setSize(1000,720);
		this.setVisible(true);
		
	}
	
	M8GUI(String string){
		super("Magic 8 Ball v1.0");
		panel = new JPanel();
		panelControl=new JPanel();
		centerPanel = new JPanel();
		
		display = new JLabel(""+string);
		panelControl.add(display);
		init();
		
		this.setSize(1000,720);
		this.setVisible(true);
	}
	 void init() {
		question = new JTextField(60);
		 
		 think = new JButton("Think");

		 
		 think.setBounds(400,400,300,160);
		 
		 panel.add(think);
		 centerPanel.add(question);
		 
		 think.addActionListener(this);
		 
		 this.add(panel, BorderLayout.SOUTH);
		 this.add(centerPanel, BorderLayout.CENTER);
		 this.add(panelControl, BorderLayout.NORTH);
		 
	 }
	 
	 @SuppressWarnings("static-access")
	public void actionPerformed(ActionEvent event) {
		 
		 if(event.getSource() == think) {
				Random rand=new Random();
				
				int thought=rand.nextInt(2);
				for(int i=0;i<thought;i++){
					try {
						Thread.currentThread().sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				//temp.dispose();
				
			 switch(rand.nextInt(6)) {
				
				case 0:
					new M8GUI("Yes");
					dispose();
					break;
				
				case 1:
					new M8GUI("No");
					dispose();
					break;
					
				case 2:
					new M8GUI("NO WAY!");
					dispose();
					break;
					
				case 3:
					new M8GUI("OMG YES!");
					dispose();
					break;
					
				case 4:
					new M8GUI("TOTALLY!!!");
					dispose();
					break;
					
				default:
					new M8GUI("Nope");
					dispose();
					break;
					
				}
		 }
	 }
}
