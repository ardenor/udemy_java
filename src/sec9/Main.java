package sec9;

public class Main {

    public static void main(String[] args) {
        //Deskphone colinsPhone;
        ITelephone colinsPhone;
        colinsPhone = new DeskPhone(123456);
        colinsPhone.powerOn();
        colinsPhone.callPhone(123456);
        colinsPhone.answer();

        MobilePhone cellPhone;
        cellPhone = new MobilePhone(234567);
        cellPhone.powerOn();
        cellPhone.callPhone(234567);
        cellPhone.answer();

    }


























    public static boolean boolReturn(){
        return true;
    }

    public static boolean bool2(){
        return true;
    }
}
