public class Main {
    public static void main(String[] args) throws Exception {
        salaried_Employee s1 = new salaried_Employee("Jack Sparrow", "3030150", "3124512312",1000);
        hourly_Employee s2 = new hourly_Employee("Test Employee", "3030151", "2312241312", 96, 5.5);
    
        System.out.println(s1);
        System.out.println(s2);
    }
}
