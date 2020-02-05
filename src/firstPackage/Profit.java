package firstPackage;

import java.util.Scanner;

public class Profit {
    public static void main(String[]args){
        double revenue,cost,profit=0.0;
        Scanner input= new Scanner(System.in);
        System.out.println("enter revenue");
        revenue=input.nextDouble() ;
        System.out.println("enter cost you made");
        cost=input.nextDouble();

        profit=revenue - cost;

        System.out.println("Profit is "+ profit );
    }
}
