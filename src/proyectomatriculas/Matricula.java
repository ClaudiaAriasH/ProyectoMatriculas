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
 * @author s109e9
 */
public class Matricula {
    
    private List<Object> matricula;
    
    public Matricula ()
    {
        this.matricula = new ArrayList<>();
    }
    

    public void matricularEstudiante(String asignatura, String alumno) {
        String registro= "ASIGNATURA: "+asignatura+" ALUMNO: "+alumno;
        matricula.add(registro);
        System.out.println(matricula);
    }
    
    
    
}
