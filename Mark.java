
//package java
import java.util.Scanner;
public class Mark{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter mark 1:");
        int m1=sc.nextInt();
        System.out.println("Enter mark 2:");
        int m2=sc.nextInt();
        System.out.println("Enter mark 3:");
        int m3=sc.nextInt();
        System.out.println("Enter mark 4:");
        int m4=sc.nextInt();
        System.out.println("Enter mark 5:");
        int m5=sc.nextInt();
        float total=m1+m2+m3+m4+m5;
        System.out.println("Total="+total);
        float percentage=(total/500)*100;
        System.out.println("Percentage="+percentage);
        sc.close();

    }
}
