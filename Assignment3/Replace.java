public class Replace {
    public static void main(String[] args) {
        String str="I am always ready to learn although I do not always like being taught";
        String str1="";
        for(int i=0;i<str.length();i++) {
            if (str.charAt(i) == 'a') {
                str1 = str1+"$";
            } else {
                str1 = str1+str.charAt(i);

            }
        }
        System.out.println(str1);
    }
}
