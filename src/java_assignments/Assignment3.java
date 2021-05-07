//Write a java function that will ping any host ( given as input ) and computes the median of the time taken to ping.
//Use the system ping utility, do not use any deprecated methods.

package java_assignments;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the IP address of the host to ping : ");
		String ipAddress = sc.nextLine();
		
		PingHost pingHost = new PingHost(ipAddress);
		pingHost.pingHostWithIpAddress();
	 }
}

class PingHost{
	private String ipAddress;
	
	public PingHost(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	
	/*	Method which uses Runtime class exec() command to run the ping command with the IP address
	 * 	provided in the input.
	 *  It uses a BufferedReader to read the input stream of bytes and prints the response from the
	 *  server which is connected.
	 * 
	 */
	
	public void pingHostWithIpAddress() {
		
		try {
			Process p = Runtime.getRuntime().exec("ping " + ipAddress);
			BufferedReader inputStream = new BufferedReader(
					new InputStreamReader(p.getInputStream()));

			String s = "";
			// reading output stream of the command
			while ((s = inputStream.readLine()) != null) {
				System.out.println(s);
			}

		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	
}
