/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Datos.ArchivoDatosDelDestinatario;
import Entidades.DatosDelDestinatarioR;
import Entidades.DatosDelDestinatarioR;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author JULIO
 */
public class RegistroDatosDelDestinatario {
    
    private ArchivoDatosDelDestinatario datos;

    public RegistroDatosDelDestinatario() {
        this.datos = new ArchivoDatosDelDestinatario();
    }

    /**
     * @return the datos
     */
    public ArchivoDatosDelDestinatario getDatos() {
        return datos;
    }

    /**
     * @param datos the datos to set
     */
    public void setDatos(ArchivoDatosDelDestinatario datos) {
        this.datos = datos;
    }
    
    
    public boolean registrar(DatosDelDestinatarioR H) throws IOException{
        return this.datos.Escribir(H);
    }
    
    public List<DatosDelDestinatarioR> Leer() throws IOException{
        return this.datos.Leer();
    }
    
    public DatosDelDestinatarioR Eliminar(String NombreCompletos) throws IOException{
        return this.datos.Eliminar(NombreCompletos);
    }
    
    public DatosDelDestinatarioR buscar(String NombreCompletos) throws IOException{
        return this.datos.buscar(NombreCompletos);
    }
    

}
