/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cliente;

import biblioteca.GestorBibliotecaIntf;
import biblioteca.TDatosRepositorio;
import java.rmi.Naming;
import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    
    public static int MenuPrincipal()
    {
        Scanner Teclado=new Scanner(System.in);
        int Salida;
        do
        {
            System.out.println("\n****************************");
            System.out.println("**");
            System.out.println("** 1.- Sumar");
            System.out.println("** 2.- Restar");
            System.out.println("** 3.- Multiplicar");
            System.out.println("** 4.- Dividir");
            System.out.println("** 5.- Automático");
            System.out.println("** 6.- Sumar Vector de Operaciones");
            System.out.println("** 7.- Salir");
            System.out.println("**");            
            System.out.print("** Elige Opcion:");
            Salida=Teclado.nextInt();
        } while (Salida<1 || Salida>7);
        return Salida;
    };
    
    public static void main(String[] args) {
         try {
            GestorBibliotecaIntf gestor = (GestorBibliotecaIntf) Naming.lookup("rmi://localhost/GestorBibliotecaService");
            int repoCount = gestor.NRepositorios(1);
            
            int conexion = gestor.Conexion("password");
            System.out.println("Conexión obtenida con ID: " + conexion);
        
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
   
    }    
}
