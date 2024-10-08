/**
 * almacenamos todos los procesos correspondientes de categorias
 **/
package logica;
import funciones.Funciones;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * esta es la clase categorias, almacena los datos de categorias
 * @author Manuel
 * @since 4/10/2024
 **/
public class Categorias {
    Funciones fun = new Funciones();

    public void verificacionC(){
        
        File file = new File("C:\\Users\\labor\\OneDrive\\Escritorio\\UMG 2\\Algoritmos\\proyecto de semestre\\proyecto\\ProyectAlgoritmos\\src\\db\\categorias.TXT");
        
        //conprovamos que el archivo categorias exista y si no crea un nuevo archivo
        if (file.exists() == false){
            try {
                file.createNewFile();
                
            } catch (IOException ex) {
                Logger.getLogger(Categorias.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    public void verificacionP(){
        
        File file = new File("C:\\Users\\labor\\OneDrive\\Escritorio\\UMG 2\\Algoritmos\\proyecto de semestre\\proyecto\\ProyectAlgoritmos\\src\\db\\productos.TXT");
        
        //conprovamos que el archivo categorias exista y si no crea un nuevo archivo
        if (file.exists() == false){
            try {
                file.createNewFile();
                
            } catch (IOException ex) {
                Logger.getLogger(Categorias.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
