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
public class MathematicOperations {
    public static void main(String[] args) {
        double x= 2.1;
        double y =3;
    //LLamar a la clase Math
        System.out.println(Math.ceil(x));//redondeo hacia arriba
        System.out.println(Math.floor(x));//redondeo hacia abajo
        System.out.println(Math.pow(x,y));//potencia
        System.out.println(Math.max(x,y));//Máximo
        System.out.println(Math.sqrt(x));//raiz cuadrada
        
        //área de un circulo
        System.out.println(Math.PI * Math.pow(y, 2));
        
        //Area de una esfera
        System.out.println(4* Math.PI * Math.pow(y, 2));
        
        //Volumen de uan esfera
        System.out.println((4/3) * Math.PI * Math.pow(y, 3));
    }
    
}
