package Usuario;

public class loging {
    
    public boolean validarUsuario(String usuario, String contraseña){
        boolean usuarioValidado = false;
        
        
        if(("admin".equals(usuario)) && ("1234").equals(contraseña)){
            usuarioValidado = true;
        }
            return usuarioValidado;
        
    }
    
    
}
