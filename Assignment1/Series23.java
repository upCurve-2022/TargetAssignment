import java.util.Scanner;
public class Series23 {
    public static void main(String []args){
        //input
        System.out.println("Enter value of n");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int n1=1,n2=-2;
        //generating series 1,-2,4,-6.....
        if(n==1) {
            System.out.print(n1);
        }
        else if(n==2){
            System.out.print(n1+" "+n2);
        }
        else{
            System.out.print(n1+" "+n2+" ");
            for(int i=3,j=0;i<=n;i++,j++){
                if(i%2!=0){
                    n1=n1+3;
                    System.out.print(n1+" ");
                }
                else{
                    n2=n2-4;
                    System.out.print(n2+" ");
                }
            }
        }
    }
}
