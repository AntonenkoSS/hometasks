package test3;

// Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

import java.util.Scanner;

public class test3 {

        public static void main(String[] args) {
            System.out.println("введите количесто чисел");
            Scanner input = new Scanner(System.in);
            String buffer = input.nextLine();

            try {
                int buf = Integer.parseInt(buffer.trim()); // именно здесь String преобразуется в int
                System.out.println("введенное число = " + buf);

                double [] arr = new double[buf];

                for (int i = 0; i < buf; i++) {
                    arr[i] = Math.random()*300;
                    System.out.println(arr[i]);
                }

                for (int j = 0; j < buf; j++) {
                    System.out.print(arr[j]);
                    System.out.print(", ");
                }

            } catch (NumberFormatException nfe) {
                System.out.println("NumberFormatException: " + nfe.getMessage());
            }
        }
}
