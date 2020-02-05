package firstPackage;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] ags) {
        String name;
        Scanner cs = new Scanner(System.in);
        System.out.println("Who was the first Ronald McDonanals?");
        name= cs.nextLine() ;

        if( name.equals("Willard Scort") )
        {
            System.out.println("Correct");
        }
        else {
            System.out.println("nyc try");
        }

    }
}
