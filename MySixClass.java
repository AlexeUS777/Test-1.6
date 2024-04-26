import java.util.Arrays;
import java.util.Scanner;

public class MySixClass {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        //1.Пользователь вводит дробное число. Если оно больше пи, вывести “pimore”.
        System.out.print("Please enter a fractional number:");
        double fractional = scanner.nextDouble();

        if(fractional > Math.PI){
            System.out.println("pimore");
        } //блок else добавлять не стал, так как в условии задачи написано вывести только при числе большем пи


        //2.Пользователь вводит строку. Используя метод .contains(‘ ‘) пробел, определите,
        // ввел пользователь одно слово, или больше.
        System.out.print("Please enter a string:");
        String str = scanner.nextLine();
        if(str.contains(" ")){
            System.out.println("Введено больше одного слова.");
        } else{
            System.out.println("Введено одно слово.");
        }


        //3.Пользователь вводит четыре числа. Найти наибольшее из них.
        System.out.print("Please enter four numbers:");
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        int a4 = scanner.nextInt();

        if((a1 > a2) && (a1 > a3) && (a1 > a4)){
            System.out.println(a1);
        } else if((a2 > a1) && (a2 > a3) && (a2 > a4)){
            System.out.println(a2);
        } else if((a3 > a1) && (a3 > a2) && (a3 > a4)){
            System.out.println(a3);
        } else if((a4 > a1) && (a4 > a2) && (a4 > a3)){
            System.out.println(a4);
        }

        //Также решил через массив:

        int[]numbers = {a1, a2, a3, a4};
        int maxA = Arrays.stream(numbers).max().getAsInt();
        System.out.println(maxA);


    }
}
