/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author JULIO
 */
public class DatosDelPaqueteR {
    
    
    private String TipoPqt;
    private String Descripcion;
    private double Largo;
    private double Ancho;
    private double Alto;  
    private double Peso;
    private double ValorDeclarado;

    public DatosDelPaqueteR() {
    }

    public DatosDelPaqueteR(String TipoPqt, String Descripcion, double Largo, double Ancho, double Alto, double Peso, double ValorDeclarado) {
        this.TipoPqt = TipoPqt;
        this.Descripcion = Descripcion;
        this.Largo = Largo;
        this.Ancho = Ancho;
        this.Alto = Alto;
        this.Peso = Peso;
        this.ValorDeclarado = ValorDeclarado;
    }

    

    
    public String getDatosArchivoTexto(){
    
     return this.TipoPqt +";"+
            this.Descripcion +";"+
            this.Largo +";"+
            this.Ancho +";"+
            this.Alto +";"+
            this.Peso +";"+
            this.ValorDeclarado ;
    }

    public String getTipoPqt() {
        return TipoPqt;
    }

    public void setTipoPqt(String TipoPqt) {
        this.TipoPqt = TipoPqt;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getLargo() {
        return Largo;
    }

    public void setLargo(double Largo) {
        this.Largo = Largo;
    }

    public double getAncho() {
        return Ancho;
    }

    public void setAncho(double Ancho) {
        this.Ancho = Ancho;
    }

    public double getAlto() {
        return Alto;
    }

    public void setAlto(double Alto) {
        this.Alto = Alto;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getValorDeclarado() {
        return ValorDeclarado;
    }

    public void setValorDeclarado(double ValorDeclarado) {
        this.ValorDeclarado = ValorDeclarado;
    }
    
}
