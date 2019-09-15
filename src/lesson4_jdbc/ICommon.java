/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4_jdbc;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.naming.spi.DirStateFactory;

/**
 *
 * @author mam
 */
public abstract class ICommon <T> {
    Statement statement;
    ResultSet resultSet;
    
    public abstract T[] SelectAll();
    public abstract T[] SelectByName(String name);
    public abstract T SelectById(int id);
    
    public abstract int insert(T object);
    public abstract int update(T object);
    public abstract int delete(int id);
}
