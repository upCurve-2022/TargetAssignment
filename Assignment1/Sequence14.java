 import java.util.Scanner;
public class Sequence14 {
    public static void main(String []args){

        Scanner s=new Scanner(System.in);
        System.out.println("Enter value of n ");
        int n1=1,n2=4,n3=7,n4;
        int n=s.nextInt();

        if(n==1){
            System.out.print(n1);
        }
        else if(n==2){
            System.out.print(n1+" "+n2);
        }
        else if(n==3){
            System.out.print(n1+" "+n2+" "+n3);
        }
        else{
            System.out.print(n1+" "+n2+" "+n3+" ");
            for(int i=4;i<=n;i++){
                n4=n1+n2+n3;
                n1=n2;
                n2=n3;
                n3=n4;
                System.out.print(n4+" ");
            }
        }
    }
}

