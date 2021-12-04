/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


import Datos.ArchivosDatosDelRemitente;
import Entidades.DatosDelRemitenteR;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author JULIO
 */
public class RegistroDatosDelRemitente {
    
    
    private ArchivosDatosDelRemitente datos;

    public RegistroDatosDelRemitente() {
        this.datos = new ArchivosDatosDelRemitente();
    }

    /**
     * @return the datos
     */
    public ArchivosDatosDelRemitente getDatos() {
        return datos;
    }

    /**
     * @param datos the datos to set
     */
    public void setDatos(ArchivosDatosDelRemitente datos) {
        this.datos = datos;
    }
    
    
    public boolean registrar(DatosDelRemitenteR H) throws IOException{
        return this.datos.Escribir(H);
    }
    
    public List<DatosDelRemitenteR> Leer() throws IOException{
        return this.datos.Leer();
    }
    
    public DatosDelRemitenteR Eliminar(String NombreC) throws IOException{
        return this.datos.Eliminar(NombreC);
    }
    
    public DatosDelRemitenteR buscar(String NombreC) throws IOException{
        return this.datos.buscar(NombreC);
    }
    

}
