package switchcases;

import javax.xml.bind.annotation.XmlType;

public class RainbowColours {
    public static void main(String[] args) {
        colourName(3); colourName(8); colourName(5);
    }
    public static void colourName (int colourNumber){
        switch(colourNumber){
            case 1: System.out.println("RED");    break;
            case 2: System.out.println("ORANGE"); break;
            case 3: System.out.println("YELLOW"); break;
            case 4: System.out.println("GREEN");  break;
            case 5: System.out.println("BLUE");   break;
            case 6: System.out.println("INDIGO"); break;
            case 7: System.out.println("VIOLET"); break;
            default: System.out.println("Invalid Colour");
        }

    }

}

