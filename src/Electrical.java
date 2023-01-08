/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Legion
 */
public class Electrical {
    
    public static void main(String[] args) {
        int fail =0, success=0;
        int runTime = 3000;
        for (int i = 1; i <= runTime; i++){
            int j = utility.getRandomNumber(1, 10);
            int q = utility.getRandomNumber(1, 10);
            int k = utility.getRandomNumber(1, 10);
            if (j != 10 || q != 10 || k != 10) success++;
            else fail++;
        }
        
        System.out.printf("success chance: %.3f%s", ((float) success / runTime) * 100, "%\n");
        System.out.printf("failed chance: %.3f%s", ((float) fail / runTime) * 100, "%\n");
    }
    
}
