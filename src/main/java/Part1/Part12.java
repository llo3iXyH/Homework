package Part1;

import java.util.Scanner;


public class Part12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int age = scan.nextInt();
        if (age == 1){
            System.out.println("Січень, в ньому 31 день");
        }else if (age == 2){
            System.out.println("Лютий, в ньому 28 день");
        }else if (age == 3){
            System.out.println("Березень, в ньому 31 день");
        }else if (age == 4){
            System.out.println("Квітень, в ньому 30 день");
        }else if (age == 5){
            System.out.println("Травень, в ньому 31 день");
        }else if (age == 6){
            System.out.println("Червень, в ньому 30 день");
        }else if (age == 7){
            System.out.println("Липень, в ньому 31 день");
        }else if (age == 8){
            System.out.println("Серпень, в ньому 31 день");
        }else if (age == 9){
            System.out.println("Вересень, в ньому 30 день");
        }else if (age == 10){
            System.out.println("Жовтень, в ньому 31 день");
        }else if (age == 11){
            System.out.println("Листопад, в ньому 30 день");
        }else if(age ==12){
            System.out.println("Грудень, в ньому 31 день");
        }else {
            System.out.println("Невірно задане число");
        }
    }
}