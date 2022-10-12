package sec9;

public class MobilePhone implements ITelephone{

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Powering on cellphone");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){
            System.out.println("Now calling " + phoneNumber + " on desk phone");
        } else {
            System.out.println("cell phone is not on");
        }
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the cell phone phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn){
            isRinging = true;
            System.out.println("Cell phone: ring ring");
        } else {
            isRinging = false;
            System.out.println("Cell phone is off or number different");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
