package firstPackage;

import java.util.Scanner;

public class Circle {
    public static void main(String[]args){
        int radius,diameter=0;
        double circumference=0.0,area=0.0;

        Scanner input= new Scanner(System.in);
        System.out.println("enter radius");
        radius=input.nextInt();

        diameter =2*radius ;
        circumference =2*3.14159*radius;
        area=3.14159*(radius*radius );

        System.out.println("Diameter is "+ diameter );
        System.out.println("Circumference is "+ circumference);
        System.out.println("Area is "+ area );
    }
}
