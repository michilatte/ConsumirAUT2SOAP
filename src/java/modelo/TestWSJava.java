/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import ws.WSOperaciones;
import ws.WSOperaciones_Service;

/**
 *
 * @author USUARIO
 */
public class TestWSJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // UTILIZAR METODOS
        
        //LOGIN
        
        WSOperaciones_Service servicio = new WSOperaciones_Service();
        WSOperaciones cliente = servicio.getWSOperacionesPort();
        
        if(cliente.login("Miriam", "medina2003")){
            System.out.println("Credenciales CORRECTAS");
        }else{
            System.out.println("Credenciales INCORRECTAS");
        }
        
        
        // PROCESAR PAGO
        if(cliente.procesarPago(5000, 50)!=-1){
            System.out.println("Pago realizado con EXITO");
            System.out.println("Su vuelto es: "+cliente.procesarPago(5000, 50));
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
    
}
