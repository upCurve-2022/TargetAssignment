import java.util.Scanner;
public class Separate {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double frac;
        int act;
        System.out.println("enter number");
        double n=sc.nextDouble();
        frac=n%1;
        act=(int)(n-frac);
        System.out.println("actual number:"+n);;
        System.out.println("Fractional part:"+frac);
        System.out.println("Whole part:"+act);
    }
}