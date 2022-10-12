package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber() {
        Scanner scanner = new Scanner(System.in);
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

                System.out.printf("The largest number is " + "%.2f", max);
                System.out.println();


            }
            count++;

        } while (number > 0);
    }

    //todo Task 2
    public void stairs() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n= scanner.nextInt();
        int i, j, zahl = 1;

        if(n<0) {
            System.out.println("Invalid number!");
        }

        for (i=1; i <= n; i = i+ 1) {
            for (j=1; j<=i;j++) {
                System.out.print(zahl+ " ");
                zahl = zahl + 1;
            }
            System.out.println();
        }
    }


    //todo Task 3
    public void printPyramid(){

        int i=6, j, k;
        for (j=1; j<=i; j++) {
            for (k=i; k>j; k--) {
                System.out.print(" ");
            }
            for (k=1; k<j*2; k=k+1){
                System.out.print("*");
            }
            System.out.println();
        }

    }



    //todo Task 4
    public void printRhombus(){

        Scanner scanner=new Scanner(System.in);
        System.out.print("h: ");
        int h= scanner.nextInt();
        System.out.print("c: ");
        char c= scanner.next().charAt(0);

        if (h%2==0){
            System.out.println("Invalid number!");
            return;
        }
        int i, j, k, z;

        for (j=1; j<=h/2+1; j++){
            for (k=h/2+1; k>j; k--){
    System.out.print(" ");

            }
            for (z=j; z>0; z--) {
                char b = (char) (c - z+1);
                System.out.print(b);
            }
            for (i=1; i<j; i++) {
                char b = (char) (c - i);
                System.out.print(b);
            }
            System.out.println();

        }
        for ( j=h/2; j>=1; j--){
            for (k=h/2; k>=j; k--){
                System.out.print(" ");
            }
            for (z=j; z>0; z--) {
                char b = (char) (c - z+1);
                System.out.print(b);
            }
            for (i=1; i<j; i++) {
                char b = (char) (c - i);
                System.out.print((b));
            }
            System.out.println();
        }
    }

    //todo Task 5
    public void marks() {
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

    public void happyNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n: ");
        int number  = scanner.nextInt();
        int digit;
        int sum = 0;

                while(number !=1 && number !=4){
                    while (number>0){
                        digit = number % 10;
                        sum = (digit*digit) + sum;
                        number = number / 10;


                    }
                    number = sum;
                    sum =0;
                }

                if (number == 1) {
                    System.out.println("Happy number!");
                }else {
                    System.out.println("Sad number!");
                }
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