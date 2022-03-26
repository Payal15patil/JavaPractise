package ifelse;

public class AgeLimit {

        public static void main(String[] args) {
            AgeLimit myAge = new AgeLimit();
            myAge.age(3);
            myAge.age(45);
            myAge.age(80);
            myAge.age(66);
        }
        public static void age(int a){
            if(a<20){
                System.out.println("Child");
            }
            else if((a>20) && (a<=50)){
                System.out.println("Healthy Man");
            }
            else if((a>50) && (a<=75)){
                System.out.println("Retired Man");
            }
            else {
                System.out.println("Senior Citizen");
            }


        }
    }


