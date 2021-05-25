package lesson6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    private static final int PORT = 8790;
    private static BufferedReader inStream;
    private static PrintWriter outStream;
    private static BufferedReader systemIn;
    private static Socket socket;

    public static void main(String[] args) throws IOException {
        socket = new Socket();

        ServerSocket serverSocket = new ServerSocket(PORT);
        System.out.println("Server started. Wait for connection...");
        socket = serverSocket.accept();
        System.out.println("Client connected.");
        inStream = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        outStream = new PrintWriter(socket.getOutputStream(), true);
        systemIn = new BufferedReader(new InputStreamReader(System.in));

        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    while (true){
                        String str = inStream.readLine();
                        System.out.println("Client: " + str);
                        if(str.equals("bye"))
                            System.out.println("Client disconnected!");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    while (true){
                        String str = systemIn.readLine();
                        outStream.println(str);
                        if(str.equals("/end"))
                            break;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
