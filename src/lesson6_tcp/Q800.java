/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6_tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mam
 */
public class Q800 {
    public static void main(String[] args) {
        DataInputStream in;
        DataOutputStream out;
        try {
            Socket client = new Socket("127.0.0.1", 1107);
            out = new DataOutputStream(client.getOutputStream());
            in = new DataInputStream(client.getInputStream());
            out.writeUTF("B16DCCN999;800");//
            
            int a = in.readInt();
            int b = in.readInt();
            out.writeInt(a+b);
            out.writeInt(a*b);
            
            
            out.close();
            in.close();
            client.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Q800.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
