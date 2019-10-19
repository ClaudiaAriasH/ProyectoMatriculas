/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomatriculas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 19H1
 */
public class Profesor {

    //Atributos
    private List<ProfesorDto> datosProfesor;

    //Contructor
    public Profesor(List<ProfesorDto> datosProfesor) {
        this.datosProfesor = datosProfesor;
    }

    public Profesor() {
        this.datosProfesor = new ArrayList<>();
    }

    public void agregarProfesor(String profesion, String nombres, String apellidos, int identificacion, String fechaNacimiento, String telefono, String correo, String direccion) {
        ProfesorDto profesorDto = new ProfesorDto();
        profesorDto = new ProfesorDto(profesion, nombres, apellidos, identificacion, fechaNacimiento, telefono, correo, direccion);
        datosProfesor.add(profesorDto);
        System.out.println("Alumnos guadados: " + datosProfesor);
    }

    public boolean buscarContacto(int identificacion) {

        boolean existe = false;

        for (int i = 0; i < datosProfesor.size(); i++) {
            if (datosProfesor.get(i).equals(identificacion)) {
                return true;
            }

        }

        return existe;
    }

}
