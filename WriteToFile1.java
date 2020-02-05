package day3;

import java.io.PrintWriter;

public class WriteToFile1 {
    public static void main(String[]args){
        String zizi= "C://Users//iLabs//Desktop//Javax//Home.txt";
        try {
            PrintWriter write = new PrintWriter(zizi);
            write.println("Java is cool");
            write.println("..............");
            System.out.println("Text created");
            write.close();
        }
        catch (Exception ex){
            System.out.println("Texe created");
        }
    }
}
