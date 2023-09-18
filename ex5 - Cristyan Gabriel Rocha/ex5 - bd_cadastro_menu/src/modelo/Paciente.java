/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Senai
 */
public class Paciente {

    int id_paciente;
    String nome_paciente;
    String cpf_paciente;
    String idade_paciente;
    String tell_paciente;
    String cidade_paciente;
    String doenca_paciente;

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getNome_paciente() {
        return nome_paciente;
    }

    public void setNome_paciente(String nome_paciente) {
        this.nome_paciente = nome_paciente;
    }

    public String getCpf_paciente() {
        return cpf_paciente;
    }

    public void setCpf_paciente(String cpf_paciente) {
        this.cpf_paciente = cpf_paciente;
    }

    public String getIdade_paciente() {
        return idade_paciente;
    }

    public void setIdade_paciente(String idade_paciente) {
        this.idade_paciente = idade_paciente;
    }

    public String getTell_paciente() {
        return tell_paciente;
    }

    public void setTell_paciente(String tell_paciente) {
        this.tell_paciente = tell_paciente;
    }

    public String getCidade_paciente() {
        return cidade_paciente;
    }

    public void setCidade_paciente(String cidade_paciente) {
        this.cidade_paciente = cidade_paciente;
    }

    public String getDoenca_paciente() {
        return doenca_paciente;
    }

    public void setDoenca_paciente(String doenca_paciente) {
        this.doenca_paciente = doenca_paciente;
    }

}
