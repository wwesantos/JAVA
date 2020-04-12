package other.clientserverwiththread.server;

//Java implementation of Server side 
//It contains two classes : Server and ClientHandler 
//Save file as Server.java 

import java.io.*;  
import java.net.*; 

//Server class 
@SuppressWarnings("resource")
public class Server { 
	
	private static int SERVER_PORT = 5056;
	
	public static void main(String[] args) throws IOException 
	{ 
		// server is listening on port 5056
		ServerSocket serverSocket = new ServerSocket(SERVER_PORT); 
		
		// running infinite loop for getting 
		// client request 
		while (true) { 
			Socket socket = null; 
			
			try{ 
				// socket object to receive incoming client requests 
				socket = serverSocket.accept(); 
				
				System.out.println("A new client is connected : " + socket); 
				
				// obtaining input and out streams 
				DataInputStream dis = new DataInputStream(socket.getInputStream()); 
				ObjectOutputStream dos = new ObjectOutputStream(socket.getOutputStream()); 
				
				System.out.println("Assigning new thread for this client");

				// create a new thread object
				Thread clientHandler = new ClientHandler(socket, dis, dos); 
				clientHandler.start();
				
			} catch (Exception e){ 
				socket.close();
				e.printStackTrace(); 
			} 
		} 
	} 
} 
