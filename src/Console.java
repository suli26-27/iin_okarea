/*
Készítette: Erős István, 2026-11-18
*/

import java.util.Scanner;

public class Console {
    static Scanner scanner = new Scanner(System.in);
    public static String input(String message) {
        String value = "";
        System.out.print(message);
        value = scanner.nextLine();        
        return value;
    }
}
