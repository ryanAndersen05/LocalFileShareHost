import java.net.Socket;
import java.net.UnknownHostException;
import java.net.Inet4Address;
import java.io.*;


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
	
	
	public TCPSocketHost() 
	{
		try {
			this.localHostAddress = Inet4Address.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
