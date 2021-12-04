/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Entidades.DatosDelRemitenteR;
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
public class ArchivosDatosDelRemitente {
    
    
    private File Archivo;
    private FileWriter A_Escritura;
    private Scanner A_Lectura;

    public ArchivosDatosDelRemitente() {
        
        this.Archivo = new File("DatosDelRemitente.dat");
    }

    public ArchivosDatosDelRemitente(String Name) {
        
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
    
    
    public boolean Escribir (DatosDelRemitenteR H) throws IOException{
        
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
    
    public DatosDelRemitenteR LeerDatosDelRemitenteR (String linea[]){
        DatosDelRemitenteR H = new DatosDelRemitenteR();
        H.setNombreCompletos(linea[0]);
        H.setCalle_Carrera(linea[1]);
        H.setNoDeVivienda(Integer.valueOf(linea[2]));
        H.setTeléfono(Integer.valueOf(linea[3]));
        H.setPais((linea[4]));
        H.setCiudad((linea[5]));
        return H;
    }
    
    
   
    public List<DatosDelRemitenteR> Leer() throws IOException{
        
        List<DatosDelRemitenteR> lista = null;
        
        try {
            this.A_Lectura = new Scanner(this.Archivo);
            lista = new ArrayList();
            while(this.A_Lectura.hasNext()){
                String linea[] = this.A_Lectura.nextLine().split(";");
                DatosDelRemitenteR H = this.LeerDatosDelRemitenteR(linea);
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
    
    
        public DatosDelRemitenteR Eliminar(String NombreCompletos) throws IOException{ // 123
        

        DatosDelRemitenteR eliminado = null;
        List<DatosDelRemitenteR> listadoDatosDelRemitenteR = this.Leer();
        ArchivosDatosDelRemitente archivoTmp = new ArchivosDatosDelRemitente("ListaDatosDelRemitenteRTmp.dat");
        for (DatosDelRemitenteR H : listadoDatosDelRemitenteR) {
            if (H.getNombreCompletos().equals(NombreCompletos)) {
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
        
        
        
        public DatosDelRemitenteR buscar(String NombreC) throws IOException{
        DatosDelRemitenteR Buscado1 = null;
        
        try{
            this.A_Lectura = new Scanner(this.Archivo);
            while(this.A_Lectura.hasNext()){
                DatosDelRemitenteR H = this.LeerDatosDelRemitenteR(this.A_Lectura.nextLine().split(";"));
                if(H.getNombreCompletos().equals(NombreC)){
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
    
  

