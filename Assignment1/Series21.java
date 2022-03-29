import java.util.Scanner;
public class Series21 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = s.nextInt();
        int num = 1;

        if (n == 1) {
            System.out.print(num);
        } else {
            System.out.print(num + " ");
            for (int i = 1; i < n; i++) {
                if (i % 2 == 0) {
                    num = num + (i * i);
                    System.out.print(num + " ");
                } else {
                    num = num + (i * i);
                    System.out.print("-" + num + " ");
                }
            }
        }
    }
}
