package com.mycompany.hrmanagement;
import java.util.*;
public abstract class Employee {
    private String employeeID;
    private String employeeName;
    private int yearOfBirth;
    private String address;
    private String phone;
    public Employee(){}
    public Employee(String employeeID, String employeeName, int yearOfBirth, String address, String phone) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.phone = phone;
    }
    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void InputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Employee ID : ");
        employeeID=sc.next() ;
        System.out.println("Employee Name : ");
        sc.nextLine();
        employeeName=sc.nextLine() ;
        System.out.println("Employee year of birth : ");
        yearOfBirth = sc.nextInt() ;
        System.out.println("Employee address : ");
        sc.nextLine();
        address = sc.nextLine() ;
        System.out.println("Employee phone : ");
        phone = sc.next();
    }
    public abstract String getInfo();
    public abstract float getPayment();
}
