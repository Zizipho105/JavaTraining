package day2;

import java.util.Scanner;

public class Gas {

    public static void main(String[] args) {
        int miles,gallonsUded;
        int TotalForAll=0;
        double milesPergallon=0.0;
        Scanner cs = new Scanner(System.in);

        System.out.println("Enter miles driven");
        miles=cs.nextInt() ;


        while (miles != -999){

            System.out.println("Enter  gallons used ");
            gallonsUded =cs.nextInt();

            milesPergallon=miles/gallonsUded;
            System.out.println("miles per gallon"+milesPergallon);
            TotalForAll+=milesPergallon;
            System.out.println("Enter miles driven");
            miles=cs.nextInt() ;
            }
        System.out.println("PROCESS COMPLETTED");
        System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
        System.out.println("TOTAL GALLON USED FOR ALL MILES = " + TotalForAll);
        System.out.println("..............................................................................");
        System.out.println("THANK YOU GOODBYE");

        }
    }

