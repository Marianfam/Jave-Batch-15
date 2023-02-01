package raniaR1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your quiz grade.");
        int quiz = input.nextInt();
        System.out.println("Enter your mid term grade.");
        int midterm =input.nextInt();
        System.out.println("Enter your final score grade.");
        int finals =input.nextInt();
        int avg = ((quiz+midterm+finals)/3);
        if (avg >=90) {
            System.out.println("grade=A");
        }else if (avg >=70 && avg < 90) {
                System.out.println("grade=B");
        }else if (avg >=50 && avg < 70) {
            System.out.println("grade=C");
        }else if ( avg < 50 ) {
            System.out.println("grade=F");





        }
    }

}