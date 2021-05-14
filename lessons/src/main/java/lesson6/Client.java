package lesson6;

import java.io.*;
import java.net.Socket;

public class Client{

    private final int PORT = 8790;
    private final String host = "localhost";

    private BufferedReader inStream;
    private PrintWriter outStream;
    private BufferedReader systemIn;
    Socket server;

    private void client() throws IOException  {

        server = new Socket(host, PORT);
        inStream = new BufferedReader(new InputStreamReader(server.getInputStream()));
        outStream = new PrintWriter(server.getOutputStream(), true);
        systemIn = new BufferedReader(new InputStreamReader(System.in));

        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    while (true) {
                        String str = systemIn.readLine();
                        outStream.println(str);
                        if (str.equals("bye"))
                            closeConnection();
                    }
                } catch(IOException e){
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    while (true) {
                        String str = inStream.readLine();
                        System.out.println("Server: " + str);
                        if (str.equals("/end"))
                            break;
                    }
                    } catch(IOException e){
                        e.printStackTrace();
                    }
                }
        }).start();
    }

    public void closeConnection() throws IOException{
        try {
            inStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        outStream.close();
        try {
            server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

     public static void main(String[] args) throws IOException {
        Client client = new Client();
        client.client();
    }
}

