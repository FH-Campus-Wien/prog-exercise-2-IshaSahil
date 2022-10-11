package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber() {
        Scanner scanner = new Scanner (System.in);
        double number;
        int count = 1;
        double max = 0;

        do {
            System.out.print("Number " + count + ": ");
            number = scanner.nextFloat();

            if (count == 1 && number <= 0) {
                System.out.println("No number entered.");
                break;
            }

            if ((number > max)) {
                max = number;

            }

            if (number <= 0) {

                System.out.printf( "The largest number is "+ "%.2f", max);
                System.out.println();


            }
            count++;

        } while (number > 0);
    }

    //todo Task 2
    public void stairs(){
        Scanner scanner = new Scanner(System.in);
        int k = 1;
        System.out.print("n: ");
        int rows = scanner.nextInt();


        if(rows <= 0) {
            System.out.println("Invalid number!");
        } else{
            for (int i = 1; i <= rows; i++) {
                for (int i1 = 0; i < i ; i++) {
                    System.out.print(k++ + " ");

                }
                System.out.println();
            }
        }

    }

    //todo Task 3
    public void printPyramid(){

    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
    }

    //todo Task 5
    public void marks(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count5 = 0;
        int countNum = 1;
        boolean isInput = true;

        while (isInput) {
            System.out.print("Mark " + countNum + ": ");
            int number = scanner.nextInt();

            if (number > 0 && number <= 5) {
                sum = sum + number;
                countNum++;

                if (number == 5) {
                    count5++;
                }

            } else if (number < 0 || number > 5) {
                System.out.println("Invalid mark!");

            }
            if (number == 0) {
                float mean;// / i
                if (countNum == 1){
                    mean = (float) sum / (countNum);
                } else {
                    mean = (float) sum / (countNum - 1);
                }
                System.out.printf("Average: " + "%.2f", mean);
                System.out.println();
                System.out.println("Negative marks: " + count5);
                isInput = false;

            }
        }
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}