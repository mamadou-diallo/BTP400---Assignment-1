package btp400ass1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ClassNotFoundException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    
    //static ServerSocket variable
    private static ServerSocket server;
    //socket server port on which it will listen
    private static int port;
    
    public static void main(String args[]) throws IOException, ClassNotFoundException{
        
    	ArrayList<String> stations = new ArrayList<String>();
    	stations.add("BrakeStation.java");
    	stations.add("ChassisStation.java");
    	stations.add("CollisionSensorsStation.java");
    	stations.add("GearBoxStation.java");
    	stations.add("PaintStation.java");
    	stations.add("TransmissionStation.java");
    	stations.add("VINStation.java");
    	
    	//create the socket server object
        server = new ServerSocket(port);
        //keep listens indefinitely until receives 'exit' call or program terminates
        while (true) {
            System.out.println("Waiting for the client request");
            
            //creating socket and waiting for client connection
            Socket socket = server.accept();
            
            for (int i = 0; i < stations.size(); ++i) {
            	
            }
            
            //read from socket to ObjectInputStream object
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            
            //convert ObjectInputStream object to String
            String message = (String) inputStream.readObject();
            System.out.println("Message Received: " + message);
            
            //create ObjectOutputStream object
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            
            //write object to Socket
            outputStream.writeObject("Hi Client " + message);
            
            //close resources
            inputStream.close();
            outputStream.close();
            socket.close();
            
            //terminate the server if client sends exit request
            if (message.equalsIgnoreCase("exit")) 
            	break;
        }
        System.out.println("Shutting down Socket server!!");
        server.close();
    }
    
}
