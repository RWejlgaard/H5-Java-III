import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.applet.*;

public class BoxServer extends Applet implements Runnable {
	boolean player1Connected = false;
	boolean player2Connected = false;
	
	Label status = new Label();
	
	public void init(){
		resize(200, 100);
		add(status);
	}
	
	public void run() {
		status.setText("Starting Server...");
		Player player1 = new Player(1, 2001);
		status.setText("Player1 connected waiting for player2");
		Player player2 = new Player(2, 2002);
		status.setText("Server Started!");
		boolean started = false;
		while (started) {
			
		}
	}
	
	public void start(){
		new Thread(this).start();
	}

}

class Player {
	int id;
	int port;
	int posX, posY;
	boolean connected = false;
	ServerSocket socket;
	Socket connection;
	
	public Player(int id, int port){
		this.id = id;
		this.port = port;
		try {
			this.socket = new ServerSocket(port);
			this.connection = this.socket.accept();
			this.connection.
			this.connected = true;
		} catch (Exception e) {
			e.printStackTrace();
			this.connected = false;
		}
	}
}


