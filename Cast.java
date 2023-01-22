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
public class Cast {
    public static void main(String[] args) {
       //En un año ubicar 30 perritos
       //cuantos por mes
       double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);//2.5
        
        //ESTIMACION: al convertir de un tipo de dato mas grande a uno menor se trunca
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);//2
         //Volumen de uan esfera, casteo directo
        System.out.println( (int) Math.sqrt(28));

        //EXACTITUD
        int a = 30;
        int b = 12;
        System.out.println((double) a/b);//2.5
        
        char n = '1';
        int nI = n;//casteo automatico, char si cabe en int, 49
        
        System.out.println(nI);
        
        short nS = (short) n; //char no cabe en un short, 49, //casteo explicito
        System.out.println(nS);
        
    }
}
