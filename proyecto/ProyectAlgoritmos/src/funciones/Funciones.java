
package funciones;

//importamos los metodos que nos sirvan 
import java.io.File;

/**
 * la clase funciones se encargar de almacenar todas aquellas 
 * acciones repetitivas que podemos utilizar 
 * @author Manuel
 */
public class Funciones {
        
    //la clase create file nos ayuda a crear los archivos que no esten creados
    public void CreateFileC(){
        boolean verificador;
        
        //instanciamos la clase file y conprovamos que el archivo correspondiente exista
        File file = new File("");
        verificador = file.exists();
        
        //si el verificador nos da false "el archivo no existe" el programa crea la ruta 
        if (verificador == false){
            file.mkdir();
        }
        
    }
}
