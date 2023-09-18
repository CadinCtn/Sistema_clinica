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
import modelo.Paciente;

/**
 *
 * @author Senai
 */
public class PacienteDAO {
    
    private Connection conn;
    
    int id;
    String nome;
    String cpf;
    String idade;
    String tell;
    String cidade;
    String doenca;
    
    public PacienteDAO(){
        this.conn = new ConnectionFactory().getConection();
    }
    
    public void insert(Paciente paciente){
        String sql = "INSERT INTO pacientes (nome_paciente,cpf_paciente,idade_paciente,tell_paciente,cidade_paciente,doenca_paciente) VALUES(?,?,?,?,?,?)";
    
        try{
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, paciente.getNome_paciente());
            stmt.setString(2, paciente.getCpf_paciente());
            stmt.setString(3, paciente.getIdade_paciente());
            stmt.setString(4, paciente.getTell_paciente());
            stmt.setString(5, paciente.getCidade_paciente());
            stmt.setString(6, paciente.getDoenca_paciente());
            
            stmt.execute();
            stmt.close();
            
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Não foi possivel cadastrar o Paciente " + e.getMessage(), "ERRO",JOptionPane.WARNING_MESSAGE);
            throw new RuntimeException(e);
        }
    
    
    
    }
    
    
}
