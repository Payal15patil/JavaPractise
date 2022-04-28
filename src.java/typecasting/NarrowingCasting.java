package typecasting;

public class NarrowingCasting {
    public static void main(String[] args) {

        double val1 = 2345.6780;        // Declaration of double value
        System.out.println(val1);
        float myVal1 = (float) val1;    // Converting double into float
        System.out.println(myVal1);
        long myVal5 = (long) val1;      // Converting double into long
        System.out.println(myVal5);
        float val2 = 5.60f;             // Declaration of float value
        System.out.println(val2);
        int myVal2 = (int) val2;        // Converting float into int
        System.out.println(myVal2);
        int val3 = 456;                 // Declaration of int value
        System.out.println(val3);
        char myVal3 = (char) val3;      // Converting int into char
        System.out.println(myVal3);
        char val4 = 'p';                // Declaration of char value
        System.out.println(val4);
        byte myVal4 = (byte) val4;      // Converting char into byte
        System.out.println(myVal4);

    }
}
