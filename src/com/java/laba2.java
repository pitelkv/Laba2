package com.java;
import java.util.Scanner;

public class laba2 {

    public static void main(String[] args) {
        System.out.println("Лабораторная работа 1. Подготовил Питель Кирилл, студент группы 1161");
        System.out.println("Задание 1.");
        System.out.println("Четные числа. Используя цикл for вывести на экран чётные числа от 1 до 100 ");
        System.out.println("включительно. Через пробел либо с новой строки.");
        {
            for (int x = 1; x <= 100; x++)
                if ((x % 2) == 0) {
                    System.out.print(x + " ");
                }
        }
        System.out.println("Задание 2.");
        System.out.println("Рисуем прямоугольник Ввести с клавиатуры два числа m и n.");
        System.out.println("Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.");
        System.out.println("Введите данные для создания прямоугольника, где m - высота а n - ширина ");
        Scanner in = new
                Scanner(System.in);
        System.out.print("Введите m: ");
        int m = in.nextInt();
        System.out.print("Введите n: ");
        int n = in.nextInt();
        System.out.println("Прямоугольник с шириной - " + n + " и высотой " + m);
        for (int y = 0; y < m; y++) {
            int x;
            for (x = 0; x < n; x++) System.out.print(8);
            System.out.println("");
        }
        System.out.println("Задание 3.");
        System.out.println("Риспользуя цикл for вывести на экран прямоугольный");
        System.out.println("треугольник из восьмёрок со сторонами 10 и 10.");
         {
            String s = "8";
            for (int count = 0; count < 10; count++) {
                System.out.println(s);
                s = s + 8;
            }
        }
        System.out.println("Задание 4.");
        System.out.println("Минимум двух чисел. Ввести с клавиатуры два числа,");
        System.out.println("и вывести на экран минимальное из них (Поиск минимума выполняется в функции).");
        System.out.print("Введите первое число:");
        int w = in.nextInt();
        System.out.print("Введите второе число:");
        int e = in.nextInt();
        int r = 0;
        if (w > e) {
            r = w;
        } else {
            r = e;
        }
        System.out.println("Между числами " + w + " и " + e + " больше " + r);

        System.out.println("Задание повышенной сложности №1");
        System.out.println("Сравнить имена Ввести с клавиатуры два имени, и если имена одинаковые, вывести ");
        System.out.println("сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести ");
        System.out.println("сообщение – «Длины имен равны».");
        Scanner name = new Scanner(System.in);
        String a, b;
        System.out.println("Введите два имени: ");
        a = name.nextLine();
        b = name.nextLine();
        if (a.equals(b)){
            System.out.println("Имена идентически");
        } else if(a.length() == b.length()) {
            System.out.println("Колиечество символов в строке");
        } else {System.out.println("Конец");}

        System.out.println("Задание повышенной сложности №2");
        System.out.println("Минимум четырех чисел Написать функцию, которая вычисляет минимум из ");
        System.out.println("четырёх чисел. Функция min(a,b,c,d) должна использовать (вызывать) функцию ");
        System.out.println("min(a,b).");
        Scanner wop = new Scanner(System.in);
        int p, o, i, u;
        p = wop.nextInt();
        o = wop.nextInt();
        i = wop.nextInt();
        u = wop.nextInt();
        int tancuem = Math.min( p, o);
        int pod = Math.min(i, u);
        int minimal = Math.min(tancuem, pod);
        System.out.println("Наииимеееньшее из вами введеных чисел это iq Асхаба = " + minimal);

        System.out.println("Задание повышенной сложности №3");
        System.out.println("Координатные четверти Ввести с клавиатуры два целых числа, которые будут ");
        System.out.println("координатами точки, не лежащей на координатных осях OX и OY. Вывести на экран ");
        System.out.println("номер координатной четверти, в которой находится данная точка.");
        System.out.println("Задача №3");
        Scanner coor = new Scanner(System.in);
        int x, y;
        System.out.println("Введите оси координат x и y и мы с помощью черной)00)0) магии покажем где лежит эта точка: ");
        x = coor.nextInt();
        y = coor.nextInt();
        if (x==0 || y==0){System.out.println("По условию, точка НЕ ЛЕЖИТ НА ОСИ АЛЕ");}
        if(x>0 && y >0) { System.out.println("I"); }
        else if (x<0 && y>0) { System.out.println ("II"); }
        else if (x<0 && y<0) { System.out.println ("III"); }
        else if (x>0 && y<0) { System.out.println ("IV"); }

    }

}