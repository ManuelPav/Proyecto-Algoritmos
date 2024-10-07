package logica;

/**
 * esta es la clase LoginL la cual se encarga de almacenar todos los objetos
 y metodos que utilizaré en mi interfas de login
 * @since 27/9/2024
 * @author Manuel
 */
public class LoginL {    

    public boolean Validacion(String usuario, String contraseña){
        boolean conprovacion = false;
        
        if ("Manuel".equals(usuario) && "Benja".equals(contraseña)){
                conprovacion = true;          
                
        }
        return conprovacion;   
    }
    
    
    
    
}
