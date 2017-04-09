import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Label;
import java.io.IOException;
import java.net.Socket;

public class BoxClient extends Applet implements Runnable {
	int sizeX = 500; 
	int sizeY = 500;
	
	Socket Connection;
	Label status = new Label();
	
	boolean Connected = false;
	
	public void init(){
		resize(sizeX, sizeY);
		add(status);
	}
	
	public void run() {
		try {
			Connection = new Socket("localhost", 2001);
			this.Connected = true;
		} catch (Exception e1) {
			System.out.println("Error!");
		}
		while(Connected){
			System.out.println("connected on port: " + Connection.getPort());
		}
	}
	
	public void paint(Graphics g){
	}
	
	public void start(){
		new Thread(this).start();
	}

}
