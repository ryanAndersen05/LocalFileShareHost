import java.net.Socket;
import java.net.UnknownHostException;
import java.net.Inet4Address;
import java.io.*;
import java.lang.Thread;


public class TCPSocketHost {
	/**
	 * The host port will be used to transfer data to the host. In this case any data we receive will come from this port
	 */
	public final static int HOST_PORT = 90123;
	/**
	 * We will use this port to transfer data to the client. In this case we will use this port to transfer data to other devices
	 */
	public final static int CLIENT_PORT = 12390;
	
	public String localHostAddress;
	public Thread hostReadThread;
	
	public TCPSocketHost() 
	{
		try {
			this.localHostAddress = Inet4Address.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hostReadThread = new HostReadThread();
		hostReadThread.start();
	}

	private class HostReadThread extends Thread
	{
		
		
		@Override
		public void run() 
		{
			while(true) 
			{
				
				try {
					Thread.sleep(1000);
					System.out.println("Next Loop Started");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		public void start() 
		{
			System.out.println("TCP Socket Read Thread Started");
			super.setDaemon(true);
			super.start();
		}
	}
}
