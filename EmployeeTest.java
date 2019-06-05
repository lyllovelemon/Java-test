import java.io.*;
public class EmployeeTest{
    public static void main(String args[]){
        Employee empOne=new Employee("lemon");
        Employee empTwo=new Employee("qs");

        empOne.empAge(22);
        empOne.empDesignation("front-end developver");
        empOne.empSalary(10000);
        empOne.printEmployee();

        empTwo.empAge(26);
        empTwo.empDesignation("doctor");
        empTwo.empSalary(20000);
        empTwo.printEmployee();
    }
}