package network;

import PeerNode;

import java.io.IOException;
import java.net.UnknownHostException;

public class MasterRun {

	public static void main(String[] args) throws UnknownHostException, IOException{
		PeerNode p1=new PeerNode(5678,"/Users/anandgoyal/Desktop/Java/workspace/KeyValueStore/keys/5678.txt");
		PeerNode p2=new PeerNode(5679,"/Users/anandgoyal/Desktop/Java/workspace/KeyValueStore/keys/5679.txt");
		PeerNode p3=new PeerNode(5680,"/Users/anandgoyal/Desktop/Java/workspace/KeyValueStore/keys/5680.txt");
		
		p1.asClient("localhost", 5679);
		p2.asClient("localhost", 5680);
		p3.asClient("localhost", 5678);
		
		
	}

}
