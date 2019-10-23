/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomatriculas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Claudia
 */
public class Profesor {

    //Atributos
    private List<ProfesorDto> datosProfesor;

    //Contructor
    public Profesor() {
        this.datosProfesor = new ArrayList<>();
        datosProfesor.add(new ProfesorDto("Quimico", "Sebastian", "Vega Guitierrez", 1209876554, "1990/08/03", "5982553", "sebas.Vega@hotmail.com", "Carrera 62#34 sur"));
        datosProfesor.add(new ProfesorDto("Biologa", "Sara", "Martinez Montenegro", 1308765439, "1994/08/03", "3894057", "sarism@hotmail.com", "Carerra 60B #38-04"));
        datosProfesor.add(new ProfesorDto("Administrador de empresas", "Daniel", "Ortiz Mejia", 1037865439, "1989/04/30", "59086542", "dani.ortiz@hotmail.com", "Calle 58#42-4"));
        datosProfesor.add(new ProfesorDto("Educación especial", "Kelly", "Londoño Palacio", 39206934, "1985/08/01", "5896420", "kelly85@hotmail.com", "Calle 68 B #73-09"));

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
    public int buscarProfesor(int identificacion) {

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
            indice = -1;
        }
        return indice;
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

    /**
     *
     * @param valor
     * @param existe
     * @param opcionseleccionada
     */
    public void modificarProfesor(String valor, int existe, int opcionseleccionada) {

        switch (opcionseleccionada) {

            case 1:
                datosProfesor.get(existe).setTelefono(valor);
                break;
            case 2:
                datosProfesor.get(existe).setCorreo(valor);
                break;
            case 3:
                datosProfesor.get(existe).setDireccion(valor);
                break;

            default:
                System.out.println("La opción seleccionada no es válida.");
                break;
        }

    }
    
    public ProfesorDto seleccionarProfesor()
    {
        int cantidadReg= datosProfesor.size();
        Random random = new Random();
        int indiceAleatorio= random.nextInt((cantidadReg - 1) - 0 + 1) + 0;
        
        return datosProfesor.get(indiceAleatorio);
    }
}
