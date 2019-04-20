package com.socketproject;

import java.net.*;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.io.*;

public class PalindromeCheckerServer{
	// initialize socket port to default value
	static int port = 1200;

	
	public static void main(String[] args) {
		//check if port was supplied
		if (args.length==1){
			String portString = args[0].replaceAll("\\D+","");
			port = Integer.parseInt(portString);
		} 
		
		//verify port less than 1024 is not being used
		if (port < 1024){
			System.out.println("Run with port number greater than 1024");
			return;
		}
		
		//Use Serversocket to launch server on specified port
		//Fails if current port is already being used
		try (ServerSocket listener = new ServerSocket(port)){
            System.out.println("The server is running on port: " + port);
            
            //Allow a maximum of 20 threads to not use up all resources
            ExecutorService pool = Executors.newFixedThreadPool(20);
            
            //When new client request comes in, call PalindromeChecker static class for that client
            while (true) {
                pool.execute(new PalindromeChecker(listener.accept()));
            }
            
        } catch (IOException e) {
			System.out.println("Port is being used, try with different port number");
			System.out.println("Error description:");
			e.printStackTrace();
		}
	}
	
	
	/*
	 * static class whose instance is created with a Socket input each time a client request comes in
	 * Implemented Runnable since multiple threads will be run at a time
	 */
	private static class PalindromeChecker implements Runnable {
		private Socket socket;
		
		/*constructor sets socket value from client */
		PalindromeChecker(Socket socket){
			this.socket = socket;
		}
		
		@Override
		public void run() {
            System.out.println("Connected: " + socket);
            try {
            	//get input stream from client and write output to be returned
            	Scanner in = new Scanner(socket.getInputStream());
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                //for each line that is passed, test for palindrome by calling the isPalindrome method
                while (in.hasNextLine()){
                	String s = in.nextLine();
                	out.println(isPalindrome(s));
                }

            } catch (Exception e) {
                System.out.println("Error:" + socket);
            } finally {
                try { socket.close(); } catch (IOException e) {}
                System.out.println("Closed: " + socket);
            }
 		}

		/* Return true if a string is a palindrome */
		public static boolean isPalindrome(String s) {
			// Create a new string by eliminating non-alphanumeric chars, and converting to lower case
			String s1 = filter(s).toLowerCase();

			// Create a new string that is the reversal of s1
			String s2 = reverse(s1);

			// Compare if the reversal is the same as the original string
			return s2.equals(s1);
		}

		/** Create a new string by eliminating non-alphanumeric chars */
		public static String filter(String s) {
			// Create a string buffer
			StringBuilder strBuf = new StringBuilder();

			// Examine each char in the string to skip alphanumeric char
			for (int i = 0; i < s.length(); i++) {
				if (Character.isLetterOrDigit(s.charAt(i))) {
					strBuf.append(s.charAt(i));
				}
			}
			// Return a new filtered string
			return strBuf.toString();
		}

		/** Create a new string by reversing a specified string */
		public static String reverse(String s) {
			StringBuilder strBuf = new StringBuilder(s);
			strBuf.reverse(); // Use the reverse method for StringBuilder object
			return strBuf.toString();
		}
	}
}