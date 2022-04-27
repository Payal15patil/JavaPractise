package abstraction;

class Employee extends Company{

    @Override
    public void employeeInfo(String employeeName, int employeeId) {
        System.out.println("");
        System.out.println("Employee details are given below:");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Name     : " +employeeName);
        System.out.println("ID       : " +employeeId);
    }
    @Override
    void employeePosition(String myPosition) {
        System.out.println("Position : " +myPosition);
    }

    @Override
    void employeeSalary(int mySalary) {
        System.out.println("Salary   : " +mySalary);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.employeeInfo("Payal Patil",23456);
        employee.employeePosition("C.E.O");
        employee.employeeSalary(70000);
        employee.employeeInfo("Yogesh Patil",23764);
        employee.employeePosition("Manager");
        employee.employeeSalary(40000);
    }
}
