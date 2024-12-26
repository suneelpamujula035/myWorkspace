package java_programs_07;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class FindingIPAddressOfWebsite_11 {

	public static void main(String[] args) throws UnknownHostException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter website name");
		String website = sc.nextLine();
		InetAddress ip = InetAddress.getByName(website);
		System.out.println("IP address of "+website+" is ----"+ip);
	}

}
