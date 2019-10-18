/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomatriculas;

/**
 *
 * @author Henry
 */
public class AlumnoDto extends DatosPersonales{
 
    private int becado;
    
    //Constructor
    public AlumnoDto(int becado, String nombres, String apellidos, int identificacion, String fechaNacimiento, String telefono, String correo, String direccion) {
        super(nombres, apellidos, identificacion, fechaNacimiento, telefono, correo, direccion);
        this.becado = becado;
    }
    

    public int getBecado() {
        return becado;
    }

    public void setBecado(int becado) {
        this.becado = becado;
    }
    

    @Override
    public String toString() {
        return "becado=" + becado+" "+ super.toString();
    }
}
