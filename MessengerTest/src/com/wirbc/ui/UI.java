package com.wirbc.ui;

import java.util.Scanner;

import com.wirbc.message.Message;



public class UI {
	static Scanner inputScanner = new Scanner(System.in);
	@SuppressWarnings("unused")
	public static void main(String args[]) {
		
		String scannerInput = "";
		String message = "";

		 do {
		 
			 System.out.println("Please choose an option");
			 System.out.println("1) Show Recieved");
			 System.out.println("2) Send");
			 System.out.println("3) Recieve");
			 System.out.println("4) Quit");

			 scannerInput = inputScanner.nextLine();
			 
			 switch (scannerInput) {
			 case "1":
				 System.out.println("Show recieved messages");
				 showRcvMsgs();
				 break; 
			 
			 case "2":
				 System.out.println("Send a message");
				 sendMessage();
				 break;
			 case "3":
				 System.out.println("Recieve messages");
				 rcvMessages();
				 break;
			 case "4":
				 break;
			 default:
				 System.err.println("Please type 1,2,3 or 4");
				 break;
			 }
				 
				 
		 
		 } while (!scannerInput.equals("4"));
	}

	private static void rcvMessages() {
		// TODO Auto-generated method stub
		
	}

	private static void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("Please Type in message");
		String messageContent = inputScanner.nextLine();
		
		System.out.println("Please input the address to send to");
		String address = inputScanner.nextLine();
		
		Message message = new Message(messageContent, address);
		
		
	}

	private static void showRcvMsgs() {
		// TODO Auto-generated method stub
		
	}
}
