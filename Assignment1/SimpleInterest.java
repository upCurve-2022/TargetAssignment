
public class SimpleInterest {
    float amount;
    float rate;
    float time;
    float si;
    SimpleInterest(float amount,float rate,float time)
    {
        this.amount=amount;
        this .rate=rate;
        this.time=time;
    }
    public void value()
    {
        si=(amount*rate*time)/100;
        System.out.print("Simple interest :"+si);
    }
    public static void main(String[] args) {
        SimpleInterest obj1=new SimpleInterest(20000,3,2);
        obj1.value();

    }
}
