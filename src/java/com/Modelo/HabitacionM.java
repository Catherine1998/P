/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Modelo;

/**
 *
 * @author fc
 */
public class HabitacionM {

    public HabitacionM() {
    }

    public HabitacionM(int ID, String Tipo, int Nivel, float Precio, String Comentario, String Estado) {
        this.ID = ID;
        this.Tipo = Tipo;
        this.Nivel = Nivel;
        this.Precio = Precio;
        this.Comentario = Comentario;
        this.Estado = Estado;
    }

    private int ID;
    private String Tipo;
    private int Nivel;
    private float Precio;
    private String Comentario;
    private String Estado;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getNivel() {
        return Nivel;
    }

    public void setNivel(int Nivel) {
        this.Nivel = Nivel;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String Comentario) {
        this.Comentario = Comentario;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

}
