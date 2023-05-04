package duringbug.cloud.socket.Start;
import duringbug.cloud.socket.Client.TCPClient;
import java.io.IOException;

public class OpenClient extends Thread {
    int port;
    public  OpenClient(int port){
        this.port=port;
    }
    @Override
    public void run() {
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
