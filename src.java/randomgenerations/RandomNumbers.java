package randomgenerations;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        Random random = new Random();
        int result = random.nextInt();
        String emailId = "Payal"+result+"@yahoo.com";
        String password = "WELCOME"+result;
        employeeInfo(emailId,password);

    }
    public static void employeeInfo (String emailId, String password){
        System.out.println(emailId+" "+password);
    }
}
