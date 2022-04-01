package constructor;

public class Const2 {
    int houseNo;
    String postCode;
    String streetName;
    String cityName;

    public Const2(int Number, String Name, String poCode){
        houseNo = Number;
        streetName = Name;
        postCode = poCode;
    }
    public Const2(int hNum, String cName){
        houseNo = hNum;
        cityName = cName;
    }
    public void printMessage(){
        System.out.println("My Home Details are Given Below:");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(houseNo);
        System.out.println(streetName);
        System.out.println(postCode);
        System.out.println(cityName);
        System.out.println();
    }

    public static void main(String[] args) {
        Const2 c1 = new Const2(10,"london");
        c1.printMessage();
        Const2 c2 = new Const2(94,"Boleyn Road","E79QG");
        c2.printMessage();
    }


}
