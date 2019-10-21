import java.util.Scanner;
import java.security.SecureRandom;
public class ComputerAssistedInstruction {
    public static void main(String[] args) {
        String restart = "Y";
        while(restart.toUpperCase().equals("Y")) {
            System.out.println("Hello! Welcome to your Computer Assisted Instruction");
            questionGenerator();
            Scanner startOver = new Scanner(System.in);
            System.out.println("Restart instruction? (Y/N)");
            restart = startOver.next();
        }//ends while(restart...)

    }//ends main


    private static void correctResponse() {
        int rand;
        SecureRandom random = new SecureRandom();
        rand = random.nextInt(4);
        switch (rand) {
            case 0:
                System.out.println("You're on a roll!");
                break;
            case 1:
                System.out.println("Good job!");
                break;
            case 2:
                System.out.println("Excellent!");
                break;
            case 3:
                System.out.println("Hey, you're pretty good!");
                break;
            case 4:
                System.out.println("Keep it up!");
                break;
        }//ends switch(rand)
    }//ends correctResponse()


    private static void incorrectResponse() {
        int rand;
        SecureRandom random = new SecureRandom();
        rand = random.nextInt(4);
        switch (rand) {
            case 0:
                System.out.println("Don't give up!");
                break;
            case 1:
                System.out.println("Not quite!");
                break;
            case 2:
                System.out.println("Try again!");
                break;
            case 3:
                System.out.println("Incorrect!");
                break;
            case 4:
                System.out.println("keep trying!");
                break;
        }//ends second switch(rand)
    }//ends incorrectResponse()


    private static double grade(double i) {
        double grade = 0;
        grade = (i / 10) * 100;
        System.out.println("Grade: " + grade + "%");
        if (grade < 75) {
            System.out.println("Please ask your teacher for extra help.\n\n");
        }// ends if
        else {
            System.out.println("You are ready for the next level!\n\n");
        }//ends else
        return grade;
    }//ends double grade


    private static int problemType() {
       int arith;
        Scanner type = new Scanner(System.in);
        System.out.println("Please select arithmetic type:\n" +
                "1 - Addition\n" +
                "2 - Multiplication\n" +
                "3 - Subtraction\n" +
                "4 - Division\n" +
                "5 - Mix\n" +
                "Type:");
        arith = type.nextInt();
        return arith;

    }// ends problemType


    private static int selectDifficulty() {
        int level;
        Scanner difficulty = new Scanner(System.in);
        while (true) {
            System.out.println("Please select from the following difficulty levels: 1, 2, 3, 4");
            level = difficulty.nextInt();
            while (level < 1 || level > 4) {
                System.out.println("Incorrect difficulty, try again.");
                System.out.println("Please select from the following difficulty levels: 1, 2, 3, 4");
                level = difficulty.nextInt();
            }//ends while(level...)
            return level;
        }//ends while(true)
    }//ends selectDifficulty

