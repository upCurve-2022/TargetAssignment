import java.util.Scanner;
public class Student {
   public int id;
    public String name;
   public  int Class;
  public  int marks;
    public String result;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of students");
        int n= sc.nextInt();
        Student[] obj =new Student[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the details of student "+ (i+1));
            obj[i]=new Student();
            System.out.println("Id:");
            obj[i].id=sc.nextInt();
            System.out.println("Name:");
            obj[i].name=sc.next();
            System.out.println("Class:");
            obj[i].Class=sc.nextInt();
            System.out.println("Marks:");
            obj[i].marks=sc.nextInt();
            System.out.println("Result:");
            obj[i].result=sc.next();
        }
        System.out.println("Printing report");
        System.out.println("ID\t"+"Name\t"+"Class\t"+"Marks\t"+"Result");
        for(int i=0;i<n;i++)
        {
            System.out.println(obj[i].id+"\t"+obj[i].name+"\t"+obj[i].Class+"\t"+obj[i].marks+"\t"+obj[i].result);
        }
    }
}
