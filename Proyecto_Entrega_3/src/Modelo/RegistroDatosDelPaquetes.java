/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Datos.ArchivosDatosDelPaquetes;
import Entidades.DatosDelPaqueteR;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author JULIO
 */
public class RegistroDatosDelPaquetes {
    
    private ArchivosDatosDelPaquetes datos;

    public RegistroDatosDelPaquetes() {
        this.datos = new ArchivosDatosDelPaquetes();
    }

    /**
     * @return the datos
     */
    public ArchivosDatosDelPaquetes getDatos() {
        return datos;
    }

    /**
     * @param datos the datos to set
     */
    public void setDatos(ArchivosDatosDelPaquetes datos) {
        this.datos = datos;
    }
    
    
    public boolean registrar(DatosDelPaqueteR H) throws IOException{
        return this.datos.Escribir(H);
    }
    
    public List<DatosDelPaqueteR> Leer() throws IOException{
        return this.datos.Leer();
    }
    
    public DatosDelPaqueteR Eliminar(String Descripcion) throws IOException{
        return this.datos.Eliminar(Descripcion);
    }
    
    public DatosDelPaqueteR buscar(String Descripcion) throws IOException{
        return this.datos.buscar(Descripcion);
    }
    


}
