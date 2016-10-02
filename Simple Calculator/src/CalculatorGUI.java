import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


@SuppressWarnings("serial")
public class CalculatorGUI extends JFrame implements ActionListener {
	public static JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9, jb0,
			jbT, jbP, jbM, jbD, jbE;
	JPanel panel;
	JLabel display;
	// public static JPanel panel;
	int num1 = 0;
	int tempNum = 0;
	String op = "";

	CalculatorGUI() {

		
		
		super("Ben's Calculator v1.0");
		panel = new JPanel();
		init();

		//window size
		this.setSize(420, 420);
		this.setVisible(true);
	}
	
	CalculatorGUI(int num) {
		super("Ben's Calculator v1.0");
		panel = new JPanel();

		display=new JLabel(""+num);
		panel.add(display);
		init();

		this.setSize(420, 420);
		this.setVisible(true);
	}

	void init() {
		
		
		jb1 = new JButton("1");
		jb2 = new JButton("2");
		jb3 = new JButton("3");
		jb4 = new JButton("4");
		jb5 = new JButton("5");
		jb6 = new JButton("6");
		jb7 = new JButton("7");
		jb8 = new JButton("8");
		jb9 = new JButton("9");
		jb0 = new JButton("0");
		jbP = new JButton("+");
		jbM = new JButton("-");
		jbT = new JButton("X");
		jbD = new JButton("/");
		jbE = new JButton("=");
		
		jb1.setLayout(null);
		
		jb1.setBounds(60, 400, 220, 30);


		
		//adds buttons to the panel
		panel.add(jb1);
		panel.add(jb2);
		panel.add(jb3);
		panel.add(jb4);
		panel.add(jb5);
		panel.add(jb6);
		panel.add(jb7);
		panel.add(jb8);
		panel.add(jb9);
		panel.add(jbP);
		panel.add(jb0);
		panel.add(jbM);
		panel.add(jbT);
		panel.add(jbD);
		panel.add(jbE);

		
		//sees if button is pressed
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		jb6.addActionListener(this);
		jb7.addActionListener(this);
		jb8.addActionListener(this);
		jb9.addActionListener(this);
		jb0.addActionListener(this);
		jbP.addActionListener(this);
		jbM.addActionListener(this);
		jbT.addActionListener(this);
		jbD.addActionListener(this);
		jbE.addActionListener(this);

		this.add(panel, BorderLayout.CENTER);

		this.add(panel);

	}
	
	public void updateLabel(){
		String temp=""+num1;
		display=new JLabel(temp);
	}

	
	//if button pressed
	public void actionPerformed(ActionEvent event) {
		
		
		if(event.getSource() == jbP){
			op="+";
        }
		
		if(event.getSource() == jbM) {
			op="-";
		}
			
		if(event.getSource() == jbT) {
			op="X";
		}
		
		if(event.getSource() == jbD) {
			op="/";
		}
			
         if(op==""){
	        if(event.getSource() == jb1){
	            num1*=10;
	            num1+=1;
	            System.out.println(num1);
	        }
	        
	        else if(event.getSource() == jb2){
	           num1*=10;
	           num1+=2;
	           System.out.println(num1);
	       }
	        else if(event.getSource() == jb3){
	            num1*=10;
	            num1+=3;
	            System.out.println(num1); 
	        }
	        
	        else if(event.getSource() == jb4) {
	        	num1*=10;
	        	num1+=4;
	        	System.out.println(num1);
	        }
	        
	        else if(event.getSource() == jb5){
	            num1*=10;
	            num1+=5;
	            System.out.println(num1);
	        }
	        
	        else if(event.getSource() == jb6){
	            num1*=10;
	            num1+=6;
	            System.out.println(num1);
	        }
	        
	        else if(event.getSource() == jb7){
	            num1*=10;
	            num1+=7;
	            System.out.println(num1);
	        }
	        
	        else if(event.getSource() == jb8){
	            num1*=10;
	            num1+=8;
	            System.out.println(num1);
	        }
	        
	        else if(event.getSource() == jb9){
	            num1*=10;
	            num1+=9;
	            System.out.println(num1);
	        }
	        
	        else if(event.getSource() == jb0){
	            num1*=10;
	            //num1+=0;
	            System.out.println(num1);
	        }
         }
        
         else{
 	        if(event.getSource() == jb1){
 	            tempNum*=10;
 	            tempNum+=1;
 	            System.out.println(tempNum);
 	        }
 	        
 	        else if(event.getSource() == jb2){
 	           tempNum*=10;
 	           tempNum+=2;
 	           System.out.println(tempNum);
 	       }
 	        else if(event.getSource() == jb3){
 	            tempNum*=10;
 	            tempNum+=3;
 	            System.out.println(tempNum); 
 	        }
 	        
 	        else if(event.getSource() == jb4) {
 	        	tempNum*=10;
 	        	tempNum+=4;
 	        	System.out.println(tempNum);
 	        }
 	        
 	        else if(event.getSource() == jb5){
 	            tempNum*=10;
 	            tempNum+=5;
 	            System.out.println(tempNum);
 	        }
 	        
 	        else if(event.getSource() == jb6){
 	            tempNum*=10;
 	            tempNum+=6;
 	            System.out.println(tempNum);
 	        }
 	        
 	        else if(event.getSource() == jb7){
 	            tempNum*=10;
 	            tempNum+=7;
 	            System.out.println(tempNum);
 	        }
 	        
 	        else if(event.getSource() == jb8){
 	            tempNum*=10;
 	            tempNum+=8;
 	            System.out.println(tempNum);
 	        }
 	        
 	        else if(event.getSource() == jb9){
 	            tempNum*=10;
 	            tempNum+=9;
 	            System.out.println(tempNum);
 	        }
 	        
 	        else if(event.getSource() == jb0){
 	            tempNum*=10;
 	            //tempNum+=0;
 	            System.out.println(tempNum);
 	        }
         }
        
        
        if(event.getSource() == jbE){
            //num1+=0;
        	if(op.equalsIgnoreCase("x")) {
    			num1*=tempNum;
    		}
    		if(op.equalsIgnoreCase("+")){
    			num1+=tempNum;
    		}
    		if(op.equalsIgnoreCase("-")) {
    			num1-=tempNum;
    		}
    		if(op.equalsIgnoreCase("/")) {
    			num1/=tempNum;
    		}

	        System.out.println(num1);
	        
    		new CalculatorGUI(num1);
    		dispose();

        }
    }//equals button
}
