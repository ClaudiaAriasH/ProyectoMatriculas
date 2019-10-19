/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomatriculas;

import java.util.ArrayList;

/**
 *
 * @author Henry
 */
public class Alumno {

    ArrayList<AlumnoDto> alumno;

    public Alumno() {
        this.alumno = new ArrayList<>();
    }

    /**
     * Procedimiento Agregar Alumno
     *
     * @param nombres
     * @param apellidos
     * @param identificacion
     * @param fechaNacimiento
     * @param telefono
     * @param correo
     * @param direccion
     * @param becado
     */
    public void agregarAlumno(String nombres, String apellidos, int identificacion,
            String fechaNacimiento, String telefono, String correo, String direccion, int becado) {

        AlumnoDto nuevoAlumno = new AlumnoDto(becado, nombres, apellidos,
                identificacion, fechaNacimiento, telefono, correo, direccion);

        alumno.add(nuevoAlumno);

        System.out.println("Se guardo de forma exitosa.");

    }

    public void modificarAlumno(String telefono, String correo, String direccion, int becado, int existe) {

        alumno.get(existe).setTelefono(telefono);
        alumno.get(existe).setCorreo(correo);
        alumno.get(existe).setDireccion(direccion);
        alumno.get(existe).setBecado(becado);

    }

    /**
     * Procedimiento para eliminar Alumno
     *
     * @param identificacion
     */
    public void eliminarAlumno(int identificacion) {

        boolean encontrado = false;
        for (int i = 0; i < alumno.size(); i++) {
            if (alumno.get(i).getIdentificacion() == identificacion) {
                alumno.remove(i);
                encontrado = true;
            }
        }
        if (encontrado) {
            System.out.println("El alumno con el número de identificación " + identificacion + " fue eliminado exitosamente.");
        } else {
            System.out.println("El alumno no existe en el sistema.");
        }
    }

    /**
     * Procedimiento para Consultar Alumno
     *
     * @param identificacion
     */
    public int consultarAlumno(int identificacion) {

        boolean encontrado = false;
        int indice = 0;
        for (int i = 0; i < alumno.size(); i++) {
            if (alumno.get(i).getIdentificacion() == identificacion) {
                encontrado = true;
                indice = i;
            }
        }

        if (encontrado) {
            System.out.println("Datos del alumno: " + alumno.get(indice).getNombres() + " " + alumno.get(indice).getApellidos());

            System.out.println("************* Datos del Alumno ********** " + "\n");
            System.out.println("Nombre: " + alumno.get(indice).getNombres() + " " + alumno.get(indice).getApellidos());
            System.out.println("Identificación: " + alumno.get(indice).getIdentificacion());
            System.out.println("Fecha de Nacimiento: " + alumno.get(indice).getFechaNacimiento());
            System.out.println("Es Becado: " + alumno.get(indice).getBecado());
            System.out.println("Telefono: " + alumno.get(indice).getTelefono());
            System.out.println("Correo: " + alumno.get(indice).getCorreo());
            System.out.println("Dirección: " + alumno.get(indice).getDireccion());

        } else {
            System.out.println("El alumno no existe en el sistema.");
            indice = -1;
        }

        return indice;
    }

}
