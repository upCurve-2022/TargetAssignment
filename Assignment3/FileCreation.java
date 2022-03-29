
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileCreation {
    public static void main(String[] args)
    {
        try {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the name of the file to be created");
            String str=sc.nextLine();
            File f = new File(str);
            if (f.createNewFile()) {
                System.out.println("File " + f.getName()+" is created");
            } else
                System.out.println("File already exists");
        }
        catch(IOException e)
        {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
