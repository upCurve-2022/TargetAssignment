import java.util.Scanner;
public class Volume {
    public static void volume(int r,int h)
    {
        double v=3.14*r*r*h;
        System.out.println("Volume of cylinder with radius="+r+"and heigh="+h+"is :"+v);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius and height of the cylinder");
        int radius=sc.nextInt();
        int height=sc.nextInt();
        volume(radius,height);

    }
}
