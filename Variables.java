/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jocelyn.francisco.s1
 */
public class Variables {//Upper Camel Case
    //variable: espacio en memoria al que le podemos asignar contenido
    //localidad en memoria ram, nombre y valor 
    
    public static void main(String[] args) {
        //Asignsar un valor a la variable
        int speed = 10;
        System.out.println(speed);
        
        String employeeName = "Jocelyn";
        System.out.println(employeeName);
//ACTUALIZAR VARIABLES
        int salary = 1000;
        //bono
        //sintaxis ipica
        //salary = 1000 + 200;
        salary = salary + 200;
        System.out.println(salary);
        //pesnison: 50, descuento
        salary = salary - 50;
        System.out.println(salary);
        
        //2 horas extra
        //comida 45
        salary = salary + (2*30) - 45;
        System.out.println(salary);
//Actualizar cadenas de texto
        employeeName = employeeName + " Francisco";
        employeeName = employeeName + " Segundo";
        System.out.println(employeeName);
        
//NOMBRES EN JAVA
        //Java es sensible a maysuculas y minusculas
        //las variables deben iniciar con una letra, guion bajo o $
        //Sintaxis permitida
         int cellphone =  722698772;
         int cellPhone = 678493245;
         System.out.println(cellphone);
         System.out.println(cellPhone);
         String $countryName = "Spain";
         String _backgroundColor = "Green";
         String country_Name = "Spain";
         String background$Color = "Green";
         
         //CONSTANTES, SE ESCRIBEN CON MAYUSCULAS
         int POSITION = -5;
         int MAX_WIDTH = 9999;
         int MIN_WIDTH = 1;
         System.out.println(POSITION);
         
//CAMEL CASE
        //Upper Camel Case: Primera letra con mayúscula, se emplea en las clases
        //Lower Camel Case: minuscula, se emplea en las varaibles, metodos
        String fullName = "Jocelyn Francisco Segundo";
        int sizeInCentimeter = 97 ;
        
        
         
         
         
         
         

        
    }
    
}
