package firstPackage;

import java.util.Scanner;

public class Bagels {
    public static void main(String[] ags) {
        int noBagels;
        double totCost = 0.0;
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter number of bargels");
        noBagels = cs.nextInt();

        if(noBagels > 0 && noBagels < 6)
        {
            totCost = noBagels * 0.75;
            System.out.printf("Total Cost for less than half bagels is %.2f", totCost);
        }
        else if (noBagels>=6 )
        {
            totCost=noBagels * 0.60;
            System.out.printf(" Total cost for bagels more than half %.2f", totCost);
        }
        else {
            System.out.println("invalid no of bagels");
        }
    }

}