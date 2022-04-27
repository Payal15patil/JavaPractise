package abstraction;

public abstract class Company {


    abstract void employeeInfo(String employeeName, int employeeId);
    abstract void employeePosition(String myPosition);
    abstract void employeeSalary(int mySalary);
    void employeeMeeting(){
        System.out.println("Meeting Schedules are not fixed");
    }


}
