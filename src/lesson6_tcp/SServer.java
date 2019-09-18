/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6_tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mam
 */
public class SServer {
    public static void main(String[] args) {
        InputStream in;
        try {
            ServerSocket server = new ServerSocket(1107);
            System.out.println("server started ...");
            while(true){
                Socket conn = server.accept();
                System.out.format("a client connected. {%s port: %d, localport: %d}\n"
                        ,conn.getInetAddress().getHostName(),conn.getPort(), conn.getLocalPort());
                in = conn.getInputStream();
                byte[] b = new byte[1024];
                in.read(b);
                
                System.out.println(new String(b).trim());
                
                in.close();
                conn.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(SServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
