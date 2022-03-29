import java.util.Scanner;
import java.util.Stack;
public class Expression {

        public static int Evaluate(String str)
        {
        char[] a=str.toCharArray();
        Stack<Integer>values=new Stack<Integer>();
        Stack<Character>ops=new Stack<Character>();

        for(int i=0;i<a.length;i++)
        {
            if(a[i]==' ')
                continue;
            if(a[i]>='0'&&a[i]<='9')
            {
               StringBuffer sb=new StringBuffer();
               while(i<a.length&&a[i]>='0'&&a[i]<='9')

                   sb.append(a[i++]);
                   values.push(Integer.parseInt(sb.toString()));
                   i--;

            }
            else if(a[i]=='(')
                ops.push(a[i]);
            else if(a[i]==')')
            {
                while(ops.peek()!='(')

                    values.push(applyOp(ops.pop(),values.pop(),values.pop()));
                    ops.pop();

            }
            else if(a[i]=='+'||a[i]=='-'||a[i]=='*'||a[i]=='/'||a[i]=='%')
            {
               while(!ops.empty()&&hasPrecedence(a[i],ops.peek()))
                   values.push(applyOp(ops.pop(),values.pop(),values.pop()));
               ops.push(a[i]);
            }
        }while (!ops.empty())
            values.push(applyOp(ops.pop(),values.pop(),values.pop()));
        return values.pop();
    }
    public static boolean hasPrecedence(char op1,char op2)
    {
        if(op2=='('||op2==')')
            return false;
        if((op1=='*'||op1=='/')&&(op2=='+'||op2=='-'))
        {
            return false;
        }
        else
            return true;
    }
    public static int applyOp(char op,int b,int a)
    {

        switch (op)
        {
            case '+':return a+b;
            case '-':return  a-b;
            case '*':return a*b;
            case '%':return a%b;
            case '/':if(b==0)
                         throw new ArithmeticException();
                return a/b;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the expression");
        String ex=sc.nextLine();
        System.out.println("Result is:"+Evaluate(ex));
    }
}
