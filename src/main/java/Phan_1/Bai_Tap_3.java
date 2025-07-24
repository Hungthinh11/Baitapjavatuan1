/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Phan_1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai_Tap_3 {public static void main (String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("cho biet so thu 1 la:" );
    double a=sc.nextDouble();
    System.out.print("cho biet so thu 2:");
    double b=sc.nextDouble();
    
    if (a==0)
    {
        if (b==0)
        {
            System.out.println("Phuowng trinh vo so nghiem.");
        }
        else{
            System.out.println("phuong trinh vo nghiem");      
            }
    }
        else{
     double x = -b/a ;
                System.out.println("nghiem cua phuong trinh nay la:"+x);}

}
}


