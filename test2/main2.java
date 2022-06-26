package test2;

// Отобразить в окне консоли аргументы командной строки в обратном порядке.

import java.util.Scanner;

public class main2 {

    public static void main(String[] args) {
        System.out.println("введите текст");
        Scanner input = new Scanner(System.in);
        String buffer = input.nextLine();
        System.out.println("Строка наоборот =  " + reverseStr(buffer));
    }

    public static String reverseStr (String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }
        return result;
    }

}