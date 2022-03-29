import java.io.*;
import java.io.FileOutputStream;
import java.util.Scanner;
public class File_writing {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter file name");
            String file=sc.nextLine();
            FileOutputStream obj=new FileOutputStream(file);
            System.out.println("Enter the content");
            String str=sc.nextLine();
            byte[] b=str.getBytes();
            obj.write(b);
            System.out.println("contents of the file:"+file+" are");
            FileReader fr =new FileReader(file);
            int i;
            while((i=fr.read())!=-1)
                System.out.println((char)i);
            obj.close();
            System.out.println("content is written");

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
