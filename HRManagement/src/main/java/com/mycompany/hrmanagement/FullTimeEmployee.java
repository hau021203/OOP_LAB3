package com.mycompany.hrmanagement;
import java.util.*;
public class FullTimeEmployee extends Employee{
    private float salary;
    public FullTimeEmployee(){
        
    }

    public FullTimeEmployee(float salary) {
        this.salary = salary;
    }

    public FullTimeEmployee(float salary, String employeeID, String employeeName, int yearOfBirth, String address, String phone) {
        super(employeeID, employeeName, yearOfBirth, address, phone);
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public void InputInfo() {
        super.InputInfo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Salary : ");
        salary = sc.nextFloat();
    }

    @Override
    public String getInfo() {
        
        return "Employee ID : "+getEmployeeID()+"| Employee Name : "+getEmployeeName()+"| Employee year of birth : "+getYearOfBirth()+"| Employee address : "+getAddress()+"| Employee phone : "+getPhone()+"| Payment :"+salary ;
    }

    @Override
    public float getPayment() {
        return getSalary();
    }

}
