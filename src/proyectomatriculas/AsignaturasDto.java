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
public class AsignaturasDto {

    private String codigo;
    private String nombre;
    private String intensidadHoraria;
    private String creditos;
    private Profesor profesor;

    public AsignaturasDto(String codigo, String nombre, String intensidadHoraria, String creditos, Profesor profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.intensidadHoraria = intensidadHoraria;
        this.creditos = creditos;
        this.profesor = profesor;
    }

    public AsignaturasDto() {

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIntensidadHoraria() {
        return intensidadHoraria;
    }

    public void setIntensidadHoraria(String intensidadHoraria) {
        this.intensidadHoraria = intensidadHoraria;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "AsignaturasDto{" + "codigo=" + codigo + ", nombre=" + nombre + ", intensidadHoraria=" + intensidadHoraria + ", creditos=" + creditos + ", profesor=" + profesor + '}';
    }

}
