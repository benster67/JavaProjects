import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.JFrame;


@SuppressWarnings("unused")
public class Magic8Ball {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		new M8GUI();
		
		@SuppressWarnings("resource")
		Scanner PlayerInput=new Scanner(System.in);
		

		String playerInput="";
		int thought=5;
		Random rand=new Random();

		System.out.println("Ask a Yes or No Question!");
		playerInput=PlayerInput.nextLine();
		
		
		while(!playerInput.equalsIgnoreCase("quit")){
			
			while (playerInput.length()<2) {
				if(playerInput.equalsIgnoreCase("") ){
					System.out.println("Please ask a question.");
				}else{
					System.out.println("You need to ask a longer question.");
				}
				playerInput=PlayerInput.nextLine();
			}
			
			System.out.println("Thinking...");
			
			thought=rand.nextInt(4);
			for(int i=0;i<thought;i++){
				try {
					Thread.currentThread().sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
			
			switch(rand.nextInt(6)) {
			
			case 0:
				System.out.println("Yes");
				break;
			
			case 1:
				System.out.println("No");
				break;
				
			case 2:
				System.out.println("NO WAY!");
				break;
				
			case 3:
				System.out.println("OMG YES!");
				break;
				
			case 4:
				System.out.println("TOTALLY!!!");
				break;
				
			default:
				System.out.println("Nope");
				break;
				
			}

			System.out.println("Ask a Yes or No Question!");
			PlayerInput=new Scanner(System.in);
			playerInput=PlayerInput.nextLine();
		}
	}
		
}
	


