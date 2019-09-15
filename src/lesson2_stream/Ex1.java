/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mam
 */
public class Ex1 {
    public static void main(String[] args) {
        String file = "C:\\jnp\\2019\\n8\\in.txt";
        byte[] data;
        String copyFile = "C:\\jnp\\2019\\n8\\out.txt";
        try (FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(copyFile);
                ) {
            data  = new byte[(int) fis.getChannel().size()];
            while(fis.available()>0)
                fis.read(data);
            
            fos.write(data);
            System.out.println(new String(data, "UTF-8"));
            System.out.println(Charset.defaultCharset());
        } catch (Exception e) { 
            System.out.println("err: " + e.getMessage());
        }
    }
    
}
