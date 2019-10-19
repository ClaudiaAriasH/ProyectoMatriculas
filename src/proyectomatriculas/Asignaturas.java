/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomatriculas;

import java.util.ArrayList;

/**
 *
 * @author Maria
 */
public class Asignaturas {
    
    private ArrayList<AsignaturasDto> asignaturas;
    
    public Asignaturas()
    {
        this.asignaturas= new ArrayList<>();
    }
    
    public void agregarAsignatura(AsignaturasDto a)
    {
        //Continuar acá
        System.out.println("Agregar asignatura" +a);
    }
}
