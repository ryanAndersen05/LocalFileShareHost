

/**
 * This is the main class that will launch our file share host
 * @author Ryan Andersen
 */
public class FileShareHostMain {
	public final static int Build = 0;
	public final static int Version = 1;
	
	public static void main(String[] args)
	{
		TCPSocketHost socketHost = new TCPSocketHost();
	}
	
	public static String GetVersionAsString() 
	{
		return Build + "." + Version;
		
	}

}
