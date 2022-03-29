public class Swap {

    int n1;
    int n2;
    int n3;
    public  void swapping(int num1,int num2) {
        n1 = num1;
        n2 = num2;
        n1=n1-n2;
        n2=n1+n2;
        n1=n2-n1;
        System.out.println("After swaping:");
        System.out.println("First Number:"+n1);
        System.out.println("second Number:"+n2);
    }
    public  void swapping(int num1,int num2,int num3) {
        n1 = num1;
        n2 = num2;
        n3=num3;
        n1=n1+n2+n3;
        n2=n1-(n2+n3);
        n3=n1-(n2+n3);
        n1=n1-(n2+n3);
        System.out.println("After swaping:");
        System.out.println("First Number:"+n1);
        System.out.println("second Number:"+n2);
        System.out.println("Third Number:"+n3);
    }
    public static void main(String[] args) {
       Swap obj=new Swap();
       obj.swapping(4,6);
       obj.swapping(4,6,8);
    }

}
