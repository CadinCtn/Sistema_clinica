/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Senai
 */
public class TestConnection {
    
    public static void main(String args[]) throws SQLException{
        Connection conn;
        conn = new ConnectionFactory().getConection();
        System.out.println("Conexão estabelecida com sucesso");
        JOptionPane.showMessageDialog(null,"Conexão estabelecida com sucesso");
        conn.close();
    }
    
}
