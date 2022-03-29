import java.io.IOException;
import java.io.*;
import java.util.Scanner;
public class FileCopy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter source file");
        String sfile=sc.nextLine();
        System.out.println("Enter destination file");
        String dfile=sc.nextLine();
        try{
        FileReader fin=new FileReader(sfile);
        FileWriter fout=new FileWriter(dfile);
        int c;
        while((c=fin.read())!=-1)
        {
            fout.write(c);
        }
        System.out.println("Copy finish");
        fin.close();
        fout.close();
    }catch(IOException e)
        {
            System.out.println("Something went wrong");
        }
    }
}
