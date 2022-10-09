package sec6;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String value){
        this.firstName = value;
    }

    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String value){
        this.lastName = value;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int value){
        if(value<0 || value >100){
            this.age = 0;
        } else {
            this.age = value;
        }
    }

    public boolean isTeen(){
        if(getAge() > 12 && getAge() < 20){
            return true;
        } else {
            return false;
        }
    }

    public String getFullName(){
        if(getFirstName().isEmpty() && getLastName().isEmpty()){
            return "";
        }
        if(getFirstName().isEmpty()){
            return lastName;
        }
        if(getLastName().isEmpty()){
            return firstName;
        }
        return firstName + " " + lastName;
    }
}
