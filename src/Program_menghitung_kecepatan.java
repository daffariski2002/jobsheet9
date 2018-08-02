
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kbex1908
 */
public class Program_menghitung_kecepatan {
    public static void hitung(int a, int b)
    {    
    System.out.println("hasil1: " + (a / b) + "Km/jam");
    }
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukkan jarak");
        int bil1 = input.nextInt();
        
        System.out.println("Masukkan waktu tempuh");
        int bil2 = input.nextInt();
        
        hitung (bil1, bil2);
         
    }
        
    }
