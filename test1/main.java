package test1;

import java.util.Scanner;

// 1. Приветствовать любого пользователя при вводе его имени через командную строку.

public class main {

    public static void main(String[] args) {
        System.out.println("введите вашу фамилию");
        Scanner input = new Scanner(System.in);
        String buffer = input.nextLine();
        System.out.println("Привет, " + buffer);
    }

}
