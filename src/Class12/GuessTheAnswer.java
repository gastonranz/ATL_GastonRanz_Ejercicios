package Class12;

import Clase8.GeneradorClaves;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessTheAnswer {
    public static void main(String[] args) throws IOException {
        GuessTheAnswer.runProgram();
    }

    private static void runProgram() throws IOException{
        System.out.println("Let's play -- Guess the Answer --\nHere's the instructions:\nYou have to read the " +
                "question and then, you must guess the correct word about the meaning of that question.\n" +
                "Let's get started!");
        GuessTheAnswer.question();

        System.out.println("Press 1 to play again, 0 to quit:");
        GuessTheAnswer.playAgain();
    }

    private static void runProgram2() throws IOException {
        GuessTheAnswer.question();

        System.out.println("Press 1 to play again, 0 to quit:");
        GuessTheAnswer.playAgain();
    }

    private static String stringInput() throws IOException {
        InputStreamReader keyboardCapture = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(keyboardCapture);
        return buffer.readLine();
    }

    private static void question() throws IOException {
        String answer = "";
        Integer num = (int) Math.floor((Math.random() * 2) + 1);

        if(num == 1) {
            System.out.println("In what year did Neil Armstrong become the first person to walk on the moon?");
            answer = GuessTheAnswer.stringInput();
            if(answer.equalsIgnoreCase("69'")) {
                System.out.println("---- YOUR ANSWER IS CORRECT! CONGRATULATIONS! ----");
            } else {
                num = Integer.parseInt(answer);
                if(num == 1969 || num == 69) {
                    System.out.println("---- YOUR ANSWER IS CORRECT! CONGRATULATIONS! ----");
                } else {
                    System.out.println("---- YOUR ANSWER IS INCORRECT, TRY AGAIN! ----");
                }
            }
        } else {
            System.out.println("What's the name of the film that has got an oscar for the best film in 1998");
            answer = GuessTheAnswer.stringInput();
            if(answer.equalsIgnoreCase("Titanic") || answer.equalsIgnoreCase("Titanic 1997") ||
                    answer.equalsIgnoreCase("Titanic1997")) {
                System.out.println("---- YOUR ANSWER IS CORRECT! CONGRATULATIONS! ----");
            } else {
                System.out.println("---- YOUR ANSWER IS INCORRECT, TRY AGAIN! ----");
            }
        }
    }

    private static void playAgain() throws IOException {
        String strNum = GuessTheAnswer.stringInput();
        Integer num = Integer.parseInt(strNum);

        while(num < 0 || num > 1) {
            if(num < 0) {
                System.out.println("Please, don't type a negative number. Just press 1 to play again or 0 to quit:");
                strNum = GuessTheAnswer.stringInput();
                num = Integer.parseInt(strNum);
                while(num < 0) {
                    System.out.println("C'mon man. Just press 1 to play again or 0 to quit:");
                    strNum = GuessTheAnswer.stringInput();
                    num = Integer.parseInt(strNum);
                    if(num < 0) {
                        System.out.println("This is not funny. Please press 1 to play again or 0 to quit:");
                        strNum = GuessTheAnswer.stringInput();
                        num = Integer.parseInt(strNum);
                    }
                }
            } else {
                System.out.println("Please, don't press a bigger button than 1! Press 1 to play again, 0 to quit:");
                strNum = GuessTheAnswer.stringInput();
                num = Integer.parseInt(strNum);
                while(num > 1) {
                    System.out.println("C'mon man. Just press 1 to play again or 0 to quit:");
                    strNum = GuessTheAnswer.stringInput();
                    num = Integer.parseInt(strNum);
                    if(num > 1) {
                        System.out.println("This is not funny. Please press 1 to play again or 0 to quit:");
                        strNum = GuessTheAnswer.stringInput();
                        num = Integer.parseInt(strNum);
                    }
                }
            }
        }
        if(num == 1) {
            GuessTheAnswer.runProgram2();
        } else {
            System.out.println("---- THANK YOU FOR PLAYING THIS GAME ----");
        }
    }
}
