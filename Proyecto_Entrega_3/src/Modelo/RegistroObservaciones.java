/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Datos.ArchivosObservaciones;
import Entidades.Observaciones;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author JULIO
 */
public class RegistroObservaciones {
    
    
    private ArchivosObservaciones datos;

    public RegistroObservaciones() {
        this.datos = new ArchivosObservaciones();
    }

    /**
     * @return the datos
     */
    public ArchivosObservaciones getDatos() {
        return datos;
    }

    /**
     * @param datos the datos to set
     */
    public void setDatos(ArchivosObservaciones datos) {
        this.datos = datos;
    }
    
    
    public boolean registrar(Observaciones H) throws IOException{
        return this.datos.Escribir(H);
    }
    
    public List<Observaciones> Leer() throws IOException{
        return this.datos.Leer();
    }
    
    public Observaciones Eliminar(String FechaIngreso) throws IOException{
        return this.datos.Eliminar(FechaIngreso);
    }
    
    public Observaciones buscar(String FechaIngreso) throws IOException{
        return this.datos.buscar(FechaIngreso);
    }
    


}
