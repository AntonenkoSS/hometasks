package test5;

import java.util.Scanner;

//Ввести число от 1 до 12. Вывести на консоль
// название месяца, соответствующего данному числу.
// Осуществить проверку корректности ввода чисел
public class test5 {
    public static void main(String[] args) {
        System.out.println("введіть число від 1 до 12");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        switch (num){
            case 1 :
                System.out.println("січень");
                break;
            case 2 :
                System.out.println("лютий");
                break;
            case 3 :
                System.out.println("березень");
                break;
            case 4 :
                System.out.println("квітень");
                break;
            case 5 :
                System.out.println("травень");
                break;
            case 6 :
                System.out.println("червень");
                break;
            case 7 :
                System.out.println("липень");
                break;
            case 8 :
                System.out.println("серпень");
                break;
            case 9 :
                System.out.println("вересень");
                break;
            case 10 :
                System.out.println("жовтень");
                break;
            case 11 :
                System.out.println("листопад");
                break;
            case 12 :
                System.out.println("грудень");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + num);
        }

    }
}
