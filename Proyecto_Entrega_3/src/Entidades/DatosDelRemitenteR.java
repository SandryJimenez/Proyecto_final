/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author JULIO
 */
public class DatosDelRemitenteR extends SMCliente{
    
    private String Pais;
    private String Ciudad;

    public DatosDelRemitenteR() {
    }

    public DatosDelRemitenteR(String Pais, String Ciudad, String NombreCompletos, String Calle_Carrera, int NoDeVivienda, int Teléfono) {
        super(NombreCompletos, Calle_Carrera, NoDeVivienda, Teléfono);
        this.Pais = Pais;
        this.Ciudad = Ciudad;
    }

    

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }
    
    @Override
    public String getDatosArchivoTexto(){
        return super.getDatosArchivoTexto() +";"+
               this.Pais +";"+
               this.Ciudad ;
    }
}
