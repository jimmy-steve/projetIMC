package utils;

import java.util.Scanner;

public class Utilitaire {

    public static int saisirEntier(String message, String messageErreur){
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        while (!scan.hasNextInt()){
            System.out.println(messageErreur);
            scan.nextLine();
        }
        return scan.nextInt();
    }

    public static String saisirChaine(String message){
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        return scan.nextLine();
    }

    public static double saisirDouble(String message, String messageErreur){
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        while (!scan.hasNextDouble()){
            System.out.println(messageErreur);
            scan.nextLine();
        }
        return scan.nextDouble();
    }
}
