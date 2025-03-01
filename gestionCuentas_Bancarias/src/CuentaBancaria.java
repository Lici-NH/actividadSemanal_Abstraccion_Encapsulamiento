/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ALIS
 */
public class CuentaBancaria {
    
   private String numeroCuenta;
   private double saldoInicial;
   
   //Constructor 
   public CuentaBancaria(String numeroCuenta, double saldoInicial){
   this.numeroCuenta = numeroCuenta;
   this.saldoInicial = saldoInicial;
   }
   
   //metodo para deposita, donde se controla que el saldo no sea negativo.
public void depositar (double cantidad) {
    if (cantidad > 0){ 
      saldoInicial += cantidad;   
    }
    else {
    System.out.println("La cantidad debe ser positiva");
    }
}
    //metodo para retirar
    
    public void retirar (double cantidad) {
    if (cantidad > 0) {
       if (saldoInicial >= cantidad) {
           saldoInicial += cantidad;
       }
    }  
    
    else {
            System.out.println("Saldo Insuficiente");
    }
    }
    
    //Metodo para consultar saldo
    public void consultarSaldo ( ) {
        System.out.println("Su saldo actual es de: " + saldoInicial);
    }

}
   
    
  
