package H241240131016;

import java.util.Scanner;

public class MeterToFeet{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Meters : ");
        double M = sc.nextDouble();
        double f=M*3.28084;
        System.out.printf("Feet = %.2f",f);
    }
}