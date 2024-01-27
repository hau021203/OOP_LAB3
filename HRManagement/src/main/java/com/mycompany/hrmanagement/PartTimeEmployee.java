package com.mycompany.hrmanagement;
import java.util.*;
public class PartTimeEmployee extends Employee{
    private int workingHour;
    private float payRate;
    public PartTimeEmployee(){}

    public PartTimeEmployee(int workingHour, float payRate) {
        this.workingHour = workingHour;
        this.payRate = payRate;
    }

    public PartTimeEmployee(int workingHour, float payRate, String employeeID, String employeeName, int yearOfBirth, String address, String phone) {
        super(employeeID, employeeName, yearOfBirth, address, phone);
        this.workingHour = workingHour;
        this.payRate = payRate;
    }

    public int getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour;
    }

    public float getPayRate() {
        return payRate;
    }

    public void setPayRate(float payRate) {
        this.payRate = payRate;
    }
    @Override
    public void InputInfo() {
        super.InputInfo(); 
        Scanner sc = new Scanner(System.in);
        System.out.print("Working Hour : ");
        workingHour = sc.nextInt();
        System.out.print("Pay Rate : ");
        payRate = sc.nextFloat();
    }

    @Override
    public String getInfo() {
        return "Employee ID : "+getEmployeeID()+"| Employee Name : "+getEmployeeName()+"| Employee year of birth : "+getYearOfBirth()+"| Employee address : "+getAddress()+"| Employee phone : "+getPhone()+"| Payment :"+(workingHour*payRate);
    }

    @Override
    public float getPayment() {
        return (getPayRate()*getWorkingHour());
    }
}
