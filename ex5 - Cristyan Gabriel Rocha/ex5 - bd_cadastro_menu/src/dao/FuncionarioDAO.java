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
import modelo.Funcionario;
/**
 *
 * @author Senai
 */
public class FuncionarioDAO {
    
    private Connection conn;
    
    int id;
    String nome;
    String cpf;
    String idade;
    String tell;
    String cidade;
    float salario;
    String cargo;
    
    public FuncionarioDAO(){
        this.conn = new ConnectionFactory().getConection();
    }
    
    public void insert(Funcionario funcionario){
        String sql = "INSERT INTO funcionarios (nome_funcionario,cpf_funcionario,idade_funcionario,tell_funcionario,cidade_funcionario,salario_funcionario,cargo_funcionario) VALUES(?,?,?,?,?,?,?)";
        
        try{
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, funcionario.getNome_funcionario());
            stmt.setString(2, funcionario.getCpf_funcionario());
            stmt.setString(3, funcionario.getIdade_funcionario());
            stmt.setString(4, funcionario.getTell_funcionario());
            stmt.setString(5, funcionario.getCidade_funcioario());
            stmt.setFloat(6, funcionario.getSalario_funcionario());
            stmt.setString(7, funcionario.getCargo_funcionario());
            
            
            stmt.execute();
            stmt.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Não foi possivel cadastrar o Funcionario " + e.getMessage(), "ERRO",JOptionPane.WARNING_MESSAGE);
            throw new RuntimeException(e);
        }
    }
    
    
}
