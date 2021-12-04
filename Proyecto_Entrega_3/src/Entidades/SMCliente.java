/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author JULIO
 */
public class SMCliente {
    
    private String NombreCompletos;
    private String Calle_Carrera;
    private int NoDeVivienda;
    private int Teléfono;

    public SMCliente() {
    }

    public SMCliente(String NombreCompletos, String Calle_Carrera, int NoDeVivienda, int Teléfono) {
        this.NombreCompletos = NombreCompletos;
        this.Calle_Carrera = Calle_Carrera;
        this.NoDeVivienda = NoDeVivienda;
        this.Teléfono = Teléfono;
    }

    public String getNombreCompletos() {
        return NombreCompletos;
    }

    public void setNombreCompletos(String NombreCompletos) {
        this.NombreCompletos = NombreCompletos;
    }

    public String getCalle_Carrera() {
        return Calle_Carrera;
    }

    public void setCalle_Carrera(String Calle_Carrera) {
        this.Calle_Carrera = Calle_Carrera;
    }

    public int getNoDeVivienda() {
        return NoDeVivienda;
    }

    public void setNoDeVivienda(int NoDeVivienda) {
        this.NoDeVivienda = NoDeVivienda;
    }

    public int getTeléfono() {
        return Teléfono;
    }

    public void setTeléfono(int Teléfono) {
        this.Teléfono = Teléfono;
    }
    
    
    public String getDatosArchivoTexto(){
        return this.NombreCompletos+";"+
               this.Calle_Carrera+";"+ 
               this.NoDeVivienda+";"+ 
               this.Teléfono;
    }
}
