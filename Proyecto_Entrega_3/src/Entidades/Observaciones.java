/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author JULIO
 */
public class Observaciones {
    
    private int NoPaquete ;
    private String FechaIngreso;
    private String FechaLimiteEntrega;

    public Observaciones() {
    }

    public Observaciones(int NoPaquete, String FechaIngreso, String FechaLimiteEntrega) {
        this.NoPaquete = NoPaquete;
        this.FechaIngreso = FechaIngreso;
        this.FechaLimiteEntrega = FechaLimiteEntrega;
    }

    public int getNoPaquete() {
        return NoPaquete;
    }

    public void setNoPaquete(int NoPaquete) {
        this.NoPaquete = NoPaquete;
    }

    public String getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(String FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }

    public String getFechaLimiteEntrega() {
        return FechaLimiteEntrega;
    }

    public void setFechaLimiteEntrega(String FechaLimiteEntrega) {
        this.FechaLimiteEntrega = FechaLimiteEntrega;
    }
    
    
    public String getDatosArchivoTexto(){
    
     return this.NoPaquete +";"+
            this.FechaIngreso +";"+
            this.FechaLimiteEntrega ;
    }
}
