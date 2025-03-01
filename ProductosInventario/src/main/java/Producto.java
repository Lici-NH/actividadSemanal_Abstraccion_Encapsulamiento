/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ALIS
 */
public class Producto {
    
    private String codigoProducto;
    private String nombre;
    private double precio;
    
    //Constructor
    public Producto (String codigoProducto, String nombre, double precio){
     this.codigoProducto = codigoProducto;
     this.nombre = nombre;
     this.precio = precio;
    }
    
    //Getter para producto
    public double getprecio () {
    return precio;
    }
    
    //Setter para producto
    public void setprecio (double precio){
        if (precio>= 0)//Verificar que el precio no sea negativo
        {this.precio = precio;}
    else {
    System.out.println("El precio esta por debajo de ");
    }
}
}

    
