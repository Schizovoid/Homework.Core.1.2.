package Homework.JavaCore2.Homework6;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.List;

public class Server {
        private static final int PORT = 8189;
        private List<Handler> handlers;

    public void start() {
            try (ServerSocket serverSocket = new ServerSocket(PORT)) {
                while (true) {
                System.out.println("Server started");
                Socket socket = serverSocket.accept();
                System.out.println("Client connected");
                Handler handler = new Handler(socket, this);
                handlers.add(handler);
                handler.handle();
//                DataInputStream in = new DataInputStream(socket.getInputStream());
//                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            }



            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public void broadcast (String message){
        for (Handler handler : handlers){
            handler.Send(message);
        }

        }
    }
