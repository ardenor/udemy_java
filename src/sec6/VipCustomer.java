package sec6;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public VipCustomer(String name, double creditLimit, String email){
        System.out.println("MAIN CONSTRUCTOR");
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
    public VipCustomer(String name, String email){
        this(name, 5000.0, email);
        System.out.println("PARTIAL CONSTRUCTOR");
    }
    public VipCustomer(){
        this("Default Name", 4000.0, "default@email.com");
        System.out.println("EMPTY CONSTRUCTOR");
    }
}
