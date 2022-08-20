package Homework.JavaCore2.Homework6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientTwo {
    private static final int PORT = 8189;
    private static final String HOST = "192.168.1.73";
    public static String name;

    public static void main(String[] args) {
        connect();
    }

    public static void connect() {
        try {
            Socket socket = new Socket(HOST, PORT);
             Scanner scanner = new Scanner(System.in);
            System.out.println("Connected to server");
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            while (true) {
                String outcome = scanner.nextLine();
                out.writeUTF(outcome);
                Thread.sleep(50);
                String income = in.readUTF();
                System.out.println("Got the answer: " + income);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

//    public String getName() {
//        return name;
//    }
}
//
//    public static void setName() {
//        System.out.println("Please input your name.");
//        Scanner scanner = new Scanner(System.in);
//        name = scanner.nextLine();
//    }
//}
