/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Time;
import java.sql.Date;

/**
 *
 * @author Senai
 */
public class Consulta {
    
    int idMedico;
    int idPaciente;
    String datac;
    String horac;

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getDatac() {
        return datac;
    }

    public void setDatac(String datac) {
        this.datac = datac;
    }

    public String getHorac() {
        return horac;
    }

    public void setHorac(String horac) {
        this.horac = horac;
    }

    
    
}
