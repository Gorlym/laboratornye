package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task1");
        solutions();
        System.out.println("Task2");
        findZip();
        System.out.println("Task3");
        checkPerfect();
        System.out.println("Task4");
        flipEndChars();
        System.out.println("Task5");
        isValidHexCode();
        System.out.println("Task6");
        same();
        System.out.println("Task7");
        isKaprekar();
        System.out.println("Task8");
        longestZero();
        System.out.println("Task9");
        nextPrime();
        System.out.println("Task10");
        rightTriangle();

    }
    public static void solutions()
    {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = b*b - 4*a*c;
        if (d == 0)
        {
            //double x = (-1*b - Math.sqrt(d))/2*a;
            System.out.println(1);
        }
        if (d < 0)
        {
            System.out.println(0);
        }
        if (d > 1)
        {
            System.out.println(2);
        }
    }
    public static void findZip()
    {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String z = "z";
        String i = "i";
        String p = "p";
        double chet = 0;
        double jj = 0;
        for (int j = 0; j <= str1.length()-1; j++)
        {
            if ((str1.charAt(j) == z.charAt(0)) && (str1.charAt(j+1) == i.charAt(0)) && (str1.charAt(j+2) == p.charAt(0)))
            {
                chet = chet + 1;
            }
            //System.out.println(chet);
            if (chet == 2)
            {

                jj = j ;
                break;
            }
        }
        if (chet == 2)
        {
            System.out.println(jj);
        }
        else
        {
            System.out.println("-1");
        }
    }
    public static void checkPerfect()
    {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = 0;
        for (int i = 1; i <= a/2; i++)
        {
            if (a%i == 0)
            {
                b = b + i;
            }

        }
        if (b == a)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
    public static void flipEndChars()
    {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        char x1 = 1;
        //String x2 = "";
        if (str1.length()<2)
        {
            System.out.println("Incompatible.");
        }
        else if (str1.charAt(0) == str1.charAt(str1.length()-1))
        {
            System.out.println("Two's a pair.");
        }
        else
        {
            char[] chArray = str1.toCharArray();
            x1 = chArray[0];
            chArray[0] = chArray[str1.length()-1];
            chArray[str1.length()-1] = x1;
            System.out.println(chArray);
        }
    }
    public static void isValidHexCode()
    {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        char[] chArray = str1.toCharArray();
        String s = "0123456789";
        String s1 = "ABCDEFabcdef";
        int b = 0;
        String p = "#";
        for (int i = 1; i <= str1.length()-1; i++)
        {
            String z = String.valueOf(chArray[i]);
            if ((s.contains(z)) || (s1.contains(z)))
            {
                b = b + 1;
            }
            else
            {
                break;
            }
        }
        if ((b == 6) && ((str1.charAt(0) == p.charAt(0))))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
    public static void same()
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int n1 = input.nextInt();
        int[] array = new int[n];
        int[] array1 = new int[n1];
        for (int i = 0; i < n; i++) {
            array[i] = (int) Math.round(Math.random() * 10);
            System.out.println(array[i]);
        }
        for (int i = 0; i < n1; i++) {
            array1[i] = (int) Math.round(Math.random() * 10);
            System.out.println(array1[i]);
        }
        int a = 1;
        int b = 1;
        for (int i = 1; i < array.length; i++)
        {
            int c = 0;
            for (int j = 0; j < i; j++) {
                if (array[i] != array[j])
                {
                    c = c + 1;
                }
                if (c == i)
                {
                    a = a + 1;
                }
            }
        }
        for (int i = 1; i < array1.length; i++)
        {
            int c1 = 0;
            for (int j = 0; j < i; j++) {
                if (array1[i] != array1[j])
                {
                    c1 = c1 + 1;
                }
                if (c1 == i)
                {
                    b = b + 1;
                }
            }
        }
        if (a == b)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
    public static void isKaprekar()
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int n2 = n*n;
        System.out.println(n2);
        double sum = 0;
        if (n2 < 10)
        {
            sum = n2;
            if (sum == n)
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
        }
        else
        {
            int c = 0;
            int n3 = n2;
            while (n3 > 0)
            {
                n3 = n3/10;
                c = c + 1;
            }
            if (c%2 == 0)
            {
                double c1 = c*0.5;
                double sum1 = n2%(c1*10);
                double sum2 = (n2 - sum1)/(c1*10);
                sum = sum1 + sum2;
                System.out.println(sum);
            }
            if (c%2 == 1)
            {
                double c1 = c*0.5+0.5;
                double sum1 = n2%(Math.pow(10,c1));
                System.out.println(sum1);
                double sum2 = (n2 - sum1)/(Math.pow(10,c1));
                System.out.println(sum2);
                sum = sum1 + sum2;
                System.out.println(sum);
            }
            if (sum == n)
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
        }
    }
    public static void longestZero()
    {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String strArr[] = str1.split("");
        int numArr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++)
        {
            numArr[i] = Integer.parseInt(strArr[i]);
        }
        //char[] chArray = str1.toCharArray();
        int k = 0;
        int kmax = 0;
        for (int i = 0; i < numArr.length; i++)
        {
            if (numArr[i] == 0)
            {
                k = k + 1;
            }
            else
            {
                k = 0;
            }
            if (k > kmax)
            {
                kmax = k;
            }
        }
        String a = "";
        for (int i = 0; i < kmax; i++) {
            a += "0";
        }
        System.out.println(a);
    }
    public static void nextPrime()
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = 0;
        for (int i = 1; i < n+1; i++)
        {
            if (n%i == 0)
            {
                k = k + 1;
            }
        }
        if (k==2)
        {
            System.out.println(n);
        }
        else
        {
            int n1 = n;
            int k1 = 0;
            while (k1!=1)
            {
                k1 = 0;
                n1 = n1 + 1;
                for (int i = 2; i < n1+1; i++)
                {
                    if (n1%i == 0)
                    {
                        k1 = k1 + 1;
                    }
                }
            }
            System.out.println(n1);
        }
    }
    public static void rightTriangle()
    {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        int n = 0;
        if (y > x)
        {
            n = x;
            x = y;
            y = n;
        }
        if (z > x)
        {
            n = x;
            x = z;
            z = n;
        }
        if ((x*x) == ((y*y) + (z*z)))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
