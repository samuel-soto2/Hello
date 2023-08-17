/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.suma;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Suma {

    public static void main(String[] args) {
        int numero_1;
        int numero_2;
        int resultado;
        
        Scanner constructor=new Scanner(System.in);
        System.out.println("Por favor ingrese el primer número: ");
        numero_1=constructor.nextInt();
        
        System.out.println("Por favor ingrese el segundo número: ");
        numero_2=constructor.nextInt();
        
        resultado=numero_1 + numero_2;
        
        System.out.println("El resultado de la suma es" +resultado);
     
        
    }
}
           
        
    }
}
