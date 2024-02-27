public class Customer {
    private String customerCode;
    private String name;
    private String address;
    private double price;

    // Setters
    public void setCode(String code){
        this.customerCode = code;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setPrice(double price){
        this.price = price;
    }

    //Getters
    public String getCode(){
        return customerCode;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public double getPrice(){
        return price;
    }

    @Override
    public String toString(){
        return "Customer Code:" + customerCode + " Name: " + name + " Address: " + address + " Price: " + price;
    }
}
