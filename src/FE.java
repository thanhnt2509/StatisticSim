/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Legion
 */
public class FE {

    public static void main(String[] args) {
        final int runTime = utility.readInt("RunTime");
        final double passScore = (double) utility.readInt("PassScore");
        final double questionPoint = 0.2;
        final int question = 50;
        
        int passedCount = 0;
        int notPassedCount = 0;
        int correctAns;
        
        boolean include_2_5_question = utility.readBool("You want to include question than have more than 4 choices?");
        if (include_2_5_question){
            int numberOf5 = utility.readInt("Input number of question that have 5 ans");
            int numberOf2 = utility.readInt("Input number of question that have 2 ans");
            for (int i = 1; i <= runTime; i++) {
                
                correctAns = 0;
                //loop for 5 ans questions
                for (int j = 1; j <= numberOf5; j++) {
                    int answer = utility.getRandomNumber(1, 5);
                    int chosenAns = utility.getRandomNumber(1, 5);
                    if (chosenAns == answer) correctAns++;
                }
                //loop for 2 ans question
                for (int q = numberOf5 + 1; q <= numberOf5 + numberOf2; q++) {
                    int answer = utility.getRandomNumber(1, 2);
                    int chosenAns = utility.getRandomNumber(1, 2);
                    if (chosenAns == answer) correctAns++;
                }
                for (int k = numberOf5 + numberOf2 + 1; k <= question; k++) {
                    int answer = utility.getRandomNumber(1, 4);
                    int chosenAns = utility.getRandomNumber(1, 4);
                    if (chosenAns == answer) correctAns++;
                }
                if (correctAns * questionPoint >= passScore) passedCount++;
                else notPassedCount++;
            }
        }else{
            for (int i = 1; i <= runTime; i++) {
                correctAns = 0;
                for (int j = 1; j <= question; j++) {
                    int answer = utility.getRandomNumber(1, 4);
                    int chosenAns = utility.getRandomNumber(1, 4);
                    if (chosenAns == answer) correctAns++;
                }
                if (correctAns * questionPoint >= passScore) passedCount++;
                else notPassedCount++;
            }
        }
        
        
        
        System.out.print("passed count: " + passedCount + "; ");
        System.out.printf("passed chance: %.13f%s", ((float) passedCount / runTime) * 100, "%\n");
        System.out.print("not passed count: " + notPassedCount + "; ");
        System.out.printf("not passed chance: %.13f%s", ((float) notPassedCount / runTime) * 100, "%\n\n");

    }

}
