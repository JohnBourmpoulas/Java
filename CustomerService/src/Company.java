import java.util.Scanner;

public class Company {
    private String companyName;
    private int customerNumber;
    private Customer[] customers = new Customer[100];

    public Company(String companyName){
        this.companyName = companyName;
        customerNumber = 0;
    }

    public void insertCustomer(int N){
        Scanner input = new Scanner(System.in);

        for(int i=0; i<N; i++){
            customers[i] = new Customer();
            
            System.out.println("Enter Customer Code:");
            customers[i].setCode(input.next());

            System.out.println("Enter customer Name:");
            customers[i].setName(input.next());

            System.out.println("Enter customer Address:");
            customers[i].setAddress(input.next());

            System.out.println("Enter customer Price:");
            customers[i].setPrice(input.nextFloat());
            customerNumber++;
        }
    }

    public void displayCustomerInfo(){
        for(int i=0; i<customerNumber; i++){
            System.out.println(customers[i]);
        }
    }

    public double totalIncomes(){
        double sum = 0;

        for(int i=0; i<customerNumber; i++){
            sum = customers[i].getPrice();
        }

        return sum;
    }

    public void betterCustomer(){

        double max = -1;
        int customerNo = -1;

        for(int i=0; i<customerNumber; i++){
            if(customers[i].getPrice() > max){
                max = customers[i].getPrice();
                customerNo = i;
            }
        }
        
        System.out.println(customers[customerNo]);
        
    }

}
