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

    public Matricula() {
        this.matricula = new ArrayList<>();
    }

    /**
     *
     * @param asignatura
     * @param alumno
     */
    public void matricularEstudiante(String asignatura, String alumno) {
        try {
            if (!asignatura.equalsIgnoreCase("null") && !alumno.equalsIgnoreCase("null")) {
                String registro = "ASIGNATURA: " + asignatura + "\n" + "ALUMNO: " + alumno;
                matricula.add(registro);
                for (int i = 0; i < matricula.size(); i++) {
                    System.out.println(matricula.get(i));
                }
            } else {
                System.out.println("Ingrese los datos correctamenta");
            }
        } catch (Exception e) {

            System.out.println("Error: Ingrese datos que existan en el sistema");
        }
    }

}
