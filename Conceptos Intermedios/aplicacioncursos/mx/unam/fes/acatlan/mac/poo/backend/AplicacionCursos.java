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
public class AplicacionCursos {
    
    // atributos
    
    private Integer posicionAlumnoActual,posicionAlumnoSiguiente,posicionAlumnoAnterior;
    
    
    // constructor
    
    public AplicacionCursos(Integer posicionAlumnoActual){
        this.posicionAlumnoActual=posicionAlumnoActual;
    }
    
    // get y set
    
    public Integer getposicionAlumnoActual(){
        return posicionAlumnoActual;
    }
    public void setposicionAlumnoActual(Integer posicionAlumnoActual){
        this.posicionAlumnoActual=posicionAlumnoActual;
    }
    
    public Integer getposicionAlumnoAnterior(){
        return posicionAlumnoAnterior;
    }
    public void setposicionAlumnoAnterior(Integer posicionAlumnoAnterior){
     
        this.posicionAlumnoAnterior = posicionAlumnoAnterior;
    }
    
    public Integer getposicionAlumnoSiguiente(){
        return posicionAlumnoSiguiente;
    }
    
    public void setposicionAlumnoSiguiente(Integer posicionAlumnoSiguiente){
        this.posicionAlumnoSiguiente=posicionAlumnoSiguiente;
    }
    
    
    
}
