package firstPackage;

import java.util.Scanner;

public class Salary {
    public static void main(String[]args){
        double hoursWorked=0.0;double rateOfPay=0.0; double salary=0.0;
        Scanner input= new Scanner(System.in);
        System.out.println("enter hours worked");
        hoursWorked=input.nextDouble();
        System.out.println("enter your rate of pay");
        rateOfPay=input.nextDouble();

        salary=hoursWorked*rateOfPay;

        System.out.printf("Salary is %.2f" ,salary);
    }
}
