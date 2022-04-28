package switchcases;

public class ShoeBrand {
    public static void main(String[] args) {
        ShoeBrand sb = new ShoeBrand();
        sb.brandName(2);
        sb.brandName(6);
        sb.brandName(5);
    }
    public void brandName(int brandNumber ){
        switch(brandNumber){   // switch case shows number available for shoe's different brands
            case 1: System.out.println("NIKE");   break;
            case 2: System.out.println("PRADA");  break;
            case 3: System.out.println("ADIDAS"); break;
            case 4: System.out.println("REEBOK"); break;
            case 5: System.out.println("JORDAN"); break;
            default: System.out.println("These shoes are not available");
        }
    }
}
