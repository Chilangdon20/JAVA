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
public class Curso {
    // atributos
    private Integer clave,duracionHoras;
    private String nombreCurso;
    // constructor
    public Curso(Integer clave,Integer duracionHoras,String nombreCurso){
        this.clave = clave;
        this.duracionHoras = duracionHoras;
        this.nombreCurso = nombreCurso;
        
        
        
    }
    public Integer getClave(){
            return clave;
        }
    public void setClave(Integer clave){
        this.clave = clave;
    }
    public Integer getDuracionHoras(){
        return duracionHoras;
    }
    public void setDuracionHoras(Integer duracionHoras){
        this.duracionHoras = duracionHoras;
    }
    public String getNombreCurso(){
        return nombreCurso;
    }
    public void setNombreCurso(String nombreCurso){
        this.nombreCurso=nombreCurso;
    }
}
