
import java.util.Scanner;
/**
 * This is the main class that will launch our file share host
 * @author Ryan Andersen
 */
public class FileShareHostMain {
	public final static int Build = 0;
	public final static int Version = 1;
	
	public static void main(String[] args)
	{
		System.out.println("File Transfer Host Has Started");
		System.out.println("Version: " + Build + "." + String.format("%02d", Version));
		TCPSocketHost socketHost = new TCPSocketHost();
		System.out.println("Local Host: " + socketHost.localHostAddress.split("\\.")[3]);
		String input = "";
		
		Scanner in = new Scanner(System.in);
		while (input != "q") 
		{
			input = in.nextLine();
			
		}
	}
	
	public static String GetVersionAsString() 
	{
		return Build + "." + Version;
		
	}

}
