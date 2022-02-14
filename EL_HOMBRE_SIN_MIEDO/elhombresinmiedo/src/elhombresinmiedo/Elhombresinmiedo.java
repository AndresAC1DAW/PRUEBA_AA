/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elhombresinmiedo;

import java.util.Scanner;

/**
 *
 * @author 1dawa
 */
public class Elhombresinmiedo {

    public static Scanner cr = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int f = cr.nextInt();
        int c = cr.nextInt();
        
        while(f!=0 && c!=0)
        {
            char[][] sala = new char[f][c];
            for(int i = 0; i < sala.length; i++)
            {
                String pos = cr.next();
                for(int j = 0; j < sala[i].length; j++)
                {
                    sala[i][j] = pos.charAt(j);
                }
                
            }
            
            int consultas = cr.nextInt();
            
            for(int k = 0; k < consultas; k++)
            {
                int filaBuscar = cr.nextInt()-1;
                int columnBuscar = cr.nextInt()-1;
                String direccion = cr.next();
                
                
                if(direccion.equals("DERECHA"))
                {
                    int cont = 0;
                    boolean villano = false;
                    for(int j = columnBuscar+1; j < sala[0].length && !villano; j++)
                    {
                        char lug = sala[filaBuscar][j];
                        if(lug=='X')
                        {
                            villano = true;
                        }
                        cont++;
                    }
                    if(!villano)
                    {
                        System.out.println("NINGUNO");
                    }
                    else
                        System.out.println(cont);
                }
                else if(direccion.equals("IZQUIERDA"))
                {
                    int cont = 0;
                    boolean villano = false;
                    for(int j = columnBuscar-1; j >= 0 && !villano; j--)
                    {
                        char lug = sala[filaBuscar][j];
                        if(lug=='X')
                        {
                            villano = false;
                        }
                        
                    }
                    if(!villano)
                    {
                        System.out.println("NINGUNO");
                    }
                    else
                        System.out.println(cont);
                }
                
                else if(direccion.equals("ARRIBA"))
                {
                    int cont = 0;
                    boolean villano = false;
                    for(int i = filaBuscar-1; i >= 0 && !villano; i--)
                    {
                        char lug = sala[i][columnBuscar];
                        if(lug=='X')
                        {
                            villano = true;
                        }
                        cont++;
                    }
                    if(!villano)
                    {
                        System.out.println("NINGUNO");
                    }
                    else
                        System.out.println(cont);
                }
                
                else if(direccion.equals("ABAJO"))
                {
                    int cont = 0;
                    boolean villano = false;
                    for(int i = filaBuscar+1; i < sala.length; i++)
                    {
                        char lug = sala[i][columnBuscar];
                        if(lug=='X')
                        {
                            villano = true;
                        }
                        cont++;
                    }
                    if(!villano)
                    {
                        System.out.println("NINGUNO");
                    }
                    else
                        System.out.println(cont);
                }
                
            }
            
            
            
            
            
            
            
            System.out.println("---");
            f = cr.nextInt();
            c = cr.nextInt();
        }
        
    }
    
}
