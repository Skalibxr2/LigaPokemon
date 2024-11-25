/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Hans
 */
public class Entrenador {
    
    private int id;
    private String nombre;
    private String Region;
    private int medallasGanadas;
    private int nivelDeExperiencia;

    public Entrenador() {
    }

    public Entrenador(int id, String nombre, String Region, int medallasGanadas, int nivelDeExperiencia) {
        this.id = id;
        this.nombre = nombre;
        this.Region = Region;
        this.medallasGanadas = medallasGanadas;
        this.nivelDeExperiencia = nivelDeExperiencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }

    public int getMedallasGanadas() {
        return medallasGanadas;
    }

    public void setMedallasGanadas(int medallasGanadas) {
        this.medallasGanadas = medallasGanadas;
    }

    public int getNivelDeExperiencia() {
        return nivelDeExperiencia;
    }

    public void setNivelDeExperiencia(int nivelDeExperiencia) {
        this.nivelDeExperiencia = nivelDeExperiencia;
    }

    @Override
    public String toString() {
        return "Entrenador{" + "id=" + id + ", nombre=" + nombre + ", Region=" + Region + ", medallasGanadas=" + medallasGanadas + ", nivelDeExperiencia=" + nivelDeExperiencia + '}';
    }
    
    
    
    
}
