/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import com.mysql.jdbc.Connection;
import java.sql.*;


/**
 *
 * @author Senai
 */
public class ConnectionFactory {
    
    public Connection getConection(){
        try{
            
            return (Connection) DriverManager.getConnection("jdbc:mysql://localhost/bd_cadastro_menu","root","root");
        } 
        catch(SQLException e ) {
            throw new RuntimeException(e);
        }
        
    }
    
}
