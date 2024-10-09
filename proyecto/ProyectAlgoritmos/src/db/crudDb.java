
package db;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Manuel
 */
public class crudDb {
    
    public boolean writeDb(String nombreDb, String contenido ){
        boolean verifyWrite = false;
        
        String carpetaArchivo = "db2";
        String nombreArchivo = nombreDb + ".txt";
        File carpeta = new File(carpetaArchivo);
        File archivo = new File(carpeta, nombreArchivo);
        
        try {
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido+"\n");
            bw.close();
            verifyWrite = true;
        } catch (IOException ex) {
            System.out.println("!error");
        }
        return verifyWrite;
    }
}
