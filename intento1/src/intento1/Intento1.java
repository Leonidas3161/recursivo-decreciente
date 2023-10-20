/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intento1;

import java.util.Scanner;

/**
 *
 * @author Gipsy Danger
 */
public class Intento1 {

    static int decremento(int n){
        if (n==0) {
            return 0;
        }else{
        System.out.println(n);
        return decremento(n-1);
        }
        
        
        }
    
    public static void main(String[] args) {
        int num;
        System.out.print("ingrese el numero que quiere reducir a 0: ");
        Scanner entrada = new Scanner(System.in);
        num=entrada.nextInt();
                      
        System.out.println(decremento(num));
        
        
    }
    
}
