/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Hans
 */
public class Pokemon {
    
    private int id;
    private String nombre;
    private String especie;
    private String tipoP;
    private String tipoS;
    private int nivel;
    private int idEntrenador;

    public Pokemon() {
    }

    public Pokemon(int id, String nombre, String especie, String tipoP, String tipoS, int nivel, int idEntrenador) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.tipoP = tipoP;
        this.tipoS = tipoS;
        this.nivel = nivel;
        this.idEntrenador = idEntrenador;
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

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getTipoP() {
        return tipoP;
    }

    public void setTipoP(String tipoP) {
        this.tipoP = tipoP;
    }

    public String getTipoS() {
        return tipoS;
    }

    public void setTipoS(String tipoS) {
        this.tipoS = tipoS;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "id=" + id + ", nombre=" + nombre + ", especie=" + especie + ", tipoP=" + tipoP + ", tipoS=" + tipoS + ", nivel=" + nivel + ", idEntrenador=" + idEntrenador + '}';
    }
    
    
   
    
}
