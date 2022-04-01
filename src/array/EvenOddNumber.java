package array;

public class EvenOddNumber {
    public static void main(String[] args) {
        int myNumber[]= {2,5,7,12,22,39,56,71,90};

        for(int i=0; i<myNumber.length; i++){
            if(myNumber[i] % 2 == 0){
                System.out.println(myNumber[i]+ " is Even Number");
            }
            else{
            System.out.println(myNumber[i]+ " is Odd Number");
        }
    }
}
}