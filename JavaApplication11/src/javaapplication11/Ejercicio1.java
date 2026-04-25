/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11;



/**
 *
 * @author Richard
 */
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int h0,m0,s0,h,m,s;
               
        System.out.print("Ingrese las horas (0-23): ");
        h0 = teclado.nextInt();
        
        System.out.print("Ingrese los minutos (0-59): ");
        m0 = teclado.nextInt();
        
        System.out.print("Ingrese los segundos (0-59): ");
        s0 = teclado.nextInt();

        if (h0 < 0 || h0 > 23 || m0 < 0 || m0 > 59 || s0 < 0 || s0 > 59) {
            System.out.println("Error: Los valores ingresados no son válidos.");
        } else {
            h=h0;
            m=m0;
            s=s0;        

            s=s+1;

            if (s == 60) {
                s = 0;
                m=m+1;
                
                if (m == 60) {
                    m = 0;
                    h=h+1;
                    
                    if (h == 24) {
                        h = 0;
                    }
                }
            }

 
            System.out.printf("Entrada: %02d:%02d:%02d -> Salida: %02d:%02d:%02d\n",h0, m0, s0, h, m, s); 
                              
        }
    }
}