    //CAUTION! THE FOLLOWING CODE IS THE WORSE CODE EVER ASSEMBLED. I AM SO SORRY.
    public static void questionGenerator() {
        int i;
        int rand1 = 0;
        int rand2 = 0;
        int level;
        int answer;
        int totalCorrect = 0;
        int type;
        Scanner scnr = new Scanner(System.in);
        SecureRandom randNum = new SecureRandom();
        int[] responses = new int[10];
        for (i = 0; i < responses.length; i++) {
            type = problemType();
            switch(type) {
                case 1:
                    level = selectDifficulty();
                    for (i = 0; i < responses.length; i++) {
                        switch (level) {
                            case 1:
                                rand1 = randNum.nextInt(9);
                                rand2 = randNum.nextInt(9);
                                break;
                            case 2:
                                rand1 = randNum.nextInt(99);
                                rand2 = randNum.nextInt(99);
                                break;
                            case 3:
                                rand1 = randNum.nextInt(999);
                                rand2 = randNum.nextInt(999);
                                break;
                            case 4:
                                rand1 = randNum.nextInt(9999);
                                rand2 = randNum.nextInt(9999);
                                break;
                        }// ends switch(level)
                        System.out.println("\nCan you solve the problem?\n" + rand1 + " + " + rand2);
                        System.out.println("What is the answer?: ");
                        answer = scnr.nextInt();
                        responses[i] = answer;

                        if (answer == rand1 + rand2) {
                            correctResponse();
                            totalCorrect++;
                        } //ends if

                        else {
                            incorrectResponse();
                        }//ends else

                        if (i == 9) {
                            break;
                        }//ends if
                    }//ends case 1 for loop
                    break;
                case 2:
                    level = selectDifficulty();
                    for (i = 0; i < responses.length; i++) {
                        switch (level) {
                            case 1:
                                rand1 = randNum.nextInt(9);
                                rand2 = randNum.nextInt(9);
                                break;
                            case 2:
                                rand1 = randNum.nextInt(99);
                                rand2 = randNum.nextInt(99);
                                break;
                            case 3:
                                rand1 = randNum.nextInt(999);
                                rand2 = randNum.nextInt(999);
                                break;
                            case 4:
                                rand1 = randNum.nextInt(9999);
                                rand2 = randNum.nextInt(9999);
                                break;
                        }// ends switch(level)
                        System.out.println("\nCan you solve the problem?\n" + rand1 + " * " + rand2);
                        System.out.println("What is the answer?: ");
                        answer = scnr.nextInt();
                        responses[i] = answer;

                        if (answer == rand1 * rand2) {
                            correctResponse();
                            totalCorrect++;
                        } //ends if

                        else {
                            incorrectResponse();
                        }//ends else

                        if (i == 9) {
                            break;
                        }//ends if
                    }//ends case 2 for loop
                    break;
                case 3:
                    level = selectDifficulty();
                    for (i = 0; i < responses.length; i++) {
                        switch (level) {
                            case 1:
                                rand1 = randNum.nextInt(9);
                                rand2 = randNum.nextInt(9);
                                break;
                            case 2:
                                rand1 = randNum.nextInt(99);
                                rand2 = randNum.nextInt(99);
                                break;
                            case 3:
                                rand1 = randNum.nextInt(999);
                                rand2 = randNum.nextInt(999);
                                break;
                            case 4:
                                rand1 = randNum.nextInt(9999);
                                rand2 = randNum.nextInt(9999);
                                break;
                        }// ends switch(level)
                        System.out.println("\nCan you solve the problem?\n" + rand1 + " - " + rand2);
                        System.out.println("What is the answer?: ");
                        answer = scnr.nextInt();
                        responses[i] = answer;

                        if (answer == rand1 - rand2) {
                            correctResponse();
                            totalCorrect++;
                        } //ends if

                        else {
                            incorrectResponse();
                        }//ends else

                        if (i == 9) {
                            break;
                        }//ends if
                    }//ends case 3 for loop
                    break;
                case 4:
                    level = selectDifficulty();
                    for (i = 0; i < responses.length; i++) {
                        switch (level) {
                            case 1:
                                rand1 = randNum.nextInt(9);
                                rand2 = randNum.nextInt(9);
                                break;
                            case 2:
                                rand1 = randNum.nextInt(99);
                                rand2 = randNum.nextInt(99);
                                break;
                            case 3:
                                rand1 = randNum.nextInt(999);
                                rand2 = randNum.nextInt(999);
                                break;
                            case 4:
                                rand1 = randNum.nextInt(9999);
                                rand2 = randNum.nextInt(9999);
                                break;
                        }// ends switch(level)
                        System.out.println("\nCan you solve the problem?\n" + rand1 + " / " + rand2);
                        System.out.println("What is the answer?: ");
                        answer = scnr.nextInt();
                        responses[i] = answer;

                        if (answer == rand1 / rand2) {
                            correctResponse();
                            totalCorrect++;
                        }//ends if

                        else {
                            incorrectResponse();
                        }//ends else

                        if (i == 9) {
                            break;
                        }//ends if
                    }//ends case 4 for loop
                    break;
                case 5:
                    System.out.println("\nMix is under development.\n");
                    break;
                    }// ends switch(type)
            grade(totalCorrect);
        }//ends for loop

    }//ends questionGenerator

}//Ends class
