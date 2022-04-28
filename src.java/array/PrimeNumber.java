package array;

public class PrimeNumber {
    public static void main(String[] args) {
        int myNumber[] = {2, 3, 9, 25, 64, 77, 89, 102};


        for (int i = 0; i < myNumber.length; i++) {
            int count = 0;
            for(int j = 1; j <= myNumber[i]; j++) {
                if (myNumber[i] % j == 0) {
                    System.out.println(myNumber[i] + " is Prime Number");
                    }
                count++;

                }
            if (count == 2)  {
                    System.out.println(myNumber[i] + " is not Prime Number");
                }
            }

        }
}

