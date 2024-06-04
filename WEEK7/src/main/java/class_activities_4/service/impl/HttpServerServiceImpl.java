package class_activities_4.service.impl;

import class_activities_4.service.HttpServerService;
import class_activities_4.utils.HttpHandler;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static class_activities_4.common.SimpleHttpServer.PORT;

public class HttpServerServiceImpl implements HttpServerService {
    @Override
    public void start(int port){
        try(ServerSocket serverSocket = new ServerSocket(PORT)){
            System.out.println("Server started on port: " + port);

            while (true){
                Socket socket = serverSocket.accept();
                System.out.println("New connection from: " + socket.getRemoteSocketAddress());
                new HttpHandler(socket).start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}