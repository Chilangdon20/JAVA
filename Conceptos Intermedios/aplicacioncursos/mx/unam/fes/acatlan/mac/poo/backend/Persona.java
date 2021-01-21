/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacioncursos.mx.unam.fes.acatlan.mac.poo.backend;

import java.util.Date;

/**
 *
 * @author fernandov
 */
public class Persona {
    
    // atriutos
    
    private Date fechaNac;
    private Genero genero;
    private String nombre,paterno,materno;
    
    // constructor
    
    public Persona(Date fechaNac,Genero genero,String nombre,String paterno,String materno){
        this.fechaNac=fechaNac;
        this.genero=genero;
        this.materno=materno;
        this.paterno=paterno;
        this.nombre=nombre;
    }
    
    public Date getfechaNac(){
        return fechaNac;
    }
    
    public void setfechaNac(Date fechaNac){
        this.fechaNac=fechaNac;
    }
    
    public Genero getgenero(){
        return genero;
    }
    
    public void setgenero(Genero genero){
        this.genero=genero;
    }
    
    public String getnombre(){
        return nombre;
    }
    
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getpaterno(){
        return paterno;
    }
    
    public void setpaterno(String paterno){
        this.paterno = paterno;
    }
    
    public String getmaterno(){
        return materno;
    }
    
    public void setmaterno(String materno){
        this.nombre = nombre;
    }
    
}
