/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;


import Entidades.DatosDelPaqueteR;
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
public class ArchivosDatosDelPaquetes {
    
    private File Archivo;
    private FileWriter A_Escritura;
    private Scanner A_Lectura;

    public ArchivosDatosDelPaquetes() {
        
        this.Archivo = new File("DatosDelPaquetes.dat");
    }

    public ArchivosDatosDelPaquetes(String Name) {
        
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
    
    
    public boolean Escribir (DatosDelPaqueteR H) throws IOException{
        
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


    public DatosDelPaqueteR LeerDatosDelPaqueteR (String linea[]){
        DatosDelPaqueteR H = new DatosDelPaqueteR();
        H.setTipoPqt(linea[0]);
        H.setDescripcion(linea[1]);
        H.setLargo(Double.valueOf(linea[2]));
        H.setAncho(Double.valueOf(linea[3]));
        H.setAlto(Double.valueOf(linea[4]));
        H.setPeso(Double.valueOf(linea[5]));
        H.setValorDeclarado(Double.valueOf(linea[6]));
        return H;
    }
    
    
   
    public List<DatosDelPaqueteR> Leer() throws IOException{
        
        List<DatosDelPaqueteR> lista = null;
        
        try {
            this.A_Lectura = new Scanner(this.Archivo);
            lista = new ArrayList();
            while(this.A_Lectura.hasNext()){
                String linea[] = this.A_Lectura.nextLine().split(";");
                DatosDelPaqueteR H = this.LeerDatosDelPaqueteR(linea);
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
    
    public DatosDelPaqueteR Eliminar(String Descripcion) throws IOException{ // 123
        

        DatosDelPaqueteR eliminado = null;
        List<DatosDelPaqueteR> listadoDatosDelPaqueteR = this.Leer();
        ArchivosDatosDelPaquetes archivoTmp = new ArchivosDatosDelPaquetes("ListaDatosDelPaqueteTmp.dat");
        for (DatosDelPaqueteR H : listadoDatosDelPaqueteR) {
            if (H.getDescripcion().equals(Descripcion)) {
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
    
        
    public DatosDelPaqueteR buscar(String Descripcion) throws IOException{
        DatosDelPaqueteR Buscado1 = null;
        
        try{
            this.A_Lectura = new Scanner(this.Archivo);
            while(this.A_Lectura.hasNext()){
                DatosDelPaqueteR H = this.LeerDatosDelPaqueteR(this.A_Lectura.nextLine().split(";"));
                if(H.getDescripcion().equals(Descripcion)){
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
