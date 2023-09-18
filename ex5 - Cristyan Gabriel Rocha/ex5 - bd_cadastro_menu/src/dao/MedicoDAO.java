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
import modelo.Medico;



/**
 *
 * @author Senai
 */
public class MedicoDAO {
    
    private Connection conn;
    
    int id;
    String nome;
    String cpf;
    String idade;
    String tell;
    String cidade;
    String especilidade;
    
    public MedicoDAO(){
        this.conn = new ConnectionFactory().getConection();
    }
    
    public void insert(Medico medico){
        String sql = "INSERT INTO medicos (nome_medico,cpf_medico,idade_medico,tell_medico,cidade_medico,especialidade_medico) VALUES(?,?,?,?,?,?)";
        
        try{
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, medico.getNome_medico());
            stmt.setString(2, medico.getCpf_medico());
            stmt.setString(3, medico.getIdade_medico());
            stmt.setString(4, medico.getTell_medico());
            stmt.setString(5, medico.getCidade_medico());
            stmt.setString(6, medico.getEspecialidade_medico());
            
            stmt.execute();
            stmt.close();
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Não foi possivel cadastrar o Médico " + e.getMessage(), "ERRO",JOptionPane.WARNING_MESSAGE);
            throw new RuntimeException(e);
        }
    }
    
    
    
}
