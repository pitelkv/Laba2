package com.java;
import java.util.Scanner;

public class laba2 {

    public static void main(String[] args) {
        System.out.println("Введите данные для создания прямоугольника, где m - высота а n - ширина ");
        Scanner in = new
                Scanner(System. in);
      System.out.print("Введите m: ");
      int m = in.nextInt();
      System.out.print("Введите n: ");
      int n = in.nextInt();
        System.out.println("Прямоугольник с шириной - "+n +" и высотой "+ m);
        for ( int y=0; y<m; y++){
            int x;
            for(x=0; x<n; x++)System.out.print (8);
            System.out.println ("");
        }
    }
}
