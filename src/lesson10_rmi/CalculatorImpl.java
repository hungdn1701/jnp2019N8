/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson10_rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

/**
 *
 * @author mam
 */
public class CalculatorImpl extends UnicastRemoteObject implements Calculator{

    public CalculatorImpl() throws  RemoteException
    {
        super();
    }
    @Override
    public int add(int a, int b) {
        System.out.println(new Date() + " a client request ...");
        return a+b;
    }
    
}
