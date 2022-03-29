public class StringImmutable {
    public static void referenceCheck(Object x,Object y)
    {
        if(x==y)
            System.out.println("Both are pointing to the same location");
        else
            System.out.println("Both are pointing to different locations");
    }

    public static void main(String[] args) {
        String str1="hello";
        String str2="hello";

        System.out.println("Before modification in st1");
        referenceCheck(str1,str2);
        str1=str1+"hi";
        System.out.println("After modification in st1");

        referenceCheck(str1,str2);

    }
}
