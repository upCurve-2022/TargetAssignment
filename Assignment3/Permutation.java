

public class Permutation {
    public static void permutation(String str,String ans)
    {
        if(str.length()==0)
        {
            System.out.println(ans+" ");
        }
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            String ros=str.substring(0,i)+str.substring(i+1);
            permutation(ros,ans+ch);
        }
    }
    public static void main(String[] args) {

        String str="GOD";
        permutation(str,"");

    }
}
