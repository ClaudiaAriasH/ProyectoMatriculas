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
        // asignaturas.add(new AsignaturasDto("23003", "Biologia", "4", "2", "Sebastian Vega Guitierrez"));

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
    public int buscarAsignatura(int codigo) {

        boolean existe = false;
        int indice = 0;
        for (int i = 0; i < asignaturas.size(); i++) {
            
            int codigoInt = Integer.parseInt(asignaturas.get(i).getCodigo());
            if (codigoInt == codigo) {
                existe = true;
                indice = i;
            }
        }

        if (existe) {
            System.out.println("************* Datos de la Asignatura ********** " + "\n");
            System.out.println("Nombre: " + asignaturas.get(indice).getNombre());
            System.out.println("intensidadHoraria: " + asignaturas.get(indice).getIntensidadHoraria());
            System.out.println("creditos: " + asignaturas.get(indice).getCreditos());
            System.out.println("Profesor: " + asignaturas.get(indice).getProfesorAsignado().getNombres()+" "+asignaturas.get(indice).getProfesorAsignado().getApellidos());

        } else {
            System.out.println("No existe la asignatura en sistema.");
            indice = -1;
        }
        return indice;
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

   public void modificarAsignatura(String valor, int existe, int opcionseleccionada) {

        switch (opcionseleccionada) {

            case 1:
                asignaturas.get(existe).setNombre(valor);
                break;
            case 2:
                asignaturas.get(existe).setIntensidadHoraria(valor);
                break;
            case 3:
                asignaturas.get(existe).setCreditos(valor);
                break;

            default:
                System.out.println("La opción seleccionada no es válida.");
                break;
        }

}
}