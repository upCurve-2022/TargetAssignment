public class Discount {
    public static void main(String[] args) {
        int cost=50;
        int disc=12;
        System.out.println("Original pen price:$"+cost);
        float disc_price=(disc*cost)/100;
        System.out.println("Discount provided:$"+disc_price);
        float sp=cost-disc_price;
        System.out.println("Selling price:"+sp);
    }
}
