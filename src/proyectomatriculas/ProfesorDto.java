/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomatriculas;

/**
 *
 * @author 19H1
 */
public class ProfesorDto extends DatosPersonales {

    //Atributos
    private String profesion;

    //Constructor
    public ProfesorDto() {

    }

    public ProfesorDto(String profesion, String nombres, String apellidos, int identificacion, String fechaNacimiento, String telefono, String correo, String direccion) {
        super(nombres, apellidos, identificacion, fechaNacimiento, telefono, correo, direccion);
        this.profesion = profesion;
    }

    //Getters and Setters
    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    @Override
    public String toString() {

        return "Profesor=" + profesion + " " + super.toString();
    }

}
