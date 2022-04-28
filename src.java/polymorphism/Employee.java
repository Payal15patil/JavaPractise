package polymorphism;

import java.io.FilterOutputStream;

public class Employee {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name("Payal");
        e.name("Yogesh","Patil");


    }
    public void name(String eName){
        System.out.println("Employee name is: " +eName);

    }
    public void name(String firstName, String lastName){
        System.out.println("Employee name is: " +firstName +" " +lastName);

    }
    public int name(){
        return 0;


    }
}
