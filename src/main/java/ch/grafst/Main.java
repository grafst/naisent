package ch.grafst;


import java.util.Scanner;


/**
 * Review Management with naive sentiment analysis
 */
public class Main {
    private static Boolean finished=false;
    public static void main(String[] args) {
        while (!finished) {
            menu();
        }
    }

    private static void menu() {
        Scanner input = new Scanner(System.in);
        System.out.printf("~~~ MENU ~~~");
        System.out.println("1: search");
        System.out.println("2: list most n used words");
        System.out.println("3: print statistics");
        System.out.println("4: sentiment");
        System.out.println("5: quit");
        int userchoice=input.nextInt();
        switch (userchoice){
            case 5: finished=true;
            break;
        }
    }


}
