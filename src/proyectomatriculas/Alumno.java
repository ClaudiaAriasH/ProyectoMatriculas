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

    
    public Alumno(){
        this.alumno = new ArrayList<>();
    }
    
    public  void agregarAlumno(String nombres, String apellidos,int identificacion,
            String fechaNacimiento,String telefono, String correo, String direccion, int becado){
       
         AlumnoDto nuevoAlumno = new AlumnoDto(apellidos, nombres, apellidos,
                 identificacion, fechaNacimiento, telefono, correo, direccion);
         
         nuevoAlumno.setBecado(becado);

         alumno.add(nuevoAlumno);
       
    }
    
    public  void modificarAlumno(){

    }
    
    public  void eliminarAlumno(){

    }
    
    public  void consultarAlumno(){

    }    
    
}
