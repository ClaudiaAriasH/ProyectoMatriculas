/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomatriculas;

/**
 *
 * @author Maria
 */
public class MatriculaDto {
    
    AsignaturasDto asignatura;
    AlumnoDto alumno;

    public MatriculaDto(AsignaturasDto asignatura, AlumnoDto alumno) {
        this.asignatura = asignatura;
        this.alumno = alumno;
    }
    
    public AsignaturasDto getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(AsignaturasDto asignatura) {
        this.asignatura = asignatura;
    }

    public AlumnoDto getAlumno() {
        return alumno;
    }

    public void setAlumno(AlumnoDto alumno) {
        this.alumno = alumno;
    }

    @Override
    public String toString() {
        return "MatriculaDto{" + "asignatura=" + asignatura + ", alumno=" + alumno + '}';
    }
    
    
    
}
