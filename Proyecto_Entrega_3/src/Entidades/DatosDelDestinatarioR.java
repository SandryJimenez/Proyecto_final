/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author JULIO
 */
public class DatosDelDestinatarioR extends SMCliente {
    
    private int CodigoPostal;

    public DatosDelDestinatarioR() {
    }

    
    public DatosDelDestinatarioR(int CodigoPostal, String NombreCompletos, String Calle_Carrera, int NoDeVivienda, int Teléfono) {
        super(NombreCompletos, Calle_Carrera, NoDeVivienda, Teléfono);
        this.CodigoPostal = CodigoPostal;
    }



    public int getCodigoPostal() {
        return CodigoPostal;
    }

    public void setCodigoPostal(int CodigoPostal) {
        this.CodigoPostal = CodigoPostal;
    }
    
    @Override
    public String getDatosArchivoTexto(){
        return super.getDatosArchivoTexto() +";"+
               this.CodigoPostal; 
    }


}
