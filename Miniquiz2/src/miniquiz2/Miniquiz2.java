/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniquiz2;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Miniquiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    int n,j,i;
    
    Scanner input= new Scanner (System.in);
    
    System.out.print ("Masukkan Skala : ");
    
    if (!input.hasNextInt())
        {
            System.out.print ("Harus angka! Tidak bisa di proses");
        } 
        else
        {
        n=input.nextInt();
        
        i=1;
        while (i<=2*n-1) 
          {
            j=1;
            while (j<=n) {
                if (i==1 || i==n || (j==n && i<n) || (j==1 && i>=n) || (i==2*n-1))
                { 
                    System.out.print ("*");
                }
                
                else {
                    System.out.print (" ");
                }
                j++;
        }
             i++;
        System.out.println();
        }
    }
    
    }
    }

    
    

