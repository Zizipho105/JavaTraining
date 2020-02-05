package firstPackage;

import java.util.Scanner;

public class Decision {
    public static void main(String[]args)
    {

        int testMarks=0;
        Scanner input = new Scanner(System.in);
        System.out.println("input test mark");
        testMarks = input.nextInt();
        if (testMarks >0 &&testMarks <50)
        {
            System.out.println("Pass");
        }
        if (testMarks >= 50 && testMarks <= 100)
        {
            System.out.println("fail");
        }
    }
}
