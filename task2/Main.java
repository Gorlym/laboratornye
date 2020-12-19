package com.company;
import java.util.*;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Task1");
        repeat();
        System.out.println();
        System.out.println("Task2");
        differenceMaxMin();
        System.out.println();
        System.out.println("Task3");
        System.out.println(isAvgWhole());
        System.out.println();
        System.out.println("Task4");
        cumulativeSum();
        System.out.println();
        System.out.println("Task5");
        getDecimalPlaces();
        System.out.println();
        System.out.println("Task6");
        Fibonacci();
        System.out.println();
        System.out.println("Task7");
        System.out.println(isValid());
        System.out.println();
        System.out.println("Task8");
        System.out.println(isStrangePair());
        System.out.println();
        System.out.println("Task9");
        System.out.println(isPrefix());
        System.out.println(isSuffix());
        System.out.println();
        System.out.println("Task10");
        System.out.println(boxSeq());
    }
    public static void repeat()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int size = input.nextInt();
        System.out.print("Введите кол-во повторений: ");
        int p = input.nextInt();

        String array[] = new String[size];
        System.out.print("Введите элементы массива: ");
        for (int i = 0; i < size; i++)
        {
            array[i] = input.next();
        }

        for (int i = 0; i < array.length; i++)
        {
            array[i] =  array[i].repeat(p);
        }
        System.out.print("Полученный массив: ");
        for (int i = 0; i < size; i++)
        {
            System.out.print (array[i]);
        }
    }
    public static void differenceMaxMin()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int size = input.nextInt();

        int array[] = new int[size];

        System.out.print("Сгенерированный массив: ");
        for (int i = 0; i < size; i++)
        {
            array[i] = ((int) (Math.random()*100));
            System.out.print(array[i] + " ");
        }
        Arrays.sort(array);
        System.out.print("Отсортированный массив: ");
        for (int i = 0; i < size; i++)
        {
            System.out.print(array[i] + " ");
        }
        int  firstNum = array[0];
        int  lastNum = array[array.length-1];

        lastNum = lastNum - firstNum;
        System.out.print("Разница между элеменатами равна: ");
        System.out.println(lastNum);
    }

    public static boolean isAvgWhole()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int size = input.nextInt();
        int array[] = new int[size];

        System.out.print("Сгенерированный массив: ");
        for (int i = 0; i < size; i++)
        {
            array[i] = ((int) (Math.random()*100));
            System.out.print(array[i] + " ");
        }
        double a = 0;
        for(int i = 0; i < size; i++)
        {
            a = a + array[i];
        }
        System.out.print("Cумма элементов в массиве равна: ");
        System.out.println(a);
        System.out.print("Среднее арифметическое: ");
        System.out.println(a/size);
        if (a % size == 0)
            return true;
        else return false;
    }
    public static void cumulativeSum()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int size = input.nextInt();
        int array[] = new int[size];

        System.out.print("Сгенерированный массив: ");
        for (int i = 0; i < size; i++)
        {
            array[i] = ((int) (Math.random()*100));
            System.out.print(array[i] + " ");
        }
        int a = 0;
        int array1[] = new int[size];
        System.out.println();
        for (int i = 0; i < size; i++)
        {
            a = a + array[i];
            array1[i] = a;
            System.out.print(array1[i] + " ");
        }
    }
    public static void getDecimalPlaces()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        double size = input.nextDouble();
        int i = 0;
        while(size % 1 > 0){
            i = i + 1;
            size = size * 10;
        }
        System.out.println(i);
    }
    public static void Fibonacci()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        double size = input.nextDouble();
        int a = 1;
        int b = 1;
        int c = 1;
        for (int i = 0; i < size - 1; i++)
        {
            b = c;
            c = b + a;
            a = b;
        }
        System.out.println(c);
    }
    public static boolean isValid()
    {
        Scanner input = new Scanner(System.in);

        String stroka = input.next();
        String sub = " ";
        for(int i=0; i<stroka.length(); i++)
        {
            if(((stroka.charAt(i)<'0' || stroka.charAt(i)>'9')) || ((stroka.length() < 5) ||  (stroka.length() > 5)) ||  (stroka.indexOf(sub) != -1))
            {
                return false;
            }
        }
        return true;
    }
    public static boolean isStrangePair()
    {
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        String str2 = input.next();
        if (str1.charAt(0) == str2.charAt(str2.length() - 1) && str1.charAt(str1.length() - 1) == str2.charAt(0))
        {
            return true;
        }
        else return false;
    }
    public static boolean isPrefix()
    {
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        String str2 = input.next();
        return str1.startsWith(str2.substring(0, str2.length() - 2));
    }

    public static boolean isSuffix()
    {
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        String str2 = input.next();
        return str1.endsWith(str2.substring(1));
    }
    public static int boxSeq()
    {
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
        int result = 0;

        if (n == 0)
        {
            return result;
        }

        for (int i = 1; i <= n; i++)
        {
            if (i % 2 == 0) {
                result -= 1;
            } else {
                result += 3;
            }
        }
        return result;
    }
}

