package other.clientserverwiththread.server;

import other.clientserverwiththread.domain.Employee;
import other.clientserverwiththread.repo.EmplyeeDAO;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;

//ClientHandler class 
public class ClientHandler extends Thread { 
	final DataInputStream dis; 
	final ObjectOutputStream dos; 
	final Socket s; 
	

	// Constructor 
	public ClientHandler(Socket s, DataInputStream dis, ObjectOutputStream dos) { 
		this.s = s; 
		this.dis = dis; 
		this.dos = dos; 
	} 

	@Override
	public void run() { 
		String filterBy; 
		while (true) { 
			try {
				// receive the answer from client 
				filterBy = dis.readUTF(); 
				
				if(filterBy.equals("exit")) { 
					closeConnection();
					break; 
				} 
				
				List<Employee> result = EmplyeeDAO.getBy(filterBy);
				dos.writeObject(result);
				
			} catch (IOException e) { 
				e.printStackTrace(); 
			} 
		} 
		
		closeReseources(); 
	}

	private void closeConnection() throws IOException {
		System.out.println("Client " + this.s + " sends exit..."); 
		System.out.println("Closing this connection."); 
		this.s.close(); 
		System.out.println("Connection closed");
	}

	private void closeReseources() {
		try{ 
			this.dis.close(); 
			this.dos.close(); 
			
		}catch(IOException e){ 
			e.printStackTrace(); 
		}
	} 
	

} 