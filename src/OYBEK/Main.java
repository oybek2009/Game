package OYBEK;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(in);
        System.out.print("Write number: ");
        int num = scanner.nextInt();
        switch (num) {
            case 1->{
                System.out.println(" Monday ");
            }case 2->{
                System.out.println(" Tuesday ");
            }case 3->{
                System.out.println(" Wednesday ");
            }case 4->{
                System.out.println(" Thursday ");
            }case 5->{
                System.out.println(" Friday ");
            }case 6->{
                System.out.println(" Saturday ");
            }case 7->{
                System.out.println(" Sunday ");
            }default -> System.out.println("Error!!!");
        }
    }
}