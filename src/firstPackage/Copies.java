package firstPackage;

import java.util.Scanner;

public class Copies {
    public static void main(String[] ags) {
        int noCopies;
        double totCost = 0.0;
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter number of Number of copies");
        noCopies= cs.nextInt();

        if (noCopies >=1 && noCopies <= 100) {
            totCost = noCopies * 0.05;
            System.out.printf("Total Cost  for fist 100 copies is %.2f", totCost);
        } else if (noCopies >100) {
            totCost =((100-noCopies)*0.03)+(100 * 0.05);
            System.out.printf(" Total cost for copies of more than 100  is %.2f", totCost);
        } else {
            System.out.println("invalid no of copies");
        }
    }
}
