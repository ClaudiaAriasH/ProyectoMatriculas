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
    }

    public void agregarProfesor(ProfesorDto profesor) {
        /*   for (int i = 0; i < profesor.size(); i++) {
       
         datosProfesor.add(profesor.get(i));
         }
         */
        System.err.println("prueba Profesor: ");

        for (int i = 0; i < datosProfesor.size(); i++) {

            datosProfesor.add(profesor);

        }

        for (int i = 0; i < datosProfesor.size(); i++) {
            System.err.println("Prueba" + datosProfesor.get(i));
        }
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
