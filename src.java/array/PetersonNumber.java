package array;

public class PetersonNumber {
    public static void main(String[] args) {
        int myNum[] = {123, 345, 4783, 93472, 298212};

        int remainder = 0;
        int sum = 0;
        int num = 0;

        for (int i = 0; i < myNum.length; i++) {
            remainder = i % 10;
            i = i / 10;
            int fact = 1;
            for (int j = remainder; j > 0; j--) {
                fact = fact * j;
            }
            sum = sum + fact;

        }
        if (sum == num) {
            System.out.println(+num + " is Peterson Number");
        } else {
            System.out.println(+num + "is not Peterson Number");
        }


    }

}
