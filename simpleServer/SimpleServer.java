package simpleServer;

import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
    public static void main(String[] args) {
        int port = 8080;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening on PORT " + port);

            while (true) {
                System.out.println("WHile Loop Iteration");
                Socket socket = serverSocket.accept();
                System.out.println("New Client Connection");

                // handle the client on a seperate thread
                new ClientHandler(socket).start();
            }
        } catch (Exception e) {
            System.out.println("Server exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
