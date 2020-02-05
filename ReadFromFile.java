package day3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String zizi1 = "C://Users//iLabs//Desktop//Javax//Home.txt";
        String line = null;
        try {
            FileReader fileReader = new FileReader(zizi1);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not foud" + zizi1+ "'");

        } catch (IOException ex) {
            System.out.println("Error in reading file '" +zizi1+ "'");
        }

    }
}