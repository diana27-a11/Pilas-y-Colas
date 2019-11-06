/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class Pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int pila[] = new int[10];
        Pila pilaEnteros = new Pila(pila); 
        pilaEnteros.insertar(27);
        pilaEnteros.insertar(20); 
        pilaEnteros.insertar(6);
        pilaEnteros.insertar(27);
        
        int opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                "Acción a realizar: \n\n 1.Visualizar la Cima\n 2.Visualizar el Fondo\n 3.Visualizar Pilas\n 4.Retirar Cima\n 5.Salir"));
        
        switch (opcion){
            case 1:
                JOptionPane.showMessageDialog(null, "¿Desea visualizar la Cima? " );
                pilaEnteros.cima();
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "¿Desea visualizar el fondo? ");
                pilaEnteros.fondo();
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "¿Desea visualizar la pila completa?");
                pilaEnteros.mostrarPila();
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "¿Desea retirar la cima?");
                pilaEnteros.retirar();
                pilaEnteros.mostrarPila();
                break;
            case 5:
                //JOptionPane.showConfirmDialog(null, "¿Esra seguro?");
                System.exit(0);
                break;
                default:
                JOptionPane.showMessageDialog(null, "Opcion Incorrecta");

       // }
        
//        Object [] opciones={"Cima","Fondo","retirar","mostrar"};
//        Object opcion = JOptionPane.showInputDialog(null,"Selecciona una opcion:", "Elejir",
//                JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);
//        if (opciones.toString().equalsIgnoreCase("retirar")) {
//            System.out.println("Eligio la cima xD"); 
           
            
        }
        
      
        
        
        
        
        
        
       
        
//        pilaEnteros.mostrarPila();
//     pilaEnteros.cima();
//     pilaEnteros.fondo();
//     pilaEnteros.retirar();
//     pilaEnteros.mostrarPila();
        
        // TODO code application logic here
    }
    
}
