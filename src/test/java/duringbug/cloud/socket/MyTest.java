/*
 * @Description: 
 * @Author: 唐健峰
 * @Date: 2023-05-04 19:12:51
 * @LastEditors: ${author}
 * @LastEditTime: 2023-05-04 21:27:00
 */
package duringbug.cloud.socket;

import duringbug.cloud.socket.Client.TCPClient;
import duringbug.cloud.socket.Server.TCPServer;
import duringbug.cloud.socket.Start.OpenClient;
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
    @Test
    public void ManyClientOpen(){
        for(int i=0;i<1;i++)
        {
            OpenClient openClient=new OpenClient(9091);
            openClient.start();
        }
    }
}
