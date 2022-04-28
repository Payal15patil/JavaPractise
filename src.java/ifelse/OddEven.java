package ifelse;

public class OddEven {
    public static void main(String[] args) {
        OddEven n = new OddEven();
        n.number(30);
        n.number(45);
    }
    public static void number(int a){
        if(a%2==0){
            System.out.println("Given Number is Even");
        }
        else{
            System.out.println("Given number is odd");
        }
    }
}
