package encapsulation;

public class GetAndSet {
    private String myName;
    private int myId;

    public static void main(String[] args) {
        GetAndSet getAndSet = new GetAndSet();
        getAndSet.setName("payal",352);
        getAndSet.setName("yogesh",356);

    }
    public String  getName (){
        return myName;}
    public int getMyId(){
        return myId;
    }
    public void setName(String myName, int myId){
        this.myName = myName;
        this.myId = myId;

    }
}
