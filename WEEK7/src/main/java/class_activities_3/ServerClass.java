package class_activities_3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerClass {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(3000);

        System.out.println("Server is waiting for client...");
        Socket clientSocket = server.accept();
        System.out.println("Client is connected");
        BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true);

        output.println("Hello from server!");

        input.close();
        output.close();
        clientSocket.close();
        server.close();
    }
}
