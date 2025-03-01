/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ALIS
 */
public class Estudiantes {
    
    private String nombreEstudiante;
    private String carnet;
    private double notaFinal;
    
    //Constructor --lleva el misno nombre de la clase.
    public Estudiantes (String nombreEstudiante, String carnet, int notaFinal){
    this.nombreEstudiante = nombreEstudiante;
    this.carnet = carnet;
    this.notaFinal = notaFinal;
    } 
    
    //getters
    public String getnombreEstudiante (){
    return nombreEstudiante;
    }
    
    public String getcarnet(){
    return carnet;
    }
    
    public double getnotaFinal(){
    return notaFinal;
    }
    
    //setter
    public void setnotaFinal (double notaFinal)
    {if (notaFinal >= 0 && notaFinal <=100){
    this.notaFinal = notaFinal;
    }
    else {System.out.println("La nota debe estar en el rago de 0 a 100");}
    }
            
            
}
