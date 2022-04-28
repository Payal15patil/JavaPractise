package array;

public class SumOfArray {
    public static void main(String[] args) {
        int myNum[] = {2,4,6,8,22,45,37};
        int total = 0;
        for (int i = 0; i < myNum.length; i++) {
            total = total + myNum[i];
        }
        System.out.println("Array addition is :" +total);
    }
}
