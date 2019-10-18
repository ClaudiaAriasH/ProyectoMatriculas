/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomatriculas;

/**
 *
 * @author hmunoze
 */
public class Alumno extends DatosPersonales {
    
    
    private boolean becado;

    public boolean isBecado() {
        return becado;
    }

    public void setBecado(boolean becado) {
        this.becado = becado;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    
    
 
    
}
