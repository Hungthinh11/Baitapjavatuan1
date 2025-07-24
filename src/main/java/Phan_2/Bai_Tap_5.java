/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Phan_2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai_Tap_5 {public static void main (String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("nhap so a:" );
   int a=sc.nextInt();
    System.out.print("nhap so b:");
   int b=sc.nextInt();
    System.out.print("nhap so c:");
   int c=sc.nextInt();
    int max;
    if(a>b & a>c)
    {
        max = a;
    }
    else if(b>a & b>c)
    {
        max=b;
    }
    else
        {
            max=c;
        }
    System.out.print("so lon nhat la:"+ max);
}
}
