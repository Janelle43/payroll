package edu.iitu.kz;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("-------Main Menu-------");
            System.out.println("-------Payroll System-------");
            System.out.println("1. Add 10%");
            System.out.println("2. Change salary -> salary employee");
            System.out.println("3. Change salary -> hourly employee");
            System.out.println("0. Exit");

            int choice = in.nextInt();
            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Incorrect choice");
                    break;
            }
        }
    }
}
