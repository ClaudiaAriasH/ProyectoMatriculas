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

    /**
     *
     * @param profesion
     * @param nombres
     * @param apellidos
     * @param identificacion
     * @param fechaNacimiento
     * @param telefono
     * @param correo
     * @param direccion
     */
    public void agregarProfesor(String profesion, String nombres, String apellidos, int identificacion, String fechaNacimiento, String telefono, String correo, String direccion) {
        ProfesorDto profesorDto = new ProfesorDto();
        profesorDto = new ProfesorDto(profesion, nombres, apellidos, identificacion, fechaNacimiento, telefono, correo, direccion);
        datosProfesor.add(profesorDto);
        System.out.println("Se guardo de forma exitosa.");
    }

    /**
     *
     * @param identificacion
     * @return
     */
    public boolean buscarProfesor(int identificacion) {

        boolean existe = false;
        int indice = 0;
        for (int i = 0; i < datosProfesor.size(); i++) {
            if (datosProfesor.get(i).getIdentificacion() == identificacion) {
                existe = true;
                indice = i;
            }
        }

        if (existe) {
            System.out.println("************* Datos del Profesor ********** " + "\n");
            System.out.println("Nombre: " + datosProfesor.get(indice).getNombres() + " " + datosProfesor.get(indice).getApellidos());

            System.out.println("Identificación: " + datosProfesor.get(indice).getIdentificacion());
            System.out.println("Fecha de Nacimiento: " + datosProfesor.get(indice).getFechaNacimiento());
            System.out.println("Profesión: " + datosProfesor.get(indice).getProfesion());
            System.out.println("Telefono: " + datosProfesor.get(indice).getTelefono());
            System.out.println("Correo: " + datosProfesor.get(indice).getCorreo());
            System.out.println("Dirección: " + datosProfesor.get(indice).getDireccion());

        } else {
            System.out.println("El profesor no existe en el sistema.");
        }
        return existe;
    }

    /**
     *
     * @param identificacion
     */
    public void eliminarProfesor(int identificacion) {

        boolean encontrado = false;
        for (int i = 0; i < datosProfesor.size(); i++) {
            if (datosProfesor.get(i).getIdentificacion() == identificacion) {
                datosProfesor.remove(i);
                encontrado = true;
            }
        }
        if (encontrado) {
            System.out.println("El profesor con el número de identificación " + identificacion + " fue eliminado exitosamente.");
        } else {
            System.out.println("El profesor no existe en el sistema.");
        }
    }

    public void modificarProfesor() {

    }

}
