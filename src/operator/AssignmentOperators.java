package operator;

public class AssignmentOperators {

    public static void main(String[] args) {

        int p= 120;
        int q= 23;
        int r= 34;
        int s= 2;
        int t= 86;
        p += q;
        System.out.println(p);
        q -= 24;
        System.out.println(q);
        r *= 12345;
        System.out.println(r);
        s /= 2;
        System.out.println(s);
        t %= s;
        System.out.println(t);
        p &= 6;
        System.out.println(p);


    }
}
