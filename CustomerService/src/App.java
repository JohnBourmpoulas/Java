public class App {
    public static void main(String[] args) throws Exception {
        Company myCompany = new Company("Logitech");
    
        myCompany.insertCustomer(2);
  
        myCompany.displayCustomerInfo();
        System.out.println("Total Incomes: " + myCompany.totalIncomes());
      System.out.println();
        myCompany.betterCustomer();
    }
}
