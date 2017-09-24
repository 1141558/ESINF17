/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esinf;

/**
 *
 * @author André Silva
 */
public class string {
    
    public static String original(String string){
        if(string.isEmpty()) 
            return string;
        
        return string.charAt(0) + original(string.substring(1, string.length()));
    }
    
    public static String reverse(String string){
        if(string.isEmpty()) 
            return string;
        return string.charAt(string.length()-1) + reverse(string.substring(0,string.length()-1));
    }
    
}
