/*Este es el codigo principal en donde se ejecuta el loging
@since 15/09/2024
@author Manuel Mansilla
*/
       
package Principal;

//importamos la clase interfas para acceder a las funcionalidades
import interfas.Login; 

import registros.DatosC;


public class Principal {
    
    //este es el metodo main el cual se encarga de redirigir 
    //a una pestaña emergente del Login 
    public static void main(String[] args){
        
        Login login = new Login();
        DatosC datosC = new DatosC();
        
        login.setVisible(true);
        login.setLocationRelativeTo(null);  
        
        datosC.CreateFile();
    }  
}
