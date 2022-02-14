/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abadiaspirenaicas;

import java.util.Scanner;

/**
 *
 * @author 1dawa
 */
public class Abadiaspirenaicas {
    
    
    
    public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);
        int[] cantidadMontañas;
        int cantidad;
        
        
            cantidad = cr.nextInt();
            
        
        while(cantidad != 0)
        {
            cantidadMontañas = new int[cantidad];
            
            for(int i = 0; i < cantidadMontañas.length; i++)
            {
                cantidadMontañas[i] = cr.nextInt();
            }
            int max = cantidadMontañas[cantidadMontañas.length-1];
            int contador = 1;
            for(int i = cantidadMontañas.length-1; i >= 0; i--)
            {
                if(max < cantidadMontañas[i])
                {
                    max = cantidadMontañas[i];
                    contador++;
                }
            }
            System.out.println(contador);
            cantidad = cr.nextInt();
            
        }
        
        
        
    }
    
}
