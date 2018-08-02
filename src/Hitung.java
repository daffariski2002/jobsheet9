
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
public class Hitung {
    public static void hitung(int a, int b) 
    {
        System.out.println("Hasil: "+ (a + b));
    }
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan bilangan 1 : ");
        int bill = input.nextInt();
        
        System.out.println("Masukkan bilangan 11 : ");
        int bil2 = input.nextInt();
        
        hitung(bill, bil2);
    }
    
}
