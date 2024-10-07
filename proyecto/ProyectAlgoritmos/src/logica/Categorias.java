/**
 * almacenamos todos los procesos correspondientes de categorias
 **/
package logica;

/**
 * esta es la clase categorias, almacena los datos de categorias
 * @author Manuel
 * @since 4/10/2024
 **/
public class Categorias {
    
    public int IDcategorias;
    public String nombre;
    
    public Categorias(){
    }
    
    
    public Categorias(int IDcategorias, String nombre){
        this.IDcategorias = IDcategorias;
        this.nombre = nombre;
    }
    
    public int getIDcategorias(int IDcategorias){
        return IDcategorias;
    }
    
    public void setIDcategorias(){
        this.IDcategorias = IDcategorias;
    }
    
    public String getNombre(String nombre){
        return nombre;
    }
    
    public void setNombre(){
        this.nombre = nombre;
    }
}
