/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson7_udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mam
 */
public class UDPServer {
    DatagramSocket server;
    DatagramPacket receivePacket, sendPacket;
    byte[] receiveData, sendData;
    int port, bufferSize;
    public UDPServer() {
        try {
            port = 1107;
            bufferSize = 1024;
            server = new DatagramSocket(port);
        } catch (SocketException ex) {
            Logger.getLogger(UDPServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void listening(){
        System.out.println("start listening...");
        while(true){
            try {
                receiveData = new byte[bufferSize];
                receivePacket = new DatagramPacket(receiveData,bufferSize);
                server.receive(receivePacket);
                String _strTemp = new String(receivePacket.getData()).trim();
                System.out.println(_strTemp);
                String _strRes = StrUtil.reverse(_strTemp);
                sendData = _strRes.getBytes();
                sendPacket = new DatagramPacket(sendData, sendData.length
                        , receivePacket.getSocketAddress());
                server.send(sendPacket);
                
            } catch (IOException ex) {
                Logger.getLogger(UDPServer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
