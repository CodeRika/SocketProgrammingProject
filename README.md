**Socket Programming**

**Overview:** This socket program is to help users figure out if what they typed
is a palindrome or not. A palindrome is a word that is spelled the same forwards
as it is backwards such as “Bob”.

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

    -   Click on green arrow to Run the code with no arguments. To add a port
        number as an argument, adjust Run configurations and add port number in
        Arguments.

    -   Once the server is running, open the code for PalindromeCheckerClient.

    -   Click the green arrow to Run the code for Client with default port and
        host settings. Otherwise, provide port number first followed by
        hostname. (Default for host is localhost and default for port is 1200).

    -   In Eclipse console, there is a button to switch views. There is a small
        arrow to change which program’s output is being displayed. Select an
        instance of PalindromeCheckerClient.

    -   Now you can type text into the console and the program will tell you if
        it is a palindrome or not. Enter empty line to terminate that specific
        client’s connection with the Server and end that instance. You can run
        multiple clients concurrently.

-   To use the program using command line (also valid for SSH):

    -   Navigate to the jar files in the Github directory by going under
        “bin/com/socketproject”.

    -   Download the jar files for both the Server and the Client classes.

    -   Go to command prompt (or Putty if you are running on SSH) on your
        computer

![cmdsearch](https://github.com/CodeRika/SocketProgrammingProject/blob/master/images/cmdsearch.png)

    -   After you open up “command prompt” you want to make sure you are in the
        same directory that you saved your jar files in.

    -   To do this type cd and write the whole path that your jar file is in not
        including the jar file

![](media/be4fa508080f84513b679274c06fc779.png)

-   Then type in java –jar and the name of the jar file. First run the Server
    jar file with either no argument or an argument for Port number.

    -   Open another Command prompt window and navigate to the client jar file.
        You can add arguments for host and port, or run with the default
        settings with no arguments.

    -   Your client will now establish a socket connection with the client if
        the hostname and port number match.

    ![](media/df320f8ab96034096075eff0a4fceef1.png)

**Screenshots and Usage notes:**

![](media/a5cefc906c781f3389c34487870e4606.png)

The Blue Square around the symbol that looks like a green play button is the
“Run” program button. You click this button when you are ready for the program
to work.

-   The Blue Square around the little computer icon is “display selected
    console” which will give you the Host you are using and the text to check
    for a palindrome

![](media/fb27e699f10a4a204a6694cc3a819704.png)

**Test Result:**

-   If you program works on Eclipse, you get the following output in the Client console:

![](media/14c72877d9c1d7293925d071f2f8867d.png)

-   Using command prompt, you see the following results:

![](media/132f77630b99928efe9a04dd83a376d8.png)

-   If it is a palindrome it will say “This is a palindrome” or if it isn’t a
    palindrome it will say “This is NOT a palindrome”. Empty lines terminate the
    connection for a particular client.
