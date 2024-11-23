package day13_string;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {
        Scanner key = new Scanner (System.in);
        System.out.println("Please choose one of this options below: ");
        System.out.print("\t1 - English\n\t2 - Spanish\n\t3 - Turkish\n\t4 - Russian\n\t5 - French\n\t6 -Azerbaijan\nYour option: ");
        int userOption = key.nextInt();
        //1 option
        if (userOption==1) {
            System.out.println("Hello thank for your call");
        } else if (userOption==2) {
            System.out.println("Hola");
        }else if (userOption==3) {
            System.out.println("Merchaba");
        } else if (userOption==4) {
                System.out.println("Privet");
        } else if (userOption==5) {
            System.out.println("Merci");
        } else if (userOption==6) {
            System.out.println("Salam");
        }else {
            System.out.println("Incorrect");
        }

        System.out.println("=============================");
        //2 option
        String message = "";
        switch (userOption){
            case 1:
                message = "Hello thank for your call";
                break;
            case 2:
                message= "Hola";
                break;
            case 3:
                message = "Merchaba";
                break;
            case 4:
                message = "Privet";
                break;
            case 5:
                message = "Merci";
                break;
            case 6:
                message = "Salam";
                break;
            default:
                System.out.println("Incorrect");
        }
        System.out.println(message);
    }
}
