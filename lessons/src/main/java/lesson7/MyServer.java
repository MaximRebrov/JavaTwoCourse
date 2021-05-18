package lesson7;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class MyServer {

    private List<ClientHandler> clients;
    private AuthService authService;

    public AuthService getAuthService(){
        return authService;
    }

    public MyServer(){
        try (ServerSocket server = new ServerSocket(ChatConstants.PORT)){
            authService = new BaseAuthService();
            authService.start();
            clients = new ArrayList<>();
            while (true){
                System.out.println("Server started. Waiting connection");
                Socket socket = server.accept();
                System.out.println("Client connection");
                new ClientHandler(this, socket);
            }
        } catch (IOException e) {
            System.out.println("Server error");
        }finally {
            if(authService != null){
                authService.stop();
            }
        }
    }

    public synchronized boolean isNickBusy(String nick){
        for(ClientHandler o : clients) {
            if (o.getName().equals(nick)) {
                return true;
            }
        }
        return false;
    }

    public synchronized void broadcastMsg(String msg){
        for(ClientHandler o : clients){
            o.sendMsg(msg);
        }
    }

    public synchronized void unsubscribe(ClientHandler o){
        clients.remove(o);
    }

    public synchronized void subscribe(ClientHandler o){
        clients.add(o);
    }

    public void privateMsg(String msg, String... nick){
        int countList = 0;
        int countNick = nick.length;
        for(ClientHandler o : clients){
            for (String n : nick) {
                if(o.getName().equals(n)){
                    o.sendMsg(msg);
                    if(++countList == countNick) {
                        return;
                    }
                }
            }
        }
        }
}
