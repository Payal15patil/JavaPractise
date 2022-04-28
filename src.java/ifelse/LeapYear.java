package ifelse;

public class LeapYear {
    public static void main(String[] args) {
        LeapYear lp = new LeapYear();
        lp.year(2020);
        lp.year(1536);
        lp.year(3000);
        lp.year(1750);

    }
    public static void year(int year){
        if((year%4==0) && (year%100==0)){
            System.out.println("It is LEAP YEAR");
        }
        else if((year%4==0) && (year%100!=0) || (year%400==0)){
            System.out.println("It is not a LEAP YEAR");

        }
        else{
            System.out.println("It is not a LEAP YEAR");
        }
    }
}

