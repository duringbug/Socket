package duringbug.cloud.socket;

import duringbug.cloud.socket.Client.TCPClient;
import duringbug.cloud.socket.Server.TCPServer;
import java.io.IOException;
import org.junit.jupiter.api.Test;



public class MyTest {
    @Test
    public void ServerOpen(){
        int port = 9091;
        TCPServer server=new TCPServer();
        try {
            server.start(port);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            server.stop();
        }
    }
    @Test
    public void ClientOpen(){
        int port = 9091;
        TCPClient client = new TCPClient();
        try {
            client.startConnection("127.0.0.1", port);
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            client.stopConnection();
        }
    }

    @Test
    public void Client2Open(){
        int port = 9091;
        TCPClient client = new TCPClient();
        try {
            client.startConnection("127.0.0.1", port);
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            client.stopConnection();
        }
    }
}
