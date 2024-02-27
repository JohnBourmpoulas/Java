import java.util.Random;

public class Main {
    public static final int ELEMENTS=10;
    public static void main(String[] args) throws Exception {
        int nextNumber;
        int max=Integer.MIN_VALUE;

        Random random_number = new Random();

        System.out.println("The 10 random numbers in range [20-50] are:");
        for(int i=1;i<=ELEMENTS; i++){
            nextNumber = random_number.nextInt(31) + 20;
            System.out.println(nextNumber);
            if(nextNumber > max){
                max=nextNumber;
            }
        }
        System.out.println("Maximum number: " + max);
    }
}
