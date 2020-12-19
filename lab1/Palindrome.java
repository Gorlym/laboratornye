package com.company;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        ///String s = "non"; // пусть строка s будет каким-либо словом или фразой, а str будет результатом
        String ss = s.replaceAll("\\s+", "");
        System.out.println(isPalindrom(s,ss));
    }
    public static String reverStr(String s){
        s = s.replaceAll("\\s+", ""); // удаляет все пробелы и невидимые символы из изначальной строки (например, tab, \n)
        String str = "";
        for (int i = s.length(); i > 0; i--) { // начинаем цикл, где отчет будет идти по индексам с конца фразы(слова) к началу
            str += s.charAt(i - 1); // прибавляем к итоговой строке(она пустая) буквы в обратном порядке из изначальной строки
        }
        return str;
    }
    public static boolean isPalindrom(String s, String ss){
        s = reverStr(s);
        if (s.equalsIgnoreCase(ss) == true) {
            return true;
        }
        else return false;

    }
}

