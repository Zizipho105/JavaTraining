package firstPackage;

import java.util.Scanner;

public class Class1 {
    public static void main(String[]args)
        {
            int num1,num2,product=0;
            Scanner input= new Scanner(System.in);
            System.out.println("input fist interger");
            num1=input.nextInt();
            System.out.println("input second interger");
            num2=input.nextInt();

            product=num1+num2;
            System.out.println("Product is "+ product);

    }


}
