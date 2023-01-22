/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author jocelyn.francisco.s1
 */
public class IncrementDecrement {

    public static void main(String[] args) {
//POSFIJA: se accede al valor original de la varaible y luego se ejecuta el operador        
        int lives = 5;
        lives = lives - 1;
        System.out.println(lives);//4
        lives--;//Operador decremento
        System.out.println(lives);

        lives++;//Operador incremento
        System.out.println(lives);

//PREFIJA:se obtiene el dato incrementado
        //Gana un regalo por ganar una vida
        /*int gift = 100 + lives++;//postfijo
        System.out.println(gift);
        System.out.println(lives);//5//104*/
        int gift = 100 + ++lives;//prefijo
        System.out.println(gift);
        System.out.println(lives);
        
        
        
    }
}
