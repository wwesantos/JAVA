package other.clientserverwiththread.client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.List;
import java.util.Scanner;

import domain.Employee;

/**
 * Sources
 * https://www.geeksforgeeks.org/introducing-threads-socket-programming-java/
 * https://howtodoinjava.com/java/collections/arraylist/serialize-deserialize-arraylist/
 */

@SuppressWarnings("unchecked")
public class Client {
	public static void main(String[] args) throws IOException{
		
		try
        { 
            Scanner scn = new Scanner(System.in); 
              
            // getting localhost ip 
            InetAddress ip = InetAddress.getByName("localhost"); 
      
            // establish the connection with server port 5056 
            Socket s = new Socket(ip, 5056); 
      
            // obtaining input and out streams
            ObjectInputStream dis = new ObjectInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream()); 
      
            while (true)  
            { 
            	Thread.sleep(1000);
            	System.out.println("Who are you looiking for? \nType 'exit' to terminate\n");
                String tosend = scn.nextLine();
                
                dos.writeUTF(tosend); 
                  
                // If client sends exit,close this connection  
                // and then break from the while loop 
                if(tosend.equals("exit")) { 
                    System.out.println("Closing this connection : " + s); 
                    s.close(); 
                    System.out.println("Connection closed"); 
                    break; 
                }
                
                // printing list received 
				List<Employee> received = (List<Employee>)dis.readObject();
				received.forEach(System.out::println);
            } 
              
            // closing resources 
            scn.close(); 
            dis.close(); 
            dos.close(); 
        }catch(Exception e){ 
            e.printStackTrace(); 
        } 
	}
}
