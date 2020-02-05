package day2;

public class WhileLoop {
    public static void main(String[] args) {
        int total=0;
        int count = 1;
        while( count <= 3)
        {
            System.out.println(count);
            total+=count;
            count++;

        }
        System.out.println("Total is "+ total);
    }
}
