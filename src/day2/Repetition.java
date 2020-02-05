package day2;

import java.util.Scanner;

public class Repetition {
    public static void main(String[] args) {
        int productNo=0, quantity;
        double price = 0.0, PriceForAll = 0.0;
        Scanner cs = new Scanner(System.in);

        System.out.println("Enter product number");
        productNo =cs.nextInt() ;

        if (productNo == -999){
            System.out.println("Thank you goodbye");
            System.exit(0);
        }else if(productNo<=0 || productNo >5 ) {
            System.out.println("Enter product number");
            productNo = cs.nextInt();


            while (productNo != -999) {


                System.out.println("Enter  quality sold ");
                quantity = cs.nextInt();

                switch (productNo) {
                    case 1:
                        price = 2.98 * quantity;
                        System.out.println("price = " + price);
                        break;
                    case 2:
                        price = 4.50 * quantity;
                        System.out.println("price = " + price);
                        break;
                    case 3:
                        price = 9.98 * quantity;
                        System.out.println("prce = " + price);
                        break;
                    case 4:
                        price = 4.49 * quantity;
                        System.out.println("price = " + price);
                        break;
                    case 5:
                        price = 6.87 * quantity;
                        System.out.println("price = " + price);
                    default:
                        System.out.println("invalid");
                }

                PriceForAll += price;
                System.out.println("Enter  product number");
                productNo = cs.nextInt();
                if(productNo<=0 || productNo >5 ) {
                    System.out.println("Enter product number");
                    productNo = cs.nextInt();
                }

            }
            if (productNo == -999 && PriceForAll <= 0) {
                System.out.println("Thank you using application");
                System.exit(0);
            } else {
                System.out.println("Total for all " + PriceForAll);
            }
        }
            }



        }











