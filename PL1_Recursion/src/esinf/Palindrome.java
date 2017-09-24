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
public class Palindrome {
       
    public static int isPalindrome(int n)
    {
        if (n<10) return n;
        return (n%10) * (int)Math.pow(10, (int) Math.log10(n)) + isPalindrome(n/10);
    }

    
}
