import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value");
        int n = sc.nextInt();
        int oddsum = 0, evensum = 0;
        int i = 0;
        while (i <= n) {
            if (i % 2 == 0) {
                evensum = evensum + i;
            } else {
                oddsum = oddsum + i;
            }
            i++;

        }
        System.out.println("Even sum=" + evensum);
        System.out.println("Odd sum=" + oddsum);
    }
}

