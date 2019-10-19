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

    public Asignaturas() {
        this.asignaturas = new ArrayList<>();
    }

    /**
     *
     * @param a
     */
    public void agregarAsignatura(AsignaturasDto a) {
        asignaturas.add(a);
        System.out.println("Se guardo de forma exitosa.");
    }

    /**
     *
     * @param codigo
     * @return
     */
    public boolean buscarAsignatura(String codigo) {

        boolean existe = false;
        int indice = 0;
        for (int i = 0; i < asignaturas.size(); i++) {
            if (asignaturas.get(i).getCodigo().equals(codigo)) {
                existe = true;
                indice = i;
            }
        }

        if (existe) {
            System.out.println("************* Datos de la Asignatura ********** " + "\n");
            System.out.println("Nombre: " + asignaturas.get(indice).getNombre());
            System.out.println("intensidadHoraria: " + asignaturas.get(indice).getIntensidadHoraria());
            System.out.println("creditos: " + asignaturas.get(indice).getCreditos());

        } else {
            System.out.println("No existe la asignatura en sistema.");
        }
        return existe;
    }

    /**
     *
     * @param codigo
     */
    public void eliminarAsignatura(String codigo) {

        boolean encontrado = false;
        for (int i = 0; i < asignaturas.size(); i++) {
            if (asignaturas.get(i).getCodigo().equals(codigo)) {
                asignaturas.remove(i);
                encontrado = true;
            }
        }
        if (encontrado) {
            System.out.println("La asignatura con codigo " + codigo + " fue eliminado exitosamente.");
        } else {
            System.out.println("No existe la asignatura en el sistema");
        }
    }

    public void modificarAsignatura() {

    }

}
