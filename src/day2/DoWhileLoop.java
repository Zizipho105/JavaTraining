package day2;

public class DoWhileLoop {
    public static void main(String[] args) {
        int total=0,count=1;
        do{
            System.out.println(count);
            total=total+count;
            count++;
        }
        while (count<=3);
        System.out.println("Total is "+ total);
    }
}
