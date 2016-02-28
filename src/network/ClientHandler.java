package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientHandler {
	Socket server;
	int port;
	ClientHandler(Socket conn,int port){
		this.server=conn;
		this.port=port;
	}
	
	public void run(){
		System.out.println("Just connected to "
                + server.getRemoteSocketAddress());
         DataInputStream in = null;
		try {
			in = new DataInputStream(server.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          try {
			System.out.println(in.readUTF());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          DataOutputStream out = null;
		try {
			out = new DataOutputStream(server.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          try {
			out.writeUTF("Thank you for connecting to "
			    + server.getLocalSocketAddress() + "\nGoodbye!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
