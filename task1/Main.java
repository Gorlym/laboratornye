package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();
        double num3 = in.nextDouble();
        System.out.println(remainder(num1, num2));
        System.out.println(triArea(num1, num2));
        System.out.println(animals(num1,num2,num3));
        System.out.println(profitableGamble(num1,num2,num3));
        operation(num1,num2,num3);
        String s = in.next();
        ctoa(s);
        addUpTo(num1);
        nextEdge(num1, num2);
        sumOfCubes();
        abcmath(num1, num2, num3);
    }
    public static double remainder(double a,double b)
    {
        a = a % b;
        return a;
    }
    public static double triArea(double a, double b)
    {
        a = (a / 2) * b;
        return a;
    }

    public static double animals(double a, double b, double c)
    {
        a = (a * 2) + (b * 4) + (c * 4);
        return a;
    }
    public static boolean profitableGamble(double a, double b, double c)
    {
        if (a * b > c)
            return true;
        else return false;


    }
    public static void operation(double a, double b, double c)
    {
        if (b + c == a)
            System.out.println("added");
        else if ((b - c == a) | (c - b == a))
            System.out.println("subtracted");
        else if ((b * c == a))
            System.out.println("multiplication");
        else if ((b / c == a) | (c / b == a))
            System.out.println("division");
        else
            System.out.println("None");
    }
    public static void ctoa(String  a)
    {
        char c = a.charAt(0);
        int ascii = (int) c;
        System.out.println(ascii);
    }
    public static void addUpTo(double a)
    {
        double c = 0;
        for(int i = 0; i < a+1; i++) {
            c = c + i;
        }
        System.out.println(c);
    }
    public static void nextEdge(double a, double b)
    {
        double c = a + b - 1;
        System.out.println(c);
    }
    public static void sumOfCubes()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Размер массива: ");
        int num4 = in.nextInt();
        double c = 0;
        int array[] = new int[num4];
        for (int i = 0; i < num4; i++) {
            array[i] = in.nextInt();
            c = c + array[i]*array[i]*array[i];
        }
        System.out.println(c);
    }
    public static void abcmath(double a, double b, double c)
    {
        double aa = a;
        for(int i = 0; i < b; i++) {
            aa = aa + a;
        }
        if (aa % c == 0)
            System.out.println("true");
        else System.out.println("false");
    }


}
