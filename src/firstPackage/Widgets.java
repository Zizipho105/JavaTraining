package firstPackage;

import java.util.Scanner;

public class Widgets
{
    public static void main(String[] ags) {
        int noWigdgets;
        double totCost = 0.0;
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter number of Wigget");
        noWigdgets = cs.nextInt();

        if (noWigdgets > 1 && noWigdgets < 100) {
            totCost = 0.25 * noWigdgets;
            System.out.printf("Total Cost for small order of widget %.2f", totCost);
        } else if (noWigdgets >=100) {
            totCost = noWigdgets * 0.20;
            System.out.printf(" Total cost for Large order is %.2f", totCost);
        } else {
            System.out.println("ivvalid no of wigdet");
        }
    }
}
