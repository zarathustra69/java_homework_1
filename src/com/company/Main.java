package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1
        boolean var_boolean = true;
        byte var_byte = 3;
        short var_short = 130;
        int var_int = 35;
        long var_long = 64;
        float var_float = 8.5f;
        double var_Double = 1.9;
        char var_char = 'c';
        String var_string = "Hello";

        Scanner scanner = new Scanner(System.in);

        //2
        System.out.println("Введите 4 параметра (a,b,c,d):");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double res = calculate(a,b,c,d);
        System.out.println("a*(b+(c/d)="+res);

        //3
        System.out.println("Введите 2 параметра (x,y):");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        System.out.println("10<=x+y<=20? " + checkSum(x,y));

        //4
        System.out.println("Введите целое число:");
        int p = scanner.nextInt();
        printSign(p);

        //5
        System.out.println("Введите целое число:");
        int r = scanner.nextInt();
        System.out.println("Оно отрицательно? " + checkNegative(r));

        //6
        System.out.println("Введите имя:");
        String name = scanner.next();
        printHello(name);

        //7
        System.out.println("Введите год:");
        int year = scanner.nextInt();
        printLeapYear(year);
    }

    public static double calculate(double a, double b, double c, double d){
        return a*(b+(c/d));
    }

    public static boolean checkSum(double a, double b){
        return (a+b>=10 && a+b<=20);
    }

    public static void printSign(int a){
        if(a>=0)
            System.out.println("Число положительное");
        else
            System.out.println("Число отрицательное");
    }

    public static boolean checkNegative(int a){
        return (a<0);
    }

    public static void printHello(String name){
        System.out.println("Привет, " + name + "!");
    }

    public static void printLeapYear(int year){
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println("Год високосный");
        else
            System.out.println("Год невисокосный");
    }
}
