package test4;

import java.util.Scanner;
//Ввести целые числа как аргументы командной строки,
// подсчитать их сумму (произведение) и вывести результат на консоль.
public class test4 {
    public static void main(String[] args) {
        System.out.println("введите три целых числа");
        Scanner input = new Scanner(System.in);

        int numA = input.nextInt();
        int numB = input.nextInt();
        int numC = input.nextInt();

        int sum = numA + numB + numC;
        int pr = numA * numB * numC;

        System.out.println(numA + "+" + numB + "+" + numC + "=" + sum);
        System.out.println(numA + "*" + numB + "*" + numC + "=" + pr);
    }
}
