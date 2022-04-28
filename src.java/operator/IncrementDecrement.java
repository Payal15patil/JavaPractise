package operator;

public class IncrementDecrement {

    public static void main(String[] args) {
        int x= 30;
        int y= 49;
        x++;         /* first increase and then assign value */
        System.out.println(x);

        ++x;         /* first assign and then increase value */
        System.out.println(x);

        ++y;
        System.out.println(y);

        y++;
        System.out.println(y);


    }
}
