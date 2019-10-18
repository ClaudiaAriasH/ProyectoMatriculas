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
public class AlumnoDto extends DatosPersonales{
 
    private int becado;

    public int getBecado() {
        return becado;
    }

    public void setBecado(int becado) {
        this.becado = becado;
    }
    

    @Override
    public String toString() {
        return "becado=" + becado;
    }
}
