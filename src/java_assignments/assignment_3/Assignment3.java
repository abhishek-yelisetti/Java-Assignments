//Write a java function that will ping any host ( given as input ) and computes the median of the time taken to ping.
//Use the system ping utility, do not use any deprecated methods.

package java_assignments.assignment_3;

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

