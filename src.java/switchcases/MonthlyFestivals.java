package switchcases;

public class MonthlyFestivals {
    public static void main(String[] args) {
        MonthlyFestivals mf = new MonthlyFestivals();
        mf.festiveName("MARCH");
        mf.festiveName("JUNE");
        mf.festiveName("nov"); }
    public void festiveName(String monthName){
        switch (monthName){
            case "JAN": System.out.println("Kite Festival and Republic Day"); break;
            case "FEB": System.out.println("Valentine's Day"); break;
            case "MARCH": System.out.println("Holi"); break;
            case "APRIL": System.out.println("Easter Holidays"); break;
            case "MAY": System.out.println("Summer Vacation"); break;
            case "JUNE": System.out.println("Spring Bank Holiday"); break;
            case "JULY": System.out.println("Gauri Vrat"); break;
            case "AUG": System.out.println("Independence Day and Janmashtmi"); break;
            case "SEP": System.out.println("Shradh - Death Rituals"); break;
            case "OCT": System.out.println("Dashera and Diwali"); break;
            case "NOV": System.out.println("Winter Begins"); break;
            case "DEC": System.out.println("Chritsmas"); break;
            default: System.out.println("Invalid Input");

        }

    }
}
