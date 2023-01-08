
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Legion
 */
public class utility {
    
    static Scanner sc = new Scanner(System.in);
    
    public static int readInt(String message) {
        int t = 0;
        boolean flag;
        do {
            try {
                System.out.print(message + ": ");
                t = Integer.parseInt(sc.nextLine());
                flag = false;
            } catch (Exception e) {
                System.out.println("Please input number!");
                flag = true;
            }
        } while (flag);
        return t;
    }
    
    public static boolean readBool(String message) {
        String S;
        boolean valid;
        do {
            System.out.print(message + " (y/n): ");
            S = sc.nextLine().trim().toUpperCase();
            valid = S.matches("[01YNTF]");
            if (!valid) {
                System.out.println("Invalid input!");
            }
        } while (!valid);
        char c = S.charAt(0);
        return (c == 'T' || c == 'Y' || c == '1');
    }

    public static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max) + min;
    }
}
