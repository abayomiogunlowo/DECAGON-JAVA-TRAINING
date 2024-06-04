package class_activities_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientClass {

    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost", 3000);
        PrintWriter output = new PrintWriter(client.getOutputStream(), true);
        BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));

        output.println("Hello from client");

        String response = input.readLine();
        System.out.println("Server : " + response);

        output.close();
        input.close();
        client.close();
    }
}