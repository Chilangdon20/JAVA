/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacioncursos.mx.unam.fes.acatlan.mac.poo.backend;

/**
 *
 * @author fernandov
 */
public class Profesor {
    
    // atributos
    
    private Integer noTrabajador;
    private String cedula;
    
    // constructor
    
    public Profesor(Integer noTrabajador,String cedula){
        this.noTrabajador=noTrabajador;
        this.cedula=cedula;
    }
    
    // get y set
    
    public Integer getnoTrabajador(){
        return noTrabajador;
    }
    
    public void setnoTrabajador(Integer noTrabajador){
        this.noTrabajador=noTrabajador;
    }
    
    public String getcedula(){
        return cedula;
    }
    
    public void setcedula(String cedula){
        this.cedula=cedula;
    }
}
