package switchcases;

public class VowelNumber {
    public static void main(String[] args) {
        printNumber('a');
        printNumber('f');
        printNumber('u');

    }
    public static void printNumber (char vowelChar){
        switch (vowelChar){
            case 'a': System.out.println("1");  break;
            case 'e': System.out.println("5");  break;
            case 'i': System.out.println("9");  break;
            case 'o': System.out.println("15"); break;
            case 'u': System.out.println("21"); break;
            default:  System.out.println("Invalid Character");
        }
    }
}
