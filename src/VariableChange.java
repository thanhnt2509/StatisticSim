/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Legion
 */
public class VariableChange {
    
    public static void main(String[] args) {
        final int runTime = utility.readInt("RunTime");
        final int upperBound = 3;
        final int lowerBound = 1;
        boolean cont;
        
        do{
            int winCount = 0;
            int loseCount = 0;

            boolean wantSwitch = utility.readBool("Switch?");

            for (int i = 1; i <= runTime; i++) {
                int winNum = utility.getRandomNumber(lowerBound, upperBound);
                int chosenNum = utility.getRandomNumber(lowerBound, upperBound);
                if (wantSwitch){
                    //chosing a random number to remove
                    //this remove number can't be the winning number or a pre-chosen one
                    int removeNum = utility.getRandomNumber(lowerBound, upperBound);
                    while (removeNum == winNum || removeNum == chosenNum) 
                        removeNum = utility.getRandomNumber(lowerBound, upperBound);
                    
                    //chosing a new random number
                    //this new number can't be the old one or the one has removed
                    int newChosenNum = utility.getRandomNumber(lowerBound, upperBound);
                    while (newChosenNum == removeNum || newChosenNum == chosenNum) 
                        newChosenNum = utility.getRandomNumber(lowerBound, upperBound);

                    if (newChosenNum == winNum) winCount++;
                    else loseCount++;
                }else{
                    if (chosenNum == winNum) winCount++;
                    else loseCount++;
                }
            }

            System.out.print("win count: " + winCount + "; ");
            System.out.printf("win chance: %.3f%s", ((float) winCount / runTime) * 100, "%\n");
            System.out.print("lose count: " + loseCount + "; ");
            System.out.printf("lose chance: %.3f%s", ((float) loseCount / runTime) * 100, "%\n\n");
            
            cont = utility.readBool("Continue?");
        }while(cont);
    }

}
