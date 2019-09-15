/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson5_thread;

/**
 *
 * @author mam
 */
public class Ex1 {

    public static void main(String[] args) throws InterruptedException {
        new Thread(new PrintName("A")).start();
        new Thread(new PrintName("B")).start();
        new Thread(new PrintName("C")).start();
        new Thread(new PrintName("D")).start();
        
    }
}
class PrintName implements Runnable{
    String name;

    public PrintName(String name) {
        this.name = name;
    }
    
    
    @Override
    public void run() {
        for(int i =0; i < 50;i++)
            System.out.print(this.name);
    }
    
}


class PrintNameThread extends Thread {

    public PrintNameThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.print(this.getName());
        }
    }

}
