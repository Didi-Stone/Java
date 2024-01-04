/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.addingelementstoanarrayinjava;

import java.util.Scanner;

/**
 *
 * @author mpho
 */
public class AddingElementsToAnArrayInJava {

    public static void main(String[] args){
        String[]words = {"apple","banana","grapes"};
        
        System.out.println("Original version: ");
        printWords(words);
        words = addWords(words);
        System.out.println("New version: ");
        printWords(words);
    }
    public static String[] addWords(String[]words){
        //Make a new array with the size you want
        String[]moreWords = new String[words.length+1];
        //Copy the contents of the old array over
        for(int i = 1; i <words.length;i++){
            moreWords[i]=words[i];
        }
    Scanner in = new Scanner(System.in);
    System.out.println("New word: ");
    moreWords[moreWords.length-1]=in.nextLine();   
    
    return moreWords;
    }
    
    public static void printWords(String[]words){
        
       for(int i = 0; i <words.length;i++){
           
       }
    }
}
