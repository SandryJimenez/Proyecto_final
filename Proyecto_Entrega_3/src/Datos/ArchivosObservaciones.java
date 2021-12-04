/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Entidades.DatosDelDestinatarioR;
import Entidades.DatosDelRemitenteR;
import Entidades.Observaciones;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author JULIO
 */
public class ArchivosObservaciones {
    
    
    private File Archivo;
    private FileWriter A_Escritura;
    private Scanner A_Lectura;

    public ArchivosObservaciones() {
        
        this.Archivo = new File("Observaciones.dat");
    }

    public ArchivosObservaciones(String Name) {
        this.Archivo = new File(Name);
    }

    public File getArchivo() {
        return Archivo;
    }

    public void setArchivo(File Archivo) {
        this.Archivo = Archivo;
    }

    public FileWriter getA_Escritura() {
        return A_Escritura;
    }

    public void setA_Escritura(FileWriter A_Escritura) {
        this.A_Escritura = A_Escritura;
    }

    public Scanner getA_Lectura() {
        return A_Lectura;
    }

    public void setA_Lectura(Scanner A_Lectura) {
        this.A_Lectura = A_Lectura;
    }
    
    
    
    public boolean Escribir (Observaciones H) throws IOException{
        
        PrintWriter Escritor=null;
        boolean Exito = false;
        try{
            this.A_Escritura = new FileWriter(this.Archivo, true);
            Escritor = new PrintWriter(this.A_Escritura);
            Escritor.println(H.getDatosArchivoTexto());
            Exito = true;
            return Exito;
            
        }catch(IOException ioe){
            throw new IOException("Error al abrir el archvio en modo escritura");
        }
        finally{
            if(Escritor!=null)
                Escritor.close();
            
            if(this.A_Escritura!=null){
                this.A_Escritura.close();
            }    
        }
    }
    
    public Observaciones LeerObservaciones (String linea[]){
        Observaciones H = new Observaciones();
        
        H.setNoPaquete(Integer.valueOf(linea[0]));
        H.setFechaIngreso((linea[1]));
        H.setFechaLimiteEntrega((linea[2]));
        return H;
    }
    

    public List<Observaciones> Leer() throws IOException{
        
        List<Observaciones> lista = null;
        
        try {
            this.A_Lectura = new Scanner(this.Archivo);
            lista = new ArrayList();
            while(this.A_Lectura.hasNext()){
                String linea[] = this.A_Lectura.nextLine().split(";");
                Observaciones H = this.LeerObservaciones(linea);
                lista.add(H);
            }
            return lista;
            
       
        } catch (FileNotFoundException ex) {
            throw new IOException("Error al leer el archivo");
        }
        finally{
            if(this.A_Lectura!=null)
                this.A_Lectura.close();
        }  
        
    }
    
    
 
    public Observaciones Eliminar(String FechaIngreso) throws IOException{ // 123
        

        Observaciones eliminado = null;
        List<Observaciones> listadoObservaciones = this.Leer();
        ArchivosObservaciones archivoTmp = new ArchivosObservaciones("ListaObservacionesTmp.dat");
        for (Observaciones H : listadoObservaciones) {
            if (H.getFechaIngreso().equals(FechaIngreso)) {
                eliminado = H;
            } else {
                archivoTmp.Escribir(H);
            }
        }

        if (!archivoTmp.Archivo.exists()) {
            archivoTmp.Archivo.createNewFile();
        }
        if (this.Archivo.delete()) {
            if (archivoTmp.Archivo.renameTo(this.Archivo)) {
                return eliminado;
            } else {
                throw new IOException("El archivo temporal no fue renombrado");
            }

        } else {
            throw new IOException("El archivo original no fue eliminado");
        }
        
    }
    
    
    
        public Observaciones buscar(String FechaIngreso) throws IOException{
        Observaciones Buscado1 = null;
        
        try{
            this.A_Lectura = new Scanner(this.Archivo);
            while(this.A_Lectura.hasNext()){
                Observaciones H = this.LeerObservaciones(this.A_Lectura.nextLine().split(";"));
                if(H.getFechaIngreso().equals(FechaIngreso)){
                    Buscado1 = H;
                    break;
                }
            }
            return Buscado1;
        }catch(FileNotFoundException ex){
            throw new IOException("No fue posible abrir el archivo para leer");
        }
        finally{
            if(this.A_Lectura!=null)
                this.A_Lectura.close();
        }
    }
        
}
