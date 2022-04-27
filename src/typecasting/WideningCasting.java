package typecasting;

public class WideningCasting {
    public static void main(String[] args) {
        byte num1 = 2;                   // Declaration of byte value
        System.out.println(num1);
        char value1 = (char) num1;       // Converting byte into char
        System.out.println(value1);
        short num2 = 12;                 // Declaration of short value
        System.out.println(num2);

        char value = 'a';                // Declaration of char value
        System.out.println(value);
        int value2 = value;              // Converting char into int
        System.out.println(value2);
        int num3 = 23;                  // Declaration of int value
        System.out.println(num3);
        long value3 = num3;              // Converting int into long
        System.out.println(value3);
        long num4 = 3456;                // Declaration of long value
        System.out.println(num4);
        float value4 = num4;             // Converting long into float
        System.out.println(value4);
        float num5 = 67.4f;              // Declaration of float value
        System.out.println(num5);
        double value5 = num5;            // Converting float into double
        System.out.println(value5);



    }
}
