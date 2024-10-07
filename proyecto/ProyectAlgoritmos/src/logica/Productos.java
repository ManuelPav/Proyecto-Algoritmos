
package logica;

public class Productos {
    
    private int IDproductos;
    private String nombre;
    private String categoria1;
    private String categoria2; 
    private String categoria3;
    private float precio;
    private int stock;
    private String descripcion;
    
    public Productos(){
    }
    
    public Productos(int IDproductos, String nombre, String categoria1, String categoria2, String categoria3, float Precio, int stock, String descripcion){
     this.IDproductos = IDproductos;   
     this.nombre = nombre;
     this.categoria1 = categoria1;
     this.categoria2 = categoria2;
     this.categoria3 = categoria3;
     this.precio = precio;
     this.stock = stock;
    }
    
    public int getIDproductos(){
        return IDproductos;
    }
    
    public void setIDproductos(int IDproductos){
        this.IDproductos = IDproductos;
    }
    
    public String getNombre(String nombre){
        return nombre;
    }
    
    public String getCategoria1(){
        return categoria1 = categoria1;
    }
    
    public void setCategoria1(String categoria1){
        this.categoria1 = categoria1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria2() {
        return categoria2;
    }

    public void setCategoria2(String categoria2) {
        this.categoria2 = categoria2;
    }

    public String getCategoria3() {
        return categoria3;
    }

    public void setCategoria3(String categoria3) {
        this.categoria3 = categoria3;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }   
}
