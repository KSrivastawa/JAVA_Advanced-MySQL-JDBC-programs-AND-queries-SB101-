package com.practice;

import java.util.*;

class Main {
    
    public static void rockFileCount(int n, String str){
        
        if(str.contains("+")){
             for(int i=0; i<n; i++){
                 System.out.print(str.charAt(i)+" ");
                 char cr = str.charAt(i);
                 
                 
                 
                 
             }
           
        }
        else
           System.out.println("0");
     
        
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter tc:");
        int tc = sc.nextInt();
        
        for(int i=0; i<tc; i++){
            
        	System.out.println("Enter n:");
            int n = sc.nextInt();
            
            System.out.println("enter string:");
            String str = sc.next();
            
            rockFileCount(n, str);
            
        }
        
        
        
    }
    
}
