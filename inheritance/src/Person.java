public class Person {
    protected String name;
    protected String birth_date;

    public Person(String name, String birth_date){
        this.name=name;
        this.birth_date=birth_date;
    }
    
    public String toString(){
        return "Name: " + name + "\n" + "Birth Date: " + birth_date;
    }
    
}
