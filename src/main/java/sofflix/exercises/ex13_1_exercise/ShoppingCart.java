/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the te
mplate in the editor.
 */
package ex13_1_exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Hp
 */
public class ShoppingCart {
    public static void main(String[] args){
        String[] days = {"monday","saturday","tuesday","sunday","friday"};
        
        // Convert the days array into an ArrayList        
        List<String> listDays = new ArrayList(Arrays.asList(days));
        // Loop through the ArrayList, printing out "sunday" elements in 
        for (String day : listDays) {                    
        //   upper case (use toUpperCase() method of String class) 
            if(day.equals("sunday")){
                System.out.println(day.toUpperCase());
            }else{
            // Print all other days in lower case 
            System.out.println(day);
            }
        }        
        // Print out the ArrayList  
        System.out.println(listDays);
    }    
}
