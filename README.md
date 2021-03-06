# Socket Programming

**Overview:** This socket program is to help users figure out if what they typed is a palindrome or not. A palindrome is a word that is spelled the same forwards as it is backwards such as “Bob”.

**Set Up:**

-   Download the jar file

    -   Go to the GitHub link

    -   Go to the bin folder

    -   There you will find the jar file needed to run the program

-   Save the jar file

**Installation Environment:**

-   You will need Java version 8 to run the program

**How to use the Program:**

-   To use the program via Eclipse:

    -   Download the entire project as a Zip File via the Github Download link.

    -   Open Eclipse and select option to Import project from Zip File

    -   Open the code for PalindromeCheckerServer.

    -   Click on green arrow to Run the code with no arguments. To add a port number as an argument, adjust Run configurations and add port number in Arguments.

    -   Once the server is running, open the code for PalindromeCheckerClient.

    -   Click the green arrow to Run the code for Client with default port and host settings. Otherwise, provide port number first followed by hostname. (Default for host is localhost and default for port is 1200).

    -   In Eclipse console, there is a button to switch views. There is a small arrow to change which program’s output is being displayed. Select an instance of PalindromeCheckerClient.

    -   Now you can type text into the console and the program will tell you if it is a palindrome or not. Enter empty line to terminate that specific client’s connection with the Server and end that instance. You can run multiple clients concurrently.

-   To use the program using command line (also valid for SSH):

    -   Navigate to the jar files in the Github directory by going under
        “bin/com/socketproject”.

    -   Download the jar files for both the Server and the Client classes.

    -   Go to command prompt (or Putty if you are running on SSH) on your computer
        
    -   Go to command prompt (or Putty if you are running on SSH) on your computer
        
    -   ![cmdsearch](https://github.com/CodeRika/SocketProgrammingProject/blob/master/images/cmdsearch.png)

    -   After you open up “command prompt” you want to make sure you are in the same directory that you saved your jar files in.

    -   To do this type cd and write the whole path that your jar file is in not including the jar file
        
    -   ![navigate](https://github.com/CodeRika/SocketProgrammingProject/blob/master/images/navigate.png)

    -   Then type in java –jar and the name of the jar file. First run the Server jar file with either no argument or an argument for Port number.

    -   Open another Command prompt window and navigate to the client jar file. You can add arguments for host and port, or run with the default settings with no arguments.

    -   Your client will now establish a socket connection with the client if the hostname and port number match.

    ![jar](https://github.com/CodeRika/SocketProgrammingProject/blob/master/images/jar.png)

**Screenshots and Usage notes:**

![runbutton](https://github.com/CodeRika/SocketProgrammingProject/blob/master/images/runbutton.png)

-   The Blue Square around the symbol that looks like a green play button is the “Run” program button. You click this button when you are ready for the program to work.

-   The Blue Square around the little computer icon is “display selected console” which will give you the Host you are using and the text to check for a palindrome

![consolechange](https://github.com/CodeRika/SocketProgrammingProject/blob/master/images/consolechange.png)

**Test Result:**

-   If you client runs on Eclipse, you get the following output in the console (PalindromeCheckerClient instance):

![eclipsrun](https://github.com/CodeRika/SocketProgrammingProject/blob/master/images/eclipserun.png)

-   Running on command prompt, you see the following results:

![cmdrun](https://github.com/CodeRika/SocketProgrammingProject/blob/master/images/cmdrun.png)

-   If it is a palindrome it will say “This is a palindrome” or if it isn’t a palindrome it will say “This is NOT a palindrome”. Empty lines terminate the connection for a particular client.
