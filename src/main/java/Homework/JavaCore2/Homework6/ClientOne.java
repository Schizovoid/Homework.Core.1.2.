package Homework.JavaCore2.Homework6;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientOne {
    private static final int PORT = 8189;
    private static final String HOST = "192.168.1.73";
    private DataInputStream in;
    private DataOutputStream out;
    private Thread clientThread;


    public static void main(String[] args) {
    }
    private void start() {
        try (Socket socket = new Socket(HOST, PORT)) {
            System.out.println("Connected to server");
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            startConsoleInput();

            while (!socket.isClosed()) {
                String income = in.readUTF();
                System.out.println("Received: " + income);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                shutdown();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void shutdown() throws IOException {
        if (clientThread != null && clientThread.isAlive()) {
            clientThread.interrupt();
        }
        System.out.println("Client stopped");
    }

    private void startConsoleInput() {
        clientThread = new Thread(() -> {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
                System.out.print("Enter your message >>>>> ");
                while (!Thread.currentThread().isInterrupted()) {
                    if (br.ready()) {
                        String outcome = br.readLine();
                        out.writeUTF(outcome);

                        if (outcome.equals("/end")) {
                            shutdown();
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        clientThread.start();
    }

//    public static void connect() {
//        try {
//            Socket socket = new Socket(HOST, PORT);
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Connected to server");
//            DataInputStream in = new DataInputStream(socket.getInputStream());
//            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
////            setName();
//
//            while (true) {
//                System.out.println("Say something!");
//                String outcome = scanner.nextLine();
//                out.writeUTF(outcome);
//                Thread.sleep(50);
//                String income = in.readUTF();
//                System.out.println("Got the answer: " + income);
//            }
//        } catch (IOException | InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//    public String getName () {
//        return name;
//    }
}
//    public static void setName() {
//        System.out.println("Please input your name.");
//        Scanner scanner = new Scanner(System.in);
//        name = scanner.nextLine();
//    }
//}

