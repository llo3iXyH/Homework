package Part2;

import java.util.Scanner;

public class Part21 {
    public static void main(String[] args) {
        System.out.println("Введіть речення три рази будь ласка");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String line2 = scan.nextLine();
        String line3 = scan.nextLine();
        String[] ua = {"а", "е", "и", "і", "о", "у", "я", "ю", "є", "ї"};
        for (int i = 0; i < ua.length; i++) {
            line = line.replace(ua[i], "");
        }
        System.out.println();
        System.out.println(line);

        String[] ua2 = {"б", "в", "г", "д", "ж", "з", "к", "л", "м", "н", "п", "р", "с", "т", "ґ", "ф", "х", "ц", "ч", "ш", "щ"};
        for (int i = 0; i < ua2.length; i++) {
            line2 = line2.replace(ua2[i], "");
        }
        System.out.println();
        System.out.println(line2);

        String[] ua3 = {" "};
        for (int i = 0; i < ua3.length; i++) {
            line3 = line3.replace(ua3[i], "");
        }
        System.out.println();
        System.out.println(line3);
    }
}
