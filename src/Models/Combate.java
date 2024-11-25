/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Date;

/**
 *
 * @author Hans
 */
public class Combate {
    
    private int id;
    private Date fecha;
    private String lugar;
    private int idEntrenador1;
    private int idEntrenador2;
    private int ganador;

    public Combate() {
    }

    public Combate(int id, Date fecha, String lugar, int idEntrenador1, int idEntrenador2, int ganador) {
        this.id = id;
        this.fecha = fecha;
        this.lugar = lugar;
        this.idEntrenador1 = idEntrenador1;
        this.idEntrenador2 = idEntrenador2;
        this.ganador = ganador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getIdEntrenador1() {
        return idEntrenador1;
    }

    public void setIdEntrenador1(int idEntrenador1) {
        this.idEntrenador1 = idEntrenador1;
    }

    public int getIdEntrenador2() {
        return idEntrenador2;
    }

    public void setIdEntrenador2(int idEntrenador2) {
        this.idEntrenador2 = idEntrenador2;
    }

    public int getGanador() {
        return ganador;
    }

    public void setGanador(int ganador) {
        this.ganador = ganador;
    }

    @Override
    public String toString() {
        return "Combate{" + "id=" + id + ", fecha=" + fecha + ", lugar=" + lugar + ", idEntrenador1=" + idEntrenador1 + ", idEntrenador2=" + idEntrenador2 + ", ganador=" + ganador + '}';
    }
    
    
    
    
}
