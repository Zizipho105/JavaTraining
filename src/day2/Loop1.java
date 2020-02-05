package day2;

public class Loop1 {

        public static void main(String[] args) {
            int total=0;
            for (int count = 1; count <= 3; count++)
            {
                System.out.println(count);
                total=total+count;
            }
            System.out.println("Total is "+ total);
        }
    }

