package com.socketproject;

import java.net.*;
import java.util.Scanner;
import java.io.*;

public class PalindromeCheckerClient {
	// initialize socket port number and hostname to default values
	static int port = 1200;
	static String hostName = "localhost";
			
	public static void main(String[] args) {
		//Based on sample provided, input is checked
		//If only 1 argument, then it is identified as the port number
		//If 2 arguments, then first one is port number, second is hostname
		if (args.length==1){
			//get numerical port number from first argument
			String portString = args[0].replaceAll("\\D+","");
			port = Integer.parseInt(portString);
		} else if (args.length==2){
			String portString = args[0].replaceAll("\\D+","");
			port = Integer.parseInt(portString);
			hostName = args[1];
		}
		
		//try to access socket at entered host with entered port number
		try (Socket socket = new Socket(hostName, port)) {
        	System.out.println("Host running on Server:"+ hostName + " on port: " + port);
            System.out.println("Enter text to check for palindrome. Input empty string to terminate connection.");
            
            //Scanner for input from keyboard 
            //Input stream from socket and output printwriter are also initialized
            Scanner scanner = new Scanner(System.in);
            Scanner in = new Scanner(socket.getInputStream());
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            //Using line to verify if line is empty string or not
            String line = null;
            
            //if line is not empty, add to out with given line and display response from server
            while(!(line = scanner.nextLine()).isEmpty()) {
            	out.println(line);
            	String result = in.nextLine();
            	if (result.equals("true")){
            		System.out.println("This is a palindrome");
            	} else{
            		System.out.println("This is NOT a palindrome");	
            	}
                //System.out.println(in.nextLine());
             }
            
            scanner.close();
            System.out.println("Closing connection for this client");
        }
	    catch(IOException ex){ ex.printStackTrace();}
	}
}