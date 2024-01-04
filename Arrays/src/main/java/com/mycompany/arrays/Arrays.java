/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arrays;

import java.util.Scanner;

/**
 *
 * @author ST10231469
 */
public class Arrays {

    public static void main(String[] args) {
       String[][] cars = {{"Bugatti","Tesla","Agera R","Lambo"},{"Volvo","BMW","Ford","Mazda"},{"Opel","Porshe","Nissan","Toyota"}};
        String y = cars[2][0];
        System.out.println(y); 
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println(cars);
        boolean flag=false;
        
        String search ="B";
        for(int i = 0;i < cars.length-1; i++){
            //System.out.println(a[i]);
            if(search.equals(cars[i][i])){
                System.out.println("Element is found at: "+i+" "+cars[i][i]);
                flag=true;
                break;
            }
        } 
            if (flag ==false){
                System.out.println("Element Not Found");  
            }
    }
}
