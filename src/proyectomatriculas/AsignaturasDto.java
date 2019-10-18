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
    
    private int codigo;
    private String nombre;
    private int intensidadHoraria;
    private int creditos;

    public AsignaturasDto()
    {
    
    }

    public AsignaturasDto(int codigo, String nombre, int intensidadHoraria, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.intensidadHoraria = intensidadHoraria;
        this.creditos = creditos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIntensidadHoraria() {
        return intensidadHoraria;
    }

    public void setIntensidadHoraria(int intensidadHoraria) {
        this.intensidadHoraria = intensidadHoraria;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    
    @Override
    public String toString() {
        return "Asignaturas{" + "codigo=" + codigo + ", nombre=" + nombre + ", intensidadHoraria=" + intensidadHoraria + ", creditos=" + creditos + '}';
    }
}
