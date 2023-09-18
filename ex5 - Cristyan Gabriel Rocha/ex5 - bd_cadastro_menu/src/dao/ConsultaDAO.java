/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


import modelo.Consulta;



/**
 *
 * @author Senai
 */
public class ConsultaDAO {
    
    private Connection conn;
    
    int medico;
    int paciente;
    String data;
    String hora;
    
    public ConsultaDAO(){
        this.conn = new ConnectionFactory().getConection();
    }
    
    public void insert(Consulta consulta){
        String sql = "INSERT INTO consultas (idMedico,idPaciente,datac,horac) VALUES(?,?,?,?)";
        
        try{
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setInt(1, consulta.getIdMedico());
            stmt.setInt(2, consulta.getIdPaciente());
            stmt.setString(3, consulta.getDatac());
            stmt.setString(4, consulta.getHorac());
            
            stmt.execute();
            stmt.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Não foi possivel agendar a Consulta " + e.getMessage(), "ERRO",JOptionPane.WARNING_MESSAGE);
            throw new RuntimeException(e);
        }
    }
    
}
