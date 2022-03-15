package com.company;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        String from = "s215525@dtu.dk";
        String to = "bhsi@dtu.dk";
        String subject = "smtp server";
        String text = "Hello this is a test";
        String localServer = "smtp2.bhsi.xyz";

        Scanner input = new Scanner(System.in);
/*
        from = input.nextLine();
        to = input.nextLine();
        subject = input.nextLine();
        text = input.nextLine();

 */
        Message message = new Message(from,to,subject,text);
        Envelope envelope = new Envelope(message,localServer);
        SMTPConnection smtp = new SMTPConnection(envelope);
        smtp.send(envelope);
        smtp.close();
    }
}
