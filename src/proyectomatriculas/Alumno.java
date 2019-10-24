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

        alumno.add(new AlumnoDto(1, "Juan Pablo", "Vega Perez", 102704353, "1990/04/23", "5982253", "juan.Vega@hotmail.com", "Calle 60#34 sur"));
        alumno.add(new AlumnoDto(2, "Isabella", "Bustamante Martinez", 1027987654, "1994/08/03", "5982903", "isa.bust@hotmail.com", "Carerra 60A#34 sur -34"));
        alumno.add(new AlumnoDto(2, "Carolina", "Santander Gomez", 1378654456, "1991/01/21", "3982253", "carosan@hotmail.com", "Calle 54#40-4"));
        alumno.add(new AlumnoDto(1, "Estafani", "Bedoya", 137630234, "1999/08/21", "5972254", "tefa@hotmail.com", "Calle 66 B #70-09"));

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

    public void modificarAlumno(String valor, int existe, int opcionseleccionada) {

        switch (opcionseleccionada) {

            case 1:
                alumno.get(existe).setTelefono(valor);
                break;
            case 2:
                alumno.get(existe).setCorreo(valor);
                break;
            case 3:
                alumno.get(existe).setDireccion(valor);
                break;
            case 4:
                try {
                    int becado = Integer.parseInt(valor);
                    alumno.get(existe).setBecado(becado);
                } catch (Exception e) {
                    System.out.println("Debes insertar un número.");
                }
                break;
            default:
                System.out.println("La opción seleccionada no es válida.");
                break;
        }

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
    
        public String seleccionar(int codigo)
    {
        String resultadoString = null;
        boolean existe = false;
        AlumnoDto resultado = null;
        int indice = 0;
        for (int i = 0; i < alumno.size(); i++) {
            
            int codigoInt = alumno.get(i).getIdentificacion();
            if (codigoInt == codigo) {
                existe = true;
                indice = i;
            }
        }

        if (existe) {
            
            resultado = alumno.get(indice);
            resultadoString= "Código: "+resultado.getIdentificacion()+" , Nombre: "+resultado.getNombres()+" , Apellidos: "+resultado.getApellidos();
        
        } else {
            System.out.println("No existe el alumno en el sistema.");
            indice = -1;
        }
        
        return resultadoString;
        
    }

}
