
package funciones;

//importamos metodos que nos sirvan 
import java.io.File;

/**
 * la clase funciones se encargar de almacenar todas aquellas 
 * acciones repetitivas que podemos utilizar 
 * @author Manuel
 */
public class Funciones {
    
    File file = new File("");
    
    //la clase create file nos ayuda a crear los archivos que no esten creados
    public void CreateFile(){
        
        boolean verificador = file.exists();
        
        if (verificador == false){
            file.mkdir();
        }
        
    }
}
