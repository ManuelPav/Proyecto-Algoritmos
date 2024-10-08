/*Este es el codigo principal en donde se ejecuta el loging
@since 15/09/2024
@author Manuel Mansilla
*/
       
package Principal;

//importamos las clases que nos sirvan
import interfas.Login; 
import logica.Categorias;

public class Principal {
    
    //este es el metodo main el cual se encarga de redirigir 
    //a una pestaña emergente del Login 
    public static void main(String[] args){
        
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);  
        
        Categorias categorias = new Categorias();
        categorias.verificacionC();
        categorias.verificacionP();
        
    }  
}
