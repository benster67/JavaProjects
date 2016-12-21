package com.wirbc.coms;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import com.wirbc.message.Message;

public class Communications {
	
	Socket socket;
	ServerSocket serverSocket;
	
	int port = 50_000;
	
	public void sendMessage(Message message) {
		String address = message.getAddress();
		
		try {
			serverSocket = new ServerSocket();
			
			socket = new Socket(address, port);
			serverSocket.accept();
			
			
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public String recieveMessage() {
	
		String data = "";
		
		try {
			DataInputStream input = new DataInputStream(socket.getInputStream());
			data = input.readUTF();
		}
		catch (IOException e){
			e.printStackTrace();
		}
		return data;
	}
}
