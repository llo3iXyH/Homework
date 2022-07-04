package Part1;
import java.util.Scanner;


public class Part11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int age = scan.nextInt();
        if (age == 1){
            System.out.println("Monday");
        }else if (age == 2){
            System.out.println("Tuesday");
        }else if (age == 3){
            System.out.println("Wednesday");
        }else if (age ==4){
            System.out.println("Thursday");
        }else if (age == 5){
            System.out.println("Friday");
        }else if (age <= 7){
            System.out.println("Weekend");
        }else {
            System.out.println("Incorrectly entered number");
        }
    }
}
