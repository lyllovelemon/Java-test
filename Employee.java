import java.io.*;
public class Employee{
    public String name;
    int age;
    String designation;
    private double salary;

    public Employee(String name){
       this.name=name;
    }
    public void empAge(int empAge){
        age=empAge;
    }
    public void empDesignation(String empDesig){
        designation=empDesig;
    }
    public void empSalary(double empSalary){
        salary=empSalary;
    }
    public void printEmployee(){
        System.out.println("Name: "+name);
        System.out.println("age: "+age);
        System.out.println("designation: "+designation);
        System.out.println("salary: "+salary);
    }
}