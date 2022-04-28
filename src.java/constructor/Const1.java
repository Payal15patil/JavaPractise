package constructor;

public class Const1 {
    int myID;

    public Const1(int id){
        myID = id;

    }
    public void printId(){
        System.out.println("My ID : " +myID);
    }
    public static void main(String[] args) {
        Const1 const1 = new Const1(24);
        const1.printId();

    }



}
